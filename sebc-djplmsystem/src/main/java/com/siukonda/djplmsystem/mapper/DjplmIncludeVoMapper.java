package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.vo.DjplmIncludeVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-10 15:46
 */
public interface DjplmIncludeVoMapper {

    /**
     * 查找自己构件信息
     * @param guid 构件guid
     * @return 返回单个构件信息
     */
    public List<DjplmIncludeVo> selectComponentIncludeProductItself(String guid);

    /**
     * 查找引用的构件信息
     * @param guid 构件guid
     * @return 返回引用构件信息
     */
    public List<DjplmIncludeVo> selectComponentIncludeProductParent(String guid);
}
