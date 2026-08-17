package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.MaCodeDetail;

import java.util.List;

public interface IMaCodeDetailService {
    /**
     * 查询单位表所有内容列表
     * @return
     */
    public List<MaCodeDetail> selectMaCodeDetailList();
}
