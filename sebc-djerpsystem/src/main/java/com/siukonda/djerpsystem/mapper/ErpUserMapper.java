package com.siukonda.djerpsystem.mapper;

import com.siukonda.djerpsystem.domain.vo.ErpUser;

import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author ruoyi
 */
public interface ErpUserMapper
{
    /**
     * 根据条件分页查询用户列表
     * 
     * @param erpUser 用户信息
     * @return 用户信息集合信息
     */
    public List<ErpUser> selectUserList(ErpUser erpUser);

}
