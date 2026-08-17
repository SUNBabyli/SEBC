package com.siukonda.djerpsystem.mapper;

import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-08 20:11
 */
public interface SalesOrderVoMapper {

    public List<SalesOrderVo> selectSalesOrderVoList(SalesOrderVo salesOrderVo);

    public List<SalesOrderVo> selectSalesOrderVoList2(SalesOrderVo salesOrderVo);

}
