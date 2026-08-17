package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.model.DjplmTreeSelect;
import com.siukonda.djplmsystem.domain.vo.ItemClassTreeVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 15:30
 */
public interface IItemClassTreeVoService {
    public List<DjplmTreeSelect> buildItemClassTreeSelect(List<ItemClassTreeVo> productTreeVoLists);

    List<ItemClassTreeVo> buildItemClassTree(List<ItemClassTreeVo> itemClassTreeVoLists);

}
