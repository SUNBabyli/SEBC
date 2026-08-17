package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.MaCodeDetail;
import com.siukonda.djplmsystem.mapper.MaCodeDetailMapper;
import com.siukonda.djplmsystem.service.IMaCodeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class MaCodeDetailServiceImpl implements IMaCodeDetailService {

    @Autowired
    private MaCodeDetailMapper maCodeDetailMapper;

    @Override
    public List<MaCodeDetail> selectMaCodeDetailList() {
        return maCodeDetailMapper.selectMaCodeDetailList();
    }
}
