package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djplmsystem.domain.vo.ItemVo;
import com.siukonda.djplmsystem.service.IItemVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/djplmsystem/itemclass/")

public class ItemVoController extends BaseController {

    @Autowired
    private IItemVoService itemVoService;

    /**
     *  获取所选分类物料列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:itemclass:list')")
    @GetMapping("/list")
    public TableDataInfo list(ItemVo itemVo){
        startPage();
        List<ItemVo> list = itemVoService.selectItemList(itemVo);
        return getDataTable(list);
    }

    @Log(title = "物料管理", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djplmsystem:itemclass:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response, ItemVo itemVo){
        List<ItemVo> list = itemVoService.selectItemList(itemVo);
        ExcelUtil<ItemVo> util = new ExcelUtil<ItemVo>(ItemVo.class);
        util.exportExcel(response, list, "物料数据");
    }
}
