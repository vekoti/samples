package com.cisco.ccw.quote.etl.sql.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cisco.ccw.quote.etl.annotation.Document;

@Entity
@Document
@Table(name = "CQ_QUOTE")
public class CqQuote extends com.cisco.ccw.quote.etl.sql.model.Document {

	private static final long serialVersionUID = 6083017310232401940L;

	@Id
	@Column(name = "OBJECT_ID")
	@org.mongodb.morphia.annotations.Id
	protected Long objectId;

	@Column(name = "ACTIVE")
	protected BigDecimal active;

	@Column(name = "APPROVED_DISC_DISCRETION_PCT")
	protected BigDecimal approvedDiscDiscretionPct;

	@Column(name = "AT_OR_BELOW_FLAG")
	protected String atOrBelowFlag;

	@Column(name = "AUTO_NEGOTIATE_NS")
	protected String autoNegotiateNs;

	@Column(name = "BILLING_TERM")
	protected BigDecimal billingTerm;

	@Column(name = "BOM_SOURCE")
	protected String bomSource;

	@Column(name = "BOM_STATE")
	protected BigDecimal bomState;

	@Column(name = "CART_ID")
	protected BigDecimal cartId;

	@Column(name = "CBN_DISTI_ID")
	protected BigDecimal cbnDistiId;

	@Column(name = "CBN_SPLIT_ELIGIBLE")
	protected String cbnSplitEligible;

	@Column(name = "UPDATED_TS")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updatedTimeStamp;

	@Column(name = "CBN_STATUS")
	protected BigDecimal cbnStatus;

	@Column(name = "CONTRACTUAL_DISC")
	protected String contractualDisc;

	@Column(name = "COPY_FROM_QUOTE")
	protected String copyFromQuote;

	@Column(name = "CREATED_BY")
	protected String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_ON")
	protected Date createdOn;

	@Column(name = "CURRENCY_CODE")
	protected String currencyCode;

	@Column(name = "CUSTOMER_CATALOG_FLAG")
	protected String customerCatalogFlag;

	@Column(name = "DEAL_OBJECT_ID")
	protected BigDecimal dealObjectId;

	@Column(name = "DEC_COLLABORATED_BY")
	protected String decCollaboratedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEC_COLLABORATED_ON")
	protected Date decCollaboratedOn;

	@Column(name = "DISCOUNT_SUMMARY")
	protected BigDecimal discountSummary;

	@Column(name = "DISTI_EXCEPTION")
	protected BigDecimal distiException;

	@Column(name = "ERP_PRICE_LIST_ID")
	protected BigDecimal erpPriceListId;

	@Column(name = "FA_CUST_VALIDATION_ERROR")
	protected String faCustValidationError;

	@Column(name = "FA_DEAL_ID")
	protected String faDealId;

	@Column(name = "FEDERAL_FLG")
	protected String federalFlg;

	@Column(name = "FETCHED_WS_TAA_PREF")
	protected String fetchedWsTaaPref;

	@Column(name = "FINISH_STATE")
	protected BigDecimal finishState;

	@Column(name = "FRAME_AGREEEMENT")
	protected String frameAgreeement;

	@Column(name = "FULFILLMENT_SOURCE_ID")
	protected BigDecimal fulfillmentSourceId;

	@Column(name = "FULFILLMENT_TYPE")
	protected String fulfillmentType;

	@Column(name = "INACTIVE_OBJECT_ID")
	protected BigDecimal inactiveObjectId;

	@Column(name = "INTENDED_USE")
	protected BigDecimal intendedUse;

	@Column(name = "IRONPORT_FLAG")
	protected String ironportFlag;

	@Column(name = "IS_DEC_COLLABORATED")
	protected String isDecCollaborated;

	@Column(name = "IS_DISC_GUIDANCE_VIEWED")
	protected String isDiscGuidanceViewed;

	@Column(name = "IS_DISCOUNT_PUBLISHED")
	protected String isDiscountPublished;

	@Column(name = "IS_DISTI_Q2O_ELIGIBLE")
	protected String isDistiQ2oEligible;

	@Column(name = "IS_EXT_USER_MODIFIED")
	protected String isExtUserModified;

	@Column(name = "IS_FA_FLAG")
	protected String isFaFlag;

	@Column(name = "IS_FINALIZED")
	protected String isFinalized;

	@Column(name = "IS_GPN_SPECIAL_PRICED")
	protected String isGpnSpecialPriced;

	@Column(name = "IS_PARTNER_MODIFIED_QUOTE")
	protected String isPartnerModifiedQuote;

	@Column(name = "IS_PCB_ACK_FLAG")
	protected String isPcbAckFlag;

	@Column(name = "IS_Q2O_ELIGIBLE")
	protected String isQ2oEligible;

	@Column(name = "IS_STRINGENT")
	protected String isStringent;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_PRICED_DATE")
	protected Date lastPricedDate;

	@Column(name = "MAX_LINE_INDEX")
	protected BigDecimal maxLineIndex;

	@Column(name = "NET_PRICE_DEAL")
	protected String netPriceDeal;

	@Column(name = "PRICE_BOOK_ID")
	protected BigDecimal priceBookId;

	@Column(name = "PRICE_LIST_ID")
	protected BigDecimal priceListId;

	@Column(name = "PRICED_FOR_AUTH")
	protected String pricedForAuth;

	@Column(name = "PROD_PRICING_COMMENT")
	protected String prodPricingComment;

	@Column(name = "QUOTE_CATEGORY")
	protected BigDecimal quoteCategory;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUOTE_EXPIRATION_DATE")
	protected Date quoteExpirationDate;

	@Column(name = "QUOTE_ID")
	protected String quoteId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "QUOTE_IMPORT_DATE")
	protected Date quoteImportDate;

	@Column(name = "QUOTE_NAME")
	protected String quoteName;

	@Column(name = "QUOTE_STATUS")
	protected Long quoteStatus;

	@Column(name = "SMB_EXPIRATION_DATE")
	protected Date smbExpirationDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REACTIVATE_DEAL_DATE")
	protected Date reactivateDealDate;

	@Column(name = "SDG_CUSTOMER_TECH_SELECT_FLAG")
	protected String sdgCustomerTechSelectFlag;

	@Column(name = "SERV_PRICING_COMMENT")
	protected String servPricingComment;

	@Column(name = "SOURCE_TYPE")
	protected BigDecimal sourceType;

	@Column(name = "SWEEP_FLAG")
	protected String sweepFlag;

	@Column(name = "TAA_FLG")
	protected String taaFlg;

	@Column(name = "TAB_FLAG")
	protected String tabFlag;

	@Column(name = "TAB_NET_FLAG")
	protected String tabNetFlag;

	@Column(name = "TAB_PERIOD")
	protected String tabPeriod;

	@Column(name = "TAB_SUBTRACK")
	protected String tabSubtrack;

	@Column(name = "TRADEIN_STATE")
	protected BigDecimal tradeinState;

	@Column(name = "UPDATED_BY")
	protected String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_ON")
	protected Date updatedOn;

	@Column(name = "GDR_FLAG")
	protected String gdrFlag;

	@Column(name = "STD_INCR_FLAG")

	protected String stdIncrFlag;

	@Column(name = "GEB_CALL_REQUIRED")

	protected String gebCallRequired;

	@Column(name = "CRP_FLAG")

	protected String crpFlag;

	@Column(name = "CRP_STATUS")

	protected String crpStatus;

	@Column(name = "LEAD_PARTNERS")

	protected String leadPartners;

	@Column(name = "LEAD_PARTNER_TYPE")

	protected String leadPartnerType;

	@Column(name = "INFLUENCER_STATUS")

	protected Long influencerStatus;

	@Column(name = "INFLUENCER_DEAL_TYPE")
	protected Long influencerDealType;

	@Column(name = "HOLDING_SMART_ACCT_NO")
	protected Long holdingSmartAcctNumber;

	@Column(name = "CUST_SMART_ACCT_NO")
	protected Long custSmartAcctNumber;

	@Column(name = "ELA_PROGRAM")
	protected String elaProgram;

	/**
	 * @return the objectId
	 */

	public Long getObjectId() {
		return objectId;
	}

	/**
	 * @return the quoteName
	 */

	public String getQuoteName() {
		return quoteName;
	}

	/**
	 * @param quoteName
	 *            the quoteName to set
	 */

	public void setQuoteName(String quoteName) {
		this.quoteName = quoteName;
	}

	/**
	 * @return the createdOn
	 */

	public String getCreatedOn() {
		return createdOn != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(createdOn) : "";
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */

	public void setCreatedOn(Date createdOn) {
		if (createdOn != null) {
			this.createdOn = (Date) createdOn.clone();
		}
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
	 * @return the updatedOn
	 */

	public String getUpdatedOn() {
		return updatedOn != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(updatedOn) : "";
	}

	/**
	 * @param updatedOn
	 *            the updatedOn to set
	 */

	public void setUpdatedOn(Date updatedOn) {
		if (updatedOn != null) {
			this.updatedOn = (Date) updatedOn.clone();
		}
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
	 * @return the bomSource
	 */

	public String getBomSource() {
		return bomSource;
	}

	/**
	 * @param bomSource
	 *            the bomSource to set
	 */

	public void setBomSource(String bomSource) {
		this.bomSource = bomSource;
	}

	/**
	 * @return the fulfillmentType
	 */

	public String getFulfillmentType() {
		return fulfillmentType;
	}

	/**
	 * @param fulfillmentType
	 *            the fulfillmentType to set
	 */

	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	/**
	 * @return the isStringent
	 */

	public String getIsStringent() {
		return isStringent;
	}

	/**
	 * @param isStringent
	 *            the isStringent to set
	 */

	public void setIsStringent(String isStringent) {
		this.isStringent = isStringent;
	}

	/**
	 * @return the isFinalized
	 */

	public String getIsFinalized() {
		return isFinalized;
	}

	/**
	 * @param isFinalized
	 *            the isFinalized to set
	 */

	public void setIsFinalized(String isFinalized) {
		this.isFinalized = isFinalized;
	}

	// Used to assign the generated Sequence for object Id to opty Id column
	@PrePersist

	public void assignQuoteId() {
		if (objectId != null) {
			quoteId = Long.toString(objectId);
		}
	}

	/**
	 * @return the active
	 */

	public BigDecimal getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */

	public void setActive(BigDecimal active) {
		this.active = active;
	}

	/**
	 * @return the approvedDiscDiscretionPct
	 */

	public BigDecimal getApprovedDiscDiscretionPct() {
		return approvedDiscDiscretionPct;
	}

	/**
	 * @param approvedDiscDiscretionPct
	 *            the approvedDiscDiscretionPct to set
	 */

	public void setApprovedDiscDiscretionPct(BigDecimal approvedDiscDiscretionPct) {
		this.approvedDiscDiscretionPct = approvedDiscDiscretionPct;
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
	 * @return the autoNegotiateNs
	 */

	public String getAutoNegotiateNs() {
		return autoNegotiateNs;
	}

	/**
	 * @param autoNegotiateNs
	 *            the autoNegotiateNs to set
	 */

	public void setAutoNegotiateNs(String autoNegotiateNs) {
		this.autoNegotiateNs = autoNegotiateNs;
	}

	/**
	 * @return the billingTerm
	 */

	public BigDecimal getBillingTerm() {
		return billingTerm;
	}

	/**
	 * @param billingTerm
	 *            the billingTerm to set
	 */

	public void setBillingTerm(BigDecimal billingTerm) {
		this.billingTerm = billingTerm;
	}

	/**
	 * @return the bomState
	 */

	public BigDecimal getBomState() {
		return bomState;
	}

	/**
	 * @param bomState
	 *            the bomState to set
	 */

	public void setBomState(BigDecimal bomState) {
		this.bomState = bomState;
	}

	/**
	 * @return the cartId
	 */

	public BigDecimal getCartId() {
		return cartId;
	}

	/**
	 * @param cartId
	 *            the cartId to set
	 */

	public void setCartId(BigDecimal cartId) {
		this.cartId = cartId;
	}

	/**
	 * @return the cbnDistiId
	 */

	public BigDecimal getCbnDistiId() {
		return cbnDistiId;
	}

	/**
	 * @param cbnDistiId
	 *            the cbnDistiId to set
	 */

	public void setCbnDistiId(BigDecimal cbnDistiId) {
		this.cbnDistiId = cbnDistiId;
	}

	/**
	 * @return the cbnSplitEligible
	 */

	public String getCbnSplitEligible() {
		return cbnSplitEligible;
	}

	/**
	 * @param cbnSplitEligible
	 *            the cbnSplitEligible to set
	 */

	public void setCbnSplitEligible(String cbnSplitEligible) {
		this.cbnSplitEligible = cbnSplitEligible;
	}

	/**
	 * @return the cbnStatus
	 */

	public BigDecimal getCbnStatus() {
		return cbnStatus;
	}

	/**
	 * @param cbnStatus
	 *            the cbnStatus to set
	 */

	public void setCbnStatus(BigDecimal cbnStatus) {
		this.cbnStatus = cbnStatus;
	}

	/**
	 * @return the contractualDisc
	 */

	public String getContractualDisc() {
		return contractualDisc;
	}

	/**
	 * @param contractualDisc
	 *            the contractualDisc to set
	 */

	public void setContractualDisc(String contractualDisc) {
		this.contractualDisc = contractualDisc;
	}

	/**
	 * @return the copyFromQuote
	 */

	public String getCopyFromQuote() {
		return copyFromQuote;
	}

	/**
	 * @param copyFromQuote
	 *            the copyFromQuote to set
	 */

	public void setCopyFromQuote(String copyFromQuote) {
		this.copyFromQuote = copyFromQuote;
	}

	/**
	 * @return the currencyCode
	 */

	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode
	 *            the currencyCode to set
	 */

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the customerCatalogFlag
	 */

	public String getCustomerCatalogFlag() {
		return customerCatalogFlag;
	}

	/**
	 * @param customerCatalogFlag
	 *            the customerCatalogFlag to set
	 */

	public void setCustomerCatalogFlag(String customerCatalogFlag) {
		this.customerCatalogFlag = customerCatalogFlag;
	}

	/**
	 * @return the dealObjectId
	 */

	public BigDecimal getDealObjectId() {
		return dealObjectId;
	}

	/**
	 * @param dealObjectId
	 *            the dealObjectId to set
	 */

	public void setDealObjectId(BigDecimal dealObjectId) {
		this.dealObjectId = dealObjectId;
	}

	/**
	 * @return the decCollaboratedBy
	 */

	public String getDecCollaboratedBy() {
		return decCollaboratedBy;
	}

	/**
	 * @param decCollaboratedBy
	 *            the decCollaboratedBy to set
	 */

	public void setDecCollaboratedBy(String decCollaboratedBy) {
		this.decCollaboratedBy = decCollaboratedBy;
	}

	/**
	 * @return the decCollaboratedOn
	 */

	public String getDecCollaboratedOn() {
		return decCollaboratedOn != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(decCollaboratedOn) : "";
	}

	/**
	 * @param decCollaboratedOn
	 *            the decCollaboratedOn to set
	 */

	public void setDecCollaboratedOn(Date decCollaboratedOn) {
		if (decCollaboratedOn != null) {
			this.decCollaboratedOn = (Date) decCollaboratedOn.clone();
		}
	}

	/**
	 * @return the discountSummary
	 */

	public BigDecimal getDiscountSummary() {
		return discountSummary;
	}

	/**
	 * @param discountSummary
	 *            the discountSummary to set
	 */

	public void setDiscountSummary(BigDecimal discountSummary) {
		this.discountSummary = discountSummary;
	}

	/**
	 * @return the distiException
	 */

	public BigDecimal getDistiException() {
		return distiException;
	}

	/**
	 * @param distiException
	 *            the distiException to set
	 */

	public void setDistiException(BigDecimal distiException) {
		this.distiException = distiException;
	}

	/**
	 * @return the erpPriceListId
	 */

	public BigDecimal getErpPriceListId() {
		return erpPriceListId;
	}

	/**
	 * @param erpPriceListId
	 *            the erpPriceListId to set
	 */

	public void setErpPriceListId(BigDecimal erpPriceListId) {
		this.erpPriceListId = erpPriceListId;
	}

	/**
	 * @return the faCustValidationError
	 */

	public String getFaCustValidationError() {
		return faCustValidationError;
	}

	/**
	 * @param faCustValidationError
	 *            the faCustValidationError to set
	 */

	public void setFaCustValidationError(String faCustValidationError) {
		this.faCustValidationError = faCustValidationError;
	}

	/**
	 * @return the faDealId
	 */

	public String getFaDealId() {
		return faDealId;
	}

	/**
	 * @param faDealId
	 *            the faDealId to set
	 */

	public void setFaDealId(String faDealId) {
		this.faDealId = faDealId;
	}

	/**
	 * @return the federalFlg
	 */

	public String getFederalFlg() {
		return federalFlg;
	}

	/**
	 * @param federalFlg
	 *            the federalFlg to set
	 */

	public void setFederalFlg(String federalFlg) {
		this.federalFlg = federalFlg;
	}

	/**
	 * @return the fetchedWsTaaPref
	 */

	public String getFetchedWsTaaPref() {
		return fetchedWsTaaPref;
	}

	/**
	 * @param fetchedWsTaaPref
	 *            the fetchedWsTaaPref to set
	 */

	public void setFetchedWsTaaPref(String fetchedWsTaaPref) {
		this.fetchedWsTaaPref = fetchedWsTaaPref;
	}

	/**
	 * @return the finishState
	 */

	public BigDecimal getFinishState() {
		return finishState;
	}

	/**
	 * @param finishState
	 *            the finishState to set
	 */

	public void setFinishState(BigDecimal finishState) {
		this.finishState = finishState;
	}

	/**
	 * @return the frameAgreeement
	 */

	public String getFrameAgreeement() {
		return frameAgreeement;
	}

	/**
	 * @param frameAgreeement
	 *            the frameAgreeement to set
	 */

	public void setFrameAgreeement(String frameAgreeement) {
		this.frameAgreeement = frameAgreeement;
	}

	/**
	 * @return the fulfillmentSourceId
	 */

	public BigDecimal getFulfillmentSourceId() {
		return fulfillmentSourceId;
	}

	/**
	 * @param fulfillmentSourceId
	 *            the fulfillmentSourceId to set
	 */

	public void setFulfillmentSourceId(BigDecimal fulfillmentSourceId) {
		this.fulfillmentSourceId = fulfillmentSourceId;
	}

	/**
	 * @return the inactiveObjectId
	 */

	public BigDecimal getInactiveObjectId() {
		return inactiveObjectId;
	}

	/**
	 * @param inactiveObjectId
	 *            the inactiveObjectId to set
	 */

	public void setInactiveObjectId(BigDecimal inactiveObjectId) {
		this.inactiveObjectId = inactiveObjectId;
	}

	/**
	 * @return the intendedUse
	 */

	public BigDecimal getIntendedUse() {
		return intendedUse;
	}

	/**
	 * @param intendedUse
	 *            the intendedUse to set
	 */

	public void setIntendedUse(BigDecimal intendedUse) {
		this.intendedUse = intendedUse;

	}

	/**
	 * @return the ironportFlag
	 */

	public String getIronportFlag() {
		return ironportFlag;
	}

	/**
	 * @param ironportFlag
	 *            the ironportFlag to set
	 */

	public void setIronportFlag(String ironportFlag) {
		this.ironportFlag = ironportFlag;
	}

	/**
	 * @return the isDecCollaborated
	 */

	public String getIsDecCollaborated() {
		return isDecCollaborated;
	}

	/**
	 * @param isDecCollaborated
	 *            the isDecCollaborated to set
	 */

	public void setIsDecCollaborated(String isDecCollaborated) {
		this.isDecCollaborated = isDecCollaborated;
	}

	/**
	 * @return the isDiscGuidanceViewed
	 */

	public String getIsDiscGuidanceViewed() {
		return isDiscGuidanceViewed;
	}

	/**
	 * @param isDiscGuidanceViewed
	 *            the isDiscGuidanceViewed to set
	 */

	public void setIsDiscGuidanceViewed(String isDiscGuidanceViewed) {
		this.isDiscGuidanceViewed = isDiscGuidanceViewed;
	}

	/**
	 * @return the isDiscountPublished
	 */

	public String getIsDiscountPublished() {
		return isDiscountPublished;
	}

	/**
	 * @param isDiscountPublished
	 *            the isDiscountPublished to set
	 */

	public void setIsDiscountPublished(String isDiscountPublished) {
		this.isDiscountPublished = isDiscountPublished;
	}

	/**
	 * @return the isDistiQ2oEligible
	 */

	public String getIsDistiQ2oEligible() {
		return isDistiQ2oEligible;
	}

	/**
	 * @param isDistiQ2oEligible
	 *            the isDistiQ2oEligible to set
	 */

	public void setIsDistiQ2oEligible(String isDistiQ2oEligible) {
		this.isDistiQ2oEligible = isDistiQ2oEligible;
	}

	/**
	 * @return the isExtUserModified
	 */

	public String getIsExtUserModified() {
		return isExtUserModified;
	}

	/**
	 * @param isExtUserModified
	 *            the isExtUserModified to set
	 */

	public void setIsExtUserModified(String isExtUserModified) {
		this.isExtUserModified = isExtUserModified;
	}

	/**
	 * @return the isFaFlag
	 */

	public String getIsFaFlag() {
		return isFaFlag;
	}

	/**
	 * @param isFaFlag
	 *            the isFaFlag to set
	 */

	public void setIsFaFlag(String isFaFlag) {
		this.isFaFlag = isFaFlag;
	}

	/**
	 * @return the isGpnSpecialPriced
	 */

	public String getIsGpnSpecialPriced() {
		return isGpnSpecialPriced;
	}

	/**
	 * @param isGpnSpecialPriced
	 *            the isGpnSpecialPriced to set
	 */

	public void setIsGpnSpecialPriced(String isGpnSpecialPriced) {
		this.isGpnSpecialPriced = isGpnSpecialPriced;
	}

	/**
	 * @return the isPartnerModifiedQuote
	 */

	public String getIsPartnerModifiedQuote() {
		return isPartnerModifiedQuote;
	}

	/**
	 * @param isPartnerModifiedQuote
	 *            the isPartnerModifiedQuote to set
	 */

	public void setIsPartnerModifiedQuote(String isPartnerModifiedQuote) {
		this.isPartnerModifiedQuote = isPartnerModifiedQuote;
	}

	/**
	 * @return the isPcbAckFlag
	 */

	public String getIsPcbAckFlag() {
		return isPcbAckFlag;
	}

	/**
	 * @param isPcbAckFlag
	 *            the isPcbAckFlag to set
	 */

	public void setIsPcbAckFlag(String isPcbAckFlag) {
		this.isPcbAckFlag = isPcbAckFlag;
	}

	/**
	 * @return the isQ2oEligible
	 */

	public String getIsQ2oEligible() {
		return isQ2oEligible;
	}

	/**
	 * @param isQ2oEligible
	 *            the isQ2oEligible to set
	 */

	public void setIsQ2oEligible(String isQ2oEligible) {
		this.isQ2oEligible = isQ2oEligible;
	}

	/**
	 * @return the lastPricedDate
	 */

	public String getLastPricedDate() {
		return lastPricedDate != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(lastPricedDate) : "";
	}

	/**
	 * @param lastPricedDate
	 *            the lastPricedDate to set
	 */

	public void setLastPricedDate(Date lastPricedDate) {
		if (lastPricedDate != null) {
			this.lastPricedDate = (Date) lastPricedDate.clone();
		}
	}

	/**
	 * @return the maxLineIndex
	 */

	public BigDecimal getMaxLineIndex() {
		return maxLineIndex;
	}

	/**
	 * @param maxLineIndex
	 *            the maxLineIndex to set
	 */

	public void setMaxLineIndex(BigDecimal maxLineIndex) {
		this.maxLineIndex = maxLineIndex;
	}

	/**
	 * @return the netPriceDeal
	 */

	public String getNetPriceDeal() {
		return netPriceDeal;
	}

	/**
	 * @param netPriceDeal
	 *            the netPriceDeal to set
	 */

	public void setNetPriceDeal(String netPriceDeal) {
		this.netPriceDeal = netPriceDeal;
	}

	/**
	 * @return the priceBookId
	 */

	public BigDecimal getPriceBookId() {
		return priceBookId;
	}

	/**
	 * @param priceBookId
	 *            the priceBookId to set
	 */

	public void setPriceBookId(BigDecimal priceBookId) {
		this.priceBookId = priceBookId;
	}

	/**
	 * @return the priceListId
	 */

	public BigDecimal getPriceListId() {
		return priceListId;
	}

	/**
	 * @param priceListId
	 *            the priceListId to set
	 */

	public void setPriceListId(BigDecimal priceListId) {
		this.priceListId = priceListId;
	}

	/**
	 * @return the pricedForAuth
	 */

	public String getPricedForAuth() {
		return pricedForAuth;
	}

	/**
	 * @param pricedForAuth
	 *            the pricedForAuth to set
	 */

	public void setPricedForAuth(String pricedForAuth) {
		this.pricedForAuth = pricedForAuth;
	}

	/**
	 * @return the prodPricingComment
	 */

	public String getProdPricingComment() {
		return prodPricingComment;
	}

	/**
	 * @param prodPricingComment
	 *            the prodPricingComment to set
	 */

	public void setProdPricingComment(String prodPricingComment) {
		this.prodPricingComment = prodPricingComment;
	}

	/**
	 * @return the quoteCategory
	 */

	public BigDecimal getQuoteCategory() {
		return quoteCategory;
	}

	/**
	 * @param quoteCategory
	 *            the quoteCategory to set
	 */

	public void setQuoteCategory(BigDecimal quoteCategory) {
		this.quoteCategory = quoteCategory;
	}

	/**
	 * @return the quoteExpirationDate
	 */

	public String getQuoteExpirationDate() {
		return quoteExpirationDate != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(quoteExpirationDate) : "";
	}

	/**
	 * @return the quoteExpirationDate
	 */

	public Date getExpirationDate() {
		if (this.quoteExpirationDate != null) {
			return (Date) this.quoteExpirationDate.clone();
		} else {
			return null;
		}
	}

	/**
	 * @param quoteExpirationDate
	 *            the quoteExpirationDate to set
	 */

	public void setQuoteExpirationDate(Date quoteExpirationDate) {
		if (quoteExpirationDate != null) {
			this.quoteExpirationDate = (Date) quoteExpirationDate.clone();
		}
	}

	/**
	 * @return the quoteId
	 */

	public String getQuoteId() {
		quoteId = Long.toString(objectId);
		return quoteId;
	}

	/**
	 * @param quoteId
	 *            the quoteId to set
	 */

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	/**
	 * @return the quoteImportDate
	 */

	public String getQuoteImportDate() {
		return quoteImportDate != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(quoteImportDate) : "";
	}

	/**
	 * @param quoteImportDate
	 *            the quoteImportDate to set
	 */

	public void setQuoteImportDate(Date quoteImportDate) {
		if (quoteImportDate != null) {
			this.quoteImportDate = (Date) quoteImportDate.clone();
		}
	}

	/**
	 * @return the quoteStatus
	 */

	public Long getQuoteStatus() {
		return quoteStatus;
	}

	/**
	 * @param quoteStatus
	 *            the quoteStatus to set
	 */

	public void setQuoteStatus(Long quoteStatus) {
		this.quoteStatus = quoteStatus;
	}

	/**
	 * @return the reactivateDealDate
	 */

	public String getReactivateDealDate() {
		return reactivateDealDate != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(reactivateDealDate) : "";
	}

	/**
	 * @param reactivateDealDate
	 *            the reactivateDealDate to set
	 */

	public void setReactivateDealDate(Date reactivateDealDate) {
		if (reactivateDealDate != null) {
			this.reactivateDealDate = (Date) reactivateDealDate.clone();
		}
	}

	/**
	 * @return the sdgCustomerTechSelectFlag
	 */

	public String getSdgCustomerTechSelectFlag() {
		return sdgCustomerTechSelectFlag;
	}

	/**
	 * @param sdgCustomerTechSelectFlag
	 *            the sdgCustomerTechSelectFlag to set
	 */

	public void setSdgCustomerTechSelectFlag(String sdgCustomerTechSelectFlag) {
		this.sdgCustomerTechSelectFlag = sdgCustomerTechSelectFlag;
	}

	/**
	 * @return the servPricingComment
	 */

	public String getServPricingComment() {
		return servPricingComment;
	}

	/**
	 * @param servPricingComment
	 *            the servPricingComment to set
	 */

	public void setServPricingComment(String servPricingComment) {
		this.servPricingComment = servPricingComment;
	}

	/**
	 * @return the sourceType
	 */

	public BigDecimal getSourceType() {
		return sourceType;
	}

	/**
	 * @param sourceType
	 *            the sourceType to set
	 */

	public void setSourceType(BigDecimal sourceType) {
		this.sourceType = sourceType;
	}

	/**
	 * @return the sweepFlag
	 */

	public String getSweepFlag() {
		return sweepFlag;
	}

	/**
	 * @param sweepFlag
	 *            the sweepFlag to set
	 */

	public void setSweepFlag(String sweepFlag) {
		this.sweepFlag = sweepFlag;
	}

	/**
	 * @return the taaFlg
	 */

	public String getTaaFlg() {
		return taaFlg;
	}

	/**
	 * @param taaFlg
	 *            the taaFlg to set
	 */

	public void setTaaFlg(String taaFlg) {
		this.taaFlg = taaFlg;
	}

	/**
	 * @return the tabFlag
	 */

	public String getTabFlag() {
		return tabFlag;
	}

	/**
	 * @param tabFlag
	 *            the tabFlag to set
	 */

	public void setTabFlag(String tabFlag) {
		this.tabFlag = tabFlag;
	}

	/**
	 * @return the tabNetFlag
	 */

	public String getTabNetFlag() {
		return tabNetFlag;
	}

	/**
	 * @param tabNetFlag
	 *            the tabNetFlag to set
	 */

	public void setTabNetFlag(String tabNetFlag) {
		this.tabNetFlag = tabNetFlag;
	}

	/**
	 * @return the tabPeriod
	 */

	public String getTabPeriod() {
		return tabPeriod;
	}

	/**
	 * @param tabPeriod
	 *            the tabPeriod to set
	 */

	public void setTabPeriod(String tabPeriod) {
		this.tabPeriod = tabPeriod;
	}

	/**
	 * @return the tabSubtrack
	 */

	public String getTabSubtrack() {
		return tabSubtrack;
	}

	/**
	 * @param tabSubtrack
	 *            the tabSubtrack to set
	 */

	public void setTabSubtrack(String tabSubtrack) {
		this.tabSubtrack = tabSubtrack;
	}

	/**
	 * @return the tradeinState
	 */

	public BigDecimal getTradeinState() {
		return tradeinState;
	}

	/**
	 * @param tradeinState
	 *            the tradeinState to set
	 */

	public void setTradeinState(BigDecimal tradeinState) {
		this.tradeinState = tradeinState;
	}

	public String getSmbExpirationDate() {
		return smbExpirationDate != null ? (new SimpleDateFormat("dd-MMM-yyyy")).format(smbExpirationDate) : "";
	}

	public void setSmbExpirationDate(Date smbExpirationDate) {
		if (smbExpirationDate != null) {
			this.smbExpirationDate = (Date) smbExpirationDate.clone();
		}
	}

	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public String getGdrFlag() {
		return gdrFlag;
	}

	public void setGdrFlag(String gdrFlag) {
		this.gdrFlag = gdrFlag;
	}

	public String getStdIncrFlag() {
		return stdIncrFlag;
	}

	public void setStdIncrFlag(String stdIncrFlag) {
		this.stdIncrFlag = stdIncrFlag;
	}

	/**
	 * @return the gebCallRequired
	 */

	public String getGebCallRequired() {
		return gebCallRequired;
	}

	/**
	 * @param gebCallRequired
	 *            the gebCallRequired to set
	 */

	public void setGebCallRequired(String gebCallRequired) {
		this.gebCallRequired = gebCallRequired;
	}

	/**
	 * @return the crpFlag
	 */

	public String getCrpFlag() {
		return crpFlag;
	}

	/**
	 * @param crpFlag
	 *            the crpFlag to set
	 */

	public void setCrpFlag(String crpFlag) {
		this.crpFlag = crpFlag;
	}

	/**
	 * @return the crpStatus
	 */

	public String getCrpStatus() {
		return crpStatus;
	}

	/**
	 * @param crpStatus
	 *            the crpStatus to set
	 */

	public void setCrpStatus(String crpStatus) {
		this.crpStatus = crpStatus;
	}

	/**
	 * @return the leadPartners
	 */
	public String getLeadPartners() {
		return leadPartners;
	}

	/**
	 * @param leadPartners
	 *            the leadPartners to set
	 */
	public void setLeadPartners(String leadPartners) {
		this.leadPartners = leadPartners;
	}

	/**
	 * @return the influencerStatus
	 */

	public Long getInfluencerStatus() {
		return influencerStatus;
	}

	/**
	 * @param influencerStatus
	 *            the influencerStatus to set
	 */

	public void setInfluencerStatus(Long influencerStatus) {
		this.influencerStatus = influencerStatus;
	}

	/**
	 * @return the influencerDealType
	 */

	public Long getInfluencerDealType() {
		return influencerDealType;
	}

	/**
	 * @param influencerDealType
	 *            the influencerDealType to set
	 */

	public void setInfluencerDealType(Long influencerDealType) {
		this.influencerDealType = influencerDealType;
	}

	public String getLeadPartnerType() {
		return leadPartnerType;
	}

	public void setLeadPartnerType(String leadPartnerType) {
		this.leadPartnerType = leadPartnerType;
	}

	/**
	 * @return the holdingSmartAcctNumber
	 */

	public Long getHoldingSmartAcctNumber() {
		return holdingSmartAcctNumber;
	}

	/**
	 * @param holdingSmartAcctNumber
	 *            the holdingSmartAcctNumber to set
	 */

	public void setHoldingSmartAcctNumber(Long holdingSmartAcctNumber) {
		this.holdingSmartAcctNumber = holdingSmartAcctNumber;
	}

	/**
	 * @return the custSmartAcctNumber
	 */

	public Long getCustSmartAcctNumber() {
		return custSmartAcctNumber;
	}

	/**
	 * @param custSmartAcctNumber
	 *            the custSmartAcctNumber to set
	 */

	public void setCustSmartAcctNumber(Long custSmartAcctNumber) {
		this.custSmartAcctNumber = custSmartAcctNumber;
	}

	/**
	 * @return the elaProgram
	 */

	public String getElaProgram() {
		return elaProgram;
	}

	/**
	 * @param elaProgram
	 *            the elaProgram to set
	 */

	public void setElaProgram(String elaProgram) {
		this.elaProgram = elaProgram;
	}

}
