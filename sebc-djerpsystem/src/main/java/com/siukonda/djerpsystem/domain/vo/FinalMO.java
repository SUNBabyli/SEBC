package com.siukonda.djerpsystem.domain.vo;

import com.siukonda.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * @author zhaoyang
 * @create 2023-07-19 18:40
 * E10总装工单单头
 */
public class FinalMO extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private String owner_Org_RTK;
    private String owner_Org_ROid;
    private String doc_CODE;
    private String doc_NO;
    private String sourcertk;
    private String urgent;
    private Date doc_DATE;
    private String item_CODE;
    private String item_DESCRIPTION;
    private String item_SPECIFICATION;
    private String e_CODE;
    private String drawing_NO;
    private String bom_VERSION_TIMES;
    private Date bom_DATE;
    private String status;
    private String lot_MO_FLAG;
    private Integer plan_QTY;
    private Integer req_QTY;
    private Integer completed_QTY;
    private Integer scrap_QTY;
    private Integer destroyed_QTY;
    private Integer lot_MO_QTY;
    private String unit_NAME;
    private String source_ID_RTK;
    private String admin_UNIT_NAME;
    private String item_ROUTING_CONTROL;
    private String routing_DES;
    private String receipt_REQ_CONTROL;
    private Date plan_START_DATE;
    private Date plan_COMPLETE_DATE;
    private Date actual_START_DATE;
    private Date actual_COMPLETE_DATE;
    private String plan_LOT;
    private String source_MO_ID;
    private String up_MO_ID;
    private String para_MO_ID;
    private String owner_Dept;
    private String owner_Emp;
    private String sequenceNumber;
    private String sequenceNumber1;
    private String remark;
    private String approveStatus;
    private String mo_ID;

    public String getOwner_Org_RTK() {
        return owner_Org_RTK;
    }

    public void setOwner_Org_RTK(String owner_Org_RTK) {
        this.owner_Org_RTK = owner_Org_RTK;
    }

    public String getOwner_Org_ROid() {
        return owner_Org_ROid;
    }

    public void setOwner_Org_ROid(String owner_Org_ROid) {
        this.owner_Org_ROid = owner_Org_ROid;
    }

    public String getDoc_CODE() {
        return doc_CODE;
    }

    public void setDoc_CODE(String doc_CODE) {
        this.doc_CODE = doc_CODE;
    }

    public String getDoc_NO() {
        return doc_NO;
    }

    public void setDoc_NO(String doc_NO) {
        this.doc_NO = doc_NO;
    }

    public String getSourcertk() {
        return sourcertk;
    }

    public void setSourcertk(String sourcertk) {
        this.sourcertk = sourcertk;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public Date getDoc_DATE() {
        return doc_DATE;
    }

    public void setDoc_DATE(Date doc_DATE) {
        this.doc_DATE = doc_DATE;
    }

    public String getItem_CODE() {
        return item_CODE;
    }

    public void setItem_CODE(String item_CODE) {
        this.item_CODE = item_CODE;
    }

    public String getItem_DESCRIPTION() {
        return item_DESCRIPTION;
    }

    public void setItem_DESCRIPTION(String item_DESCRIPTION) {
        this.item_DESCRIPTION = item_DESCRIPTION;
    }

    public String getItem_SPECIFICATION() {
        return item_SPECIFICATION;
    }

    public void setItem_SPECIFICATION(String item_SPECIFICATION) {
        this.item_SPECIFICATION = item_SPECIFICATION;
    }

    public String getE_CODE() {
        return e_CODE;
    }

    public void setE_CODE(String e_CODE) {
        this.e_CODE = e_CODE;
    }

    public String getDrawing_NO() {
        return drawing_NO;
    }

    public void setDrawing_NO(String drawing_NO) {
        this.drawing_NO = drawing_NO;
    }

    public String getBom_VERSION_TIMES() {
        return bom_VERSION_TIMES;
    }

    public void setBom_VERSION_TIMES(String bom_VERSION_TIMES) {
        this.bom_VERSION_TIMES = bom_VERSION_TIMES;
    }

    public Date getBom_DATE() {
        return bom_DATE;
    }

    public void setBom_DATE(Date bom_DATE) {
        this.bom_DATE = bom_DATE;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLot_MO_FLAG() {
        return lot_MO_FLAG;
    }

    public void setLot_MO_FLAG(String lot_MO_FLAG) {
        this.lot_MO_FLAG = lot_MO_FLAG;
    }

    public Integer getPlan_QTY() {
        return plan_QTY;
    }

    public void setPlan_QTY(Integer plan_QTY) {
        this.plan_QTY = plan_QTY;
    }

    public Integer getReq_QTY() {
        return req_QTY;
    }

    public void setReq_QTY(Integer req_QTY) {
        this.req_QTY = req_QTY;
    }

    public Integer getCompleted_QTY() {
        return completed_QTY;
    }

    public void setCompleted_QTY(Integer completed_QTY) {
        this.completed_QTY = completed_QTY;
    }

    public Integer getScrap_QTY() {
        return scrap_QTY;
    }

    public void setScrap_QTY(Integer scrap_QTY) {
        this.scrap_QTY = scrap_QTY;
    }

    public Integer getDestroyed_QTY() {
        return destroyed_QTY;
    }

    public void setDestroyed_QTY(Integer destroyed_QTY) {
        this.destroyed_QTY = destroyed_QTY;
    }

    public Integer getLot_MO_QTY() {
        return lot_MO_QTY;
    }

    public void setLot_MO_QTY(Integer lot_MO_QTY) {
        this.lot_MO_QTY = lot_MO_QTY;
    }

    public String getUnit_NAME() {
        return unit_NAME;
    }

    public void setUnit_NAME(String unit_NAME) {
        this.unit_NAME = unit_NAME;
    }

    public String getSource_ID_RTK() {
        return source_ID_RTK;
    }

    public void setSource_ID_RTK(String source_ID_RTK) {
        this.source_ID_RTK = source_ID_RTK;
    }

    public String getAdmin_UNIT_NAME() {
        return admin_UNIT_NAME;
    }

    public void setAdmin_UNIT_NAME(String admin_UNIT_NAME) {
        this.admin_UNIT_NAME = admin_UNIT_NAME;
    }

    public String getItem_ROUTING_CONTROL() {
        return item_ROUTING_CONTROL;
    }

    public void setItem_ROUTING_CONTROL(String item_ROUTING_CONTROL) {
        this.item_ROUTING_CONTROL = item_ROUTING_CONTROL;
    }

    public String getRouting_DES() {
        return routing_DES;
    }

    public void setRouting_DES(String routing_DES) {
        this.routing_DES = routing_DES;
    }

    public String getReceipt_REQ_CONTROL() {
        return receipt_REQ_CONTROL;
    }

    public void setReceipt_REQ_CONTROL(String receipt_REQ_CONTROL) {
        this.receipt_REQ_CONTROL = receipt_REQ_CONTROL;
    }

    public Date getPlan_START_DATE() {
        return plan_START_DATE;
    }

    public void setPlan_START_DATE(Date plan_START_DATE) {
        this.plan_START_DATE = plan_START_DATE;
    }

    public Date getPlan_COMPLETE_DATE() {
        return plan_COMPLETE_DATE;
    }

    public void setPlan_COMPLETE_DATE(Date plan_COMPLETE_DATE) {
        this.plan_COMPLETE_DATE = plan_COMPLETE_DATE;
    }

    public Date getActual_START_DATE() {
        return actual_START_DATE;
    }

    public void setActual_START_DATE(Date actual_START_DATE) {
        this.actual_START_DATE = actual_START_DATE;
    }

    public Date getActual_COMPLETE_DATE() {
        return actual_COMPLETE_DATE;
    }

    public void setActual_COMPLETE_DATE(Date actual_COMPLETE_DATE) {
        this.actual_COMPLETE_DATE = actual_COMPLETE_DATE;
    }

    public String getPlan_LOT() {
        return plan_LOT;
    }

    public void setPlan_LOT(String plan_LOT) {
        this.plan_LOT = plan_LOT;
    }

    public String getSource_MO_ID() {
        return source_MO_ID;
    }

    public void setSource_MO_ID(String source_MO_ID) {
        this.source_MO_ID = source_MO_ID;
    }

    public String getUp_MO_ID() {
        return up_MO_ID;
    }

    public void setUp_MO_ID(String up_MO_ID) {
        this.up_MO_ID = up_MO_ID;
    }

    public String getPara_MO_ID() {
        return para_MO_ID;
    }

    public void setPara_MO_ID(String para_MO_ID) {
        this.para_MO_ID = para_MO_ID;
    }

    public String getOwner_Dept() {
        return owner_Dept;
    }

    public void setOwner_Dept(String owner_Dept) {
        this.owner_Dept = owner_Dept;
    }

    public String getOwner_Emp() {
        return owner_Emp;
    }

    public void setOwner_Emp(String owner_Emp) {
        this.owner_Emp = owner_Emp;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getSequenceNumber1() {
        return sequenceNumber1;
    }

    public void setSequenceNumber1(String sequenceNumber1) {
        this.sequenceNumber1 = sequenceNumber1;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getMo_ID() {
        return mo_ID;
    }

    public void setMo_ID(String mo_ID) {
        this.mo_ID = mo_ID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("owner_Org_RTK",getOwner_Org_RTK())
                .append("owner_Org_ROid",getOwner_Org_ROid())
                .append("doc_CODE",getDoc_CODE())
                .append("doc_NO",getDoc_NO())
                .append("sourcertk",getSourcertk())
                .append("urgent",getUrgent())
                .append("doc_DATE",getDoc_DATE())
                .append("item_CODE",getItem_CODE())
                .append("item_DESCRIPTION",getItem_DESCRIPTION())
                .append("item_SPECIFICATION",getItem_SPECIFICATION())
                .append("e_CODE",getE_CODE())
                .append("drawing_NO",getDrawing_NO())
                .append("bom_VERSION_TIMES",getBom_VERSION_TIMES())
                .append("bom_DATE",getBom_DATE())
                .append("status",getStatus())
                .append("lot_MO_FLAG",getLot_MO_FLAG())
                .append("plan_QTY",getPlan_QTY())
                .append("req_QTY",getReq_QTY())
                .append("completed_QTY",getCompleted_QTY())
                .append("scrap_QTY",getScrap_QTY())
                .append("destroyed_QTY",getDestroyed_QTY())
                .append("lot_MO_QTY",getLot_MO_QTY())
                .append("unit_NAME",getUnit_NAME())
                .append("source_ID_RTK",getSource_ID_RTK())
                .append("admin_UNIT_NAME",getAdmin_UNIT_NAME())
                .append("item_ROUTING_CONTROL",getItem_ROUTING_CONTROL())
                .append("routing_DES",getRouting_DES())
                .append("receipt_REQ_CONTROL",getReceipt_REQ_CONTROL())
                .append("plan_START_DATE",getPlan_START_DATE())
                .append("plan_COMPLETE_DATE",getPlan_COMPLETE_DATE())
                .append("actual_START_DATE",getActual_START_DATE())
                .append("actual_COMPLETE_DATE",getActual_COMPLETE_DATE())
                .append("plan_LOT",getPlan_LOT())
                .append("source_MO_ID",getSource_MO_ID())
                .append("up_MO_ID",getUp_MO_ID())
                .append("para_MO_ID",getPara_MO_ID())
                .append("owner_Dept",getOwner_Dept())
                .append("owner_Emp",getOwner_Emp())
                .append("sequenceNumber",getSequenceNumber())
                .append("sequenceNumber1",getSequenceNumber1())
                .append("remark",getRemark())
                .append("approveStatus",getApproveStatus())
                .append("mo_ID",getMo_ID())
                .toString();
    }
}
