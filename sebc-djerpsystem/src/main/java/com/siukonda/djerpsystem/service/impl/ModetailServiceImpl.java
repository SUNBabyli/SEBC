package com.siukonda.djerpsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.Modetail;
import com.siukonda.djerpsystem.mapper.ModetailMapper;
import com.siukonda.djerpsystem.service.IModetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-21 17:13
 */
@Service
@DataSource(value = DataSourceType.DJE10DB)
public class ModetailServiceImpl implements IModetailService {

    private static final Logger log = LoggerFactory.getLogger(ModetailServiceImpl.class);

    @Autowired
    private ModetailMapper modetailMapper;

    @Override
    public List<Modetail> selectmodetailList(FinalMO finalMO) {
        return modetailMapper.selectmodetailList(finalMO);
    }
}
