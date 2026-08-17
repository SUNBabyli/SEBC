package com.siukonda.djerpsystem.domain.vo;

import com.siukonda.common.annotation.Excel;
import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaoyang
 * @create 2023-07-20 22:41
 * E10总装工单单身
 */
public class Modetail extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /**
     * 序列号
     **/
    @Excel(name="序列号")
    private String sequencenumber;
    /**
     * 工单行ID
     **/
    private String mo_d_id;
    /**
     * 仓库
     **/
    private String warehouse_id;
    /**
     * 仓库名称
     **/
    @Excel(name="仓库")
    private String warehouse_name;
    /**
     * 供料方式
     **/
    @Excel(name="供料方式" , readConverterExp ="0=全部,1=厂内供料,3=供货商供料,5=客户供料,4=不发料,6=委托方供料")
    private String item_type;
    /**
     * 领料模式
     **/
    @Excel(name="领料模式" , readConverterExp ="0=直接发料,1=领料申请,2=自动扣料")
    private String issue_type;
    /**
     * 工艺ID
     **/
    private String operation_id;
    /**
     * 工艺
     **/
    @Excel(name="工艺")
    private String operation_name;
    /**
     * 材料品号ID
     **/
    private String item_id;
    /**
     * 品号
     **/
    @Excel(name="品号")
    private String item_code;
    /**
     * 品名
     **/
    @Excel(name="品名")
    private String item_description;
    /**
     * 规格
     **/
    @Excel(name="规格")
    private String item_specification;
    /**
     * 单位ID
     **/
    private String unit_id;
    /**
     * 单位
     **/
    @Excel(name="单位")
    private String unit_name;
    /**
     * 预计用量
     **/
    private BigDecimal required_qty;
    /**
     * 需领用量
     **/
    @Excel(name="需领用量")
    private BigDecimal requ_include_mult_qty;
    /**
     * 被取替代数量
     **/
    private BigDecimal replaced_qty;
    /**
     * 已领用量
     **/
    @Excel(name="已领用量")
    private BigDecimal issued_qty;
    /**
     * 预计领料日期
     **/
    private Date plan_issue_date;
    /**
     * 实际领料日期
     **/
    private Date actual_issue_date;
    /**
     * 备注意见
     **/
    private String remark;
    /**
     * 特征码
     **/
    private String item_feature_id;
    /**
     * 库位
     **/
    private String bin_id;
    /**
     * 批号
     **/
    private String item_lot_id;
    /**
     * 预计用量第二数量
     **/
    private BigDecimal required_second_qty;
    /**
     * 已领用量第二数量
     **/
    private BigDecimal issued_second_qty;
    /**
     * 已申请量
     **/
    private BigDecimal issued_req_qty;
    /**
     * 已申请第二数量
     **/
    private BigDecimal issued_req_second_qty;
    /**
     * 工单材料图片
     **/
    private String mo_d_pic;
    /**
     * 最低用量
     **/
    private BigDecimal least_required_qty;
    /**
     * 调拨数量
     **/
    private BigDecimal transfer_qty;
    /**
     * 工序
     **/
    private String mo_routing_d_id;
    /**
     * 非工单料件
     **/
    private String not_mo_materail;
    /**
     * 版本
     **/
    private String version;
    /**
     * 创建日期
     **/
    private Date createdate;
    /**
     * 最后修改日期
     **/
    private Date lastmodifieddate;
    /**
     * 修改日期
     **/
    private Date modifieddate;
    /**
     * 创建者
     **/
    private String createby;
    /**
     * 最后修改者
     **/
    private String lastmodifiedby;
    /**
     * 修改者
     **/
    private String modifiedby;
    /**
     * 单据状态属性
     **/
    private String approvestatus;
    /**
     * 修改日期
     **/
    private Date approvedate;
    /**
     * 修改人
     **/
    private String approveby;
    /**
     * 工单ID
     **/
    private String mo_id;

    public String getSequencenumber() {
        return sequencenumber;
    }

    public void setSequencenumber(String sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    public String getMo_d_id() {
        return mo_d_id;
    }

    public void setMo_d_id(String mo_d_id) {
        this.mo_d_id = mo_d_id;
    }

    public String getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getIssue_type() {
        return issue_type;
    }

    public void setIssue_type(String issue_type) {
        this.issue_type = issue_type;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getOperation_id() {
        return operation_id;
    }

    public void setOperation_id(String operation_id) {
        this.operation_id = operation_id;
    }

    public String getOperation_name() {
        return operation_name;
    }

    public void setOperation_name(String operation_name) {
        this.operation_name = operation_name;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_specification() {
        return item_specification;
    }

    public void setItem_specification(String item_specification) {
        this.item_specification = item_specification;
    }

    public String getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(String unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public BigDecimal getRequired_qty() {
        return required_qty;
    }

    public void setRequired_qty(BigDecimal required_qty) {
        this.required_qty = required_qty;
    }

    public BigDecimal getRequ_include_mult_qty() {
        return requ_include_mult_qty;
    }

    public void setRequ_include_mult_qty(BigDecimal requ_include_mult_qty) {
        this.requ_include_mult_qty = requ_include_mult_qty;
    }

    public BigDecimal getReplaced_qty() {
        return replaced_qty;
    }

    public void setReplaced_qty(BigDecimal replaced_qty) {
        this.replaced_qty = replaced_qty;
    }

    public BigDecimal getIssued_qty() {
        return issued_qty;
    }

    public void setIssued_qty(BigDecimal issued_qty) {
        this.issued_qty = issued_qty;
    }

    public Date getPlan_issue_date() {
        return plan_issue_date;
    }

    public void setPlan_issue_date(Date plan_issue_date) {
        this.plan_issue_date = plan_issue_date;
    }

    public Date getActual_issue_date() {
        return actual_issue_date;
    }

    public void setActual_issue_date(Date actual_issue_date) {
        this.actual_issue_date = actual_issue_date;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getItem_feature_id() {
        return item_feature_id;
    }

    public void setItem_feature_id(String item_feature_id) {
        this.item_feature_id = item_feature_id;
    }

    public String getBin_id() {
        return bin_id;
    }

    public void setBin_id(String bin_id) {
        this.bin_id = bin_id;
    }

    public String getItem_lot_id() {
        return item_lot_id;
    }

    public void setItem_lot_id(String item_lot_id) {
        this.item_lot_id = item_lot_id;
    }

    public BigDecimal getRequired_second_qty() {
        return required_second_qty;
    }

    public void setRequired_second_qty(BigDecimal required_second_qty) {
        this.required_second_qty = required_second_qty;
    }

    public BigDecimal getIssued_second_qty() {
        return issued_second_qty;
    }

    public void setIssued_second_qty(BigDecimal issued_second_qty) {
        this.issued_second_qty = issued_second_qty;
    }

    public BigDecimal getIssued_req_qty() {
        return issued_req_qty;
    }

    public void setIssued_req_qty(BigDecimal issued_req_qty) {
        this.issued_req_qty = issued_req_qty;
    }

    public BigDecimal getIssued_req_second_qty() {
        return issued_req_second_qty;
    }

    public void setIssued_req_second_qty(BigDecimal issued_req_second_qty) {
        this.issued_req_second_qty = issued_req_second_qty;
    }

    public String getMo_d_pic() {
        return mo_d_pic;
    }

    public void setMo_d_pic(String mo_d_pic) {
        this.mo_d_pic = mo_d_pic;
    }

    public BigDecimal getLeast_required_qty() {
        return least_required_qty;
    }

    public void setLeast_required_qty(BigDecimal least_required_qty) {
        this.least_required_qty = least_required_qty;
    }

    public BigDecimal getTransfer_qty() {
        return transfer_qty;
    }

    public void setTransfer_qty(BigDecimal transfer_qty) {
        this.transfer_qty = transfer_qty;
    }

    public String getMo_routing_d_id() {
        return mo_routing_d_id;
    }

    public void setMo_routing_d_id(String mo_routing_d_id) {
        this.mo_routing_d_id = mo_routing_d_id;
    }

    public String getNot_mo_materail() {
        return not_mo_materail;
    }

    public void setNot_mo_materail(String not_mo_materail) {
        this.not_mo_materail = not_mo_materail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(String approvestatus) {
        this.approvestatus = approvestatus;
    }

    public Date getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(Date approvedate) {
        this.approvedate = approvedate;
    }

    public String getApproveby() {
        return approveby;
    }

    public void setApproveby(String approveby) {
        this.approveby = approveby;
    }

    public String getMo_id() {
        return mo_id;
    }

    public void setMo_id(String mo_id) {
        this.mo_id = mo_id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("sequencenumber", getSequencenumber())
                .append("mo_d_id", getMo_d_id())
                .append("warehouse_id", getWarehouse_id())
                .append("warehouse_name", getWarehouse_name())
                .append("issue_type",getIssue_type())
                .append("item_type", getItem_type())
                .append("operation_id", getOperation_id())
                .append("operation_name", getOperation_name())
                .append("item_id", getItem_id())
                .append("item_code", getItem_code())
                .append("item_description", getItem_description())
                .append("item_specification", getItem_specification())
                .append("unit_id", getUnit_id())
                .append("unit_name",getUnit_name())
                .append("required_qty", getRequired_qty())
                .append("requ_include_mult_qty", getRequ_include_mult_qty())
                .append("replaced_qty", getReplaced_qty())
                .append("issued_qty", getIssued_qty())
                .append("plan_issue_date", getPlan_issue_date())
                .append("actual_issue_date", getActual_issue_date())
                .append("remark", getRemark())
                .append("item_feature_id", getItem_feature_id())
                .append("bin_id", getBin_id())
                .append("item_lot_id", getItem_lot_id())
                .append("required_second_qty", getRequired_second_qty())
                .append("issued_second_qty", getIssued_second_qty())
                .append("issued_req_qty", getIssued_req_qty())
                .append("issued_req_second_qty", getIssued_req_second_qty())
                .append("mo_d_pic", getMo_d_pic())
                .append("least_required_qty", getLeast_required_qty())
                .append("transfer_qty", getTransfer_qty())
                .append("mo_routing_d_id", getMo_routing_d_id())
                .append("not_mo_materail", getNot_mo_materail())
                .append("version", getVersion())
                .append("createdate", getCreatedate())
                .append("lastmodifieddate", getLastmodifieddate())
                .append("modifieddate", getModifieddate())
                .append("createby", getCreateby())
                .append("lastmodifiedby", getLastmodifiedby())
                .append("modifiedby", getModifiedby())
                .append("approvestatus", getApprovestatus())
                .append("approvedate", getApprovedate())
                .append("approveby", getApproveby())
                .append("mo_id", getMo_id())
                .toString();
    }
}
