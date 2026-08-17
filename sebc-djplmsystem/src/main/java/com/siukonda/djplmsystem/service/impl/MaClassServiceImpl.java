package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.MaClass;
import com.siukonda.djplmsystem.mapper.MaClassMapper;
import com.siukonda.djplmsystem.service.IMaClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实例对象类型Service业务层处理
 *
 * @author hcx
 * @date 2022-08-15
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class MaClassServiceImpl implements IMaClassService
{
    @Autowired
    private MaClassMapper maClassMapper;

    /**
     * 查询实例对象类型
     *
     * @param guid 实例对象类型主键
     * @return 实例对象类型
     */
    @Override
    public MaClass selectMaClassByGuid(String guid)
    {
        return maClassMapper.selectMaClassByGuid(guid);
    }

    /**
     * 查询实例对象类型列表
     *
     * @param maClass 实例对象类型
     * @return 实例对象类型
     */
    @Override
    public List<MaClass> selectMaClassList(MaClass maClass)
    {
        return maClassMapper.selectMaClassList(maClass);
    }

    /**
     * 新增实例对象类型
     *
     * @param maClass 实例对象类型
     * @return 结果
     */
    @Override
    public int insertMaClass(MaClass maClass)
    {
        return maClassMapper.insertMaClass(maClass);
    }

    /**
     * 修改实例对象类型
     *
     * @param maClass 实例对象类型
     * @return 结果
     */
    @Override
    public int updateMaClass(MaClass maClass)
    {
        return maClassMapper.updateMaClass(maClass);
    }

    /**
     * 批量删除实例对象类型
     *
     * @param guids 需要删除的实例对象类型主键
     * @return 结果
     */
    @Override
    public int deleteMaClassByGuids(String[] guids)
    {
        return maClassMapper.deleteMaClassByGuids(guids);
    }

    /**
     * 删除实例对象类型信息
     *
     * @param guid 实例对象类型主键
     * @return 结果
     */
    @Override
    public int deleteMaClassByGuid(String guid)
    {
        return maClassMapper.deleteMaClassByGuid(guid);
    }
}