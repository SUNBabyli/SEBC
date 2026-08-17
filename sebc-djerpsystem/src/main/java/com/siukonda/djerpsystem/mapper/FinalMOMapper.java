package com.siukonda.djerpsystem.mapper;

import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-19 20:06
 */
public interface FinalMOMapper {

    public List<FinalMO> selectFinalMOList(SalesOrderVo salesOrderVo);
}
