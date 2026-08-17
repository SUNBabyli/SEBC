package com.siukonda.djerpsystem.service;

import com.siukonda.djerpsystem.domain.vo.FinalMO;
import com.siukonda.djerpsystem.domain.vo.Modetail;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2023-07-21 17:09
 */
public interface IModetailService {

    public List<Modetail> selectmodetailList(FinalMO finalMO);
}
