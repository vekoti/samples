package com.cisco.ccw.quote.etl.sql.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.mongodb.morphia.annotations.Reference;

import com.cisco.ccw.quote.etl.annotation.Document;

@Entity
@Table(name = "CQ_DEAL")
@Document(query = "select deal from CqDeal deal where deal.dealScope = 3")
public class CqDeal extends com.cisco.ccw.quote.etl.sql.model.Document {

	private static final long serialVersionUID = 5713748432418605230L;

	@Id
	@org.mongodb.morphia.annotations.Id
	@Column(name = "OBJECT_ID")
	private Long objectId;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "DEAL_OBJECT_ID")
	@Reference
	private Set<CqQuote> quote;

	@Column(name = "OPTY_ID")
	private String optyId;

	@Column(name = "OPTY_NAME")
	private String optyName;

	@Column(name = "DEAL_SCOPE")
	protected BigDecimal dealScope;

	@Column(name = "ACTIVE_WORKFLOW")
	protected String activeWorkflow;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "APPROVAL_REQUIRED_BY_DATE")
	protected Date approvalRequiredByDate;

	@Column(name = "AT_OR_BELOW_FLAG")
	protected String atOrBelowFlag;

	@Column(name = "BRIDGE_COUNTRY_CD")
	protected String bridgeCountryCd;

	@Column(name = "BRIDGE_FLAG")
	protected String bridgeFlag;

	@Column(name = "BUSINESS_SCENARIO")
	protected BigDecimal businessScenario;

	@Column(name = "CDP_FLAG")
	protected String cdpFlag;

	@Column(name = "CREATED_BY")
	protected String createdBy;

	@Column(name = "UPDATED_TS")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updatedTimeStamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	protected Date createdOn;

	@Column(name = "CREATOR_PAE_USER_ID")
	protected BigDecimal creatorPaeUserId;

	@Column(name = "CUSTOMER_USE_CASE")
	protected String customerUseCase;

	@Column(name = "CUSTOMER_USE_SOLUTION")
	protected String customerUseSolution;

	@Column(name = "DDA_DEAL_DURATION")
	protected BigDecimal ddaDealDuration;

	@Column(name = "DEAL_CATEGORY_DROP")
	protected BigDecimal dealCategoryDrop;

	@Column(name = "DEAL_CREATOR_ROLE")
	protected BigDecimal dealCreatorRole;

	@Column(name = "DEAL_DURATION")
	protected BigDecimal dealDuration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEAL_EXPECTED_BOOK_DATE")
	protected Date dealExpectedBookDate;

	@Column(name = "DEAL_OR_QUOTE")
	protected String dealOrQuote;

	@Column(name = "DEAL_SOURCE")
	protected BigDecimal dealSource;

	@Column(name = "DEAL_TYPE")
	protected BigDecimal dealType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DM_UPDATE_DATE")
	protected Date dmUpdateDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPECTED_CLOSE_DATE")
	protected Date expectedCloseDate;

	@Lob
	@Column(name = "FINANCIAL_SUMMARY")
	protected String financialSummary;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FIRST_INSTALLATION_DT")
	protected Date firstInstallationDt;

	@Column(name = "INTENDED_USE_DROP")
	protected String intendedUseDrop;

	@Column(name = "IS_DEAL_AUTO_CONVERTED")
	protected String isDealAutoConverted;

	@Column(name = "IS_DISTI_FACILITATED_DROP")
	protected String isDistiFacilitatedDrop;

	@Column(name = "IS_THRESHOLD_MEET_FLAG")
	protected String isThresholdMeetFlag;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_APPROVAL_DATE")
	protected Date lastApprovalDate;

	@Column(name = "LEAD_PROSPECTS_ID")
	protected String leadProspectsId;

	@Column(name = "LEGACY_FLAG")
	protected String legacyFlag;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MDM_DEAL_EXPIRATION_DATE")
	protected Date mdmDealExpirationDate;

	@Column(name = "MDM_DEAL_STATUS")
	protected Long mdmDealStatus;

	@Column(name = "MDM_OPTY_DESC_STRATEGIC_DESC")
	protected String mdmOptyDescStrategicDesc;

	@Column(name = "MDM_OPTY_DESC_STRATEGIC_VALUE")
	protected String mdmOptyDescStrategicValue;

	@Column(name = "MDM_PROD_VALUE")
	protected BigDecimal mdmProdValue;

	@Column(name = "MDM_SERV_VALUE")
	protected BigDecimal mdmServValue;

	@Column(name = "MERGED_SFDC_OPTY_ID")
	protected String mergedSfdcOptyId;

	@Column(name = "OPTY_STATUS")
	protected String optyStatus;

	@Column(name = "P360_AM_RECEIVED")
	protected String p360AmReceived;

	@Column(name = "P360_CUST_RECEIVED")
	protected String p360CustReceived;

	@Column(name = "P360_DEAL_FLAG")
	protected String p360DealFlag;

	@Column(name = "PARENT_OBJECT_ID")
	protected BigDecimal parentObjectId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PDR_DEAL_EXPIRATION_DATE_DROP")
	protected Date pdrDealExpirationDateDrop;

	@Column(name = "PDR_DEAL_STATUS_DROP")
	protected BigDecimal pdrDealStatusDrop;

	@Column(name = "PDR_OPTY_DESC_STRATEGIC_VALUE")
	protected String pdrOptyDescStrategicValue;

	@Column(name = "PDR_PROD_VALUE")
	protected BigDecimal pdrProdValue;

	@Column(name = "PDR_SERV_VALUE")
	protected BigDecimal pdrServValue;

	@Column(name = "PROD_SALES_PATH")
	protected String prodSalesPath;

	@Column(name = "PUBLISH_DISCOUNT_FLAG")
	protected String publishDiscountFlag;

	@Column(name = "QF_FORM_ID")
	protected BigDecimal qfFormId;

	@Column(name = "QF_FORM_STATUS")
	protected String qfFormStatus;

	@Column(name = "QUOTE_FLAG")
	protected String quoteFlag;

	@Column(name = "REOPEN_REASON")
	protected String reopenReason;

	@Column(name = "REVENUE_RECOG_FLAG")
	protected String revenueRecogFlag;

	@Column(name = "RFP_FLAG")
	protected String rfpFlag;

	@Column(name = "SERV_SALES_PATH")
	protected String servSalesPath;

	@Column(name = "SFDC_ACTIVE_FLAG")
	protected String sfdcActiveFlag;

	@Column(name = "SFDC_OPTY_ID")
	protected String sfdcOptyId;

	@Column(name = "SOURCE_OPTY_NUMBER")
	protected String sourceOptyNumber;

	@Column(name = "UPDATED_BY")
	protected String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_ON")
	protected Date updatedOn;

	@Column(name = "VERTICAL_MARKET")
	protected String verticalMarket;

	@Column(name = "PROXY_USER_ID")
	protected String proxyUserId;

	@Column(name = "CRP_CREATOR_PAE_USER_ID")
	protected Long crpCreatorPaeUserId;

	@Column(name = "UCE_NOTIFICATION_ID")
	protected Long uceNotificationId;

	@Column(name = "UCE_DEAL_REQ_ID")
	protected Long uceDealReqId;

	@Column(name = "UCE_QUOTE_ID")
	protected String uceQuoteId;

	@Column(name = "INFLUENCER_PAE_USER_ID")
	protected Long influencerPaeUserId;

	@Column(name = "IDENTIFY_SINGLE_AM_FLAG")
	private String identifySingleAMFlag;

	@Column(name = "COPY_FROM_OPTY_NUMBER")
	private String copyFromOptyNumber;

	/**
	 * @return the objectId
	 */
	public Long getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId
	 *            the objectId to set
	 */
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the optyId
	 */
	public String getOptyId() {
		return optyId;
	}

	/**
	 * @param optyId
	 *            the optyId to set
	 */
	public void setOptyId(String optyId) {
		this.optyId = optyId;
	}

	/**
	 * @return the optyName
	 */
	public String getOptyName() {
		return optyName;
	}

	/**
	 * @param optyName
	 *            the optyName to set
	 */
	public void setOptyName(String optyName) {
		this.optyName = optyName;
	}

	/**
	 * @return the dealScope
	 */
	public BigDecimal getDealScope() {
		return dealScope;
	}

	/**
	 * @param dealScope
	 *            the dealScope to set
	 */
	public void setDealScope(BigDecimal dealScope) {
		this.dealScope = dealScope;
	}

	/**
	 * @return the activeWorkflow
	 */
	public String getActiveWorkflow() {
		return activeWorkflow;
	}

	/**
	 * @param activeWorkflow
	 *            the activeWorkflow to set
	 */
	public void setActiveWorkflow(String activeWorkflow) {
		this.activeWorkflow = activeWorkflow;
	}

	/**
	 * @return the approvalRequiredByDate
	 */
	public Date getApprovalRequiredByDate() {
		return approvalRequiredByDate;
	}

	/**
	 * @param approvalRequiredByDate
	 *            the approvalRequiredByDate to set
	 */
	public void setApprovalRequiredByDate(Date approvalRequiredByDate) {
		this.approvalRequiredByDate = approvalRequiredByDate;
	}

	/**
	 * @return the atOrBelowFlag
	 */
	public String getAtOrBelowFlag() {
		return atOrBelowFlag;
	}

	/**
	 * @param atOrBelowFlag
	 *            the atOrBelowFlag to set
	 */
	public void setAtOrBelowFlag(String atOrBelowFlag) {
		this.atOrBelowFlag = atOrBelowFlag;
	}

	/**
	 * @return the bridgeCountryCd
	 */
	public String getBridgeCountryCd() {
		return bridgeCountryCd;
	}

	/**
	 * @param bridgeCountryCd
	 *            the bridgeCountryCd to set
	 */
	public void setBridgeCountryCd(String bridgeCountryCd) {
		this.bridgeCountryCd = bridgeCountryCd;
	}

	/**
	 * @return the bridgeFlag
	 */
	public String getBridgeFlag() {
		return bridgeFlag;
	}

	/**
	 * @param bridgeFlag
	 *            the bridgeFlag to set
	 */
	public void setBridgeFlag(String bridgeFlag) {
		this.bridgeFlag = bridgeFlag;
	}

	/**
	 * @return the businessScenario
	 */
	public BigDecimal getBusinessScenario() {
		return businessScenario;
	}

	/**
	 * @param businessScenario
	 *            the businessScenario to set
	 */
	public void setBusinessScenario(BigDecimal businessScenario) {
		this.businessScenario = businessScenario;
	}

	/**
	 * @return the cdpFlag
	 */
	public String getCdpFlag() {
		return cdpFlag;
	}

	/**
	 * @param cdpFlag
	 *            the cdpFlag to set
	 */
	public void setCdpFlag(String cdpFlag) {
		this.cdpFlag = cdpFlag;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the updatedTimeStamp
	 */
	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	/**
	 * @param updatedTimeStamp
	 *            the updatedTimeStamp to set
	 */
	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the creatorPaeUserId
	 */
	public BigDecimal getCreatorPaeUserId() {
		return creatorPaeUserId;
	}

	/**
	 * @param creatorPaeUserId
	 *            the creatorPaeUserId to set
	 */
	public void setCreatorPaeUserId(BigDecimal creatorPaeUserId) {
		this.creatorPaeUserId = creatorPaeUserId;
	}

	/**
	 * @return the customerUseCase
	 */
	public String getCustomerUseCase() {
		return customerUseCase;
	}

	/**
	 * @param customerUseCase
	 *            the customerUseCase to set
	 */
	public void setCustomerUseCase(String customerUseCase) {
		this.customerUseCase = customerUseCase;
	}

	/**
	 * @return the customerUseSolution
	 */
	public String getCustomerUseSolution() {
		return customerUseSolution;
	}

	/**
	 * @param customerUseSolution
	 *            the customerUseSolution to set
	 */
	public void setCustomerUseSolution(String customerUseSolution) {
		this.customerUseSolution = customerUseSolution;
	}

	/**
	 * @return the ddaDealDuration
	 */
	public BigDecimal getDdaDealDuration() {
		return ddaDealDuration;
	}

	/**
	 * @param ddaDealDuration
	 *            the ddaDealDuration to set
	 */
	public void setDdaDealDuration(BigDecimal ddaDealDuration) {
		this.ddaDealDuration = ddaDealDuration;
	}

	/**
	 * @return the dealCategoryDrop
	 */
	public BigDecimal getDealCategoryDrop() {
		return dealCategoryDrop;
	}

	/**
	 * @param dealCategoryDrop
	 *            the dealCategoryDrop to set
	 */
	public void setDealCategoryDrop(BigDecimal dealCategoryDrop) {
		this.dealCategoryDrop = dealCategoryDrop;
	}

	/**
	 * @return the dealCreatorRole
	 */
	public BigDecimal getDealCreatorRole() {
		return dealCreatorRole;
	}

	/**
	 * @param dealCreatorRole
	 *            the dealCreatorRole to set
	 */
	public void setDealCreatorRole(BigDecimal dealCreatorRole) {
		this.dealCreatorRole = dealCreatorRole;
	}

	/**
	 * @return the dealDuration
	 */
	public BigDecimal getDealDuration() {
		return dealDuration;
	}

	/**
	 * @param dealDuration
	 *            the dealDuration to set
	 */
	public void setDealDuration(BigDecimal dealDuration) {
		this.dealDuration = dealDuration;
	}

	/**
	 * @return the dealExpectedBookDate
	 */
	public Date getDealExpectedBookDate() {
		return dealExpectedBookDate;
	}

	/**
	 * @param dealExpectedBookDate
	 *            the dealExpectedBookDate to set
	 */
	public void setDealExpectedBookDate(Date dealExpectedBookDate) {
		this.dealExpectedBookDate = dealExpectedBookDate;
	}

	/**
	 * @return the dealOrQuote
	 */
	public String getDealOrQuote() {
		return dealOrQuote;
	}

	/**
	 * @param dealOrQuote
	 *            the dealOrQuote to set
	 */
	public void setDealOrQuote(String dealOrQuote) {
		this.dealOrQuote = dealOrQuote;
	}

	/**
	 * @return the dealSource
	 */
	public BigDecimal getDealSource() {
		return dealSource;
	}

	/**
	 * @param dealSource
	 *            the dealSource to set
	 */
	public void setDealSource(BigDecimal dealSource) {
		this.dealSource = dealSource;
	}

	/**
	 * @return the dealType
	 */
	public BigDecimal getDealType() {
		return dealType;
	}

	/**
	 * @param dealType
	 *            the dealType to set
	 */
	public void setDealType(BigDecimal dealType) {
		this.dealType = dealType;
	}

	/**
	 * @return the dmUpdateDate
	 */
	public Date getDmUpdateDate() {
		return dmUpdateDate;
	}

	/**
	 * @param dmUpdateDate
	 *            the dmUpdateDate to set
	 */
	public void setDmUpdateDate(Date dmUpdateDate) {
		this.dmUpdateDate = dmUpdateDate;
	}

	/**
	 * @return the expectedCloseDate
	 */
	public Date getExpectedCloseDate() {
		return expectedCloseDate;
	}

	/**
	 * @param expectedCloseDate
	 *            the expectedCloseDate to set
	 */
	public void setExpectedCloseDate(Date expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}

	/**
	 * @return the financialSummary
	 */
	public String getFinancialSummary() {
		return financialSummary;
	}

	/**
	 * @param financialSummary
	 *            the financialSummary to set
	 */
	public void setFinancialSummary(String financialSummary) {
		this.financialSummary = financialSummary;
	}

	/**
	 * @return the firstInstallationDt
	 */
	public Date getFirstInstallationDt() {
		return firstInstallationDt;
	}

	/**
	 * @param firstInstallationDt
	 *            the firstInstallationDt to set
	 */
	public void setFirstInstallationDt(Date firstInstallationDt) {
		this.firstInstallationDt = firstInstallationDt;
	}

	/**
	 * @return the intendedUseDrop
	 */
	public String getIntendedUseDrop() {
		return intendedUseDrop;
	}

	/**
	 * @param intendedUseDrop
	 *            the intendedUseDrop to set
	 */
	public void setIntendedUseDrop(String intendedUseDrop) {
		this.intendedUseDrop = intendedUseDrop;
	}

	/**
	 * @return the isDealAutoConverted
	 */
	public String getIsDealAutoConverted() {
		return isDealAutoConverted;
	}

	/**
	 * @param isDealAutoConverted
	 *            the isDealAutoConverted to set
	 */
	public void setIsDealAutoConverted(String isDealAutoConverted) {
		this.isDealAutoConverted = isDealAutoConverted;
	}

	/**
	 * @return the isDistiFacilitatedDrop
	 */
	public String getIsDistiFacilitatedDrop() {
		return isDistiFacilitatedDrop;
	}

	/**
	 * @param isDistiFacilitatedDrop
	 *            the isDistiFacilitatedDrop to set
	 */
	public void setIsDistiFacilitatedDrop(String isDistiFacilitatedDrop) {
		this.isDistiFacilitatedDrop = isDistiFacilitatedDrop;
	}

	/**
	 * @return the isThresholdMeetFlag
	 */
	public String getIsThresholdMeetFlag() {
		return isThresholdMeetFlag;
	}

	/**
	 * @param isThresholdMeetFlag
	 *            the isThresholdMeetFlag to set
	 */
	public void setIsThresholdMeetFlag(String isThresholdMeetFlag) {
		this.isThresholdMeetFlag = isThresholdMeetFlag;
	}

	/**
	 * @return the lastApprovalDate
	 */
	public Date getLastApprovalDate() {
		return lastApprovalDate;
	}

	/**
	 * @param lastApprovalDate
	 *            the lastApprovalDate to set
	 */
	public void setLastApprovalDate(Date lastApprovalDate) {
		this.lastApprovalDate = lastApprovalDate;
	}

	/**
	 * @return the leadProspectsId
	 */
	public String getLeadProspectsId() {
		return leadProspectsId;
	}

	/**
	 * @param leadProspectsId
	 *            the leadProspectsId to set
	 */
	public void setLeadProspectsId(String leadProspectsId) {
		this.leadProspectsId = leadProspectsId;
	}

	/**
	 * @return the legacyFlag
	 */
	public String getLegacyFlag() {
		return legacyFlag;
	}

	/**
	 * @param legacyFlag
	 *            the legacyFlag to set
	 */
	public void setLegacyFlag(String legacyFlag) {
		this.legacyFlag = legacyFlag;
	}

	/**
	 * @return the mdmDealExpirationDate
	 */
	public Date getMdmDealExpirationDate() {
		return mdmDealExpirationDate;
	}

	/**
	 * @param mdmDealExpirationDate
	 *            the mdmDealExpirationDate to set
	 */
	public void setMdmDealExpirationDate(Date mdmDealExpirationDate) {
		this.mdmDealExpirationDate = mdmDealExpirationDate;
	}

	/**
	 * @return the mdmDealStatus
	 */
	public Long getMdmDealStatus() {
		return mdmDealStatus;
	}

	/**
	 * @param mdmDealStatus
	 *            the mdmDealStatus to set
	 */
	public void setMdmDealStatus(Long mdmDealStatus) {
		this.mdmDealStatus = mdmDealStatus;
	}

	/**
	 * @return the mdmOptyDescStrategicDesc
	 */
	public String getMdmOptyDescStrategicDesc() {
		return mdmOptyDescStrategicDesc;
	}

	/**
	 * @param mdmOptyDescStrategicDesc
	 *            the mdmOptyDescStrategicDesc to set
	 */
	public void setMdmOptyDescStrategicDesc(String mdmOptyDescStrategicDesc) {
		this.mdmOptyDescStrategicDesc = mdmOptyDescStrategicDesc;
	}

	/**
	 * @return the mdmOptyDescStrategicValue
	 */
	public String getMdmOptyDescStrategicValue() {
		return mdmOptyDescStrategicValue;
	}

	/**
	 * @param mdmOptyDescStrategicValue
	 *            the mdmOptyDescStrategicValue to set
	 */
	public void setMdmOptyDescStrategicValue(String mdmOptyDescStrategicValue) {
		this.mdmOptyDescStrategicValue = mdmOptyDescStrategicValue;
	}

	/**
	 * @return the mdmProdValue
	 */
	public BigDecimal getMdmProdValue() {
		return mdmProdValue;
	}

	/**
	 * @param mdmProdValue
	 *            the mdmProdValue to set
	 */
	public void setMdmProdValue(BigDecimal mdmProdValue) {
		this.mdmProdValue = mdmProdValue;
	}

	/**
	 * @return the mdmServValue
	 */
	public BigDecimal getMdmServValue() {
		return mdmServValue;
	}

	/**
	 * @param mdmServValue
	 *            the mdmServValue to set
	 */
	public void setMdmServValue(BigDecimal mdmServValue) {
		this.mdmServValue = mdmServValue;
	}

	/**
	 * @return the mergedSfdcOptyId
	 */
	public String getMergedSfdcOptyId() {
		return mergedSfdcOptyId;
	}

	/**
	 * @param mergedSfdcOptyId
	 *            the mergedSfdcOptyId to set
	 */
	public void setMergedSfdcOptyId(String mergedSfdcOptyId) {
		this.mergedSfdcOptyId = mergedSfdcOptyId;
	}

	/**
	 * @return the optyStatus
	 */
	public String getOptyStatus() {
		return optyStatus;
	}

	/**
	 * @param optyStatus
	 *            the optyStatus to set
	 */
	public void setOptyStatus(String optyStatus) {
		this.optyStatus = optyStatus;
	}

	/**
	 * @return the p360AmReceived
	 */
	public String getP360AmReceived() {
		return p360AmReceived;
	}

	/**
	 * @param p360AmReceived
	 *            the p360AmReceived to set
	 */
	public void setP360AmReceived(String p360AmReceived) {
		this.p360AmReceived = p360AmReceived;
	}

	/**
	 * @return the p360CustReceived
	 */
	public String getP360CustReceived() {
		return p360CustReceived;
	}

	/**
	 * @param p360CustReceived
	 *            the p360CustReceived to set
	 */
	public void setP360CustReceived(String p360CustReceived) {
		this.p360CustReceived = p360CustReceived;
	}

	/**
	 * @return the p360DealFlag
	 */
	public String getP360DealFlag() {
		return p360DealFlag;
	}

	/**
	 * @param p360DealFlag
	 *            the p360DealFlag to set
	 */
	public void setP360DealFlag(String p360DealFlag) {
		this.p360DealFlag = p360DealFlag;
	}

	/**
	 * @return the parentObjectId
	 */
	public BigDecimal getParentObjectId() {
		return parentObjectId;
	}

	/**
	 * @param parentObjectId
	 *            the parentObjectId to set
	 */
	public void setParentObjectId(BigDecimal parentObjectId) {
		this.parentObjectId = parentObjectId;
	}

	/**
	 * @return the pdrDealExpirationDateDrop
	 */
	public Date getPdrDealExpirationDateDrop() {
		return pdrDealExpirationDateDrop;
	}

	/**
	 * @param pdrDealExpirationDateDrop
	 *            the pdrDealExpirationDateDrop to set
	 */
	public void setPdrDealExpirationDateDrop(Date pdrDealExpirationDateDrop) {
		this.pdrDealExpirationDateDrop = pdrDealExpirationDateDrop;
	}

	/**
	 * @return the pdrDealStatusDrop
	 */
	public BigDecimal getPdrDealStatusDrop() {
		return pdrDealStatusDrop;
	}

	/**
	 * @param pdrDealStatusDrop
	 *            the pdrDealStatusDrop to set
	 */
	public void setPdrDealStatusDrop(BigDecimal pdrDealStatusDrop) {
		this.pdrDealStatusDrop = pdrDealStatusDrop;
	}

	/**
	 * @return the pdrOptyDescStrategicValue
	 */
	public String getPdrOptyDescStrategicValue() {
		return pdrOptyDescStrategicValue;
	}

	/**
	 * @param pdrOptyDescStrategicValue
	 *            the pdrOptyDescStrategicValue to set
	 */
	public void setPdrOptyDescStrategicValue(String pdrOptyDescStrategicValue) {
		this.pdrOptyDescStrategicValue = pdrOptyDescStrategicValue;
	}

	/**
	 * @return the pdrProdValue
	 */
	public BigDecimal getPdrProdValue() {
		return pdrProdValue;
	}

	/**
	 * @param pdrProdValue
	 *            the pdrProdValue to set
	 */
	public void setPdrProdValue(BigDecimal pdrProdValue) {
		this.pdrProdValue = pdrProdValue;
	}

	/**
	 * @return the pdrServValue
	 */
	public BigDecimal getPdrServValue() {
		return pdrServValue;
	}

	/**
	 * @param pdrServValue
	 *            the pdrServValue to set
	 */
	public void setPdrServValue(BigDecimal pdrServValue) {
		this.pdrServValue = pdrServValue;
	}

	/**
	 * @return the prodSalesPath
	 */
	public String getProdSalesPath() {
		return prodSalesPath;
	}

	/**
	 * @param prodSalesPath
	 *            the prodSalesPath to set
	 */
	public void setProdSalesPath(String prodSalesPath) {
		this.prodSalesPath = prodSalesPath;
	}

	/**
	 * @return the publishDiscountFlag
	 */
	public String getPublishDiscountFlag() {
		return publishDiscountFlag;
	}

	/**
	 * @param publishDiscountFlag
	 *            the publishDiscountFlag to set
	 */
	public void setPublishDiscountFlag(String publishDiscountFlag) {
		this.publishDiscountFlag = publishDiscountFlag;
	}

	/**
	 * @return the qfFormId
	 */
	public BigDecimal getQfFormId() {
		return qfFormId;
	}

	/**
	 * @param qfFormId
	 *            the qfFormId to set
	 */
	public void setQfFormId(BigDecimal qfFormId) {
		this.qfFormId = qfFormId;
	}

	/**
	 * @return the qfFormStatus
	 */
	public String getQfFormStatus() {
		return qfFormStatus;
	}

	/**
	 * @param qfFormStatus
	 *            the qfFormStatus to set
	 */
	public void setQfFormStatus(String qfFormStatus) {
		this.qfFormStatus = qfFormStatus;
	}

	/**
	 * @return the quoteFlag
	 */
	public String getQuoteFlag() {
		return quoteFlag;
	}

	/**
	 * @param quoteFlag
	 *            the quoteFlag to set
	 */
	public void setQuoteFlag(String quoteFlag) {
		this.quoteFlag = quoteFlag;
	}

	/**
	 * @return the reopenReason
	 */
	public String getReopenReason() {
		return reopenReason;
	}

	/**
	 * @param reopenReason
	 *            the reopenReason to set
	 */
	public void setReopenReason(String reopenReason) {
		this.reopenReason = reopenReason;
	}

	/**
	 * @return the revenueRecogFlag
	 */
	public String getRevenueRecogFlag() {
		return revenueRecogFlag;
	}

	/**
	 * @param revenueRecogFlag
	 *            the revenueRecogFlag to set
	 */
	public void setRevenueRecogFlag(String revenueRecogFlag) {
		this.revenueRecogFlag = revenueRecogFlag;
	}

	/**
	 * @return the rfpFlag
	 */
	public String getRfpFlag() {
		return rfpFlag;
	}

	/**
	 * @param rfpFlag
	 *            the rfpFlag to set
	 */
	public void setRfpFlag(String rfpFlag) {
		this.rfpFlag = rfpFlag;
	}

	/**
	 * @return the servSalesPath
	 */
	public String getServSalesPath() {
		return servSalesPath;
	}

	/**
	 * @param servSalesPath
	 *            the servSalesPath to set
	 */
	public void setServSalesPath(String servSalesPath) {
		this.servSalesPath = servSalesPath;
	}

	/**
	 * @return the sfdcActiveFlag
	 */
	public String getSfdcActiveFlag() {
		return sfdcActiveFlag;
	}

	/**
	 * @param sfdcActiveFlag
	 *            the sfdcActiveFlag to set
	 */
	public void setSfdcActiveFlag(String sfdcActiveFlag) {
		this.sfdcActiveFlag = sfdcActiveFlag;
	}

	/**
	 * @return the sfdcOptyId
	 */
	public String getSfdcOptyId() {
		return sfdcOptyId;
	}

	/**
	 * @param sfdcOptyId
	 *            the sfdcOptyId to set
	 */
	public void setSfdcOptyId(String sfdcOptyId) {
		this.sfdcOptyId = sfdcOptyId;
	}

	/**
	 * @return the sourceOptyNumber
	 */
	public String getSourceOptyNumber() {
		return sourceOptyNumber;
	}

	/**
	 * @param sourceOptyNumber
	 *            the sourceOptyNumber to set
	 */
	public void setSourceOptyNumber(String sourceOptyNumber) {
		this.sourceOptyNumber = sourceOptyNumber;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn
	 *            the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the verticalMarket
	 */
	public String getVerticalMarket() {
		return verticalMarket;
	}

	/**
	 * @param verticalMarket
	 *            the verticalMarket to set
	 */
	public void setVerticalMarket(String verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

	/**
	 * @return the proxyUserId
	 */
	public String getProxyUserId() {
		return proxyUserId;
	}

	/**
	 * @param proxyUserId
	 *            the proxyUserId to set
	 */
	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
	}

	/**
	 * @return the crpCreatorPaeUserId
	 */
	public Long getCrpCreatorPaeUserId() {
		return crpCreatorPaeUserId;
	}

	/**
	 * @param crpCreatorPaeUserId
	 *            the crpCreatorPaeUserId to set
	 */
	public void setCrpCreatorPaeUserId(Long crpCreatorPaeUserId) {
		this.crpCreatorPaeUserId = crpCreatorPaeUserId;
	}

	/**
	 * @return the uceNotificationId
	 */
	public Long getUceNotificationId() {
		return uceNotificationId;
	}

	/**
	 * @param uceNotificationId
	 *            the uceNotificationId to set
	 */
	public void setUceNotificationId(Long uceNotificationId) {
		this.uceNotificationId = uceNotificationId;
	}

	/**
	 * @return the uceDealReqId
	 */
	public Long getUceDealReqId() {
		return uceDealReqId;
	}

	/**
	 * @param uceDealReqId
	 *            the uceDealReqId to set
	 */
	public void setUceDealReqId(Long uceDealReqId) {
		this.uceDealReqId = uceDealReqId;
	}

	/**
	 * @return the uceQuoteId
	 */
	public String getUceQuoteId() {
		return uceQuoteId;
	}

	/**
	 * @param uceQuoteId
	 *            the uceQuoteId to set
	 */
	public void setUceQuoteId(String uceQuoteId) {
		this.uceQuoteId = uceQuoteId;
	}

	/**
	 * @return the influencerPaeUserId
	 */
	public Long getInfluencerPaeUserId() {
		return influencerPaeUserId;
	}

	/**
	 * @param influencerPaeUserId
	 *            the influencerPaeUserId to set
	 */
	public void setInfluencerPaeUserId(Long influencerPaeUserId) {
		this.influencerPaeUserId = influencerPaeUserId;
	}

	/**
	 * @return the identifySingleAMFlag
	 */
	public String getIdentifySingleAMFlag() {
		return identifySingleAMFlag;
	}

	/**
	 * @param identifySingleAMFlag
	 *            the identifySingleAMFlag to set
	 */
	public void setIdentifySingleAMFlag(String identifySingleAMFlag) {
		this.identifySingleAMFlag = identifySingleAMFlag;
	}

	/**
	 * @return the copyFromOptyNumber
	 */
	public String getCopyFromOptyNumber() {
		return copyFromOptyNumber;
	}

	/**
	 * @param copyFromOptyNumber
	 *            the copyFromOptyNumber to set
	 */
	public void setCopyFromOptyNumber(String copyFromOptyNumber) {
		this.copyFromOptyNumber = copyFromOptyNumber;
	}

}
