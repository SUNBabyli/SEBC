package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djplmsystem.domain.Bomview;
import com.siukonda.djplmsystem.domain.vo.DjplmIncludeVo;
import com.siukonda.djplmsystem.domain.vo.ItemVo;
import com.siukonda.djplmsystem.service.IBomviewService;
import com.siukonda.djplmsystem.service.IDjplmIncludeVoService;
import com.siukonda.djplmsystem.service.IItemVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-09 17:16
 */
@RestController
@RequestMapping("/djplmsystem/include")
public class DjplmIncludeController extends BaseController {

    @Autowired
    private IDjplmIncludeVoService djplmIncludeVoService;

    @Autowired
    private IBomviewService bomviewService;

    @Autowired
    private IItemVoService itemVoService;


    /**
     * 根据itemid获取鼎捷构件在哪些产品中引用或含有的详细信息
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:include:list')")
    @GetMapping("/list")
    public AjaxResult getComponentIncludeProductByItemid(ItemVo itemVo)
    {
        //1、先通过页面传过来的itemGuid去获取bomview
        List<ItemVo> itemVoList = itemVoService.selectItemList(itemVo);
        for (ItemVo vo : itemVoList) {
            if (vo != null && vo.getIsbommodified().equals("Y")) {
                if(vo.getMdescription().equals("部件") || vo.getMdescription().equals("零件")){
                    Bomview bomviews = bomviewService.selectBomviewByEnd1(vo.getGuid());
                    if (bomviews == null) {
                        return AjaxResult.error("需查看的物料有误，请查正再试！");
                    }
                    //2、将查到的bomview去获取完整BOM
                    List<DjplmIncludeVo> djplmIncludeVos = djplmIncludeVoService.selectComponentIncludeProductByItemGuid(vo.getGuid());
                    return AjaxResult.success(djplmIncludeVos);
                }
                return AjaxResult.error("需查看的物料有误，请查正再试！");
            }
            return AjaxResult.error("需查看的物料有误，请查正再试！");
        }
        return AjaxResult.error("需查看的物料有误，请查正再试！");
    }

    /**
     * 导出构件引用关系
     * @param response
     * @param itemVo 物料对象
     */
    @Log(title = "构件引用关系", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djplmsystem:include:export')")
    @PostMapping("/itemidexport")
    public void itemexport(HttpServletResponse response, ItemVo itemVo)
    {
        List<ItemVo> itemVoList = itemVoService.selectItemList(itemVo);
        List<DjplmIncludeVo> djplmIncludeVos = djplmIncludeVoService.selectComponentIncludeProductByItemGuid(itemVoList.get(0).getGuid());
        ExcelUtil<DjplmIncludeVo> util = new ExcelUtil<DjplmIncludeVo>(DjplmIncludeVo.class);
        util.exportExcel(response, djplmIncludeVos, itemVo.getItemId());
    }

}
