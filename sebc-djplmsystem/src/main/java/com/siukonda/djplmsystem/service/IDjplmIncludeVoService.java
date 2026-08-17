package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.vo.DjplmIncludeVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-11-10 15:40
 */
public interface IDjplmIncludeVoService {
    /**
     * 查找引用的构件信息
     * @param guid 构件guid
     * @return 返回引用构件信息
     */
    public List<DjplmIncludeVo> selectComponentIncludeProductByItemGuid(String guid);
}
