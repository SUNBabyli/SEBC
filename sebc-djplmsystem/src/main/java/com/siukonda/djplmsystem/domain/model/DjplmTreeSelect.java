package com.siukonda.djplmsystem.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.siukonda.djplmsystem.domain.MaClassificationDetail;
import com.siukonda.djplmsystem.domain.vo.ItemClassTreeVo;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 鼎捷PLM的物料列表树结构实体类
 * @author zhaoyang
 * @create 2022-08-22 19:06
 */
public class DjplmTreeSelect implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 节点ID */
    private String id;

    /** 节点名称 */
    private String label;

    /** 列表内容分类代码标识 */
    private String classtype;

    /** 子节点 */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DjplmTreeSelect> children;

    public DjplmTreeSelect()
    {

    }

    public DjplmTreeSelect(MaClassificationDetail maClassificationDetail)
    {
        this.id = maClassificationDetail.getGuid();
        this.label = maClassificationDetail.getTitle();
        this.children = maClassificationDetail.getChildren().stream().map(DjplmTreeSelect::new).collect(Collectors.toList());
    }


    public DjplmTreeSelect(ItemClassTreeVo itemClassTreeVo)
    {
        this.id = itemClassTreeVo.getGuid();
        this.label = itemClassTreeVo.getTitle();
        this.classtype = itemClassTreeVo.getClasstype();
        this.children = itemClassTreeVo.getChildren().stream().map(DjplmTreeSelect::new).collect(Collectors.toList());
    }

    // public DjplmTreeSelect(SysMenu menu)
    // {
    //     this.id = menu.getMenuId();
    //     this.label = menu.getMenuName();
    //     this.children = menu.getChildren().stream().map(DjplmTreeSelect::new).collect(Collectors.toList());
    // }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public List<DjplmTreeSelect> getChildren()
    {
        return children;
    }

    public void setChildren(List<DjplmTreeSelect> children)
    {
        this.children = children;
    }
}
