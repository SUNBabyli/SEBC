package com.siukonda.djerpsystem.service;

import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-08 18:04
 */
public interface ISalesOrderVoService {

    public List<SalesOrderVo> selectSalesOrderVoList(SalesOrderVo salesOrderVo);

    public List<SalesOrderVo> selectSalesOrderVoList2(SalesOrderVo salesOrderVo);
}
