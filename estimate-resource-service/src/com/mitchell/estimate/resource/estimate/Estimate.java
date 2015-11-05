//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 10:53:01 AM PST 
//


package com.mitchell.estimate.resource.estimate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.adjustment.AppliedAdjustmentClosedEnumType;
import com.mitchell.estimate.resource.damage.LaborInfoType;
import com.mitchell.estimate.resource.damage.MaterialTypeClosedEnumType;
import com.mitchell.estimate.resource.damage.OtherChargesInfoType;
import com.mitchell.estimate.resource.damage.SubletInfoType;
import com.mitchell.estimate.resource.damage.WhoPaysClosedEnumType;
import com.mitchell.estimate.resource.damage.body.PDRInfoType;
import com.mitchell.estimate.resource.document.BMSObjectType;
import com.mitchell.estimate.resource.document.DocumentVersionClosedEnumType;
import com.mitchell.estimate.resource.lineitem.LineAdjustmentType;
import com.mitchell.estimate.resource.lineitem.LineItemMotorcycleCategoryClosedEnumType;
import com.mitchell.estimate.resource.lineitem.LineItemPropertyCategoryType;
import com.mitchell.estimate.resource.parts.LineItemCategoryClosedEnumType;
import com.mitchell.estimate.resource.parts.PartInfoType;
import com.mitchell.estimate.resource.totals.LineTypeClosedEnumType;


/**
 * <p>Java class for DamageLineInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DamageLineInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNum" type="{http://www.cieca.com/BMS}Integer_Range_0-9999"/>
 *         &lt;element name="BMSObject" type="{http://www.cieca.com/BMS}BMSObjectType" minOccurs="0"/>
 *         &lt;element name="UniqueSequenceNum" type="{http://www.cieca.com/BMS}Integer_Range_0-9999" minOccurs="0"/>
 *         &lt;element name="ParentLineNum" type="{http://www.cieca.com/BMS}Integer_Range_0-9999" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SupplementNum" type="{http://www.cieca.com/BMS}Integer_Range_0-99"/>
 *           &lt;element name="EstimateVerCode" type="{http://www.cieca.com/BMS}DocumentVersionClosedEnumType"/>
 *         &lt;/sequence>
 *         &lt;element name="ManualLineInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="AutomatedEntry" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LineStatusCode" type="{http://www.cieca.com/BMS}LineStatusClosedEnumType" minOccurs="0"/>
 *         &lt;element name="DamageLineHistoryInfo" type="{http://www.cieca.com/BMS}DamageLineInfoType" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.cieca.com/BMS}Char_2" minOccurs="0"/>
 *         &lt;element name="VendorRefNum" type="{http://www.cieca.com/BMS}Char_10" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineDesc" type="{http://www.cieca.com/BMS}Char_255" minOccurs="0"/>
 *         &lt;element name="DescJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="LineItemCategoryCode" type="{http://www.cieca.com/BMS}LineItemCategoryClosedEnumType" maxOccurs="unbounded"/>
 *           &lt;element name="LineItemMotorcycleCategory" type="{http://www.cieca.com/BMS}LineItemMotorcycleCategoryClosedEnumType" maxOccurs="unbounded"/>
 *           &lt;element name="LineItemPropertyCategory" type="{http://www.cieca.com/BMS}LineItemPropertyCategoryType"/>
 *         &lt;/choice>
 *         &lt;element name="LineDescCode" type="{http://www.cieca.com/BMS}Char_20" minOccurs="0"/>
 *         &lt;element name="SubletInfo" type="{http://www.cieca.com/BMS}SubletInfoType" minOccurs="0"/>
 *         &lt;element name="PartInfo" type="{http://www.cieca.com/BMS}PartInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LaborInfo" type="{http://www.cieca.com/BMS}LaborInfoType" minOccurs="0"/>
 *         &lt;element name="RefinishLaborInfo" type="{http://www.cieca.com/BMS}LaborInfoType" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{http://www.cieca.com/BMS}MaterialTypeClosedEnumType" minOccurs="0"/>
 *         &lt;element name="OtherChargesInfo" type="{http://www.cieca.com/BMS}OtherChargesInfoType" minOccurs="0"/>
 *         &lt;element name="AppliedAdjustment" type="{http://www.cieca.com/BMS}AppliedAdjustmentClosedEnumType" minOccurs="0"/>
 *         &lt;element name="LineAdjustment" type="{http://www.cieca.com/BMS}LineAdjustmentType" minOccurs="0"/>
 *         &lt;element name="WhoPays" type="{http://www.cieca.com/BMS}WhoPaysClosedEnumType" minOccurs="0"/>
 *         &lt;element name="LineMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="PDRInfo" type="{http://www.cieca.com/BMS}PDRInfoType" minOccurs="0"/>
 *         &lt;element name="LineType" type="{http://www.cieca.com/BMS}LineTypeClosedEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DamageLineInfoType", propOrder = {
    "lineNum",
    "bmsObject",
    "uniqueSequenceNum",
    "parentLineNum",
    "supplementNum",
    "estimateVerCode",
    "manualLineInd",
    "automatedEntry",
    "lineStatusCode",
    "damageLineHistoryInfo",
    "messageCode",
    "vendorRefNum",
    "lineDesc",
    "descJudgmentInd",
    "lineItemCategoryCode",
    "lineItemMotorcycleCategory",
    "lineItemPropertyCategory",
    "lineDescCode",
    "subletInfo",
    "partInfo",
    "laborInfo",
    "refinishLaborInfo",
    "materialType",
    "otherChargesInfo",
    "appliedAdjustment",
    "lineAdjustment",
    "whoPays",
    "lineMemo",
    "pdrInfo",
    "lineType"
})
public class Estimate
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "LineNum")
    protected int lineNum;
    @XmlElement(name = "BMSObject")
    protected BMSObjectType bmsObject;
    @XmlElement(name = "UniqueSequenceNum")
    protected Integer uniqueSequenceNum;
    @XmlElement(name = "ParentLineNum")
    protected Integer parentLineNum;
    @XmlElement(name = "SupplementNum")
    protected Integer supplementNum;
    @XmlElement(name = "EstimateVerCode")
    protected DocumentVersionClosedEnumType estimateVerCode;
    @XmlElement(name = "ManualLineInd")
    protected Boolean manualLineInd;
    @XmlElement(name = "AutomatedEntry")
    protected Boolean automatedEntry;
    @XmlElement(name = "LineStatusCode")
    protected String lineStatusCode;
    @XmlElement(name = "DamageLineHistoryInfo")
    protected Estimate damageLineHistoryInfo;
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "VendorRefNum")
    protected List<String> vendorRefNum;
    @XmlElement(name = "LineDesc")
    protected String lineDesc;
    @XmlElement(name = "DescJudgmentInd")
    protected Boolean descJudgmentInd;
    @XmlElement(name = "LineItemCategoryCode")
    protected List<LineItemCategoryClosedEnumType> lineItemCategoryCode;
    @XmlElement(name = "LineItemMotorcycleCategory")
    protected List<LineItemMotorcycleCategoryClosedEnumType> lineItemMotorcycleCategory;
    @XmlElement(name = "LineItemPropertyCategory")
    protected LineItemPropertyCategoryType lineItemPropertyCategory;
    @XmlElement(name = "LineDescCode")
    protected String lineDescCode;
    @XmlElement(name = "SubletInfo")
    protected SubletInfoType subletInfo;
    @XmlElement(name = "PartInfo")
    protected List<PartInfoType> partInfo;
    @XmlElement(name = "LaborInfo")
    protected LaborInfoType laborInfo;
    @XmlElement(name = "RefinishLaborInfo")
    protected LaborInfoType refinishLaborInfo;
    @XmlElement(name = "MaterialType")
    protected MaterialTypeClosedEnumType materialType;
    @XmlElement(name = "OtherChargesInfo")
    protected OtherChargesInfoType otherChargesInfo;
    @XmlElement(name = "AppliedAdjustment")
    protected AppliedAdjustmentClosedEnumType appliedAdjustment;
    @XmlElement(name = "LineAdjustment")
    protected LineAdjustmentType lineAdjustment;
    @XmlElement(name = "WhoPays")
    protected WhoPaysClosedEnumType whoPays;
    @XmlElement(name = "LineMemo")
    protected String lineMemo;
    @XmlElement(name = "PDRInfo")
    protected PDRInfoType pdrInfo;
    @XmlElement(name = "LineType")
    protected LineTypeClosedEnumType lineType;

    /**
     * Gets the value of the lineNum property.
     * 
     */
    public int getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     */
    public void setLineNum(int value) {
        this.lineNum = value;
    }

    public boolean isSetLineNum() {
        return true;
    }

    /**
     * Gets the value of the bmsObject property.
     * 
     * @return
     *     possible object is
     *     {@link BMSObjectType }
     *     
     */
    public BMSObjectType getBMSObject() {
        return bmsObject;
    }

    /**
     * Sets the value of the bmsObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMSObjectType }
     *     
     */
    public void setBMSObject(BMSObjectType value) {
        this.bmsObject = value;
    }

    public boolean isSetBMSObject() {
        return (this.bmsObject!= null);
    }

    /**
     * Gets the value of the uniqueSequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueSequenceNum() {
        return uniqueSequenceNum;
    }

    /**
     * Sets the value of the uniqueSequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueSequenceNum(Integer value) {
        this.uniqueSequenceNum = value;
    }

    public boolean isSetUniqueSequenceNum() {
        return (this.uniqueSequenceNum!= null);
    }

    /**
     * Gets the value of the parentLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentLineNum() {
        return parentLineNum;
    }

    /**
     * Sets the value of the parentLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentLineNum(Integer value) {
        this.parentLineNum = value;
    }

    public boolean isSetParentLineNum() {
        return (this.parentLineNum!= null);
    }

    /**
     * Gets the value of the supplementNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplementNum() {
        return supplementNum;
    }

    /**
     * Sets the value of the supplementNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplementNum(Integer value) {
        this.supplementNum = value;
    }

    public boolean isSetSupplementNum() {
        return (this.supplementNum!= null);
    }

    /**
     * Gets the value of the estimateVerCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersionClosedEnumType }
     *     
     */
    public DocumentVersionClosedEnumType getEstimateVerCode() {
        return estimateVerCode;
    }

    /**
     * Sets the value of the estimateVerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersionClosedEnumType }
     *     
     */
    public void setEstimateVerCode(DocumentVersionClosedEnumType value) {
        this.estimateVerCode = value;
    }

    public boolean isSetEstimateVerCode() {
        return (this.estimateVerCode!= null);
    }

    /**
     * Gets the value of the manualLineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualLineInd() {
        return manualLineInd;
    }

    /**
     * Sets the value of the manualLineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualLineInd(Boolean value) {
        this.manualLineInd = value;
    }

    public boolean isSetManualLineInd() {
        return (this.manualLineInd!= null);
    }

    /**
     * Gets the value of the automatedEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomatedEntry() {
        return automatedEntry;
    }

    /**
     * Sets the value of the automatedEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedEntry(Boolean value) {
        this.automatedEntry = value;
    }

    public boolean isSetAutomatedEntry() {
        return (this.automatedEntry!= null);
    }

    /**
     * Gets the value of the lineStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Sets the value of the lineStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineStatusCode(String value) {
        this.lineStatusCode = value;
    }

    public boolean isSetLineStatusCode() {
        return (this.lineStatusCode!= null);
    }

    /**
     * Gets the value of the damageLineHistoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Estimate }
     *     
     */
    public Estimate getDamageLineHistoryInfo() {
        return damageLineHistoryInfo;
    }

    /**
     * Sets the value of the damageLineHistoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Estimate }
     *     
     */
    public void setDamageLineHistoryInfo(Estimate value) {
        this.damageLineHistoryInfo = value;
    }

    public boolean isSetDamageLineHistoryInfo() {
        return (this.damageLineHistoryInfo!= null);
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    public boolean isSetMessageCode() {
        return (this.messageCode!= null);
    }

    /**
     * Gets the value of the vendorRefNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorRefNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorRefNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVendorRefNum() {
        if (vendorRefNum == null) {
            vendorRefNum = new ArrayList<String>();
        }
        return this.vendorRefNum;
    }

    public boolean isSetVendorRefNum() {
        return ((this.vendorRefNum!= null)&&(!this.vendorRefNum.isEmpty()));
    }

    public void unsetVendorRefNum() {
        this.vendorRefNum = null;
    }

    /**
     * Gets the value of the lineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDesc() {
        return lineDesc;
    }

    /**
     * Sets the value of the lineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDesc(String value) {
        this.lineDesc = value;
    }

    public boolean isSetLineDesc() {
        return (this.lineDesc!= null);
    }

    /**
     * Gets the value of the descJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescJudgmentInd() {
        return descJudgmentInd;
    }

    /**
     * Sets the value of the descJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescJudgmentInd(Boolean value) {
        this.descJudgmentInd = value;
    }

    public boolean isSetDescJudgmentInd() {
        return (this.descJudgmentInd!= null);
    }

    /**
     * Gets the value of the lineItemCategoryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemCategoryClosedEnumType }
     * 
     * 
     */
    public List<LineItemCategoryClosedEnumType> getLineItemCategoryCode() {
        if (lineItemCategoryCode == null) {
            lineItemCategoryCode = new ArrayList<LineItemCategoryClosedEnumType>();
        }
        return this.lineItemCategoryCode;
    }

    public boolean isSetLineItemCategoryCode() {
        return ((this.lineItemCategoryCode!= null)&&(!this.lineItemCategoryCode.isEmpty()));
    }

    public void unsetLineItemCategoryCode() {
        this.lineItemCategoryCode = null;
    }

    /**
     * Gets the value of the lineItemMotorcycleCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemMotorcycleCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemMotorcycleCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemMotorcycleCategoryClosedEnumType }
     * 
     * 
     */
    public List<LineItemMotorcycleCategoryClosedEnumType> getLineItemMotorcycleCategory() {
        if (lineItemMotorcycleCategory == null) {
            lineItemMotorcycleCategory = new ArrayList<LineItemMotorcycleCategoryClosedEnumType>();
        }
        return this.lineItemMotorcycleCategory;
    }

    public boolean isSetLineItemMotorcycleCategory() {
        return ((this.lineItemMotorcycleCategory!= null)&&(!this.lineItemMotorcycleCategory.isEmpty()));
    }

    public void unsetLineItemMotorcycleCategory() {
        this.lineItemMotorcycleCategory = null;
    }

    /**
     * Gets the value of the lineItemPropertyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemPropertyCategoryType }
     *     
     */
    public LineItemPropertyCategoryType getLineItemPropertyCategory() {
        return lineItemPropertyCategory;
    }

    /**
     * Sets the value of the lineItemPropertyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemPropertyCategoryType }
     *     
     */
    public void setLineItemPropertyCategory(LineItemPropertyCategoryType value) {
        this.lineItemPropertyCategory = value;
    }

    public boolean isSetLineItemPropertyCategory() {
        return (this.lineItemPropertyCategory!= null);
    }

    /**
     * Gets the value of the lineDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDescCode() {
        return lineDescCode;
    }

    /**
     * Sets the value of the lineDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDescCode(String value) {
        this.lineDescCode = value;
    }

    public boolean isSetLineDescCode() {
        return (this.lineDescCode!= null);
    }

    /**
     * Gets the value of the subletInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubletInfoType }
     *     
     */
    public SubletInfoType getSubletInfo() {
        return subletInfo;
    }

    /**
     * Sets the value of the subletInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubletInfoType }
     *     
     */
    public void setSubletInfo(SubletInfoType value) {
        this.subletInfo = value;
    }

    public boolean isSetSubletInfo() {
        return (this.subletInfo!= null);
    }

    /**
     * Gets the value of the partInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInfoType }
     * 
     * 
     */
    public List<PartInfoType> getPartInfo() {
        if (partInfo == null) {
            partInfo = new ArrayList<PartInfoType>();
        }
        return this.partInfo;
    }

    public boolean isSetPartInfo() {
        return ((this.partInfo!= null)&&(!this.partInfo.isEmpty()));
    }

    public void unsetPartInfo() {
        this.partInfo = null;
    }

    /**
     * Gets the value of the laborInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LaborInfoType }
     *     
     */
    public LaborInfoType getLaborInfo() {
        return laborInfo;
    }

    /**
     * Sets the value of the laborInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborInfoType }
     *     
     */
    public void setLaborInfo(LaborInfoType value) {
        this.laborInfo = value;
    }

    public boolean isSetLaborInfo() {
        return (this.laborInfo!= null);
    }

    /**
     * Gets the value of the refinishLaborInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LaborInfoType }
     *     
     */
    public LaborInfoType getRefinishLaborInfo() {
        return refinishLaborInfo;
    }

    /**
     * Sets the value of the refinishLaborInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborInfoType }
     *     
     */
    public void setRefinishLaborInfo(LaborInfoType value) {
        this.refinishLaborInfo = value;
    }

    public boolean isSetRefinishLaborInfo() {
        return (this.refinishLaborInfo!= null);
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialTypeClosedEnumType }
     *     
     */
    public MaterialTypeClosedEnumType getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialTypeClosedEnumType }
     *     
     */
    public void setMaterialType(MaterialTypeClosedEnumType value) {
        this.materialType = value;
    }

    public boolean isSetMaterialType() {
        return (this.materialType!= null);
    }

    /**
     * Gets the value of the otherChargesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherChargesInfoType }
     *     
     */
    public OtherChargesInfoType getOtherChargesInfo() {
        return otherChargesInfo;
    }

    /**
     * Sets the value of the otherChargesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherChargesInfoType }
     *     
     */
    public void setOtherChargesInfo(OtherChargesInfoType value) {
        this.otherChargesInfo = value;
    }

    public boolean isSetOtherChargesInfo() {
        return (this.otherChargesInfo!= null);
    }

    /**
     * Gets the value of the appliedAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedAdjustmentClosedEnumType }
     *     
     */
    public AppliedAdjustmentClosedEnumType getAppliedAdjustment() {
        return appliedAdjustment;
    }

    /**
     * Sets the value of the appliedAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedAdjustmentClosedEnumType }
     *     
     */
    public void setAppliedAdjustment(AppliedAdjustmentClosedEnumType value) {
        this.appliedAdjustment = value;
    }

    public boolean isSetAppliedAdjustment() {
        return (this.appliedAdjustment!= null);
    }

    /**
     * Gets the value of the lineAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link LineAdjustmentType }
     *     
     */
    public LineAdjustmentType getLineAdjustment() {
        return lineAdjustment;
    }

    /**
     * Sets the value of the lineAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAdjustmentType }
     *     
     */
    public void setLineAdjustment(LineAdjustmentType value) {
        this.lineAdjustment = value;
    }

    public boolean isSetLineAdjustment() {
        return (this.lineAdjustment!= null);
    }

    /**
     * Gets the value of the whoPays property.
     * 
     * @return
     *     possible object is
     *     {@link WhoPaysClosedEnumType }
     *     
     */
    public WhoPaysClosedEnumType getWhoPays() {
        return whoPays;
    }

    /**
     * Sets the value of the whoPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhoPaysClosedEnumType }
     *     
     */
    public void setWhoPays(WhoPaysClosedEnumType value) {
        this.whoPays = value;
    }

    public boolean isSetWhoPays() {
        return (this.whoPays!= null);
    }

    /**
     * Gets the value of the lineMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineMemo() {
        return lineMemo;
    }

    /**
     * Sets the value of the lineMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineMemo(String value) {
        this.lineMemo = value;
    }

    public boolean isSetLineMemo() {
        return (this.lineMemo!= null);
    }

    /**
     * Gets the value of the pdrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PDRInfoType }
     *     
     */
    public PDRInfoType getPDRInfo() {
        return pdrInfo;
    }

    /**
     * Sets the value of the pdrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDRInfoType }
     *     
     */
    public void setPDRInfo(PDRInfoType value) {
        this.pdrInfo = value;
    }

    public boolean isSetPDRInfo() {
        return (this.pdrInfo!= null);
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeClosedEnumType }
     *     
     */
    public LineTypeClosedEnumType getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeClosedEnumType }
     *     
     */
    public void setLineType(LineTypeClosedEnumType value) {
        this.lineType = value;
    }

    public boolean isSetLineType() {
        return (this.lineType!= null);
    }

}
