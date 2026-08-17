package com.siukonda.djerpsystem.mapper;

import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.Modetail;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-21 17:19
 */
public interface ModetailMapper {

    public List<Modetail> selectmodetailList(FinalMO finalMO);
}
