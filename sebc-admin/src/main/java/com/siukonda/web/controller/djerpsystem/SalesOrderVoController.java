package com.siukonda.web.controller.djerpsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;
import com.siukonda.djerpsystem.service.ISalesOrderVoService;
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
 * @create 2022-11-08 21:24
 */
@RestController
@RequestMapping("/djerpsystem/sales")
public class SalesOrderVoController extends BaseController {

    @Autowired
    private ISalesOrderVoService salesOrderVoService;

    /**
     * 获取销售订单列表
     */
    @PreAuthorize("@ss.hasPermi('djerpsystem:sales:list')")
    @GetMapping("/list")
    public TableDataInfo list(SalesOrderVo salesOrderVo)
    {
        //startPage();
        List<SalesOrderVo> list = salesOrderVoService.selectSalesOrderVoList(salesOrderVo);
        return getDataTable(list);
    }

    /**
     * 导出销售订单列表
     * @param response
     * @param salesOrderVo 销售订单信息
     */
    @Log(title = "销售订单导出", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djerpsystem:sales:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SalesOrderVo salesOrderVo)
    {
        List<SalesOrderVo> list = salesOrderVoService.selectSalesOrderVoList(salesOrderVo);
        ExcelUtil<SalesOrderVo> util = new ExcelUtil<SalesOrderVo>(SalesOrderVo.class);
        util.exportExcel(response, list, "销售订单明细表");
    }
}
