package com.siukonda.djerpsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;
import com.siukonda.djerpsystem.mapper.SalesOrderVoMapper;
import com.siukonda.djerpsystem.service.ISalesOrderVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-08 20:08
 */
@Service
@DataSource(value = DataSourceType.DJE10DB)
public class SalesOrderVoServiceImpl implements ISalesOrderVoService {

    @Autowired
    private SalesOrderVoMapper salesOrderVoMapper;

    @Override
    public List<SalesOrderVo> selectSalesOrderVoList(SalesOrderVo salesOrderVo) {
        return salesOrderVoMapper.selectSalesOrderVoList(salesOrderVo);
    }

    @Override
    public List<SalesOrderVo> selectSalesOrderVoList2(SalesOrderVo salesOrderVo) {
        return salesOrderVoMapper.selectSalesOrderVoList2(salesOrderVo);
    }
}
