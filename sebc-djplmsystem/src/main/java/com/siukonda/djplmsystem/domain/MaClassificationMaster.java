package com.siukonda.djplmsystem.domain;

/**
 * @author zhaoyang
 * @create 2022-08-17 9:50
 */

import com.siukonda.common.annotation.Excel;
import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 分级类型分类表对象 ma_classification_master
 *
 * @author hcx
 * @date 2022-08-17
 */
public class MaClassificationMaster extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识符 */
    @Excel(name = "唯一标识符")
    private String guid;

    /** 分级类型分类名称 */
    @Excel(name = "分级类型分类名称")
    private String groupname;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createuserguid;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updateuserguid;

    /** 分类详细名称 */
    @Excel(name = "分类详细名称")
    private String title;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 显示类型 */
    @Excel(name = "显示类型")
    private String showtype;

    /** 对应的基表 */
    @Excel(name = "对应的基表")
    private String basetablename;

    /** 删除标志 */
    @Excel(name = "删除标志")
    private String delflag;

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public String getGuid()
    {
        return guid;
    }
    public void setGroupname(String groupname)
    {
        this.groupname = groupname;
    }

    public String getGroupname()
    {
        return groupname;
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
    public void setTitle(String title)
    {
        this.title = title.split(";")[1];
    }

    public String getTitle()
    {
        return title;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setShowtype(String showtype)
    {
        this.showtype = showtype;
    }

    public String getShowtype()
    {
        return showtype;
    }
    public void setBasetablename(String basetablename)
    {
        this.basetablename = basetablename;
    }

    public String getBasetablename()
    {
        return basetablename;
    }
    public void setDelflag(String delflag)
    {
        this.delflag = delflag;
    }

    public String getDelflag()
    {
        return delflag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("guid", getGuid())
                .append("groupname", getGroupname())
                .append("createuserguid", getCreateuserguid())
                .append("createTime", getCreateTime())
                .append("updateuserguid", getUpdateuserguid())
                .append("updateTime", getUpdateTime())
                .append("title", getTitle())
                .append("description", getDescription())
                .append("name", getName())
                .append("type", getType())
                .append("showtype", getShowtype())
                .append("basetablename", getBasetablename())
                .append("delflag", getDelflag())
                .toString();
    }
}
