package com.siukonda.djplmsystem.domain.vo;

import com.siukonda.common.annotation.Excel;
import com.siukonda.common.core.domain.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author zhaoyang
 * @create 2022-11-10 15:14
 */
public class DjplmIncludeVo extends TreeEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父阶号
     */
    private String parentnum;

    /**
     * 子阶号
     */
    @Excel(name = "层级")
    private String subnum;

//    /**
//     * BOM层级码
//     */
//    @Excel(name = "行数")
//    private String indexrow;

    /**
     * 父guid
     */
    private String parentguid;

    /**
     * 子guid
     */
    private String subguid;

    /**
     * 大类
     */
    @Excel(name = "大类")
    private String description;

    /**
     * 料号
     */
    @Excel(name = "料号")
    private String subid;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String name;

    /**
     * 规格型号
     */
    @Excel(name = "规格型号")
    private String specification;

    /**
     * 分类
     */
    @Excel(name = "分类")
    private String classification;

    /**
     * 品号类型
     */
    @Excel(name = "品号类型")
    private String sourcetype;

    /**
     * 版本
     */
    @Excel(name = "版本号")
    private String revisionid;

    /**
     * 状态
     */
    @Excel(name = "发布状态")
    private String status;

    public String getParentnum() {
        return parentnum;
    }

    public void setParentnum(String parentnum) {
        this.parentnum = parentnum;
    }

    public String getSubnum() {
        return subnum;
    }

    public void setSubnum(String subnum) {
        this.subnum = subnum;
    }

//    public String getIndexrow() {
//        return indexrow;
//    }
//
//    public void setIndexrow(String indexrow) {
//        this.indexrow = indexrow;
//    }

    public String getParentguid() {
        return parentguid;
    }

    public void setParentguid(String parentguid) {
        this.parentguid = parentguid;
    }

    public String getSubguid() {
        return subguid;
    }

    public void setSubguid(String subguid) {
        this.subguid = subguid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getRevisionid() {
        return revisionid;
    }

    public void setRevisionid(String revisionid) {
        this.revisionid = revisionid;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype.split(";")[1];
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("parentnum", getParentnum())
                .append("subnum", getSubnum())
//                .append("indexrow", getIndexrow())
                .append("parentguid", getParentguid())
                .append("subguid", getSubguid())
                .append("description",getDescription())
                .append("subid", getSubid())
                .append("name", getName())
                .append("specification", getSpecification())
                .append("classification", getClassification())
                .append("revisionid", getRevisionid())
                .append("sourcetype",getSourcetype())
                .append("status", getStatus())
                .toString();
    }
}
