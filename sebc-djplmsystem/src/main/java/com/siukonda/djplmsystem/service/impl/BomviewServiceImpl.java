package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.Bomview;
import com.siukonda.djplmsystem.mapper.BomviewMapper;
import com.siukonda.djplmsystem.service.IBomviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class BomviewServiceImpl implements IBomviewService {

    @Autowired
    private BomviewMapper bomviewMapper;

    @Override
    public Bomview selectBomviewByEnd1(String end1) {
        return bomviewMapper.selectBomviewByEnd1(end1);
    }

    @Override
    public Bomview selectBomviewById(String id) {
        return bomviewMapper.selectBomviewById(id);
    }
}
