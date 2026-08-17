package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.MaClassificationDetail;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 14:33
 */
public interface IMaClassificationDetailService {
    /**
     * 查询分级类型分类明细表
     *
     * @param guid 分级类型分类明细表主键
     * @return 分级类型分类明细表
     */
    public MaClassificationDetail selectMaClassificationDetailByGuid(String guid);

    /**
     * 查询分级类型分类明细表列表
     *
     * @param maClassificationDetail 分级类型分类明细表
     * @return 分级类型分类明细表集合
     */
    public List<MaClassificationDetail> selectMaClassificationDetailList(MaClassificationDetail maClassificationDetail);

    /**
     * 查询分级类型分类明细表所有信息
     * @return 分级类型分类明细表集合
     */
    public List<MaClassificationDetail> selectMaClassificationDetailAllList();

    /**
     *
     * @param masterfk 主分类范围码
     * @return 分类表信息集合
     */
    public List<MaClassificationDetail> selectMacidListByMasterfk(List<String> masterfk);
}
