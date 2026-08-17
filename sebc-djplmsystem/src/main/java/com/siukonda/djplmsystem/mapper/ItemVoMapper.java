package com.siukonda.djplmsystem.mapper;

import com.siukonda.djplmsystem.domain.vo.ItemVo;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 15:02
 */
public interface ItemVoMapper {
    public List<ItemVo> selectItemList(ItemVo itemVo);

    public ItemVo selectItemByItemid(String itemId);
}
