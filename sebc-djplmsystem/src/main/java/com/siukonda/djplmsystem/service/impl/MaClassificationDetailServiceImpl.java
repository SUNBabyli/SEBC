package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.MaClassificationDetail;
import com.siukonda.djplmsystem.mapper.MaClassificationDetailMapper;
import com.siukonda.djplmsystem.service.IMaClassificationDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 14:35
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class MaClassificationDetailServiceImpl implements IMaClassificationDetailService
{
    @Autowired
    private MaClassificationDetailMapper maClassificationDetailMapper;

    /**
     * 查询分级类型分类明细表
     *
     * @param guid 分级类型分类明细表主键
     * @return 分级类型分类明细表
     */
    @Override
    public MaClassificationDetail selectMaClassificationDetailByGuid(String guid)
    {
        return maClassificationDetailMapper.selectMaClassificationDetailByGuid(guid);
    }

    /**
     * 查询分级类型分类明细表列表
     *
     * @param maClassificationDetail 分级类型分类明细表
     * @return 分级类型分类明细表
     */
    @Override
    public List<MaClassificationDetail> selectMaClassificationDetailList(MaClassificationDetail maClassificationDetail)
    {
        return maClassificationDetailMapper.selectMaClassificationDetailList(maClassificationDetail);
    }

    @Override
    public List<MaClassificationDetail> selectMaClassificationDetailAllList() {
        return maClassificationDetailMapper.selectMaClassificationDetailAllList();
    }

    /**
     *
     * @param masterfk 主分类范围码
     * @return 分类表信息集合
     */
    @Override
    public List<MaClassificationDetail> selectMacidListByMasterfk(List<String> masterfk) {
        return maClassificationDetailMapper.selectMacidListByMasterfk(masterfk);
    }
}
