package com.siukonda.web.controller.djerpsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djerpsystem.domain.vo.ManufacturingOrderVo;
import com.siukonda.djerpsystem.service.IManufacturingOrderVoService;
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
 * @create 2022-11-21 22:15
 */
@RestController
@RequestMapping("/djerpsystemmo/manufacturing")
public class ManufacturingOrderVoController extends BaseController {

    @Autowired
    private IManufacturingOrderVoService manufacturingOrderVoService;

    /**
     * 获工单订单列表
     */
    @PreAuthorize("@ss.hasPermi('djerpsystemmo:manufacturing:list')")
    @GetMapping("/list")
    public TableDataInfo list(ManufacturingOrderVo manufacturingOrderVo)
    {
        //startPage();
        List<ManufacturingOrderVo> list = manufacturingOrderVoService.selectManufacturingOrderVoList(manufacturingOrderVo);
        return getDataTable(list);
    }

    /**
     * 导出工单列表
     * @param response
     * @param manufacturingOrderVo 工单条件信息
     */
    @Log(title = "工单导出", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djerpsystemmo:manufacturing:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response, ManufacturingOrderVo manufacturingOrderVo)
    {
        List<ManufacturingOrderVo> list = manufacturingOrderVoService.selectManufacturingOrderVoList(manufacturingOrderVo);
        ExcelUtil<ManufacturingOrderVo> util = new ExcelUtil<ManufacturingOrderVo>(ManufacturingOrderVo.class);
        util.exportExcel(response, list, "工单明细");
    }
}
