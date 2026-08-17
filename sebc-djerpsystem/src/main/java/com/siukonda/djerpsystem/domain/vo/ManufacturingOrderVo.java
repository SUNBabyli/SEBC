package com.siukonda.djerpsystem.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.siukonda.common.annotation.Excel;
import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaoyang
 * @create 2022-11-21 15:22
 */
public class ManufacturingOrderVo extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /**
     * 工厂编号
     */
    private String owner_org_roid_code;
    /**
     * 工厂名称
     */
    private String owner_org_roid_name;
    /**
     * 单据类型
     */
    @Excel(name = "单据类型")
    private String doc_id_doc_name;
    /**
     * 工单单号
     */
    @Excel(name = "工单单号")
    private String doc_no;
    /**
     *
     */
    private String rtk;
    /**
     * 是否紧急
     */
    private String urgent;

    /**
     * 物料品号
     */
    @Excel(name = "产品品号")
    private String item_id_item_code;
    /**
     * 物料名称
     */
    @Excel(name = "产品品名")
    private String item_description;
    /**
     * 物料规格
     */
    @Excel(name = "产品规格")
    private String item_specification;
    /**
     * 工程码
     */
    private String e_code;
    /**
     * 图号
     */
    private String drawing_no;
    /**
     * BOM版次
     */
    private String bom_version_times;
    /**
     * BOM日期
     */
    private Date bom_date;
    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "单据日期",dateFormat = "yyyy-MM-dd")
    private Date doc_date;
    /**
     * 工单审核状态
     */
    @Excel(name = "审核状态", readConverterExp = "Y=已审核,N=未审核")
    private String approvestatus;
    /**
     * 状态码
     */
    @Excel(name = "状态码")
    private String status;
    /**
     * 批工单
     */
    private String lot_mo_flag;
    /**
     * 预计产量
     */
    @Excel(name = "预计产量")
    private BigDecimal plan_qty;
    /**
     * 入库申请量
     */
    @Excel(name = "入库申请量")
    private BigDecimal req_qty;
    /**
     * 已入库量
     */
    @Excel(name = "已入库量")
    private BigDecimal completed_qty;
    /**
     * 报废数量
     */
    @Excel(name = "报废数量")
    private BigDecimal scrap_qty;
    /**
     * 破坏数量
     */
    @Excel(name = "破坏数量")
    private BigDecimal destroyed_qty;
    /**
     * 批工单数量
     */
    private BigDecimal lot_mo_qty;
    /**
     * 单位
     */
    private String business_unit_id_unit_name;
    /**
     * 工作中心
     */
    @Excel(name = "工作中心")
    private String source_id_roid;
    /**
     * 生产部门
     */
    @Excel(name = "生产部门")
    private String admin_unit_id_admin_unit_name;
    /**
     * 工艺管理
     */
    private String item_routing_control;
    /**
     * 工艺路线
     */
    private String item_routing_id_routing_code;
    /**
     * 入库申请
     */
    private String receipt_req_control;
    /**
     * 预计开工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "预计开工日期",dateFormat = "yyyy-MM-dd")
    private Date plan_start_date;
    /**
     * 预计完工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "预计完工日期",dateFormat = "yyyy-MM-dd")
    private Date plan_complete_date;
    /**
     * 实际开工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "实际开工日期",dateFormat = "yyyy-MM-dd")
    private Date actual_start_date;
    /**
     * 实际完工日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "实际完工日期",dateFormat = "yyyy-MM-dd")
    private Date actual_complete_date;
    /**
     * 计划单号
     */
    private String plan_lot;
    /**
     * 源工单单号
     */
    private String source_mo_id_doc_no;
    /**
     * 上阶工单单号
     */
    private String doc_no1;
    /**
     * 母工单单号
     */
    private String para_mo_id_doc_no;
    /**
     * 生管部门
     */
    private String owner_dept_admin_unit_name;
    /**
     * 生管人员
     */
    private String owner_emp_employee_name;
    /**
     * 项目编号
     */
    private String project_code;
    /**
     * 项目名称
     */
    private String project_name;
    /**
     * 备注
     */
    private String remark;
    /**
     * 签核状态
     */
    private String efnetstatus2;
    /**
     * 需求信息序号
     */
    private Integer mo_demand_sequencenumber;
    /**
     * 需求信息需求来源
     */
    @Excel(name = "需求信息需求来源")
    private String mo_demand_demand_doc_rtk;
    /**
     * 需求信息需求单号
     */
    private String demand_doc_roid;
    /**
     * 需求订单号行号
     */
    @Excel(name = "需求订单号行号")
    private String demand_no;
    /**
     * 需求订单品号
     */
    @Excel(name = "需求订单品号")
    private String reference_source_id_item_id_code;
    /**
     * 需求订单品名
     */
    @Excel(name = "需求订单品名")
    private String reference_source_id_item_id_name;
    /**
     * 需求订单规格
     */
    @Excel(name = "需求订单规格")
    private String reference_source_id_item_specification;
    /**
     * 需求特征码
     */
    private String eference_source_id_item_feature_code;
    /**
     * 需求特征规格
     */
    private String eference_source_id_item_feature_specification;
    /**
     * 需求数量
     */
    @Excel(name = "需求数量")
    private BigDecimal demand_qty;
    /**
     * 需求日期
     */
    @Excel(name = "需求日期")
    private Date plan_delivery_date;
    /**
     * 需求客户
     */
    private String demand_doc_customer_name;
    /**
     * 供需关联锁定
     */
    private Boolean locked_flag;
    /**
     * 需求备注
     */
    private String mo_demand_remark;
    /**
     * 需求审核状态
     */
    private Boolean asq_approvestatus;
    /**
     * 物料特征码
     */
    private String item_feature_code;
    /**
     * 物料特征ID规格
     */
    private String item_feature_id_item_specification;
    /**
     * MOID
     */
    private String mo_id;
    /**
     * 计划ID
     */
    private String plant_id;
    /**
     * 工作中心ID
     */
    private String roid;



    public ManufacturingOrderVo() {
    }

    public String getOwner_org_roid_code() {
        return owner_org_roid_code;
    }

    public void setOwner_org_roid_code(String owner_org_roid_code) {
        this.owner_org_roid_code = owner_org_roid_code;
    }

    public String getOwner_org_roid_name() {
        return owner_org_roid_name;
    }

    public void setOwner_org_roid_name(String owner_org_roid_name) {
        this.owner_org_roid_name = owner_org_roid_name;
    }

    public String getDoc_id_doc_name() {
        return doc_id_doc_name;
    }

    public void setDoc_id_doc_name(String doc_id_doc_name) {
        this.doc_id_doc_name = doc_id_doc_name;
    }

    public String getDoc_no() {
        return doc_no;
    }

    public void setDoc_no(String doc_no) {
        this.doc_no = doc_no;
    }

    public String getRtk() {
        return rtk;
    }

    public void setRtk(String rtk) {
        this.rtk = rtk;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public Date getDoc_date() {
        return doc_date;
    }

    public void setDoc_date(Date doc_date) {
        this.doc_date = doc_date;
    }

    public String getItem_id_item_code() {
        return item_id_item_code;
    }

    public void setItem_id_item_code(String item_id_item_code) {
        this.item_id_item_code = item_id_item_code;
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

    public String getE_code() {
        return e_code;
    }

    public void setE_code(String e_code) {
        this.e_code = e_code;
    }

    public String getDrawing_no() {
        return drawing_no;
    }

    public void setDrawing_no(String drawing_no) {
        this.drawing_no = drawing_no;
    }

    public String getBom_version_times() {
        return bom_version_times;
    }

    public void setBom_version_times(String bom_version_times) {
        this.bom_version_times = bom_version_times;
    }

    public Date getBom_date() {
        return bom_date;
    }

    public void setBom_date(Date bom_date) {
        this.bom_date = bom_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLot_mo_flag() {
        return lot_mo_flag;
    }

    public void setLot_mo_flag(String lot_mo_flag) {
        this.lot_mo_flag = lot_mo_flag;
    }

    public BigDecimal getPlan_qty() {
        return plan_qty;
    }

    public void setPlan_qty(BigDecimal plan_qty) {
        this.plan_qty = plan_qty;
    }

    public BigDecimal getReq_qty() {
        return req_qty;
    }

    public void setReq_qty(BigDecimal req_qty) {
        this.req_qty = req_qty;
    }

    public BigDecimal getCompleted_qty() {
        return completed_qty;
    }

    public void setCompleted_qty(BigDecimal completed_qty) {
        this.completed_qty = completed_qty;
    }

    public BigDecimal getScrap_qty() {
        return scrap_qty;
    }

    public void setScrap_qty(BigDecimal scrap_qty) {
        this.scrap_qty = scrap_qty;
    }

    public BigDecimal getDestroyed_qty() {
        return destroyed_qty;
    }

    public void setDestroyed_qty(BigDecimal destroyed_qty) {
        this.destroyed_qty = destroyed_qty;
    }

    public BigDecimal getLot_mo_qty() {
        return lot_mo_qty;
    }

    public void setLot_mo_qty(BigDecimal lot_mo_qty) {
        this.lot_mo_qty = lot_mo_qty;
    }

    public String getBusiness_unit_id_unit_name() {
        return business_unit_id_unit_name;
    }

    public void setBusiness_unit_id_unit_name(String business_unit_id_unit_name) {
        this.business_unit_id_unit_name = business_unit_id_unit_name;
    }

    public String getSource_id_roid() {
        return source_id_roid;
    }

    public void setSource_id_roid(String source_id_roid) {
        this.source_id_roid = source_id_roid;
    }

    public String getAdmin_unit_id_admin_unit_name() {
        return admin_unit_id_admin_unit_name;
    }

    public void setAdmin_unit_id_admin_unit_name(String admin_unit_id_admin_unit_name) {
        this.admin_unit_id_admin_unit_name = admin_unit_id_admin_unit_name;
    }

    public String getItem_routing_control() {
        return item_routing_control;
    }

    public void setItem_routing_control(String item_routing_control) {
        this.item_routing_control = item_routing_control;
    }

    public String getItem_routing_id_routing_code() {
        return item_routing_id_routing_code;
    }

    public void setItem_routing_id_routing_code(String item_routing_id_routing_code) {
        this.item_routing_id_routing_code = item_routing_id_routing_code;
    }

    public String getReceipt_req_control() {
        return receipt_req_control;
    }

    public void setReceipt_req_control(String receipt_req_control) {
        this.receipt_req_control = receipt_req_control;
    }

    public Date getPlan_start_date() {
        return plan_start_date;
    }

    public void setPlan_start_date(Date plan_start_date) {
        this.plan_start_date = plan_start_date;
    }

    public Date getPlan_complete_date() {
        return plan_complete_date;
    }

    public void setPlan_complete_date(Date plan_complete_date) {
        this.plan_complete_date = plan_complete_date;
    }

    public Date getActual_start_date() {
        return actual_start_date;
    }

    public void setActual_start_date(Date actual_start_date) {
        this.actual_start_date = actual_start_date;
    }

    public Date getActual_complete_date() {
        return actual_complete_date;
    }

    public void setActual_complete_date(Date actual_complete_date) {
        this.actual_complete_date = actual_complete_date;
    }

    public String getPlan_lot() {
        return plan_lot;
    }

    public void setPlan_lot(String plan_lot) {
        this.plan_lot = plan_lot;
    }

    public String getSource_mo_id_doc_no() {
        return source_mo_id_doc_no;
    }

    public void setSource_mo_id_doc_no(String source_mo_id_doc_no) {
        this.source_mo_id_doc_no = source_mo_id_doc_no;
    }

    public String getDoc_no1() {
        return doc_no1;
    }

    public void setDoc_no1(String doc_no1) {
        this.doc_no1 = doc_no1;
    }

    public String getPara_mo_id_doc_no() {
        return para_mo_id_doc_no;
    }

    public void setPara_mo_id_doc_no(String para_mo_id_doc_no) {
        this.para_mo_id_doc_no = para_mo_id_doc_no;
    }

    public String getOwner_dept_admin_unit_name() {
        return owner_dept_admin_unit_name;
    }

    public void setOwner_dept_admin_unit_name(String owner_dept_admin_unit_name) {
        this.owner_dept_admin_unit_name = owner_dept_admin_unit_name;
    }

    public String getOwner_emp_employee_name() {
        return owner_emp_employee_name;
    }

    public void setOwner_emp_employee_name(String owner_emp_employee_name) {
        this.owner_emp_employee_name = owner_emp_employee_name;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEfnetstatus2() {
        return efnetstatus2;
    }

    public void setEfnetstatus2(String efnetstatus2) {
        this.efnetstatus2 = efnetstatus2;
    }

    public Integer getMo_demand_sequencenumber() {
        return mo_demand_sequencenumber;
    }

    public void setMo_demand_sequencenumber(Integer mo_demand_sequencenumber) {
        this.mo_demand_sequencenumber = mo_demand_sequencenumber;
    }

    public String getMo_demand_demand_doc_rtk() {
        return mo_demand_demand_doc_rtk;
    }

    public void setMo_demand_demand_doc_rtk(String mo_demand_demand_doc_rtk) {
        this.mo_demand_demand_doc_rtk = mo_demand_demand_doc_rtk;
    }

    public String getDemand_doc_roid() {
        return demand_doc_roid;
    }

    public void setDemand_doc_roid(String demand_doc_roid) {
        this.demand_doc_roid = demand_doc_roid;
    }

    public String getDemand_no() {
        return demand_no;
    }

    public void setDemand_no(String demand_no) {
        this.demand_no = demand_no;
    }

    public String getReference_source_id_item_id_code() {
        return reference_source_id_item_id_code;
    }

    public void setReference_source_id_item_id_code(String reference_source_id_item_id_code) {
        this.reference_source_id_item_id_code = reference_source_id_item_id_code;
    }

    public String getReference_source_id_item_id_name() {
        return reference_source_id_item_id_name;
    }

    public void setReference_source_id_item_id_name(String reference_source_id_item_id_name) {
        this.reference_source_id_item_id_name = reference_source_id_item_id_name;
    }

    public String getReference_source_id_item_specification() {
        return reference_source_id_item_specification;
    }

    public void setReference_source_id_item_specification(String reference_source_id_item_specification) {
        this.reference_source_id_item_specification = reference_source_id_item_specification;
    }

    public String getEference_source_id_item_feature_code() {
        return eference_source_id_item_feature_code;
    }

    public void setEference_source_id_item_feature_code(String eference_source_id_item_feature_code) {
        this.eference_source_id_item_feature_code = eference_source_id_item_feature_code;
    }

    public String getEference_source_id_item_feature_specification() {
        return eference_source_id_item_feature_specification;
    }

    public void setEference_source_id_item_feature_specification(String eference_source_id_item_feature_specification) {
        this.eference_source_id_item_feature_specification = eference_source_id_item_feature_specification;
    }

    public BigDecimal getDemand_qty() {
        return demand_qty;
    }

    public void setDemand_qty(BigDecimal demand_qty) {
        this.demand_qty = demand_qty;
    }

    public Date getPlan_delivery_date() {
        return plan_delivery_date;
    }

    public void setPlan_delivery_date(Date plan_delivery_date) {
        this.plan_delivery_date = plan_delivery_date;
    }

    public String getDemand_doc_customer_name() {
        return demand_doc_customer_name;
    }

    public void setDemand_doc_customer_name(String demand_doc_customer_name) {
        this.demand_doc_customer_name = demand_doc_customer_name;
    }

    public Boolean getLocked_flag() {
        return locked_flag;
    }

    public void setLocked_flag(Boolean locked_flag) {
        this.locked_flag = locked_flag;
    }

    public String getMo_demand_remark() {
        return mo_demand_remark;
    }

    public void setMo_demand_remark(String mo_demand_remark) {
        this.mo_demand_remark = mo_demand_remark;
    }

    public Boolean getAsq_approvestatus() {
        return asq_approvestatus;
    }

    public void setAsq_approvestatus(Boolean asq_approvestatus) {
        this.asq_approvestatus = asq_approvestatus;
    }

    public String getItem_feature_code() {
        return item_feature_code;
    }

    public void setItem_feature_code(String item_feature_code) {
        this.item_feature_code = item_feature_code;
    }

    public String getItem_feature_id_item_specification() {
        return item_feature_id_item_specification;
    }

    public void setItem_feature_id_item_specification(String item_feature_id_item_specification) {
        this.item_feature_id_item_specification = item_feature_id_item_specification;
    }

    public String getMo_id() {
        return mo_id;
    }

    public void setMo_id(String mo_id) {
        this.mo_id = mo_id;
    }

    public String getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(String plant_id) {
        this.plant_id = plant_id;
    }

    public String getRoid() {
        return roid;
    }

    public void setRoid(String roid) {
        this.roid = roid;
    }

    public String getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(String approvestatus) {
        this.approvestatus = approvestatus;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("owner_org_roid_code", getOwner_org_roid_code())
                .append("owner_org_roid_name", getOwner_org_roid_name())
                .append("doc_id_doc_name", getDoc_id_doc_name())
                .append("doc_no", getDoc_no())
                .append("rtk", getRtk())
                .append("urgent", getUrgent())
                .append("doc_date", getDoc_date())
                .append("item_id_item_code", getItem_id_item_code())
                .append("item_description", getItem_description())
                .append("item_specification", getItem_specification())
                .append("e_code", getE_code())
                .append("drawing_no", getDrawing_no())
                .append("bom_version_times", getBom_version_times())
                .append("bom_date", getBom_date())
                .append("status", getStatus())
                .append("lot_mo_flag", getLot_mo_flag())
                .append("plan_qty", getPlan_qty())
                .append("req_qty", getReq_qty())
                .append("completed_qty", getCompleted_qty())
                .append("scrap_qty", getScrap_qty())
                .append("destroyed_qty", getDestroyed_qty())
                .append("lot_mo_qty", getLot_mo_qty())
                .append("business_unit_id_unit_name", getBusiness_unit_id_unit_name())
                .append("source_id_roid", getSource_id_roid())
                .append("admin_unit_id_admin_unit_name", getAdmin_unit_id_admin_unit_name())
                .append("item_routing_control", getItem_routing_control())
                .append("item_routing_id_routing_code", getItem_routing_id_routing_code())
                .append("receipt_req_control", getReceipt_req_control())
                .append("plan_start_date", getPlan_start_date())
                .append("plan_complete_date", getPlan_complete_date())
                .append("actual_start_date", getActual_start_date())
                .append("actual_complete_date", getActual_complete_date())
                .append("plan_lot", getPlan_lot())
                .append("source_mo_id_doc_no", getSource_mo_id_doc_no())
                .append("doc_no1", getDoc_no1())
                .append("para_mo_id_doc_no", getPara_mo_id_doc_no())
                .append("owner_dept_admin_unit_name", getOwner_dept_admin_unit_name())
                .append("owner_emp_employee_name", getOwner_emp_employee_name())
                .append("project_code", getProject_code())
                .append("project_name", getProject_name())
                .append("remark", getRemark())
                .append("efnetstatus2", getEfnetstatus2())
                .append("mo_demand_sequencenumber", getMo_demand_sequencenumber())
                .append("mo_demand_demand_doc_rtk", getMo_demand_demand_doc_rtk())
                .append("demand_doc_roid", getDemand_doc_roid())
                .append("demand_no", getDemand_no())
                .append("reference_source_id_item_id_code", getReference_source_id_item_id_code())
                .append("reference_source_id_item_id_name", getReference_source_id_item_id_name())
                .append("reference_source_id_item_specification", getReference_source_id_item_specification())
                .append("eference_source_id_item_feature_code", getEference_source_id_item_feature_code())
                .append("eference_source_id_item_feature_specification", getEference_source_id_item_feature_specification())
                .append("demand_qty", getDemand_qty())
                .append("plan_delivery_date", getPlan_delivery_date())
                .append("demand_doc_customer_name", getDemand_doc_customer_name())
                .append("locked_flag", getLocked_flag())
                .append("mo_demand_remark", getMo_demand_remark())
                .append("asq_approvestatus", getAsq_approvestatus())
                .append("item_feature_code", getItem_feature_code())
                .append("item_feature_id_item_specification", getItem_feature_id_item_specification())
                .append("mo_id", getMo_id())
                .append("plant_id", getPlant_id())
                .append("roid", getRoid())
                .append("approvestatus", getApprovestatus())
                .toString();
    }
}
