package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.common.utils.DateUtils;
import com.siukonda.djplmsystem.domain.MaClassificationMaster;
import com.siukonda.djplmsystem.mapper.MaClassificationMasterMapper;
import com.siukonda.djplmsystem.service.IMaClassificationMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-17 9:53
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class MaClassificationMasterServiceImpl implements IMaClassificationMasterService
{
    @Autowired
    private MaClassificationMasterMapper maClassificationMasterMapper;

    /**
     * 查询分级类型分类表
     *
     * @param guid 分级类型分类表主键
     * @return 分级类型分类表
     */
    @Override
    public MaClassificationMaster selectMaClassificationMasterByGuid(String guid)
    {
        return maClassificationMasterMapper.selectMaClassificationMasterByGuid(guid);
    }

    /**
     * 查询分级类型分类表列表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 分级类型分类表
     */
    @Override
    public List<MaClassificationMaster> selectMaClassificationMasterList(MaClassificationMaster maClassificationMaster)
    {
        return maClassificationMasterMapper.selectMaClassificationMasterList(maClassificationMaster);
    }

    /**
     * 新增分级类型分类表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 结果
     */
    @Override
    public int insertMaClassificationMaster(MaClassificationMaster maClassificationMaster)
    {
        maClassificationMaster.setCreateTime(DateUtils.getNowDate());
        return maClassificationMasterMapper.insertMaClassificationMaster(maClassificationMaster);
    }

    /**
     * 修改分级类型分类表
     *
     * @param maClassificationMaster 分级类型分类表
     * @return 结果
     */
    @Override
    public int updateMaClassificationMaster(MaClassificationMaster maClassificationMaster)
    {
        maClassificationMaster.setUpdateTime(DateUtils.getNowDate());
        return maClassificationMasterMapper.updateMaClassificationMaster(maClassificationMaster);
    }

    /**
     * 批量删除分级类型分类表
     *
     * @param guids 需要删除的分级类型分类表主键
     * @return 结果
     */
    @Override
    public int deleteMaClassificationMasterByGuids(String[] guids)
    {
        return maClassificationMasterMapper.deleteMaClassificationMasterByGuids(guids);
    }

    /**
     * 删除分级类型分类表信息
     *
     * @param guid 分级类型分类表主键
     * @return 结果
     */
    @Override
    public int deleteMaClassificationMasterByGuid(String guid)
    {
        return maClassificationMasterMapper.deleteMaClassificationMasterByGuid(guid);
    }

    @Override
    public List<MaClassificationMaster> selectMacimListByGuid(List<String> guidList) {
        return maClassificationMasterMapper.selectMacimListByGuid(guidList);
    }
}
