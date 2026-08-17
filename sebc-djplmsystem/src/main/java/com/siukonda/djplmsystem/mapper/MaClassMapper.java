package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.MaClass;

import java.util.List;

/**
 * 实例对象类型Mapper接口
 *
 * @author hcx
 * @date 2022-08-15
 */
public interface MaClassMapper
{
    /**
     * 查询实例对象类型
     *
     * @param guid 实例对象类型主键
     * @return 实例对象类型
     */
    public MaClass selectMaClassByGuid(String guid);

    /**
     * 查询实例对象类型列表
     *
     * @param maClass 实例对象类型
     * @return 实例对象类型集合
     */
    public List<MaClass> selectMaClassList(MaClass maClass);

    /**
     * 新增实例对象类型
     *
     * @param maClass 实例对象类型
     * @return 结果
     */
    public int insertMaClass(MaClass maClass);

    /**
     * 修改实例对象类型
     *
     * @param maClass 实例对象类型
     * @return 结果
     */
    public int updateMaClass(MaClass maClass);

    /**
     * 删除实例对象类型
     *
     * @param guid 实例对象类型主键
     * @return 结果
     */
    public int deleteMaClassByGuid(String guid);

    /**
     * 批量删除实例对象类型
     *
     * @param guids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaClassByGuids(String[] guids);
}