package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djplmsystem.domain.Bomview;
import com.siukonda.djplmsystem.domain.vo.DjplmbomVo;
import com.siukonda.djplmsystem.domain.vo.ItemVo;
import com.siukonda.djplmsystem.service.IBomviewService;
import com.siukonda.djplmsystem.service.IDjplmbomVoService;
import com.siukonda.djplmsystem.service.IItemVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 鼎捷PLM产品BOMController
 * 
 * @author hcx
 * @date 2022-09-23
 */
@RestController
@RequestMapping("/djplmsystem/djplmbom")
public class DjplmbomController extends BaseController
{
    @Autowired
    private IDjplmbomVoService djplmbomVoService;

    @Autowired
    private IBomviewService bomviewService;

    @Autowired
    private IItemVoService itemVoService;

    /**
     * 根据itemGuid获取鼎捷PLM产品BOM详细信息
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:djplmbom:query')")
    @GetMapping(value = "/{itemGuid}")
    public AjaxResult getDjplmBombyItemGuid(@PathVariable String itemGuid)
    {
        //1、先通过页面传过来的itemGuid去获取bomview
        Bomview bomviews = bomviewService.selectBomviewByEnd1(itemGuid);
        if(bomviews == null){
            return AjaxResult.error("需查看的物料没有BOM，请查正再试！");
        }
        //2、将查到的bomview去获取完整BOM
        List<DjplmbomVo> djplmbomVos = djplmbomVoService.selectDjplmbomVoListByEnd1(bomviews);
        return AjaxResult.success(djplmbomVos);
    }

    /**
     * 根据itemid获取鼎捷PLM产品BOM详细信息
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:djplmbom:list')")
    @GetMapping("/list")
    public AjaxResult getDjplmbombyItemid(ItemVo itemVo)
    {
        //1、先通过页面传过来的itemGuid去获取bomview
        List<ItemVo> itemVoList = itemVoService.selectItemList(itemVo);
        for (ItemVo vo : itemVoList) {
            if (vo != null && vo.getIsbommodified().equals("Y")) {
                if(vo.getMdescription().equals("成品")){
                    Bomview bomviews = bomviewService.selectBomviewByEnd1(vo.getGuid());
                    if (bomviews == null) {
                        return AjaxResult.error("需查看的物料没有BOM，请查正再试！");
                    }
                    //2、将查到的bomview去获取完整BOM
                    List<DjplmbomVo> djplmbomVos = djplmbomVoService.selectDjplmbomVoListByEnd1(bomviews);
                    return AjaxResult.success(djplmbomVos);
                }
                return AjaxResult.error("此功能只提供成品查BOM，请查正再试！");
            }
            return AjaxResult.error("需查看的物料没有BOM，请查正再试！");
        }
        return AjaxResult.error("需查看的物料没有BOM，请查正再试！");
    }

    /**
     * 导出鼎捷BOM
     * @param response
     * @param itemGuid 物料guid
     */
    @Log(title = "PLMBOM导出", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djplmsystem:djplmbom:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response, String itemGuid)
    {
        Bomview bomviews = bomviewService.selectBomviewByEnd1(itemGuid);
        List<DjplmbomVo> djplmbomVos = djplmbomVoService.selectDjplmbomVoListByEnd1(bomviews);
        ExcelUtil<DjplmbomVo> util = new ExcelUtil<DjplmbomVo>(DjplmbomVo.class);
        util.exportExcel(response, djplmbomVos, "PLMBOM表");
    }

    /**
     * 导出鼎捷BOM
     * @param response
     * @param itemVo 物料对象
     */
    @Log(title = "PLMBOM导出", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djplmsystem:djplmbom:export')")
    @PostMapping("/itemexport")
    public void itemexport(HttpServletResponse response, ItemVo itemVo)
    {
        Bomview bomviews = bomviewService.selectBomviewById(itemVo.getItemId());
        List<DjplmbomVo> djplmbomVos = djplmbomVoService.selectDjplmbomVoListByEnd1(bomviews);
        ExcelUtil<DjplmbomVo> util = new ExcelUtil<DjplmbomVo>(DjplmbomVo.class);
        util.exportExcel(response, djplmbomVos, "PLMBOM表");
    }

}
