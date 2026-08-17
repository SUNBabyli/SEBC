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
 * @create 2022-11-07 21:46
 * 销售订单明细表
 */
public class SalesOrderVo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 销售域ID
     */
    private String sales_CENTER_ID;
    /**
     * 销售域编号
     */
    private String sales_CENTER_CODE;
    /**
     * 销售域名称
     */
    private String sales_CENTER_NAME;
    /**
     * 订单ID
     */
    private String doc_ID;

    /**
     * 销售订单内部ID
     */
    private String sales_ORDER_DOC_ID;
    /**
     * 单号
     */
    @Excel(name = "销售订单号")
    private String doc_NO;

    /**
     * 行号
     */
    @Excel(name = "行号")
    private Integer sequenceNumber;

    /**
     * 品号
     */
    @Excel(name = "物料编码")
    private String item_CODE;

    /**
     * 品名
     */
    @Excel(name = "物料名称")
    private String item_DESCRIPTION;

    /**
     * 规格
     */
    @Excel(name = "规格型号")
    private String item_SPECIFICATION;

    /**
     * 是否标准机
     */
    @Excel(name = "是否标准机")
    private String udf022;

    /**
     * 业务数量
     */
    @Excel(name = "下单数量")
    private BigDecimal business_QTY;

    /**
     * 订单日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "下单日期",dateFormat = "yyyy-MM-dd")
    private Date order_DATE;

    /**
     * 预交货日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "预交货日期",dateFormat = "yyyy-MM-dd")
    private Date plan_DELIVERY_DATE;

    /**
     * 项目名称
     */
    @Excel(name = "项目名称")
    private String project_NAME;

    /**
     * 单据类型
     */
    @Excel(name = "单据类型")
    private String doc_NAME;

    /**
     * 审核单据状态属性
     */
    @Excel(name = "审核状态", readConverterExp = "Y=已审核,N=未审核")
    private String approveStatus;

    /**
     * 结束码
     */
    @Excel(name = "结束状态", readConverterExp = "1=已结束,0=未结束")
    private String doc_SD_CLOSE;
    /**
     * 子ID
     */
    private String sales_ORDER_DOC_D_ID;
    /**
     * 客户编号
     */
    private String customer_CODE;
    /**
     * 客户简称
     */
    private String customer_NAME;
    /**
     * 业务员编号
     */
    private String employee_CODE;
    /**
     * 业务员姓名
     */
    private String employee_NAME;
    /**
     * 销售部门编号
     */
    private String admin_UNIT_CODE;
    /**
     * 销售部门名称
     */
    private String admin_UNIT_NAME;
    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date doc_DATE;

    /**
     * 结算公司编号
     */
    private String company_CODE;
    /**
     * 结算公司简称
     */
    private String company_NAME;
    /**
     * 币种
     */
    private String currency_CODE;
    /**
     * 汇率
     */
    private Double exchange_RATE;
    /**
     * 订单地址
     */
    private String customer_ADDR_NAME;
    /**
     * 订单联系人
     */
    private String customer_CONTACT_NAME;
    /**
     * 是否含税
     */
    private Boolean tax_INCLUDED;
    /**
     * 付款条件编号
     */
    private String payment_TERM_CODE;
    /**
     * 付款条件名称
     */
    private String payment_TERM_NAME;
    /**
     * 订金
     */
    private BigDecimal earnest;
    /**
     * 订金比率
     */
    private BigDecimal earnest_RATE;
    /**
     * 是否分期收款
     */
    private Boolean is_INSTALLMENT;
    /**
     * 分期源单
     */
    private String installment_SOURCE;
    /**
     * 是否允许分批交货
     */
    private Boolean partial_DELIVERY;
    /**
     * 合同单号
     */
    private String contract_ID_DOC_NO;
    /**
     * 备注-业务
     */
    private String remark1;
    /**
     * 多收货地址
     */
    private String multi_DELIVERY;
    /**
     * 收货地址
     */
    private String ship_TO_ADDR_NAME;
    /**
     * 收货联系人
     */
    private String ship_TO_CONTACT_NAME;
    /**
     * 运输方式编号
     */
    private String delivery_TERM_CODE;
    /**
     * 运输方式描述
     */
    private String delivery_TERM_DESCRIPTION;
    /**
     * 件数
     */
    private Integer pieces;
    /**
     * 备注-物流
     */
    private String remark2;
    /**
     * 结算客户编号
     */
    private String invoice_CUSTOMER_ID_CUSTOMER_CODE;
    /**
     * 结算客户简称
     */
    private String invoice_CUSTOMER_ID_CUSTOMER_NAME;
    /**
     * 发票邮寄地址
     */
    private String invoice_ADDR_NAME;
    /**
     * 发票邮寄联系人
     */
    private String invoice_CONTACT_NAME;
    /**
     * 发票种类编号
     */
    private String tax_INVOICE_CATEGORY_CODE;
    /**
     * 发票种类名称
     */
    private String tax_INVOICE_CATEGORY_NAME;
    /**
     * 备注-财务
     */
    private String remark3;
    /**
     * 客户单号
     */
    private String customer_ORDER_NO;
    /**
     * 单据性质
     */
    private String category;

    /**
     * 商品类型
     */
    private String item_TYPE;
    /**
     * 工程码
     */
    private String e_CODE;

    /**
     * 特征码
     */
    private String item_FEATURE_CODE;
    /**
     * 单位编号
     */
    private String unit_CODE;
    /**
     * 单位名称
     */
    private String unit_NAME;
    /**
     * 计价数量
     */
    private BigDecimal price_QTY;
    /**
     * 计价单位编号
     */
    private String price_UNIT_ID_UNIT_CODE;
    /**
     * 计价单位
     */
    private String price_UNIT_ID_UNIT_NAME;

    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 折扣率
     */
    private BigDecimal discount_RATE;
    /**
     * 折扣后单价
     */
    private BigDecimal discounted_PRICE;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 折扣额
     */
    private BigDecimal discount_AMT;
    /**
     * 税种编号
     */
    private String tax_CODE;
    /**
     * 税种名称
     */
    private String tax_NAME;
    /**
     * 税率
     */
    private BigDecimal tax_RATE;
    /**
     * 原币未税金额
     */
    private BigDecimal amt_UNINCLUDE_TAX_OC;
    /**
     * 原币税额
     */
    private BigDecimal tax_OC;
    /**
     * 本币未税金额
     */
    private BigDecimal amt_UNINCLUDE_TAX_BC;
    /**
     * 本币税额
     */
    private BigDecimal tax_BC;
    /**
     * 来源单据
     */
    private String source_ID_RTK;
    /**
     * 来源单号
     */
    private String source_DOC_NO;
    /**
     * 来源序号
     */
    private Integer source_SN;
    /**
     * 来源次序号
     */
    private Integer source_SEQ_SN;
    /**
     * 客户品号
     */
    private String customer_ITEM_CODE;
    /**
     * 客户品名
     */
    private String customer_ITEM_NAME;
    /**
     * 客户规格
     */
    private String customer_ITEM_SPECIFICATION;
    /**
     * 件数
     */
    private Integer sales_ORDER_DOC_D_PIECES;
    /**
     * 备注
     */
    private String remark;
    /**
     * 结算状态
     */
    private String settlement_CLOSE;
    /**
     * 预结算计价数量
     */
    private BigDecimal pre_SETTLEMENT_PRICE_QTY;
    /**
     * 预结算无税金额
     */
    private BigDecimal pre_SETTLEMENT_AMT_UN_TAX_OC;
    /**
     * 预结算税额
     */
    private BigDecimal pre_SETTLEMENT_TAX_OC;
    /**
     * 已结算计价数量
     */
    private BigDecimal settlement_PRICE_QTY;
    /**
     * 已结算无税金额
     */
    private BigDecimal settlement_AMT_UN_TAX_OC;
    /**
     * 已结算税额
     */
    private BigDecimal settlement_TAX_OC;

    /**
     * 币种
     */
    private String currency_ID;
    /**
     * 结算公司
     */
    private String company_ID;
    /**
     * 销售合同单号
     */
    private String contract_DOC_NO;
    /**
     * 报价单号
     */
    private String quotation_DOC_NO;
    /**
     * 单据代号
     */
    private String doc_CODE;
    /**
     *  自宝义字段1
     */
    private String customer_F1;
    /**
     * 自宝义字段2
     */
    private String customer_F2;
    /**
     * 自宝义字段3
     */
    private String customer_F3;
    /**
     *
     */
    private String item_F1;
    /**
     *
     */
    private String item_F2;
    /**
     *
     */
    private String item_F3;
    /**
     *
     */
    private String item_F4;
    /**
     * 次序号
     */
    private Integer sequenceNumber_01;
    /**
     * 收货客户编号
     */
    private String customer_CODE_01;
    /**
     * 收货客户简称
     */
    private String customer_NAME_01;
    /**
     * 收货地址
     */
    private String ship_TO_ADDR_NAME_01;
    /**
     * 收货联系人
     */
    private String ship_TO_CONTACT_NAME_01;
    /**
     * 运输方式编码
     */
    private String delivery_TERM_CODE_01;
    /**
     * 运输方式描述
     */
    private String delivery_TERM_DESCRIPTION_01;
    /**
     * 业务数量
     */
    private BigDecimal business_QTY_01;
    /**
     * 计价数量
     */
    private BigDecimal price_QTY_01;
    /**
     * 库存单位数量
     */
    private BigDecimal inventory_QTY;
    /**
     * 第二数量
     */
    private BigDecimal second_QTY;
    /**
     * 预交货日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plan_DELIVERY_DATE_01;
    /**
     * 预发货日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date plan_SHIP_DATE;
    /**
     * 供货类型
     */
    private String delivery_TYPE;
    /**
     * ??
     */
    private String delivery_PARTNER_ID_RTK;
    /**
     * ??
     */
    private String delivery_PARTNER_ID_ROid;
    /**
     * 供货方编号
     */
    private String calColumn_01;
    /**
     * 供货方名称
     */
    private String calColumn_02;
    /**
     * 发货工厂编号
     */
    private String plant_CODE;
    /**
     * 发货工厂名称
     */
    private String plant_NAME;
    /**
     * 发货仓库编号
     */
    private String warehouse_CODE;
    /**
     * 发货仓库名称
     */
    private String warehouse_NAME;
    /**
     * 协同关系编号
     */
    private String sales_SYNERGY_CODE;
    /**
     * 协同关系名称
     */
    private String sales_SYNERGY_NAME;
    /**
     * 采购域编码
     */
    private String supply_CENTER_CODE;
    /**
     * 采购域名称
     */
    private String supply_CENTER_NAME;
    /**
     * 直运
     */
    private String direct_SHIP;
    /**
     * 已交业务数量
     */
    private BigDecimal delivered_BUSINESS_QTY;
    /**
     * 已交计价数量
     */
    private BigDecimal delivered_PRICE_QTY;

    /**
     * 已转采业务数量
     */
    private BigDecimal purchased_BUSINESS_QTY;
    /**
     * 已转采计价数量
     */
    private BigDecimal purchased_PRICE_QTY;
    /**
     * 转采结束码
     */
    private String transfer_PURCHASE_STATUS;
    /**
     * 计划状态
     */
    private String plan_STATUS;
    /**
     * 已保留业务数量
     */
    private String reserved_BUSINESS_QTY;
    /**
     * 备注
     */
    private String remark_01;
    /**
     * 件数
     */
    private String pieces_01;
    /**
     * 订单分期数量
     */
    private Integer sequenceNumber_02;
    /**
     * 分期类型
     */
    private String installment_TYPE;
    /**
     * 分期名称
     */
    private String installment_NAME;
    /**
     * 分期比率
     */
    private BigDecimal installment_RATE;
    /**
     * 原币分期金额
     */
    private BigDecimal installment_AMT_OC;
    /**
     * 执行日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date carry_OUT_DATE;
    /**
     * 原币预收金额
     */
    private BigDecimal adv_RECEIVABLE_AMT_OC;
    /**
     * 原币已结算金额
     */
    private BigDecimal settlement_AMT_OC;
    /**
     * 原币已核销金额
     */
    private BigDecimal verification_AMT_OC;
    /**
     * 原币未收余额
     */
    private BigDecimal balance_AMT_OC;
    /**
     * 基准日来源
     */
    private Integer payment_BASE_DATE_S;
    /**
     * 基准日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payment_BASE_DATE;
    /**
     * 收付款条件编号
     */
    private String payment_TERM_CODE_01;
    /**
     * 收付款条件名称
     */
    private String payment_TERM_NAME_01;
    /**
     * 付款日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payment_DATE;
    /**
     * 兑现日
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cashing_DATE;
    /**
     * 现金折扣方式
     */
    private Integer cash_DISCOUNT_MODE;
    /**
     * 现金折扣率1
     */
    private BigDecimal cash_DISCOUNT_RATE1;
    /**
     * 现金折扣到期日1
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cash_DISCOUNT_DUE_DATE1;
    /**
     * 现金折扣率2
     */
    private BigDecimal cash_DISCOUNT_RATE2;
    /**
     * 现金折扣到期日2
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cash_DISCOUNT_DUE_DATE2;
    /**
     * 现金折扣率3
     */
    private BigDecimal cash_DISCOUNT_RATE3;
    /**
     * 现金折扣到期日3
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cash_DISCOUNT_DUE_DATE3;
    /**
     * 税种编号
     */
    private String tax_CODE_01;
    /**
     * 税种名称
     */
    private String tax_NAME_01;
    /**
     * 税率??
     */
    private BigDecimal tax_RATE_01;
    /**
     * 是否含税
     */
    private Boolean tax_INCLUDED_01;
    /**
     * 原币未税金额
     */
    private BigDecimal amt_UNINCLUDE_TAX_OC_01;
    /**
     * 原币税额
     */
    private BigDecimal tax_OC_02;
    /**
     * 预结算原币未税金额
     */
    private BigDecimal pre_SETTLEMENT_AMT_UN_TAX__01;
    /**
     * 预结算原币税额
     */
    private BigDecimal pre_SETTLEMENT_TAX_OC_01;
    /**
     * 已冲减原币未税金额
     */
    private BigDecimal offseted_AMT_UN_TAX_OC;
    /**
     * 已冲减原币税额
     */
    private BigDecimal offseted_TAX_OC;
    /**
     * 采购结算公司编号
     */
    private String company_CODE_01;
    /**
     * 采购结算公司简称
     */
    private String company_NAME_01;
    /**
     * 图号
     */
    private String drawing_NO;
    /**
     * 物料规格
     */
    private String item_FEATURE_SPECIFICATION;
    /**
     * 项目编号
     */
    private String project_CODE;


    public SalesOrderVo() {
    }

    public String getSales_CENTER_ID() {
        return sales_CENTER_ID;
    }

    public void setSales_CENTER_ID(String sales_CENTER_ID) {
        this.sales_CENTER_ID = sales_CENTER_ID;
    }

    public String getSales_CENTER_CODE() {
        return sales_CENTER_CODE;
    }

    public void setSales_CENTER_CODE(String sales_CENTER_CODE) {
        this.sales_CENTER_CODE = sales_CENTER_CODE;
    }

    public String getSales_CENTER_NAME() {
        return sales_CENTER_NAME;
    }

    public void setSales_CENTER_NAME(String sales_CENTER_NAME) {
        this.sales_CENTER_NAME = sales_CENTER_NAME;
    }

    public String getDoc_ID() {
        return doc_ID;
    }

    public void setDoc_ID(String doc_ID) {
        this.doc_ID = doc_ID;
    }

    public String getSales_ORDER_DOC_ID() {
        return sales_ORDER_DOC_ID;
    }

    public void setSales_ORDER_DOC_ID(String sales_ORDER_DOC_ID) {
        this.sales_ORDER_DOC_ID = sales_ORDER_DOC_ID;
    }

    public String getDoc_NAME() {
        return doc_NAME;
    }

    public void setDoc_NAME(String doc_NAME) {
        this.doc_NAME = doc_NAME;
    }

    public String getDoc_NO() {
        return doc_NO;
    }

    public void setDoc_NO(String doc_NO) {
        this.doc_NO = doc_NO;
    }

    public String getSales_ORDER_DOC_D_ID() {
        return sales_ORDER_DOC_D_ID;
    }

    public void setSales_ORDER_DOC_D_ID(String sales_ORDER_DOC_D_ID) {
        this.sales_ORDER_DOC_D_ID = sales_ORDER_DOC_D_ID;
    }

    public String getCustomer_CODE() {
        return customer_CODE;
    }

    public void setCustomer_CODE(String customer_CODE) {
        this.customer_CODE = customer_CODE;
    }

    public String getCustomer_NAME() {
        return customer_NAME;
    }

    public void setCustomer_NAME(String customer_NAME) {
        this.customer_NAME = customer_NAME;
    }

    public String getEmployee_CODE() {
        return employee_CODE;
    }

    public void setEmployee_CODE(String employee_CODE) {
        this.employee_CODE = employee_CODE;
    }

    public String getEmployee_NAME() {
        return employee_NAME;
    }

    public void setEmployee_NAME(String employee_NAME) {
        this.employee_NAME = employee_NAME;
    }

    public String getAdmin_UNIT_CODE() {
        return admin_UNIT_CODE;
    }

    public void setAdmin_UNIT_CODE(String admin_UNIT_CODE) {
        this.admin_UNIT_CODE = admin_UNIT_CODE;
    }

    public String getAdmin_UNIT_NAME() {
        return admin_UNIT_NAME;
    }

    public void setAdmin_UNIT_NAME(String admin_UNIT_NAME) {
        this.admin_UNIT_NAME = admin_UNIT_NAME;
    }

    public Date getDoc_DATE() {
        return doc_DATE;
    }

    public void setDoc_DATE(Date doc_DATE) {
        this.doc_DATE = doc_DATE;
    }

    public Date getOrder_DATE() {
        return order_DATE;
    }

    public void setOrder_DATE(Date order_DATE) {
        this.order_DATE = order_DATE;
    }

    public String getCompany_CODE() {
        return company_CODE;
    }

    public void setCompany_CODE(String company_CODE) {
        this.company_CODE = company_CODE;
    }

    public String getCompany_NAME() {
        return company_NAME;
    }

    public void setCompany_NAME(String company_NAME) {
        this.company_NAME = company_NAME;
    }

    public String getCurrency_CODE() {
        return currency_CODE;
    }

    public void setCurrency_CODE(String currency_CODE) {
        this.currency_CODE = currency_CODE;
    }

    public Double getExchange_RATE() {
        return exchange_RATE;
    }

    public void setExchange_RATE(Double exchange_RATE) {
        this.exchange_RATE = exchange_RATE;
    }

    public String getCustomer_ADDR_NAME() {
        return customer_ADDR_NAME;
    }

    public void setCustomer_ADDR_NAME(String customer_ADDR_NAME) {
        this.customer_ADDR_NAME = customer_ADDR_NAME;
    }

    public String getCustomer_CONTACT_NAME() {
        return customer_CONTACT_NAME;
    }

    public void setCustomer_CONTACT_NAME(String customer_CONTACT_NAME) {
        this.customer_CONTACT_NAME = customer_CONTACT_NAME;
    }

    public Boolean getTax_INCLUDED() {
        return tax_INCLUDED;
    }

    public void setTax_INCLUDED(Boolean tax_INCLUDED) {
        this.tax_INCLUDED = tax_INCLUDED;
    }

    public String getPayment_TERM_CODE() {
        return payment_TERM_CODE;
    }

    public void setPayment_TERM_CODE(String payment_TERM_CODE) {
        this.payment_TERM_CODE = payment_TERM_CODE;
    }

    public String getPayment_TERM_NAME() {
        return payment_TERM_NAME;
    }

    public void setPayment_TERM_NAME(String payment_TERM_NAME) {
        this.payment_TERM_NAME = payment_TERM_NAME;
    }

    public BigDecimal getEarnest() {
        return earnest;
    }

    public void setEarnest(BigDecimal earnest) {
        this.earnest = earnest;
    }

    public BigDecimal getEarnest_RATE() {
        return earnest_RATE;
    }

    public void setEarnest_RATE(BigDecimal earnest_RATE) {
        this.earnest_RATE = earnest_RATE;
    }

    public Boolean getIs_INSTALLMENT() {
        return is_INSTALLMENT;
    }

    public void setIs_INSTALLMENT(Boolean is_INSTALLMENT) {
        this.is_INSTALLMENT = is_INSTALLMENT;
    }

    public String getInstallment_SOURCE() {
        return installment_SOURCE;
    }

    public void setInstallment_SOURCE(String installment_SOURCE) {
        this.installment_SOURCE = installment_SOURCE;
    }

    public Boolean getPartial_DELIVERY() {
        return partial_DELIVERY;
    }

    public void setPartial_DELIVERY(Boolean partial_DELIVERY) {
        this.partial_DELIVERY = partial_DELIVERY;
    }

    public String getContract_ID_DOC_NO() {
        return contract_ID_DOC_NO;
    }

    public void setContract_ID_DOC_NO(String contract_ID_DOC_NO) {
        this.contract_ID_DOC_NO = contract_ID_DOC_NO;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getMulti_DELIVERY() {
        return multi_DELIVERY;
    }

    public void setMulti_DELIVERY(String multi_DELIVERY) {
        this.multi_DELIVERY = multi_DELIVERY;
    }

    public String getShip_TO_ADDR_NAME() {
        return ship_TO_ADDR_NAME;
    }

    public void setShip_TO_ADDR_NAME(String ship_TO_ADDR_NAME) {
        this.ship_TO_ADDR_NAME = ship_TO_ADDR_NAME;
    }

    public String getShip_TO_CONTACT_NAME() {
        return ship_TO_CONTACT_NAME;
    }

    public void setShip_TO_CONTACT_NAME(String ship_TO_CONTACT_NAME) {
        this.ship_TO_CONTACT_NAME = ship_TO_CONTACT_NAME;
    }

    public String getDelivery_TERM_CODE() {
        return delivery_TERM_CODE;
    }

    public void setDelivery_TERM_CODE(String delivery_TERM_CODE) {
        this.delivery_TERM_CODE = delivery_TERM_CODE;
    }

    public String getDelivery_TERM_DESCRIPTION() {
        return delivery_TERM_DESCRIPTION;
    }

    public void setDelivery_TERM_DESCRIPTION(String delivery_TERM_DESCRIPTION) {
        this.delivery_TERM_DESCRIPTION = delivery_TERM_DESCRIPTION;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getInvoice_CUSTOMER_ID_CUSTOMER_CODE() {
        return invoice_CUSTOMER_ID_CUSTOMER_CODE;
    }

    public void setInvoice_CUSTOMER_ID_CUSTOMER_CODE(String invoice_CUSTOMER_ID_CUSTOMER_CODE) {
        this.invoice_CUSTOMER_ID_CUSTOMER_CODE = invoice_CUSTOMER_ID_CUSTOMER_CODE;
    }

    public String getInvoice_CUSTOMER_ID_CUSTOMER_NAME() {
        return invoice_CUSTOMER_ID_CUSTOMER_NAME;
    }

    public void setInvoice_CUSTOMER_ID_CUSTOMER_NAME(String invoice_CUSTOMER_ID_CUSTOMER_NAME) {
        this.invoice_CUSTOMER_ID_CUSTOMER_NAME = invoice_CUSTOMER_ID_CUSTOMER_NAME;
    }

    public String getInvoice_ADDR_NAME() {
        return invoice_ADDR_NAME;
    }

    public void setInvoice_ADDR_NAME(String invoice_ADDR_NAME) {
        this.invoice_ADDR_NAME = invoice_ADDR_NAME;
    }

    public String getInvoice_CONTACT_NAME() {
        return invoice_CONTACT_NAME;
    }

    public void setInvoice_CONTACT_NAME(String invoice_CONTACT_NAME) {
        this.invoice_CONTACT_NAME = invoice_CONTACT_NAME;
    }

    public String getTax_INVOICE_CATEGORY_CODE() {
        return tax_INVOICE_CATEGORY_CODE;
    }

    public void setTax_INVOICE_CATEGORY_CODE(String tax_INVOICE_CATEGORY_CODE) {
        this.tax_INVOICE_CATEGORY_CODE = tax_INVOICE_CATEGORY_CODE;
    }

    public String getTax_INVOICE_CATEGORY_NAME() {
        return tax_INVOICE_CATEGORY_NAME;
    }

    public void setTax_INVOICE_CATEGORY_NAME(String tax_INVOICE_CATEGORY_NAME) {
        this.tax_INVOICE_CATEGORY_NAME = tax_INVOICE_CATEGORY_NAME;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getCustomer_ORDER_NO() {
        return customer_ORDER_NO;
    }

    public void setCustomer_ORDER_NO(String customer_ORDER_NO) {
        this.customer_ORDER_NO = customer_ORDER_NO;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getItem_TYPE() {
        return item_TYPE;
    }

    public void setItem_TYPE(String item_TYPE) {
        this.item_TYPE = item_TYPE;
    }

    public String getE_CODE() {
        return e_CODE;
    }

    public void setE_CODE(String e_CODE) {
        this.e_CODE = e_CODE;
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

    public String getItem_FEATURE_CODE() {
        return item_FEATURE_CODE;
    }

    public void setItem_FEATURE_CODE(String item_FEATURE_CODE) {
        this.item_FEATURE_CODE = item_FEATURE_CODE;
    }

    public String getItem_SPECIFICATION() {
        return item_SPECIFICATION;
    }

    public void setItem_SPECIFICATION(String item_SPECIFICATION) {
        this.item_SPECIFICATION = item_SPECIFICATION;
    }

    public String getUdf022() {
        return udf022;
    }

    public void setUdf022(String udf022) {
        this.udf022 = udf022;
    }

    public BigDecimal getBusiness_QTY() {
        return business_QTY;
    }

    public void setBusiness_QTY(BigDecimal business_QTY) {
        this.business_QTY = business_QTY;
    }

    public String getUnit_CODE() {
        return unit_CODE;
    }

    public void setUnit_CODE(String unit_CODE) {
        this.unit_CODE = unit_CODE;
    }

    public String getUnit_NAME() {
        return unit_NAME;
    }

    public void setUnit_NAME(String unit_NAME) {
        this.unit_NAME = unit_NAME;
    }

    public BigDecimal getPrice_QTY() {
        return price_QTY;
    }

    public void setPrice_QTY(BigDecimal price_QTY) {
        this.price_QTY = price_QTY;
    }

    public String getPrice_UNIT_ID_UNIT_CODE() {
        return price_UNIT_ID_UNIT_CODE;
    }

    public void setPrice_UNIT_ID_UNIT_CODE(String price_UNIT_ID_UNIT_CODE) {
        this.price_UNIT_ID_UNIT_CODE = price_UNIT_ID_UNIT_CODE;
    }

    public String getPrice_UNIT_ID_UNIT_NAME() {
        return price_UNIT_ID_UNIT_NAME;
    }

    public void setPrice_UNIT_ID_UNIT_NAME(String price_UNIT_ID_UNIT_NAME) {
        this.price_UNIT_ID_UNIT_NAME = price_UNIT_ID_UNIT_NAME;
    }

    public Date getPlan_DELIVERY_DATE() {
        return plan_DELIVERY_DATE;
    }

    public void setPlan_DELIVERY_DATE(Date plan_DELIVERY_DATE) {
        this.plan_DELIVERY_DATE = plan_DELIVERY_DATE;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount_RATE() {
        return discount_RATE;
    }

    public void setDiscount_RATE(BigDecimal discount_RATE) {
        this.discount_RATE = discount_RATE;
    }

    public BigDecimal getDiscounted_PRICE() {
        return discounted_PRICE;
    }

    public void setDiscounted_PRICE(BigDecimal discounted_PRICE) {
        this.discounted_PRICE = discounted_PRICE;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDiscount_AMT() {
        return discount_AMT;
    }

    public void setDiscount_AMT(BigDecimal discount_AMT) {
        this.discount_AMT = discount_AMT;
    }

    public String getTax_CODE() {
        return tax_CODE;
    }

    public void setTax_CODE(String tax_CODE) {
        this.tax_CODE = tax_CODE;
    }

    public String getTax_NAME() {
        return tax_NAME;
    }

    public void setTax_NAME(String tax_NAME) {
        this.tax_NAME = tax_NAME;
    }

    public BigDecimal getTax_RATE() {
        return tax_RATE;
    }

    public void setTax_RATE(BigDecimal tax_RATE) {
        this.tax_RATE = tax_RATE;
    }

    public BigDecimal getAmt_UNINCLUDE_TAX_OC() {
        return amt_UNINCLUDE_TAX_OC;
    }

    public void setAmt_UNINCLUDE_TAX_OC(BigDecimal amt_UNINCLUDE_TAX_OC) {
        this.amt_UNINCLUDE_TAX_OC = amt_UNINCLUDE_TAX_OC;
    }

    public BigDecimal getTax_OC() {
        return tax_OC;
    }

    public void setTax_OC(BigDecimal tax_OC) {
        this.tax_OC = tax_OC;
    }

    public BigDecimal getAmt_UNINCLUDE_TAX_BC() {
        return amt_UNINCLUDE_TAX_BC;
    }

    public void setAmt_UNINCLUDE_TAX_BC(BigDecimal amt_UNINCLUDE_TAX_BC) {
        this.amt_UNINCLUDE_TAX_BC = amt_UNINCLUDE_TAX_BC;
    }

    public BigDecimal getTax_BC() {
        return tax_BC;
    }

    public void setTax_BC(BigDecimal tax_BC) {
        this.tax_BC = tax_BC;
    }

    public String getSource_ID_RTK() {
        return source_ID_RTK;
    }

    public void setSource_ID_RTK(String source_ID_RTK) {
        this.source_ID_RTK = source_ID_RTK;
    }

    public String getSource_DOC_NO() {
        return source_DOC_NO;
    }

    public void setSource_DOC_NO(String source_DOC_NO) {
        this.source_DOC_NO = source_DOC_NO;
    }

    public Integer getSource_SN() {
        return source_SN;
    }

    public void setSource_SN(Integer source_SN) {
        this.source_SN = source_SN;
    }

    public Integer getSource_SEQ_SN() {
        return source_SEQ_SN;
    }

    public void setSource_SEQ_SN(Integer source_SEQ_SN) {
        this.source_SEQ_SN = source_SEQ_SN;
    }

    public String getCustomer_ITEM_CODE() {
        return customer_ITEM_CODE;
    }

    public void setCustomer_ITEM_CODE(String customer_ITEM_CODE) {
        this.customer_ITEM_CODE = customer_ITEM_CODE;
    }

    public String getCustomer_ITEM_NAME() {
        return customer_ITEM_NAME;
    }

    public void setCustomer_ITEM_NAME(String customer_ITEM_NAME) {
        this.customer_ITEM_NAME = customer_ITEM_NAME;
    }

    public String getCustomer_ITEM_SPECIFICATION() {
        return customer_ITEM_SPECIFICATION;
    }

    public void setCustomer_ITEM_SPECIFICATION(String customer_ITEM_SPECIFICATION) {
        this.customer_ITEM_SPECIFICATION = customer_ITEM_SPECIFICATION;
    }

    public Integer getSales_ORDER_DOC_D_PIECES() {
        return sales_ORDER_DOC_D_PIECES;
    }

    public void setSales_ORDER_DOC_D_PIECES(Integer sales_ORDER_DOC_D_PIECES) {
        this.sales_ORDER_DOC_D_PIECES = sales_ORDER_DOC_D_PIECES;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSettlement_CLOSE() {
        return settlement_CLOSE;
    }

    public void setSettlement_CLOSE(String settlement_CLOSE) {
        this.settlement_CLOSE = settlement_CLOSE;
    }

    public BigDecimal getPre_SETTLEMENT_PRICE_QTY() {
        return pre_SETTLEMENT_PRICE_QTY;
    }

    public void setPre_SETTLEMENT_PRICE_QTY(BigDecimal pre_SETTLEMENT_PRICE_QTY) {
        this.pre_SETTLEMENT_PRICE_QTY = pre_SETTLEMENT_PRICE_QTY;
    }

    public BigDecimal getPre_SETTLEMENT_AMT_UN_TAX_OC() {
        return pre_SETTLEMENT_AMT_UN_TAX_OC;
    }

    public void setPre_SETTLEMENT_AMT_UN_TAX_OC(BigDecimal pre_SETTLEMENT_AMT_UN_TAX_OC) {
        this.pre_SETTLEMENT_AMT_UN_TAX_OC = pre_SETTLEMENT_AMT_UN_TAX_OC;
    }

    public BigDecimal getPre_SETTLEMENT_TAX_OC() {
        return pre_SETTLEMENT_TAX_OC;
    }

    public void setPre_SETTLEMENT_TAX_OC(BigDecimal pre_SETTLEMENT_TAX_OC) {
        this.pre_SETTLEMENT_TAX_OC = pre_SETTLEMENT_TAX_OC;
    }

    public BigDecimal getSettlement_PRICE_QTY() {
        return settlement_PRICE_QTY;
    }

    public void setSettlement_PRICE_QTY(BigDecimal settlement_PRICE_QTY) {
        this.settlement_PRICE_QTY = settlement_PRICE_QTY;
    }

    public BigDecimal getSettlement_AMT_UN_TAX_OC() {
        return settlement_AMT_UN_TAX_OC;
    }

    public void setSettlement_AMT_UN_TAX_OC(BigDecimal settlement_AMT_UN_TAX_OC) {
        this.settlement_AMT_UN_TAX_OC = settlement_AMT_UN_TAX_OC;
    }

    public BigDecimal getSettlement_TAX_OC() {
        return settlement_TAX_OC;
    }

    public void setSettlement_TAX_OC(BigDecimal settlement_TAX_OC) {
        this.settlement_TAX_OC = settlement_TAX_OC;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getCurrency_ID() {
        return currency_ID;
    }

    public void setCurrency_ID(String currency_ID) {
        this.currency_ID = currency_ID;
    }

    public String getCompany_ID() {
        return company_ID;
    }

    public void setCompany_ID(String company_ID) {
        this.company_ID = company_ID;
    }

    public String getContract_DOC_NO() {
        return contract_DOC_NO;
    }

    public void setContract_DOC_NO(String contract_DOC_NO) {
        this.contract_DOC_NO = contract_DOC_NO;
    }

    public String getQuotation_DOC_NO() {
        return quotation_DOC_NO;
    }

    public void setQuotation_DOC_NO(String quotation_DOC_NO) {
        this.quotation_DOC_NO = quotation_DOC_NO;
    }

    public String getDoc_CODE() {
        return doc_CODE;
    }

    public void setDoc_CODE(String doc_CODE) {
        this.doc_CODE = doc_CODE;
    }

    public String getCustomer_F1() {
        return customer_F1;
    }

    public void setCustomer_F1(String customer_F1) {
        this.customer_F1 = customer_F1;
    }

    public String getCustomer_F2() {
        return customer_F2;
    }

    public void setCustomer_F2(String customer_F2) {
        this.customer_F2 = customer_F2;
    }

    public String getCustomer_F3() {
        return customer_F3;
    }

    public void setCustomer_F3(String customer_F3) {
        this.customer_F3 = customer_F3;
    }

    public String getItem_F1() {
        return item_F1;
    }

    public void setItem_F1(String item_F1) {
        this.item_F1 = item_F1;
    }

    public String getItem_F2() {
        return item_F2;
    }

    public void setItem_F2(String item_F2) {
        this.item_F2 = item_F2;
    }

    public String getItem_F3() {
        return item_F3;
    }

    public void setItem_F3(String item_F3) {
        this.item_F3 = item_F3;
    }

    public String getItem_F4() {
        return item_F4;
    }

    public void setItem_F4(String item_F4) {
        this.item_F4 = item_F4;
    }

    public Integer getSequenceNumber_01() {
        return sequenceNumber_01;
    }

    public void setSequenceNumber_01(Integer sequenceNumber_01) {
        this.sequenceNumber_01 = sequenceNumber_01;
    }

    public String getCustomer_CODE_01() {
        return customer_CODE_01;
    }

    public void setCustomer_CODE_01(String customer_CODE_01) {
        this.customer_CODE_01 = customer_CODE_01;
    }

    public String getCustomer_NAME_01() {
        return customer_NAME_01;
    }

    public void setCustomer_NAME_01(String customer_NAME_01) {
        this.customer_NAME_01 = customer_NAME_01;
    }

    public String getShip_TO_ADDR_NAME_01() {
        return ship_TO_ADDR_NAME_01;
    }

    public void setShip_TO_ADDR_NAME_01(String ship_TO_ADDR_NAME_01) {
        this.ship_TO_ADDR_NAME_01 = ship_TO_ADDR_NAME_01;
    }

    public String getShip_TO_CONTACT_NAME_01() {
        return ship_TO_CONTACT_NAME_01;
    }

    public void setShip_TO_CONTACT_NAME_01(String ship_TO_CONTACT_NAME_01) {
        this.ship_TO_CONTACT_NAME_01 = ship_TO_CONTACT_NAME_01;
    }

    public String getDelivery_TERM_CODE_01() {
        return delivery_TERM_CODE_01;
    }

    public void setDelivery_TERM_CODE_01(String delivery_TERM_CODE_01) {
        this.delivery_TERM_CODE_01 = delivery_TERM_CODE_01;
    }

    public String getDelivery_TERM_DESCRIPTION_01() {
        return delivery_TERM_DESCRIPTION_01;
    }

    public void setDelivery_TERM_DESCRIPTION_01(String delivery_TERM_DESCRIPTION_01) {
        this.delivery_TERM_DESCRIPTION_01 = delivery_TERM_DESCRIPTION_01;
    }

    public BigDecimal getBusiness_QTY_01() {
        return business_QTY_01;
    }

    public void setBusiness_QTY_01(BigDecimal business_QTY_01) {
        this.business_QTY_01 = business_QTY_01;
    }

    public BigDecimal getPrice_QTY_01() {
        return price_QTY_01;
    }

    public void setPrice_QTY_01(BigDecimal price_QTY_01) {
        this.price_QTY_01 = price_QTY_01;
    }

    public BigDecimal getInventory_QTY() {
        return inventory_QTY;
    }

    public void setInventory_QTY(BigDecimal inventory_QTY) {
        this.inventory_QTY = inventory_QTY;
    }

    public BigDecimal getSecond_QTY() {
        return second_QTY;
    }

    public void setSecond_QTY(BigDecimal second_QTY) {
        this.second_QTY = second_QTY;
    }

    public Date getPlan_DELIVERY_DATE_01() {
        return plan_DELIVERY_DATE_01;
    }

    public void setPlan_DELIVERY_DATE_01(Date plan_DELIVERY_DATE_01) {
        this.plan_DELIVERY_DATE_01 = plan_DELIVERY_DATE_01;
    }

    public Date getPlan_SHIP_DATE() {
        return plan_SHIP_DATE;
    }

    public void setPlan_SHIP_DATE(Date plan_SHIP_DATE) {
        this.plan_SHIP_DATE = plan_SHIP_DATE;
    }

    public String getDelivery_TYPE() {
        return delivery_TYPE;
    }

    public void setDelivery_TYPE(String delivery_TYPE) {
        this.delivery_TYPE = delivery_TYPE;
    }

    public String getDelivery_PARTNER_ID_RTK() {
        return delivery_PARTNER_ID_RTK;
    }

    public void setDelivery_PARTNER_ID_RTK(String delivery_PARTNER_ID_RTK) {
        this.delivery_PARTNER_ID_RTK = delivery_PARTNER_ID_RTK;
    }

    public String getDelivery_PARTNER_ID_ROid() {
        return delivery_PARTNER_ID_ROid;
    }

    public void setDelivery_PARTNER_ID_ROid(String delivery_PARTNER_ID_ROid) {
        this.delivery_PARTNER_ID_ROid = delivery_PARTNER_ID_ROid;
    }

    public String getCalColumn_01() {
        return calColumn_01;
    }

    public void setCalColumn_01(String calColumn_01) {
        this.calColumn_01 = calColumn_01;
    }

    public String getCalColumn_02() {
        return calColumn_02;
    }

    public void setCalColumn_02(String calColumn_02) {
        this.calColumn_02 = calColumn_02;
    }

    public String getPlant_CODE() {
        return plant_CODE;
    }

    public void setPlant_CODE(String plant_CODE) {
        this.plant_CODE = plant_CODE;
    }

    public String getPlant_NAME() {
        return plant_NAME;
    }

    public void setPlant_NAME(String plant_NAME) {
        this.plant_NAME = plant_NAME;
    }

    public String getWarehouse_CODE() {
        return warehouse_CODE;
    }

    public void setWarehouse_CODE(String warehouse_CODE) {
        this.warehouse_CODE = warehouse_CODE;
    }

    public String getWarehouse_NAME() {
        return warehouse_NAME;
    }

    public void setWarehouse_NAME(String warehouse_NAME) {
        this.warehouse_NAME = warehouse_NAME;
    }

    public String getSales_SYNERGY_CODE() {
        return sales_SYNERGY_CODE;
    }

    public void setSales_SYNERGY_CODE(String sales_SYNERGY_CODE) {
        this.sales_SYNERGY_CODE = sales_SYNERGY_CODE;
    }

    public String getSales_SYNERGY_NAME() {
        return sales_SYNERGY_NAME;
    }

    public void setSales_SYNERGY_NAME(String sales_SYNERGY_NAME) {
        this.sales_SYNERGY_NAME = sales_SYNERGY_NAME;
    }

    public String getSupply_CENTER_CODE() {
        return supply_CENTER_CODE;
    }

    public void setSupply_CENTER_CODE(String supply_CENTER_CODE) {
        this.supply_CENTER_CODE = supply_CENTER_CODE;
    }

    public String getSupply_CENTER_NAME() {
        return supply_CENTER_NAME;
    }

    public void setSupply_CENTER_NAME(String supply_CENTER_NAME) {
        this.supply_CENTER_NAME = supply_CENTER_NAME;
    }

    public String getDirect_SHIP() {
        return direct_SHIP;
    }

    public void setDirect_SHIP(String direct_SHIP) {
        this.direct_SHIP = direct_SHIP;
    }

    public BigDecimal getDelivered_BUSINESS_QTY() {
        return delivered_BUSINESS_QTY;
    }

    public void setDelivered_BUSINESS_QTY(BigDecimal delivered_BUSINESS_QTY) {
        this.delivered_BUSINESS_QTY = delivered_BUSINESS_QTY;
    }

    public BigDecimal getDelivered_PRICE_QTY() {
        return delivered_PRICE_QTY;
    }

    public void setDelivered_PRICE_QTY(BigDecimal delivered_PRICE_QTY) {
        this.delivered_PRICE_QTY = delivered_PRICE_QTY;
    }

    public String getDoc_SD_CLOSE() {
        return doc_SD_CLOSE;
    }

    public void setDoc_SD_CLOSE(String doc_SD_CLOSE) {
        this.doc_SD_CLOSE = doc_SD_CLOSE;
    }

    public BigDecimal getPurchased_BUSINESS_QTY() {
        return purchased_BUSINESS_QTY;
    }

    public void setPurchased_BUSINESS_QTY(BigDecimal purchased_BUSINESS_QTY) {
        this.purchased_BUSINESS_QTY = purchased_BUSINESS_QTY;
    }

    public BigDecimal getPurchased_PRICE_QTY() {
        return purchased_PRICE_QTY;
    }

    public void setPurchased_PRICE_QTY(BigDecimal purchased_PRICE_QTY) {
        this.purchased_PRICE_QTY = purchased_PRICE_QTY;
    }

    public String getTransfer_PURCHASE_STATUS() {
        return transfer_PURCHASE_STATUS;
    }

    public void setTransfer_PURCHASE_STATUS(String transfer_PURCHASE_STATUS) {
        this.transfer_PURCHASE_STATUS = transfer_PURCHASE_STATUS;
    }

    public String getPlan_STATUS() {
        return plan_STATUS;
    }

    public void setPlan_STATUS(String plan_STATUS) {
        this.plan_STATUS = plan_STATUS;
    }

    public String getReserved_BUSINESS_QTY() {
        return reserved_BUSINESS_QTY;
    }

    public void setReserved_BUSINESS_QTY(String reserved_BUSINESS_QTY) {
        this.reserved_BUSINESS_QTY = reserved_BUSINESS_QTY;
    }

    public String getRemark_01() {
        return remark_01;
    }

    public void setRemark_01(String remark_01) {
        this.remark_01 = remark_01;
    }

    public String getPieces_01() {
        return pieces_01;
    }

    public void setPieces_01(String pieces_01) {
        this.pieces_01 = pieces_01;
    }

    public Integer getSequenceNumber_02() {
        return sequenceNumber_02;
    }

    public void setSequenceNumber_02(Integer sequenceNumber_02) {
        this.sequenceNumber_02 = sequenceNumber_02;
    }

    public String getInstallment_TYPE() {
        return installment_TYPE;
    }

    public void setInstallment_TYPE(String installment_TYPE) {
        this.installment_TYPE = installment_TYPE;
    }

    public String getInstallment_NAME() {
        return installment_NAME;
    }

    public void setInstallment_NAME(String installment_NAME) {
        this.installment_NAME = installment_NAME;
    }

    public BigDecimal getInstallment_RATE() {
        return installment_RATE;
    }

    public void setInstallment_RATE(BigDecimal installment_RATE) {
        this.installment_RATE = installment_RATE;
    }

    public BigDecimal getInstallment_AMT_OC() {
        return installment_AMT_OC;
    }

    public void setInstallment_AMT_OC(BigDecimal installment_AMT_OC) {
        this.installment_AMT_OC = installment_AMT_OC;
    }

    public Date getCarry_OUT_DATE() {
        return carry_OUT_DATE;
    }

    public void setCarry_OUT_DATE(Date carry_OUT_DATE) {
        this.carry_OUT_DATE = carry_OUT_DATE;
    }

    public BigDecimal getAdv_RECEIVABLE_AMT_OC() {
        return adv_RECEIVABLE_AMT_OC;
    }

    public void setAdv_RECEIVABLE_AMT_OC(BigDecimal adv_RECEIVABLE_AMT_OC) {
        this.adv_RECEIVABLE_AMT_OC = adv_RECEIVABLE_AMT_OC;
    }

    public BigDecimal getSettlement_AMT_OC() {
        return settlement_AMT_OC;
    }

    public void setSettlement_AMT_OC(BigDecimal settlement_AMT_OC) {
        this.settlement_AMT_OC = settlement_AMT_OC;
    }

    public BigDecimal getVerification_AMT_OC() {
        return verification_AMT_OC;
    }

    public void setVerification_AMT_OC(BigDecimal verification_AMT_OC) {
        this.verification_AMT_OC = verification_AMT_OC;
    }

    public BigDecimal getBalance_AMT_OC() {
        return balance_AMT_OC;
    }

    public void setBalance_AMT_OC(BigDecimal balance_AMT_OC) {
        this.balance_AMT_OC = balance_AMT_OC;
    }

    public Integer getPayment_BASE_DATE_S() {
        return payment_BASE_DATE_S;
    }

    public void setPayment_BASE_DATE_S(Integer payment_BASE_DATE_S) {
        this.payment_BASE_DATE_S = payment_BASE_DATE_S;
    }

    public Date getPayment_BASE_DATE() {
        return payment_BASE_DATE;
    }

    public void setPayment_BASE_DATE(Date payment_BASE_DATE) {
        this.payment_BASE_DATE = payment_BASE_DATE;
    }

    public String getPayment_TERM_CODE_01() {
        return payment_TERM_CODE_01;
    }

    public void setPayment_TERM_CODE_01(String payment_TERM_CODE_01) {
        this.payment_TERM_CODE_01 = payment_TERM_CODE_01;
    }

    public String getPayment_TERM_NAME_01() {
        return payment_TERM_NAME_01;
    }

    public void setPayment_TERM_NAME_01(String payment_TERM_NAME_01) {
        this.payment_TERM_NAME_01 = payment_TERM_NAME_01;
    }

    public Date getPayment_DATE() {
        return payment_DATE;
    }

    public void setPayment_DATE(Date payment_DATE) {
        this.payment_DATE = payment_DATE;
    }

    public Date getCashing_DATE() {
        return cashing_DATE;
    }

    public void setCashing_DATE(Date cashing_DATE) {
        this.cashing_DATE = cashing_DATE;
    }

    public Integer getCash_DISCOUNT_MODE() {
        return cash_DISCOUNT_MODE;
    }

    public void setCash_DISCOUNT_MODE(Integer cash_DISCOUNT_MODE) {
        this.cash_DISCOUNT_MODE = cash_DISCOUNT_MODE;
    }

    public BigDecimal getCash_DISCOUNT_RATE1() {
        return cash_DISCOUNT_RATE1;
    }

    public void setCash_DISCOUNT_RATE1(BigDecimal cash_DISCOUNT_RATE1) {
        this.cash_DISCOUNT_RATE1 = cash_DISCOUNT_RATE1;
    }

    public Date getCash_DISCOUNT_DUE_DATE1() {
        return cash_DISCOUNT_DUE_DATE1;
    }

    public void setCash_DISCOUNT_DUE_DATE1(Date cash_DISCOUNT_DUE_DATE1) {
        this.cash_DISCOUNT_DUE_DATE1 = cash_DISCOUNT_DUE_DATE1;
    }

    public BigDecimal getCash_DISCOUNT_RATE2() {
        return cash_DISCOUNT_RATE2;
    }

    public void setCash_DISCOUNT_RATE2(BigDecimal cash_DISCOUNT_RATE2) {
        this.cash_DISCOUNT_RATE2 = cash_DISCOUNT_RATE2;
    }

    public Date getCash_DISCOUNT_DUE_DATE2() {
        return cash_DISCOUNT_DUE_DATE2;
    }

    public void setCash_DISCOUNT_DUE_DATE2(Date cash_DISCOUNT_DUE_DATE2) {
        this.cash_DISCOUNT_DUE_DATE2 = cash_DISCOUNT_DUE_DATE2;
    }

    public BigDecimal getCash_DISCOUNT_RATE3() {
        return cash_DISCOUNT_RATE3;
    }

    public void setCash_DISCOUNT_RATE3(BigDecimal cash_DISCOUNT_RATE3) {
        this.cash_DISCOUNT_RATE3 = cash_DISCOUNT_RATE3;
    }

    public Date getCash_DISCOUNT_DUE_DATE3() {
        return cash_DISCOUNT_DUE_DATE3;
    }

    public void setCash_DISCOUNT_DUE_DATE3(Date cash_DISCOUNT_DUE_DATE3) {
        this.cash_DISCOUNT_DUE_DATE3 = cash_DISCOUNT_DUE_DATE3;
    }

    public String getTax_CODE_01() {
        return tax_CODE_01;
    }

    public void setTax_CODE_01(String tax_CODE_01) {
        this.tax_CODE_01 = tax_CODE_01;
    }

    public String getTax_NAME_01() {
        return tax_NAME_01;
    }

    public void setTax_NAME_01(String tax_NAME_01) {
        this.tax_NAME_01 = tax_NAME_01;
    }

    public BigDecimal getTax_RATE_01() {
        return tax_RATE_01;
    }

    public void setTax_RATE_01(BigDecimal tax_RATE_01) {
        this.tax_RATE_01 = tax_RATE_01;
    }

    public Boolean getTax_INCLUDED_01() {
        return tax_INCLUDED_01;
    }

    public void setTax_INCLUDED_01(Boolean tax_INCLUDED_01) {
        this.tax_INCLUDED_01 = tax_INCLUDED_01;
    }

    public BigDecimal getAmt_UNINCLUDE_TAX_OC_01() {
        return amt_UNINCLUDE_TAX_OC_01;
    }

    public void setAmt_UNINCLUDE_TAX_OC_01(BigDecimal amt_UNINCLUDE_TAX_OC_01) {
        this.amt_UNINCLUDE_TAX_OC_01 = amt_UNINCLUDE_TAX_OC_01;
    }

    public BigDecimal getTax_OC_02() {
        return tax_OC_02;
    }

    public void setTax_OC_02(BigDecimal tax_OC_02) {
        this.tax_OC_02 = tax_OC_02;
    }

    public BigDecimal getPre_SETTLEMENT_AMT_UN_TAX__01() {
        return pre_SETTLEMENT_AMT_UN_TAX__01;
    }

    public void setPre_SETTLEMENT_AMT_UN_TAX__01(BigDecimal pre_SETTLEMENT_AMT_UN_TAX__01) {
        this.pre_SETTLEMENT_AMT_UN_TAX__01 = pre_SETTLEMENT_AMT_UN_TAX__01;
    }

    public BigDecimal getPre_SETTLEMENT_TAX_OC_01() {
        return pre_SETTLEMENT_TAX_OC_01;
    }

    public void setPre_SETTLEMENT_TAX_OC_01(BigDecimal pre_SETTLEMENT_TAX_OC_01) {
        this.pre_SETTLEMENT_TAX_OC_01 = pre_SETTLEMENT_TAX_OC_01;
    }

    public BigDecimal getOffseted_AMT_UN_TAX_OC() {
        return offseted_AMT_UN_TAX_OC;
    }

    public void setOffseted_AMT_UN_TAX_OC(BigDecimal offseted_AMT_UN_TAX_OC) {
        this.offseted_AMT_UN_TAX_OC = offseted_AMT_UN_TAX_OC;
    }

    public BigDecimal getOffseted_TAX_OC() {
        return offseted_TAX_OC;
    }

    public void setOffseted_TAX_OC(BigDecimal offseted_TAX_OC) {
        this.offseted_TAX_OC = offseted_TAX_OC;
    }

    public String getCompany_CODE_01() {
        return company_CODE_01;
    }

    public void setCompany_CODE_01(String company_CODE_01) {
        this.company_CODE_01 = company_CODE_01;
    }

    public String getCompany_NAME_01() {
        return company_NAME_01;
    }

    public void setCompany_NAME_01(String company_NAME_01) {
        this.company_NAME_01 = company_NAME_01;
    }

    public String getDrawing_NO() {
        return drawing_NO;
    }

    public void setDrawing_NO(String drawing_NO) {
        this.drawing_NO = drawing_NO;
    }

    public String getItem_FEATURE_SPECIFICATION() {
        return item_FEATURE_SPECIFICATION;
    }

    public void setItem_FEATURE_SPECIFICATION(String item_FEATURE_SPECIFICATION) {
        this.item_FEATURE_SPECIFICATION = item_FEATURE_SPECIFICATION;
    }

    public String getProject_CODE() {
        return project_CODE;
    }

    public void setProject_CODE(String project_CODE) {
        this.project_CODE = project_CODE;
    }

    public String getProject_NAME() {
        return project_NAME;
    }

    public void setProject_NAME(String project_NAME) {
        this.project_NAME = project_NAME;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("sales_CENTER_ID",getSales_CENTER_ID())
                .append("sales_CENTER_CODE",getSales_CENTER_CODE())
                .append("sales_CENTER_NAME",getSales_CENTER_NAME())
                .append("doc_ID",getDoc_ID())
                .append("sales_ORDER_DOC_ID",getSales_ORDER_DOC_ID())
                .append("doc_NAME",getDoc_NAME())
                .append("doc_NO",getDoc_NO())
                .append("sales_ORDER_DOC_D_ID",getSales_ORDER_DOC_D_ID())
                .append("customer_CODE",getCustomer_CODE())
                .append("customer_NAME",getCustomer_NAME())
                .append("employee_CODE",getEmployee_CODE())
                .append("employee_NAME",getEmployee_NAME())
                .append("admin_UNIT_CODE",getAdmin_UNIT_CODE())
                .append("admin_UNIT_NAME",getAdmin_UNIT_NAME())
                .append("doc_DATE",getDoc_DATE())
                .append("order_DATE",getOrder_DATE())
                .append("company_CODE",getCompany_CODE())
                .append("company_NAME",getCompany_NAME())
                .append("currency_CODE",getCurrency_CODE())
                .append("exchange_RATE",getExchange_RATE())
                .append("customer_ADDR_NAME",getCustomer_ADDR_NAME())
                .append("customer_CONTACT_NAME",getCustomer_CONTACT_NAME())
                .append("tax_INCLUDED",getTax_INCLUDED())
                .append("payment_TERM_CODE",getPayment_TERM_CODE())
                .append("payment_TERM_NAME",getPayment_TERM_NAME())
                .append("earnest",getEarnest())
                .append("earnest_RATE",getEarnest_RATE())
                .append("is_INSTALLMENT",getIs_INSTALLMENT())
                .append("installment_SOURCE",getInstallment_SOURCE())
                .append("partial_DELIVERY",getPartial_DELIVERY())
                .append("contract_ID_DOC_NO",getContract_ID_DOC_NO())
                .append("remark1",getRemark1())
                .append("multi_DELIVERY",getMulti_DELIVERY())
                .append("ship_TO_ADDR_NAME",getShip_TO_ADDR_NAME())
                .append("ship_TO_CONTACT_NAME",getShip_TO_CONTACT_NAME())
                .append("delivery_TERM_CODE",getDelivery_TERM_CODE())
                .append("delivery_TERM_DESCRIPTION",getDelivery_TERM_DESCRIPTION())
                .append("pieces",getPieces())
                .append("remark2",getRemark2())
                .append("invoice_CUSTOMER_ID_CUSTOMER_CODE",getInvoice_CUSTOMER_ID_CUSTOMER_CODE())
                .append("invoice_CUSTOMER_ID_CUSTOMER_NAME",getInvoice_CUSTOMER_ID_CUSTOMER_NAME())
                .append("invoice_ADDR_NAME",getInvoice_ADDR_NAME())
                .append("invoice_CONTACT_NAME",getInvoice_CONTACT_NAME())
                .append("tax_INVOICE_CATEGORY_CODE",getTax_INVOICE_CATEGORY_CODE())
                .append("tax_INVOICE_CATEGORY_NAME",getTax_INVOICE_CATEGORY_NAME())
                .append("remark3",getRemark3())
                .append("customer_ORDER_NO",getCustomer_ORDER_NO())
                .append("category",getCategory())
                .append("sequenceNumber",getSequenceNumber())
                .append("item_TYPE",getItem_TYPE())
                .append("e_CODE",getE_CODE())
                .append("item_DESCRIPTION",getItem_DESCRIPTION())
                .append("item_FEATURE_CODE",getItem_FEATURE_CODE())
                .append("item_SPECIFICATION",getItem_SPECIFICATION())
                .append("udf022",getUdf022())
                .append("business_QTY",getBusiness_QTY())
                .append("unit_CODE",getUnit_CODE())
                .append("unit_NAME",getUnit_NAME())
                .append("price_QTY",getPrice_QTY())
                .append("price_UNIT_ID_UNIT_CODE",getPrice_UNIT_ID_UNIT_CODE())
                .append("price_UNIT_ID_UNIT_NAME",getPrice_UNIT_ID_UNIT_NAME())
                .append("plan_DELIVERY_DATE",getPlan_DELIVERY_DATE())
                .append("price",getPrice())
                .append("discount_RATE",getDiscount_RATE())
                .append("discounted_PRICE",getDiscounted_PRICE())
                .append("amount",getAmount())
                .append("discount_AMT",getDiscount_AMT())
                .append("tax_CODE",getTax_CODE())
                .append("tax_NAME",getTax_NAME())
                .append("tax_RATE",getTax_RATE())
                .append("amt_UNINCLUDE_TAX_OC",getAmt_UNINCLUDE_TAX_OC())
                .append("tax_OC",getTax_OC())
                .append("amt_UNINCLUDE_TAX_BC",getAmt_UNINCLUDE_TAX_BC())
                .append("tax_BC",getTax_BC())
                .append("source_ID_RTK",getSource_ID_RTK())
                .append("source_DOC_NO",getSource_DOC_NO())
                .append("source_SN",getSource_SN())
                .append("source_SEQ_SN",getSource_SEQ_SN())
                .append("customer_ITEM_CODE",getCustomer_ITEM_CODE())
                .append("customer_ITEM_NAME",getCustomer_ITEM_NAME())
                .append("customer_ITEM_SPECIFICATION",getCustomer_ITEM_SPECIFICATION())
                .append("sales_ORDER_DOC_D_PIECES",getSales_ORDER_DOC_D_PIECES())
                .append("remark",getRemark())
                .append("settlement_CLOSE",getSettlement_CLOSE())
                .append("pre_SETTLEMENT_PRICE_QTY",getPre_SETTLEMENT_PRICE_QTY())
                .append("pre_SETTLEMENT_AMT_UN_TAX_OC",getPre_SETTLEMENT_AMT_UN_TAX_OC())
                .append("pre_SETTLEMENT_TAX_OC",getPre_SETTLEMENT_TAX_OC())
                .append("settlement_PRICE_QTY",getSettlement_PRICE_QTY())
                .append("settlement_AMT_UN_TAX_OC",getSettlement_AMT_UN_TAX_OC())
                .append("settlement_TAX_OC",getSettlement_TAX_OC())
                .append("approveStatus",getApproveStatus())
                .append("currency_ID",getCurrency_ID())
                .append("company_ID",getCompany_ID())
                .append("contract_DOC_NO",getContract_DOC_NO())
                .append("quotation_DOC_NO",getQuotation_DOC_NO())
                .append("doc_CODE",getDoc_CODE())
                .append("customer_F1",getCustomer_F1())
                .append("customer_F2",getCustomer_F2())
                .append("customer_F3",getCustomer_F3())
                .append("item_F1",getItem_F1())
                .append("item_F2",getItem_F2())
                .append("item_F3",getItem_F3())
                .append("item_F4",getItem_F4())
                .append("sequenceNumber_01",getSequenceNumber_01())
                .append("customer_CODE_01",getCustomer_CODE_01())
                .append("customer_NAME_01",getCustomer_NAME_01())
                .append("ship_TO_ADDR_NAME_01",getShip_TO_ADDR_NAME_01())
                .append("ship_TO_CONTACT_NAME_01",getShip_TO_CONTACT_NAME_01())
                .append("delivery_TERM_CODE_01",getDelivery_TERM_CODE_01())
                .append("delivery_TERM_DESCRIPTION_01",getDelivery_TERM_DESCRIPTION_01())
                .append("business_QTY_01",getBusiness_QTY_01())
                .append("price_QTY_01",getPrice_QTY_01())
                .append("inventory_QTY",getInventory_QTY())
                .append("second_QTY",getSecond_QTY())
                .append("plan_DELIVERY_DATE_01",getPlan_DELIVERY_DATE_01())
                .append("plan_SHIP_DATE",getPlan_SHIP_DATE())
                .append("delivery_TYPE",getDelivery_TYPE())
                .append("delivery_PARTNER_ID_RTK",getDelivery_PARTNER_ID_RTK())
                .append("delivery_PARTNER_ID_ROid",getDelivery_PARTNER_ID_ROid())
                .append("calColumn_01",getCalColumn_01())
                .append("calColumn_02",getCalColumn_02())
                .append("plant_CODE",getPlant_CODE())
                .append("plant_NAME",getPlant_NAME())
                .append("warehouse_CODE",getWarehouse_CODE())
                .append("warehouse_NAME",getWarehouse_NAME())
                .append("sales_SYNERGY_CODE",getSales_SYNERGY_CODE())
                .append("sales_SYNERGY_NAME",getSales_SYNERGY_NAME())
                .append("supply_CENTER_CODE",getSupply_CENTER_CODE())
                .append("supply_CENTER_NAME",getSupply_CENTER_NAME())
                .append("direct_SHIP",getDirect_SHIP())
                .append("delivered_BUSINESS_QTY",getDelivered_BUSINESS_QTY())
                .append("delivered_PRICE_QTY",getDelivered_PRICE_QTY())
                .append("doc_SD_CLOSE",getDoc_SD_CLOSE())
                .append("purchased_BUSINESS_QTY",getPurchased_BUSINESS_QTY())
                .append("purchased_PRICE_QTY",getPurchased_PRICE_QTY())
                .append("transfer_PURCHASE_STATUS",getTransfer_PURCHASE_STATUS())
                .append("plan_STATUS",getPlan_STATUS())
                .append("reserved_BUSINESS_QTY",getReserved_BUSINESS_QTY())
                .append("remark_01",getRemark_01())
                .append("pieces_01",getPieces_01())
                .append("sequenceNumber_02",getSequenceNumber_02())
                .append("installment_TYPE",getInstallment_TYPE())
                .append("installment_NAME",getInstallment_NAME())
                .append("installment_RATE",getInstallment_RATE())
                .append("installment_AMT_OC",getInstallment_AMT_OC())
                .append("carry_OUT_DATE",getCarry_OUT_DATE())
                .append("adv_RECEIVABLE_AMT_OC",getAdv_RECEIVABLE_AMT_OC())
                .append("settlement_AMT_OC",getSettlement_AMT_OC())
                .append("verification_AMT_OC",getVerification_AMT_OC())
                .append("balance_AMT_OC",getBalance_AMT_OC())
                .append("payment_BASE_DATE_S",getPayment_BASE_DATE_S())
                .append("payment_BASE_DATE",getPayment_BASE_DATE())
                .append("payment_TERM_CODE_01",getPayment_TERM_CODE_01())
                .append("payment_TERM_NAME_01",getPayment_TERM_NAME_01())
                .append("payment_DATE",getPayment_DATE())
                .append("cashing_DATE",getCashing_DATE())
                .append("cash_DISCOUNT_MODE",getCash_DISCOUNT_MODE())
                .append("cash_DISCOUNT_RATE1",getCash_DISCOUNT_RATE1())
                .append("cash_DISCOUNT_DUE_DATE1",getCash_DISCOUNT_DUE_DATE1())
                .append("cash_DISCOUNT_RATE2",getCash_DISCOUNT_RATE2())
                .append("cash_DISCOUNT_DUE_DATE2",getCash_DISCOUNT_DUE_DATE2())
                .append("cash_DISCOUNT_RATE3",getCash_DISCOUNT_RATE3())
                .append("cash_DISCOUNT_DUE_DATE3",getCash_DISCOUNT_DUE_DATE3())
                .append("tax_CODE_01",getTax_CODE_01())
                .append("tax_NAME_01",getTax_NAME_01())
                .append("tax_RATE_01",getTax_RATE_01())
                .append("tax_INCLUDED_01",getTax_INCLUDED_01())
                .append("amt_UNINCLUDE_TAX_OC_01",getAmt_UNINCLUDE_TAX_OC_01())
                .append("tax_OC_02",getTax_OC_02())
                .append("pre_SETTLEMENT_AMT_UN_TAX__01",getPre_SETTLEMENT_AMT_UN_TAX__01())
                .append("pre_SETTLEMENT_TAX_OC_01",getPre_SETTLEMENT_TAX_OC_01())
                .append("offseted_AMT_UN_TAX_OC",getOffseted_AMT_UN_TAX_OC())
                .append("offseted_TAX_OC",getOffseted_TAX_OC())
                .append("company_CODE_01",getCompany_CODE_01())
                .append("company_NAME_01",getCompany_NAME_01())
                .append("drawing_NO",getDrawing_NO())
                .append("item_FEATURE_SPECIFICATION",getItem_FEATURE_SPECIFICATION())
                .append("project_CODE",getProject_CODE())
                .append("project_NAME",getProject_NAME())
                .toString();
    }
}
