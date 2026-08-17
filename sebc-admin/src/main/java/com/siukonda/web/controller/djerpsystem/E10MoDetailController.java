package com.siukonda.web.controller.djerpsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.Modetail;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;
import com.siukonda.djerpsystem.service.IFinalMOService;
import com.siukonda.djerpsystem.service.IModetailService;
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
 * @create 2023-06-15 17:09
 * 查询销售订单对应的总装工单单身物料明细
 */
@RestController
@RequestMapping("/djerpsystem/e10modetail")
public class E10MoDetailController extends BaseController {
    @Autowired
    private ISalesOrderVoService salesOrderVoService;
    @Autowired
    private IFinalMOService finalMOService;
    @Autowired
    private IModetailService modetailService;



    /**
     * 根据销售订单行明细查找对应工单明细
     * 1、先依据销售订单号查出销售订单明细
     */
    @PreAuthorize("@ss.hasPermi('djerpsystem:e10modetail:list')")
    @GetMapping("/listSO")
    public TableDataInfo listSO(SalesOrderVo salesOrderVo)
    {
        //startPage();
        //List<SalesOrderVo> list = salesOrderVoService.selectSalesOrderVoList(salesOrderVo);
        List<SalesOrderVo> list = salesOrderVoService.selectSalesOrderVoList2(salesOrderVo);
        return getDataTable(list);
    }

    /**
     *  2、依据选择的销售订单号及行号信息，查出总装生产工单号
     *
     */
    @PreAuthorize("@ss.hasPermi('djerpsystem:e10modetail:query')")
    @GetMapping("/listMO")
    public TableDataInfo listMO(SalesOrderVo salesOrderVo){
        if(salesOrderVo !=null) {
            // 1.1 先拿到销售订单中的Sales_ORDER_DOC_ID,品号，行号
            List<FinalMO> finalMOList = finalMOService.selectFinalMOList(salesOrderVo);
            // 1.2 将拿到对应的总装工单去查工单明细表
            return getDataTable(finalMOList);
        }
        return null;
    }

    /**
     *  根据销售订单行明细查找对应工单明细
     *  3、依据选择的总装生产工单号查出对应的工单物料明细
     *
     */
    @PreAuthorize("@ss.hasPermi('djerpsystem:e10modetail:querytwo')")
    @GetMapping("/listMODetail")
    public TableDataInfo listMODetail(FinalMO finalMO){
        if(finalMO !=null) {
            // 1.1 先拿到工单头详细资料
            List<Modetail> modetailList = modetailService.selectmodetailList(finalMO);
            // 1.2 将拿到对应的总装工单去查工单明细表
            return getDataTable(modetailList);
        }
        return null;
    }

    /**
     * 导出工单明细
     * @param response
     */
    @Log(title = "工单明细导出", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('djerpsystem:e10modetail:export')")
    @PostMapping("/export")
    public void export(HttpServletResponse response,FinalMO finalMO){
        List<Modetail> modetails = modetailService.selectmodetailList(finalMO);
        ExcelUtil<Modetail> util = new ExcelUtil<Modetail>(Modetail.class);
        util.exportExcel(response, modetails, "工单明细表");
    }
}
