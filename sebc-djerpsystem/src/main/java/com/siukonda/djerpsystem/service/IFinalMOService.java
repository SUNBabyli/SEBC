package com.siukonda.djerpsystem.service;

import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.SalesOrderVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-19 19:55
 */
public interface IFinalMOService {

    public List<FinalMO> selectFinalMOList(SalesOrderVo salesOrderVo);
}
