package com.siukonda.djplmsystem.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.siukonda.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * @author zhaoyang
 * @create 2022-08-21 14:58
 */
public class ItemVo {

    private static final long serialVersionUID = 1L;

    /** 物料全局唯一码*/
    private String guid;

    /** 料号 */
    @Excel(name = "料号")
    private String itemId;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 大类 */
    @Excel(name = "大类")
    private String mdescription;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specification;

    private String classification;

    /** 旧CPC编码 */
    @Excel(name = "CPC编码")
    private String f000070;

    /** 旧图号 */
    @Excel(name = "旧图号")
    private String f000142;

    /** 新图号 */
    @Excel(name = "新图号")
    private String f000147;

    /** 业务类别 */
    @Excel(name = "业务类别")
    private String adescription;

    /** 单位 */
    @Excel(name = "单位")
    private String bdescription;

    /** 是否有BOM */
    private String isbommodified;

    /** 标准机 */
    @Excel(name = "标准机")
    private String f000181;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间")
    private Date iupdatetime;

    /**
     * 图纸数量
     */
    private Integer drawingnum;

    /**
     * 检查有无图纸
     */
    private Boolean checkDrawingExist;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getF000070() {
        return f000070;
    }

    public void setF000070(String f000070) {
        this.f000070 = f000070;
    }

    public String getF000142() {
        return f000142;
    }

    public void setF000142(String f000142) {
        this.f000142 = f000142;
    }

    public String getF000147() {
        return f000147;
    }

    public void setF000147(String f000147) {
        this.f000147 = f000147;
    }

    public String getF000181() {
        return f000181;
    }

    public void setF000181(String f000181) {
        this.f000181 = f000181;
    }

    public String getIsbommodified() {
        return isbommodified;
    }

    public void setIsbommodified(String isbommodified) {
        this.isbommodified = isbommodified;
    }

    public String getAdescription() {
        return adescription;
    }

    public void setAdescription(String adescription) {
        this.adescription = adescription;
    }

    public String getBdescription() {
        return bdescription;
    }

    public void setBdescription(String bdescription) {
        this.bdescription = bdescription;
    }


    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Date getIupdatetime() {
        return iupdatetime;
    }

    public void setIupdatetime(Date iupdatetime) {
        this.iupdatetime = iupdatetime;
    }

    public Integer getDrawingnum() {
        return drawingnum;
    }

    public void setDrawingnum(Integer drawingnum) {
        this.drawingnum = drawingnum;
    }

    public Boolean getCheckDrawingExist() {
        return checkDrawingExist;
    }

    public void setCheckDrawingExist(Boolean checkDrawingExist) {
        this.checkDrawingExist = checkDrawingExist;
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("itemId",getItemId())
                .append("name",getName())
                .append("mdescription",getMdescription())
                .append("specification",getSpecification())
                .append("classification",getClassification())
                .append("f000070",getF000070())
                .append("f000142",getF000142())
                .append("f000147",getF000147())
                .append("f000181",getF000181())
                .append("isbommodified",getIsbommodified())
                .append("adescription",getAdescription())
                .append("bdescription",getBdescription())
                .append("guid",getGuid())
                .append("iupdatetime",getIupdatetime())
                .append("drawingnum",getDrawingnum())
                .append("checkDrawingExist", getCheckDrawingExist())
                .toString();
    }
}
