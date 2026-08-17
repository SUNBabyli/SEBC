package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djplmsystem.domain.MaClassificationMaster;
import com.siukonda.djplmsystem.service.IMaClassificationMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-17 10:03
 */
@RestController
@RequestMapping("/djplmsystem/maClassificationMaster")
public class MaClassificationMasterController extends BaseController
{
    @Autowired
    private IMaClassificationMasterService maClassificationMasterService;

    /**
     * 查询分级类型分类表列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:list')")
    @GetMapping("/list")
    public TableDataInfo list(MaClassificationMaster maClassificationMaster)
    {
        startPage();
        List<MaClassificationMaster> list = maClassificationMasterService.selectMaClassificationMasterList(maClassificationMaster);
        return getDataTable(list);
    }

    /**
     * 导出分级类型分类表列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:export')")
    @Log(title = "分级类型分类表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MaClassificationMaster maClassificationMaster)
    {
        List<MaClassificationMaster> list = maClassificationMasterService.selectMaClassificationMasterList(maClassificationMaster);
        ExcelUtil<MaClassificationMaster> util = new ExcelUtil<MaClassificationMaster>(MaClassificationMaster.class);
        util.exportExcel(response, list, "分级类型分类表数据");
    }

    /**
     * 获取分级类型分类表详细信息
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:query')")
    @GetMapping(value = "/{guid}")
    public AjaxResult getInfo(@PathVariable("guid") String guid)
    {
        return AjaxResult.success(maClassificationMasterService.selectMaClassificationMasterByGuid(guid));
    }

    /**
     * 新增分级类型分类表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:add')")
    @Log(title = "分级类型分类表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MaClassificationMaster maClassificationMaster)
    {
        return toAjax(maClassificationMasterService.insertMaClassificationMaster(maClassificationMaster));
    }

    /**
     * 修改分级类型分类表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:edit')")
    @Log(title = "分级类型分类表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MaClassificationMaster maClassificationMaster)
    {
        return toAjax(maClassificationMasterService.updateMaClassificationMaster(maClassificationMaster));
    }

    /**
     * 删除分级类型分类表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maClassificationMaster:remove')")
    @Log(title = "分级类型分类表", businessType = BusinessType.DELETE)
    @DeleteMapping("/{guids}")
    public AjaxResult remove(@PathVariable String[] guids)
    {
        return toAjax(maClassificationMasterService.deleteMaClassificationMasterByGuids(guids));
    }
}
