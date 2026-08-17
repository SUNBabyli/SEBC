package com.siukonda.djerpsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djerpsystem.domain.vo.ErpUser;
import com.siukonda.djerpsystem.mapper.ErpUserMapper;
import com.siukonda.djerpsystem.service.IERPUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */
@Service
@DataSource(value = DataSourceType.DJE10DB)
public class ErpUserServiceImpl implements IERPUserService
{
    private static final Logger log = LoggerFactory.getLogger(ErpUserServiceImpl.class);

    @Autowired
    private ErpUserMapper erpUserMapper;

//    @Autowired
//    protected Validator validator;

    /**
     * 根据条件分页查询用户列表
     * 
     * @param erpUser 用户信息
     * @return 用户信息集合信息
     */
    @Override
    public List<ErpUser> selectUserList(ErpUser erpUser)
    {
        return erpUserMapper.selectUserList(erpUser);
    }

}
