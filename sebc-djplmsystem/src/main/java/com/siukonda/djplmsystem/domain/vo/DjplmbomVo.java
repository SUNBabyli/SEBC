package com.siukonda.djplmsystem.domain.vo;

import com.siukonda.common.annotation.Excel;
import com.siukonda.common.annotation.Excel.ColumnType;
import com.siukonda.common.core.domain.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

/**
 * 鼎捷PLM产品BOM对象 djplmbom
 *
 * @author hcx
 * @date 2022-09-23
 */
public class DjplmbomVo extends TreeEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 父阶号
     */
    private String parentnum;

    /**
     * 子阶号
     */
    private String subnum;

    /**
     * 是否添加进展示
     */
    private boolean showfalg;

    /**
     * BOM层级码
     */
    @Excel(name = "层级码")
    private String indexrow;

    /**
     * 父guid
     */
    private String parentguid;

    /**
     * 子guid
     */
    private String subguid;

    /**
     * 料号
     */
    @Excel(name = "料号")
    private String subid;

    /**
     * 是否检出状态
     */
    private Boolean ischeckout;

    /**
     * 版本
     */
    @Excel(name = "版本号")
    private String revisionid;

    /**
     * 状态
     */
    private String status;

    /**
     * CPC编码
     */
    @Excel(name = "CPC编码")
    private String oldid;

    /**
     * 规格型号
     */
    @Excel(name = "规格型号")
    private String specification;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String name;

    /**
     * 阶顺序
     */
    private int sequence;

    /**
     * 是否有取替代
     */
    private Boolean rsflag;

    /**
     * 是否来自CAD
     */
    private Boolean isfromcad;

    /**
     * 组成用量
     */
    @Excel(name = "组成用量", cellType = ColumnType.NUMERIC)
    private double quantity;

    /**
     * 底数
     */
    private int base;

    /**
     * 层
     */
    private String layer;

    /**
     * 位号
     */
    private String designators;

    /**
     * BOM工序
     */
    @Excel(name = "BOM工序")
    private String process;

    /**
     * 生产备注
     */
    private String scbz;

    /**
     * 分类
     */
    @Excel(name = "分类")
    private String classification;

    /**
     * 重量(kg)
     */
    private String weight;

    /**
     * 备注
     */
    private String remark;

    /**
     * 描述
     */
    private String descibe;

    /**
     * 材质
     */
    @Excel(name = "材质")
    private String cz;

    /**
     * 品号类型
     */
    @Excel(name = "品号类型")
    private String sourcetype;

    /**
     * 工艺属性
     */
    private String gysx;

    /**
     * 喷涂颜色
     */
    private String ptys;

    /**
     * 规格参数
     */
    private String ggcs;

    /**
     * 成型长宽高
     */
    private String cxckg;

    /**
     * 展开长
     */
    @Excel(name = "展开长")
    private double zkc;

    /**
     * 展开厚
     */
    @Excel(name = "展开厚")
    private double zkg;

    /**
     * 展开宽
     */
    @Excel(name = "展开宽")
    private double zkk;

    /**
     * 单位用量
     */
    private double dwyl;

    /**
     * 表面处理
     */
    private String bmcl;

    /**
     * CPC图号
     */
    @Excel(name = "CPC图号")
    private String cpcid;

    /**
     * 机组全型号
     */
    private String jzqxh;

    /**
     * 机组型号
     */
    private String jzxh;

    /**
     * 是否标准机
     */
    private String sfbzj;

    /**
     * 单位
     */
    @Excel(name = "单位")
    private String zdw;

    /**
     * 所属图号
     */
    private String ssth;

    /**
     * 图号
     */
    @Excel(name = "图号")
    private String th;

    /**
     * 系列型号
     */
    private String xlxh;

    /**
     * 焊接件
     */
    private String hjj;

    /**
     * 加工类型
     */
    private String jglx;

    /**
     * 加工方式
     */
    private String jgfs;

    /**
     * 材料类型
     */
    private String cllx;

    /**
     * 有BOM标识
     */
    private String viewfkname;

    /**
     * BomView_guid标识
     */
    private String viewfk;

    /**
     * 图纸数量
     */
    private Integer drawingnum;

    /**
     * 检查有无图纸
     */
    private Boolean checkDrawingExist;

    public String getIndexrow() {
        return indexrow;
    }

    public void setIndexrow(String indexrow) {
        this.indexrow = indexrow;
    }

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

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public Boolean getIscheckout() {
        return ischeckout;
    }

    public void setIscheckout(Boolean ischeckout) {
        this.ischeckout = ischeckout;
    }

    public String getRevisionid() {
        return revisionid;
    }

    public void setRevisionid(String revisionid) {
        this.revisionid = revisionid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOldid() {
        return oldid;
    }

    public void setOldid(String oldid) {
        this.oldid = oldid;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Boolean getRsflag() {
        return rsflag;
    }

    public void setRsflag(Boolean rsflag) {
        this.rsflag = rsflag;
    }

    public Boolean getIsfromcad() {
        return isfromcad;
    }

    public void setIsfromcad(Boolean isfromcad) {
        this.isfromcad = isfromcad;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getDesignators() {
        return designators;
    }

    public void setDesignators(String designators) {
        this.designators = designators;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process.split(";")[1];
    }

    public String getScbz() {
        return scbz;
    }

    public void setScbz(String scbz) {
        this.scbz = scbz;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescibe() {
        return descibe;
    }

    public void setDescibe(String descibe) {
        this.descibe = descibe;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype.split(";")[1];
    }

    public String getGysx() {
        return gysx;
    }

    public void setGysx(String gysx) {
        this.gysx = gysx;
    }

    public String getPtys() {
        return ptys;
    }

    public void setPtys(String ptys) {
        this.ptys = ptys;
    }

    public String getGgcs() {
        return ggcs;
    }

    public void setGgcs(String ggcs) {
        this.ggcs = ggcs;
    }

    public String getCxckg() {
        return cxckg;
    }

    public void setCxckg(String cxckg) {
        this.cxckg = cxckg;
    }

    public double getZkc() {
        return zkc;
    }

    public void setZkc(double zkc) {
        this.zkc = zkc;
    }

    public double getZkg() {
        return zkg;
    }

    public void setZkg(double zkg) {
        this.zkg = zkg;
    }

    public double getZkk() {
        return zkk;
    }

    public void setZkk(double zkk) {
        this.zkk = zkk;
    }

    public double getDwyl() {
        return dwyl;
    }

    public void setDwyl(double dwyl) {
        this.dwyl = dwyl;
    }

    public String getBmcl() {
        return bmcl;
    }

    public void setBmcl(String bmcl) {
        this.bmcl = bmcl;
    }

    public String getCpcid() {
        return cpcid;
    }

    public void setCpcid(String cpcid) {
        this.cpcid = cpcid;
    }

    public String getJzqxh() {
        return jzqxh;
    }

    public void setJzqxh(String jzqxh) {
        this.jzqxh = jzqxh;
    }

    public String getJzxh() {
        return jzxh;
    }

    public void setJzxh(String jzxh) {
        this.jzxh = jzxh;
    }

    public String getSfbzj() {
        return sfbzj;
    }

    public void setSfbzj(String sfbzj) {
        this.sfbzj = sfbzj;
    }

    public String getZdw() {
        return zdw;
    }

    public void setZdw(String zdw) {
        this.zdw = zdw.split(";")[1];
    }

    public String getSsth() {
        return ssth;
    }

    public void setSsth(String ssth) {
        this.ssth = ssth;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    public String getXlxh() {
        return xlxh;
    }

    public void setXlxh(String xlxh) {
        this.xlxh = xlxh;
    }

    public String getHjj() {
        return hjj;
    }

    public void setHjj(String hjj) {
        this.hjj = hjj;
    }

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public String getJgfs() {
        return jgfs;
    }

    public void setJgfs(String jgfs) {
        this.jgfs = jgfs;
    }

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    public String getViewfkname() {
        return viewfkname;
    }

    public void setViewfkname(String viewfkname) {
        this.viewfkname = viewfkname;
    }

    public String getViewfk() {
        return viewfk;
    }

    public void setViewfk(String viewfk) {
        this.viewfk = viewfk;
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

    public boolean getShowfalg() {
        return showfalg;
    }

    public void setShowfalg(boolean showfalg) {
        this.showfalg = showfalg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DjplmbomVo)) return false;
        DjplmbomVo that = (DjplmbomVo) o;
        return Objects.equals(parentnum, that.parentnum) && Objects.equals(parentguid, that.parentguid) && Objects.equals(subguid, that.subguid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentnum, parentguid, subguid);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("parentnum",getParentnum())
                .append("subnum",getSubnum())
                .append("showfalg",getShowfalg())
                .append("indexrow", getIndexrow())
                .append("parentguid", getParentguid())
                .append("subguid", getSubguid())
                .append("subid", getSubid())
                .append("ischeckout", getIscheckout())
                .append("revisionid", getRevisionid())
                .append("status", getStatus())
                .append("oldid", getOldid())
                .append("specification", getSpecification())
                .append("name", getName())
                .append("sequence", getSequence())
                .append("rsflag", getRsflag())
                .append("isfromcad", getIsfromcad())
                .append("quantity", getQuantity())
                .append("base", getBase())
                .append("layer", getLayer())
                .append("designators", getDesignators())
                .append("process", getProcess())
                .append("scbz", getScbz())
                .append("classification", getClassification())
                .append("weight", getWeight())
                .append("remark", getRemark())
                .append("", getRevisionid())
                .append("descibe", getDescibe())
                .append("cz", getCz())
                .append("sourcetype", getSourcetype())
                .append("gysx", getGysx())
                .append("ptys", getPtys())
                .append("ggcs", getGgcs())
                .append("cxckg", getCxckg())
                .append("zkc", getZkc())
                .append("zkg", getZkg())
                .append("zkk", getZkk())
                .append("dwyl", getDwyl())
                .append("bmcl", getBmcl())
                .append("cpcid", getCpcid())
                .append("jzqxh", getJzqxh())
                .append("jzxh", getJzxh())
                .append("sfbzj", getSfbzj())
                .append("zdw", getZdw())
                .append("ssth", getSsth())
                .append("th", getTh())
                .append("xlxh", getXlxh())
                .append("hjj", getHjj())
                .append("jglx", getJglx())
                .append("jgfs", getJgfs())
                .append("cllx", getCllx())
                .append("viewfkname", getViewfkname())
                .append("viewfk", getViewfk())
                .append("drawingnum",getDrawingnum())
                .append("checkDrawingExist", getCheckDrawingExist())
                .toString();
    }
}
