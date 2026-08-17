package com.siukonda.djplmsystem.domain.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义查询物料列表 ItemClassTreeVo
 * @author zhaoyang
 * @create 2022-08-16 15:47
 */
public class ItemClassTreeVo {

    private static final long seriaVersionUID = 1L;

    /** 唯一标识符 */
    private String guid;

    /** 分级类型大类标识符 */
    private String masterfk;

    /** 多语种标题 */
    private String title;

    /** 父类标识符 */
    private String parentguid;

    /** 自定义字段：查询内容分类对应的表 */
    private String classtype;

    /** 自定义：子分类节点 */
    private List<ItemClassTreeVo> children = new ArrayList<>();


    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getMasterfk() {
        return masterfk;
    }

    public void setMasterfk(String masterfk) {
        this.masterfk = masterfk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentguid() {
        return parentguid;
    }

    public void setParentguid(String parentguid) {
        this.parentguid = parentguid;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public List<ItemClassTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<ItemClassTreeVo> children) {
        this.children = children;
    }

    public ItemClassTreeVo(String guid, String masterfk, String title, String parentguid, String classtype){
        this.guid = guid;
        this.masterfk = masterfk;
        this.title = title;
        this.parentguid = parentguid;
        this.classtype = classtype;
    }

    public ItemClassTreeVo(){}
}
