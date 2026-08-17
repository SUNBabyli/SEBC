package com.siukonda.djplmsystem.service;

import com.siukonda.djplmsystem.domain.vo.ItemVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 15:00
 */
public interface IItemVoService {
    public List<ItemVo> selectItemList(ItemVo itemVo);

    public ItemVo selectItemByItemid(String itemId);
}
