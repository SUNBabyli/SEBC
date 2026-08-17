package com.siukonda.djerpsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;
import com.siukonda.djerpsystem.mapper.FinalMOMapper;
import com.siukonda.djerpsystem.service.IFinalMOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-19 20:02
 */
@Service
@DataSource(value = DataSourceType.DJE10DB)
public class FinalMOServiceImpl implements IFinalMOService {

    private static final Logger log = LoggerFactory.getLogger(FinalMOServiceImpl.class);

    @Autowired
    private FinalMOMapper finalMOMapper;
    @Override
    public List<FinalMO> selectFinalMOList(SalesOrderVo salesOrderVo) {
        return finalMOMapper.selectFinalMOList(salesOrderVo);
    }
}
