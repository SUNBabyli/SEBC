package com.siukonda.web.controller.djplmsystem;

import com.siukonda.common.annotation.Log;
import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.domain.AjaxResult;
import com.siukonda.common.enums.BusinessType;
import com.siukonda.common.utils.poi.ExcelUtil;
import com.siukonda.djplmsystem.domain.MaClass;
import com.siukonda.djplmsystem.service.IMaClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 实例对象类型Controller
 *
 * @author hcx
 * @date 2022-08-15
 */
@RestController
@RequestMapping("/djplmsystem/maclass")
public class MaClassController extends BaseController
{
    @Autowired
    private IMaClassService maClassService;

    /**
     * 查询实例对象类型列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:list')")
    @GetMapping("/list")
    public AjaxResult list(MaClass maClass)
    {
        List<MaClass> list = maClassService.selectMaClassList(maClass);
        return AjaxResult.success(list);
    }

    /**
     * 导出实例对象类型列表
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:export')")
    @Log(title = "实例对象类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MaClass maClass)
    {
        System.out.println("执行了export方法，返回的是一个list");
        List<MaClass> list = maClassService.selectMaClassList(maClass);
        ExcelUtil<MaClass> util = new ExcelUtil<MaClass>(MaClass.class);
        util.exportExcel(response, list, "实例对象类型数据");
    }

    /**
     * 获取实例对象类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:query')")
    @GetMapping(value = "/{guid}")
    public AjaxResult getInfo(@PathVariable("guid") String guid)
    {
        System.out.println("执行了getinfo方法，返回的是一个对象");
        return AjaxResult.success(maClassService.selectMaClassByGuid(guid));
    }

    /**
     * 新增实例对象类型
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:add')")
    @Log(title = "实例对象类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MaClass maClass)
    {
        return toAjax(maClassService.insertMaClass(maClass));
    }

    /**
     * 修改实例对象类型
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:edit')")
    @Log(title = "实例对象类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MaClass maClass)
    {
        return toAjax(maClassService.updateMaClass(maClass));
    }

    /**
     * 删除实例对象类型
     */
    @PreAuthorize("@ss.hasPermi('djplmsystem:maclass:remove')")
    @Log(title = "实例对象类型", businessType = BusinessType.DELETE)
    @DeleteMapping("/{guids}")
    public AjaxResult remove(@PathVariable String[] guids)
    {
        return toAjax(maClassService.deleteMaClassByGuids(guids));
    }
}