//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.idinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RefInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassThroughInfo" type="{http://www.cieca.com/BMS}Char_124" minOccurs="0"/>
 *         &lt;element name="InternalGroupInfo" type="{http://www.cieca.com/BMS}InternalGroupInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAdministratorIDInfo" type="{http://www.cieca.com/BMS}ThirdPartyAdministratorIDInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompanyID" type="{http://www.cieca.com/BMS}Char_10" minOccurs="0"/>
 *         &lt;element name="RepairOrderID" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="InsuranceCompanyPrimaryID" type="{http://www.cieca.com/BMS}Char_30" minOccurs="0"/>
 *         &lt;element name="RentalCarCompanyPrimaryID" type="{http://www.cieca.com/BMS}Char_30" minOccurs="0"/>
 *         &lt;element name="RentalCarCompanySecondaryID" type="{http://www.cieca.com/BMS}Char_30" minOccurs="0"/>
 *         &lt;element name="StockNum" type="{http://www.cieca.com/BMS}Char_25" minOccurs="0"/>
 *         &lt;element name="OtherReferenceInfo" type="{http://www.cieca.com/BMS}OtherRefInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExistingStockNum" type="{http://www.cieca.com/BMS}Char_25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefInfoType", propOrder = {
    "passThroughInfo",
    "internalGroupInfo",
    "thirdPartyAdministratorIDInfo",
    "companyID",
    "repairOrderID",
    "insuranceCompanyPrimaryID",
    "rentalCarCompanyPrimaryID",
    "rentalCarCompanySecondaryID",
    "stockNum",
    "otherReferenceInfo",
    "existingStockNum"
})
public class RefInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "PassThroughInfo")
    protected String passThroughInfo;
    @XmlElement(name = "InternalGroupInfo")
    protected List<InternalGroupInfoType> internalGroupInfo;
    @XmlElement(name = "ThirdPartyAdministratorIDInfo")
    protected List<ThirdPartyAdministratorIDInfoType> thirdPartyAdministratorIDInfo;
    @XmlElement(name = "CompanyID")
    protected String companyID;
    @XmlElement(name = "RepairOrderID")
    protected String repairOrderID;
    @XmlElement(name = "InsuranceCompanyPrimaryID")
    protected String insuranceCompanyPrimaryID;
    @XmlElement(name = "RentalCarCompanyPrimaryID")
    protected String rentalCarCompanyPrimaryID;
    @XmlElement(name = "RentalCarCompanySecondaryID")
    protected String rentalCarCompanySecondaryID;
    @XmlElement(name = "StockNum")
    protected String stockNum;
    @XmlElement(name = "OtherReferenceInfo")
    protected List<OtherRefInfoType> otherReferenceInfo;
    @XmlElement(name = "ExistingStockNum")
    protected String existingStockNum;

    /**
     * Gets the value of the passThroughInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassThroughInfo() {
        return passThroughInfo;
    }

    /**
     * Sets the value of the passThroughInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassThroughInfo(String value) {
        this.passThroughInfo = value;
    }

    /**
     * Gets the value of the internalGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalGroupInfoType }
     * 
     * 
     */
    public List<InternalGroupInfoType> getInternalGroupInfo() {
        if (internalGroupInfo == null) {
            internalGroupInfo = new ArrayList<InternalGroupInfoType>();
        }
        return this.internalGroupInfo;
    }

    /**
     * Gets the value of the thirdPartyAdministratorIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyAdministratorIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyAdministratorIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAdministratorIDInfoType }
     * 
     * 
     */
    public List<ThirdPartyAdministratorIDInfoType> getThirdPartyAdministratorIDInfo() {
        if (thirdPartyAdministratorIDInfo == null) {
            thirdPartyAdministratorIDInfo = new ArrayList<ThirdPartyAdministratorIDInfoType>();
        }
        return this.thirdPartyAdministratorIDInfo;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the repairOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairOrderID() {
        return repairOrderID;
    }

    /**
     * Sets the value of the repairOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairOrderID(String value) {
        this.repairOrderID = value;
    }

    /**
     * Gets the value of the insuranceCompanyPrimaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyPrimaryID() {
        return insuranceCompanyPrimaryID;
    }

    /**
     * Sets the value of the insuranceCompanyPrimaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyPrimaryID(String value) {
        this.insuranceCompanyPrimaryID = value;
    }

    /**
     * Gets the value of the rentalCarCompanyPrimaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalCarCompanyPrimaryID() {
        return rentalCarCompanyPrimaryID;
    }

    /**
     * Sets the value of the rentalCarCompanyPrimaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalCarCompanyPrimaryID(String value) {
        this.rentalCarCompanyPrimaryID = value;
    }

    /**
     * Gets the value of the rentalCarCompanySecondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalCarCompanySecondaryID() {
        return rentalCarCompanySecondaryID;
    }

    /**
     * Sets the value of the rentalCarCompanySecondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalCarCompanySecondaryID(String value) {
        this.rentalCarCompanySecondaryID = value;
    }

    /**
     * Gets the value of the stockNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * Sets the value of the stockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNum(String value) {
        this.stockNum = value;
    }

    /**
     * Gets the value of the otherReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherRefInfoType }
     * 
     * 
     */
    public List<OtherRefInfoType> getOtherReferenceInfo() {
        if (otherReferenceInfo == null) {
            otherReferenceInfo = new ArrayList<OtherRefInfoType>();
        }
        return this.otherReferenceInfo;
    }

    /**
     * Gets the value of the existingStockNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingStockNum() {
        return existingStockNum;
    }

    /**
     * Sets the value of the existingStockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingStockNum(String value) {
        this.existingStockNum = value;
    }

}
