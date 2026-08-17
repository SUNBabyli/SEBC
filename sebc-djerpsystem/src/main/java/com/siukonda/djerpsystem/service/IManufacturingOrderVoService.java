package com.siukonda.djerpsystem.service;

import com.siukonda.djerpsystem.domain.vo.ManufacturingOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-21 17:42
 */
public interface IManufacturingOrderVoService {

    public List<ManufacturingOrderVo> selectManufacturingOrderVoList(ManufacturingOrderVo manufacturingOrderVo);
}
