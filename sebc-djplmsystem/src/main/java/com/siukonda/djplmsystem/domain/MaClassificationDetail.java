package com.siukonda.djplmsystem.domain;

import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyang
 * @create 2022-08-21 14:31
 */
public class MaClassificationDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 唯一标识符 */
    private String guid;

    /** 大类标识符 */
    private String masterfk;

    /** 父类标识符 */
    private String parentguid;

    /** 标题 */
    private String title;

    /** 分类明细的名称 */
    private String name;

    /** 创建者 */
    private String createuserguid;

    /** 更新者 */
    private String updateuserguid;

    /** 描述 */
    private String description;

    /** 序号 */
    private Long sequence;

    /** 代码 */
    private String code;

    /** 树显示 */
    private String upoftree;

    /** 缩略图 */
    private String iconpath;

    /** 符号图 */
    private String symbolpath;

    /** 删除标识 */
    private String delflag;

    /** 暂时不知用途 */
    private String classification1;

    /** 子分类 */
    private List<MaClassificationDetail> children = new ArrayList<MaClassificationDetail>();

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public String getGuid()
    {
        return guid;
    }
    public void setMasterfk(String masterfk)
    {
        this.masterfk = masterfk;
    }

    public String getMasterfk()
    {
        return masterfk;
    }
    public void setParentguid(String parentguid)
    {
        this.parentguid = parentguid;
    }

    public String getParentguid()
    {
        return parentguid;
    }
    public void setTitle(String title)
    {
        this.title = title.split(";")[1];
    }

    public String getTitle()
    {
        return title;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setCreateuserguid(String createuserguid)
    {
        this.createuserguid = createuserguid;
    }

    public String getCreateuserguid()
    {
        return createuserguid;
    }
    public void setUpdateuserguid(String updateuserguid)
    {
        this.updateuserguid = updateuserguid;
    }

    public String getUpdateuserguid()
    {
        return updateuserguid;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setSequence(Long sequence)
    {
        this.sequence = sequence;
    }

    public Long getSequence()
    {
        return sequence;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setUpoftree(String upoftree)
    {
        this.upoftree = upoftree;
    }

    public String getUpoftree()
    {
        return upoftree;
    }
    public void setIconpath(String iconpath)
    {
        this.iconpath = iconpath;
    }

    public String getIconpath()
    {
        return iconpath;
    }
    public void setSymbolpath(String symbolpath)
    {
        this.symbolpath = symbolpath;
    }

    public String getSymbolpath()
    {
        return symbolpath;
    }
    public void setDelflag(String delflag)
    {
        this.delflag = delflag;
    }

    public String getDelflag()
    {
        return delflag;
    }
    public void setClassification1(String classification1)
    {
        this.classification1 = classification1;
    }

    public String getClassification1()
    {
        return classification1;
    }

    public List<MaClassificationDetail> getChildren() {
        return children;
    }

    public void setChildren(List<MaClassificationDetail> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("guid", getGuid())
                .append("masterfk", getMasterfk())
                .append("parentguid", getParentguid())
                .append("title", getTitle())
                .append("name", getName())
                .append("createuserguid", getCreateuserguid())
                .append("createTime", getCreateTime())
                .append("updateuserguid", getUpdateuserguid())
                .append("updateTime", getUpdateTime())
                .append("description", getDescription())
                .append("sequence", getSequence())
                .append("code", getCode())
                .append("upoftree", getUpoftree())
                .append("iconpath", getIconpath())
                .append("symbolpath", getSymbolpath())
                .append("delflag", getDelflag())
                .append("classification1", getClassification1())
                .toString();
    }

}
