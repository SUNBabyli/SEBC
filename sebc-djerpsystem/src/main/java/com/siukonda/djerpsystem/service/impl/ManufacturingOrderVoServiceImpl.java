package com.siukonda.djerpsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djerpsystem.domain.vo.ManufacturingOrderVo;
import com.siukonda.djerpsystem.mapper.ManufacturingOrderVoMapper;
import com.siukonda.djerpsystem.service.IManufacturingOrderVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-21 17:44
 */
@Service
@DataSource(value = DataSourceType.DJE10DB)
public class ManufacturingOrderVoServiceImpl implements IManufacturingOrderVoService {

    @Autowired
    public ManufacturingOrderVoMapper manufacturingOrderVoMapper;

    @Override
    public List<ManufacturingOrderVo> selectManufacturingOrderVoList(ManufacturingOrderVo manufacturingOrderVo) {
        List<ManufacturingOrderVo> manufacturingOrderVos = manufacturingOrderVoMapper.selectManufacturingOrderVoList(manufacturingOrderVo);

        return manufacturingOrderVos;
    }
}
