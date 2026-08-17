package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.Bomview;

/**
 * @author zhaoyang
 * @create 2022-10-06 16:05
 */
public interface BomviewMapper {

    public Bomview selectBomviewByEnd1(String end1);

    public Bomview selectBomviewById(String id);
}
