package com.siukonda.djplmsystem.service.impl;

import com.siukonda.common.utils.StringUtils;
import com.siukonda.djplmsystem.domain.model.DjplmTreeSelect;
import com.siukonda.djplmsystem.service.IItemClassTreeVoService;
import com.siukonda.djplmsystem.domain.vo.ItemClassTreeVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaoyang
 * @create 2022-08-21 16:16
 */
@Service
public class ItemClassTreeVoServiceImpl implements IItemClassTreeVoService {
    /**
     * 构建前端所需要下拉树结构
     *
     * @param itemClassTreeVoLists 分类表列表
     * @return 下拉树结构列表
     */
    @Override
    public List<DjplmTreeSelect> buildItemClassTreeSelect(List<ItemClassTreeVo> itemClassTreeVoLists) {
        List<ItemClassTreeVo> itemClassTreeVos = buildItemClassTree(itemClassTreeVoLists);
        return itemClassTreeVos.stream().map(DjplmTreeSelect::new).collect(Collectors.toList());
    }

    /**
     * 构建前端所需要下拉树结构
     *
     * @param itemClassTreeVoLists 分类表列表
     * @return 树结构列表
     */
    @Override
    public List<ItemClassTreeVo> buildItemClassTree(List<ItemClassTreeVo> itemClassTreeVoLists) {
        List<ItemClassTreeVo> returnList = new ArrayList<ItemClassTreeVo>();
        List<String> tempStringList = new ArrayList<String>();
        for (ItemClassTreeVo itemClassTreeVoList : itemClassTreeVoLists) {
            tempStringList.add(itemClassTreeVoList.getGuid());
        }
        for (ItemClassTreeVo itemClassTreeVoList : itemClassTreeVoLists) {
            // 如果是顶级节点，遍历该父节点的所有子节点
            if(!tempStringList.contains(itemClassTreeVoList.getParentguid())){
                recursionFn(itemClassTreeVoLists,itemClassTreeVoList);
                returnList.add(itemClassTreeVoList);
            }
        }
        if(returnList.isEmpty()){
            returnList = itemClassTreeVoLists;
        }
        return returnList;
    }

    /**
     * 递归列表
     */
    private void recursionFn(List<ItemClassTreeVo> itemClassTreeVoLists, ItemClassTreeVo itemClassTreeVoList) {
        // 得到子节点列表
        List<ItemClassTreeVo> childItemClassTreeList = getChildList(itemClassTreeVoLists,itemClassTreeVoList);
        itemClassTreeVoList.setChildren(childItemClassTreeList);
        for (ItemClassTreeVo itemClassTreeVoChild : childItemClassTreeList) {
            if(hasChild(itemClassTreeVoLists,itemClassTreeVoChild)){
                recursionFn(itemClassTreeVoLists,itemClassTreeVoChild);
            }
        }
    }

    /**
     * 得到子节点列表
     * @param itemClassTreeVoLists
     * @param itemClassTreeVoList
     * @return
     */
    private List<ItemClassTreeVo> getChildList(List<ItemClassTreeVo> itemClassTreeVoLists, ItemClassTreeVo itemClassTreeVoList) {
        List<ItemClassTreeVo> itList = new ArrayList<ItemClassTreeVo>();
        Iterator<ItemClassTreeVo> iitLists = itemClassTreeVoLists.iterator();
        while (iitLists.hasNext()){
            ItemClassTreeVo p= (ItemClassTreeVo) iitLists.next();
            if(StringUtils.isNotNull(p.getParentguid()) && p.getParentguid().equals(itemClassTreeVoList.getGuid())){
                itList.add(p);
            }
        }
        return itList;
    }

    private boolean hasChild(List<ItemClassTreeVo> itemClassTreeVoLists, ItemClassTreeVo itemClassTreeVoChild) {
        return getChildList(itemClassTreeVoLists,itemClassTreeVoChild).size() > 0;
    }
}
