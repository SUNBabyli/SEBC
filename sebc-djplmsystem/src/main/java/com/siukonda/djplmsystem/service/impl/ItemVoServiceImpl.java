package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.annotation.DataSource;
import com.siukonda.common.enums.DataSourceType;
import com.siukonda.djplmsystem.domain.vo.ItemVo;
import com.siukonda.djplmsystem.mapper.ItemVoMapper;
import com.siukonda.djplmsystem.service.IItemVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 15:01
 */
@Service
@DataSource(value = DataSourceType.DJPLMDB)
public class ItemVoServiceImpl implements IItemVoService {

    @Autowired
    private ItemVoMapper itemVoMapper;

    @Override
    public List<ItemVo> selectItemList(ItemVo itemVo) {
        List<ItemVo> itemVoList = itemVoMapper.selectItemList(itemVo);
        return itemVoList;
    }

    @Override
    public ItemVo selectItemByItemid(String itemId) {
        return itemVoMapper.selectItemByItemid(itemId);
    }
}
