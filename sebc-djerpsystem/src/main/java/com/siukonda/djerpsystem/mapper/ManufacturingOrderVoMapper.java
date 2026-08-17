package com.siukonda.djerpsystem.mapper;

import com.siukonda.djerpsystem.domain.vo.ManufacturingOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-21 17:45
 */
public interface ManufacturingOrderVoMapper {

    public List<ManufacturingOrderVo> selectManufacturingOrderVoList(ManufacturingOrderVo manufacturingOrderVo);
}
