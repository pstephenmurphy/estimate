//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.lineitem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemPropertyCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemPropertyCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemPropertyCategoryCode" type="{http://www.cieca.com/BMS}LineItemPropertyCategoryClosedEnumType"/>
 *         &lt;element name="LineItemPropertyCategoryColorCode" type="{http://www.cieca.com/BMS}LineItemPropertyCategoryColorClosedEnumType" minOccurs="0"/>
 *         &lt;element name="LineItemPropertyCategoryTypeCode" type="{http://www.cieca.com/BMS}LineItemPropertyCategoryTypeClosedEnumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemPropertyCategoryType", propOrder = {
    "lineItemPropertyCategoryCode",
    "lineItemPropertyCategoryColorCode",
    "lineItemPropertyCategoryTypeCode"
})
public class LineItemPropertyCategoryType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "LineItemPropertyCategoryCode", required = true)
    protected LineItemPropertyCategoryClosedEnumType lineItemPropertyCategoryCode;
    @XmlElement(name = "LineItemPropertyCategoryColorCode")
    protected LineItemPropertyCategoryColorClosedEnumType lineItemPropertyCategoryColorCode;
    @XmlElement(name = "LineItemPropertyCategoryTypeCode")
    protected List<LineItemPropertyCategoryTypeClosedEnumType> lineItemPropertyCategoryTypeCode;

    /**
     * Gets the value of the lineItemPropertyCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemPropertyCategoryClosedEnumType }
     *     
     */
    public LineItemPropertyCategoryClosedEnumType getLineItemPropertyCategoryCode() {
        return lineItemPropertyCategoryCode;
    }

    /**
     * Sets the value of the lineItemPropertyCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemPropertyCategoryClosedEnumType }
     *     
     */
    public void setLineItemPropertyCategoryCode(LineItemPropertyCategoryClosedEnumType value) {
        this.lineItemPropertyCategoryCode = value;
    }

    /**
     * Gets the value of the lineItemPropertyCategoryColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemPropertyCategoryColorClosedEnumType }
     *     
     */
    public LineItemPropertyCategoryColorClosedEnumType getLineItemPropertyCategoryColorCode() {
        return lineItemPropertyCategoryColorCode;
    }

    /**
     * Sets the value of the lineItemPropertyCategoryColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemPropertyCategoryColorClosedEnumType }
     *     
     */
    public void setLineItemPropertyCategoryColorCode(LineItemPropertyCategoryColorClosedEnumType value) {
        this.lineItemPropertyCategoryColorCode = value;
    }

    /**
     * Gets the value of the lineItemPropertyCategoryTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemPropertyCategoryTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemPropertyCategoryTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemPropertyCategoryTypeClosedEnumType }
     * 
     * 
     */
    public List<LineItemPropertyCategoryTypeClosedEnumType> getLineItemPropertyCategoryTypeCode() {
        if (lineItemPropertyCategoryTypeCode == null) {
            lineItemPropertyCategoryTypeCode = new ArrayList<LineItemPropertyCategoryTypeClosedEnumType>();
        }
        return this.lineItemPropertyCategoryTypeCode;
    }

}
