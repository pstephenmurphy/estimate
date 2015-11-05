//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.vehicle.color;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ColorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorName" type="{http://www.cieca.com/BMS}Char_80" minOccurs="0"/>
 *         &lt;element name="OEMColorCode" type="{http://www.cieca.com/BMS}Char_20" minOccurs="0"/>
 *         &lt;element name="VendorColorCode" type="{http://www.cieca.com/BMS}Char_20" minOccurs="0"/>
 *         &lt;element name="CustomColorCode" type="{http://www.cieca.com/BMS}Char_20" minOccurs="0"/>
 *         &lt;element name="ColorCode" type="{http://www.cieca.com/BMS}ColorCodesClosedEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorType", propOrder = {
    "colorName",
    "oemColorCode",
    "vendorColorCode",
    "customColorCode",
    "colorCode"
})
public class ColorType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "ColorName")
    protected String colorName;
    @XmlElement(name = "OEMColorCode")
    protected String oemColorCode;
    @XmlElement(name = "VendorColorCode")
    protected String vendorColorCode;
    @XmlElement(name = "CustomColorCode")
    protected String customColorCode;
    @XmlElement(name = "ColorCode")
    protected ColorCodesClosedEnumType colorCode;

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the oemColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEMColorCode() {
        return oemColorCode;
    }

    /**
     * Sets the value of the oemColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEMColorCode(String value) {
        this.oemColorCode = value;
    }

    /**
     * Gets the value of the vendorColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorColorCode() {
        return vendorColorCode;
    }

    /**
     * Sets the value of the vendorColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorColorCode(String value) {
        this.vendorColorCode = value;
    }

    /**
     * Gets the value of the customColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomColorCode() {
        return customColorCode;
    }

    /**
     * Sets the value of the customColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomColorCode(String value) {
        this.customColorCode = value;
    }

    /**
     * Gets the value of the colorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColorCodesClosedEnumType }
     *     
     */
    public ColorCodesClosedEnumType getColorCode() {
        return colorCode;
    }

    /**
     * Sets the value of the colorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorCodesClosedEnumType }
     *     
     */
    public void setColorCode(ColorCodesClosedEnumType value) {
        this.colorCode = value;
    }

}
