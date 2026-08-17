package com.siukonda.djplmsystem.domain;

import com.siukonda.common.core.domain.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实例对象类型对象 ma_class
 *
 * @author hcx
 * @date 2022-08-15
 */
public class MaClass extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识符 */
    private String guid;

    /** 类型名称 */
    private String classname;

    /** 父类标识符 */
    private String superclassguid;

    /** 描述 */
    private String description;

    /** 是否内建 */
    private String isbuiltin;

    /** 创建者 */
    private String createuserguid;

    /** 更新者 */
    private String updateuserguid;

    /** 对应的基表 */
    private String basetablename;

    /** 生命周期分类标识符 */
    private String lifecycle;

    /** 接口名称 */
    private String interfaces;

    /** 是否不被查询 */
    private String nonqueryable;

    /** 父接口 */
    private String superinterface;

    /** 版序限制 */
    private String iterationlimit;

    /** 实例字符 */
    private String instancestring;

    /** 分类 */
    private String classification;

    /** 是否抽象 */
    private String maabstract;

    /** 是否终结 */
    private String mafinal;

    /** 图标路径 */
    private String iconpath;

    /** 是否显示预览图 */
    private String showpreview;

    /** $column.columnComment */
    private String iconpath32;

    /** $column.columnComment */
    private String upoftree;

    /** $column.columnComment */
    private String iscreatetable;

    /** 删除标志 */
    private String delflag;

    /** 实例对象对应的基表 */
    private String realbasetablename;

    /**  */
    private String isidunique;

    /** $column.columnComment */
    private String clz1;

    /** $column.columnComment */
    private String clz2;

    /** $column.columnComment */
    private String clz3;

    /** $column.columnComment */
    private String clz4;

    /** $column.columnComment */
    private String clz5;

    /** $column.columnComment */
    private String clz6;

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public String getGuid()
    {
        return guid;
    }
    public void setClassname(String classname)
    {
        this.classname = classname;
    }

    public String getClassname()
    {
        return classname;
    }
    public void setSuperclassguid(String superclassguid)
    {
        this.superclassguid = superclassguid;
    }

    public String getSuperclassguid()
    {
        return superclassguid;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setIsbuiltin(String isbuiltin)
    {
        this.isbuiltin = isbuiltin;
    }

    public String getIsbuiltin()
    {
        return isbuiltin;
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
    public void setBasetablename(String basetablename)
    {
        this.basetablename = basetablename;
    }

    public String getBasetablename()
    {
        return basetablename;
    }
    public void setLifecycle(String lifecycle)
    {
        this.lifecycle = lifecycle;
    }

    public String getLifecycle()
    {
        return lifecycle;
    }
    public void setInterfaces(String interfaces)
    {
        this.interfaces = interfaces;
    }

    public String getInterfaces()
    {
        return interfaces;
    }
    public void setNonqueryable(String nonqueryable)
    {
        this.nonqueryable = nonqueryable;
    }

    public String getNonqueryable()
    {
        return nonqueryable;
    }
    public void setSuperinterface(String superinterface)
    {
        this.superinterface = superinterface;
    }

    public String getSuperinterface()
    {
        return superinterface;
    }
    public void setIterationlimit(String iterationlimit)
    {
        this.iterationlimit = iterationlimit;
    }

    public String getIterationlimit()
    {
        return iterationlimit;
    }
    public void setInstancestring(String instancestring)
    {
        this.instancestring = instancestring;
    }

    public String getInstancestring()
    {
        return instancestring;
    }
    public void setClassification(String classification)
    {
        this.classification = classification;
    }

    public String getClassification()
    {
        return classification;
    }
    public void setMaabstract(String maabstract)
    {
        this.maabstract = maabstract;
    }

    public String getMaabstract()
    {
        return maabstract;
    }
    public void setMafinal(String mafinal)
    {
        this.mafinal = mafinal;
    }

    public String getMafinal()
    {
        return mafinal;
    }
    public void setIconpath(String iconpath)
    {
        this.iconpath = iconpath;
    }

    public String getIconpath()
    {
        return iconpath;
    }
    public void setShowpreview(String showpreview)
    {
        this.showpreview = showpreview;
    }

    public String getShowpreview()
    {
        return showpreview;
    }
    public void setIconpath32(String iconpath32)
    {
        this.iconpath32 = iconpath32;
    }

    public String getIconpath32()
    {
        return iconpath32;
    }
    public void setUpoftree(String upoftree)
    {
        this.upoftree = upoftree;
    }

    public String getUpoftree()
    {
        return upoftree;
    }
    public void setIscreatetable(String iscreatetable)
    {
        this.iscreatetable = iscreatetable;
    }

    public String getIscreatetable()
    {
        return iscreatetable;
    }
    public void setDelflag(String delflag)
    {
        this.delflag = delflag;
    }

    public String getDelflag()
    {
        return delflag;
    }
    public void setRealbasetablename(String realbasetablename)
    {
        this.realbasetablename = realbasetablename;
    }

    public String getRealbasetablename()
    {
        return realbasetablename;
    }
    public void setIsidunique(String isidunique)
    {
        this.isidunique = isidunique;
    }

    public String getIsidunique()
    {
        return isidunique;
    }
    public void setClz1(String clz1)
    {
        this.clz1 = clz1;
    }

    public String getClz1()
    {
        return clz1;
    }
    public void setClz2(String clz2)
    {
        this.clz2 = clz2;
    }

    public String getClz2()
    {
        return clz2;
    }
    public void setClz3(String clz3)
    {
        this.clz3 = clz3;
    }

    public String getClz3()
    {
        return clz3;
    }
    public void setClz4(String clz4)
    {
        this.clz4 = clz4;
    }

    public String getClz4()
    {
        return clz4;
    }
    public void setClz5(String clz5)
    {
        this.clz5 = clz5;
    }

    public String getClz5()
    {
        return clz5;
    }
    public void setClz6(String clz6)
    {
        this.clz6 = clz6;
    }

    public String getClz6()
    {
        return clz6;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("guid", getGuid())
                .append("classname", getClassname())
                .append("superclassguid", getSuperclassguid())
                .append("description", getDescription())
                .append("isbuiltin", getIsbuiltin())
                .append("createTime", getCreateTime())
                .append("createuserguid", getCreateuserguid())
                .append("updateTime", getUpdateTime())
                .append("updateuserguid", getUpdateuserguid())
                .append("basetablename", getBasetablename())
                .append("lifecycle", getLifecycle())
                .append("interfaces", getInterfaces())
                .append("nonqueryable", getNonqueryable())
                .append("superinterface", getSuperinterface())
                .append("iterationlimit", getIterationlimit())
                .append("instancestring", getInstancestring())
                .append("classification", getClassification())
                .append("maabstract", getMaabstract())
                .append("mafinal", getMafinal())
                .append("iconpath", getIconpath())
                .append("showpreview", getShowpreview())
                .append("iconpath32", getIconpath32())
                .append("upoftree", getUpoftree())
                .append("iscreatetable", getIscreatetable())
                .append("delflag", getDelflag())
                .append("realbasetablename", getRealbasetablename())
                .append("isidunique", getIsidunique())
                .append("clz1", getClz1())
                .append("clz2", getClz2())
                .append("clz3", getClz3())
                .append("clz4", getClz4())
                .append("clz5", getClz5())
                .append("clz6", getClz6())
                .toString();
    }
}