//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.parts;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for NonOEMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOEMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartMaterialCode" type="{http://www.cieca.com/BMS}PartMaterialCodeClosedEnumType" minOccurs="0"/>
 *         &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeClosedEnumType"/>
 *         &lt;element name="NonOEMPartNum" type="{http://www.cieca.com/BMS}Char_20"/>
 *         &lt;element name="NonOEMPartPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="NonOEMPartDesc" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="SupplierRefNum" type="{http://www.cieca.com/BMS}Char_80"/>
 *         &lt;element name="PartSelectedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOEMType", propOrder = {
    "partMaterialCode",
    "partType",
    "nonOEMPartNum",
    "nonOEMPartPrice",
    "nonOEMPartDesc",
    "supplierRefNum",
    "partSelectedInd"
})
public class NonOEMType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "PartMaterialCode")
    protected PartMaterialCodeClosedEnumType partMaterialCode;
    @XmlElement(name = "PartType", required = true)
    protected PartTypeClosedEnumType partType;
    @XmlElement(name = "NonOEMPartNum", required = true)
    protected String nonOEMPartNum;
    @XmlElement(name = "NonOEMPartPrice")
    protected BigDecimal nonOEMPartPrice;
    @XmlElement(name = "NonOEMPartDesc")
    protected String nonOEMPartDesc;
    @XmlElement(name = "SupplierRefNum", required = true)
    protected String supplierRefNum;
    @XmlElement(name = "PartSelectedInd")
    protected Boolean partSelectedInd;

    /**
     * Gets the value of the partMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link PartMaterialCodeClosedEnumType }
     *     
     */
    public PartMaterialCodeClosedEnumType getPartMaterialCode() {
        return partMaterialCode;
    }

    /**
     * Sets the value of the partMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartMaterialCodeClosedEnumType }
     *     
     */
    public void setPartMaterialCode(PartMaterialCodeClosedEnumType value) {
        this.partMaterialCode = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartTypeClosedEnumType }
     *     
     */
    public PartTypeClosedEnumType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartTypeClosedEnumType }
     *     
     */
    public void setPartType(PartTypeClosedEnumType value) {
        this.partType = value;
    }

    /**
     * Gets the value of the nonOEMPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonOEMPartNum() {
        return nonOEMPartNum;
    }

    /**
     * Sets the value of the nonOEMPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonOEMPartNum(String value) {
        this.nonOEMPartNum = value;
    }

    /**
     * Gets the value of the nonOEMPartPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonOEMPartPrice() {
        return nonOEMPartPrice;
    }

    /**
     * Sets the value of the nonOEMPartPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonOEMPartPrice(BigDecimal value) {
        this.nonOEMPartPrice = value;
    }

    /**
     * Gets the value of the nonOEMPartDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonOEMPartDesc() {
        return nonOEMPartDesc;
    }

    /**
     * Sets the value of the nonOEMPartDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonOEMPartDesc(String value) {
        this.nonOEMPartDesc = value;
    }

    /**
     * Gets the value of the supplierRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierRefNum() {
        return supplierRefNum;
    }

    /**
     * Sets the value of the supplierRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierRefNum(String value) {
        this.supplierRefNum = value;
    }

    /**
     * Gets the value of the partSelectedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartSelectedInd() {
        return partSelectedInd;
    }

    /**
     * Sets the value of the partSelectedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartSelectedInd(Boolean value) {
        this.partSelectedInd = value;
    }

}
