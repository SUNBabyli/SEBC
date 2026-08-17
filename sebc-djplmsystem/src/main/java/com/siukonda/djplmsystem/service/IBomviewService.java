package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.Bomview;

/**
 * BOM视图Service接口
 *
 * @author hcx
 * @date 2022-10-06
 */
public interface IBomviewService
{
    /**
     * 查询实例对象类型
     *
     * @param end1 实例对象类型主键
     * @return 物料bomview实体
     */
    public Bomview selectBomviewByEnd1(String end1);

    /**
     * 查询实例对象类型
     *
     * @param itemid 实例对象类型主键
     * @return 物料bomview实体
     */
    public Bomview selectBomviewById(String id);

}