package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.MaClassificationMaster;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-17 9:53
 */
public interface IMaClassificationMasterService {

    /**
     * 查询分级类型分类表
     *
     * @param guid 分级类型分类表主键
     * @return 分级类型分类表
     */
    public MaClassificationMaster selectMaClassificationMasterByGuid(String guid);

    /**
     * 查询分级类型分类表列表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 分级类型分类表集合
     */
    public List<MaClassificationMaster> selectMaClassificationMasterList(MaClassificationMaster maClassificationMaster);

    /**
     * 新增分级类型分类表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 结果
     */
    public int insertMaClassificationMaster(MaClassificationMaster maClassificationMaster);

    /**
     * 修改分级类型分类表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 结果
     */
    public int updateMaClassificationMaster(MaClassificationMaster maClassificationMaster);

    /**
     * 批量删除分级类型分类表
     *
     * @param guids 需要删除的分级类型分类表主键集合
     * @return 结果
     */
    public int deleteMaClassificationMasterByGuids(String[] guids);

    /**
     * 删除分级类型分类表信息
     *
     * @param guid 分级类型分类表主键
     * @return 结果
     */
    public int deleteMaClassificationMasterByGuid(String guid);

    /**
     *
     */
    public List<MaClassificationMaster> selectMacimListByGuid(List<String> guidList);

}
