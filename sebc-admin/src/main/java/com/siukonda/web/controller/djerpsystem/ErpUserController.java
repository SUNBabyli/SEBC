package com.siukonda.web.controller.djerpsystem;

import com.siukonda.common.core.controller.BaseController;
import com.siukonda.common.core.page.TableDataInfo;
import com.siukonda.djerpsystem.domain.vo.ErpUser;
import com.siukonda.djerpsystem.service.IERPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 用户信息
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/djerpsystem/user")
public class ErpUserController extends BaseController
{
    @Autowired
    private IERPUserService erpUserService;


    /**
     * 获取用户列表
     */
    @PreAuthorize("@ss.hasPermi('djerpsystem:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(ErpUser erpUser)
    {
        //startPage();
        Map<String, Object> params = erpUser.getParams();
        System.out.println(params.toString());
        List<ErpUser> list = erpUserService.selectUserList(erpUser);
        return getDataTable(list);
    }
}
