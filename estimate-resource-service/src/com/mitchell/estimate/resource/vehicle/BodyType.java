//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.vehicle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BodyStyleNum" type="{http://www.cieca.com/BMS}Char_20" minOccurs="0"/>
 *         &lt;element name="BodyStyle" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="DoorQuantity" type="{http://www.cieca.com/BMS}Integer_Range_1-9" minOccurs="0"/>
 *         &lt;element name="Trim" type="{http://www.cieca.com/BMS}TrimType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", propOrder = {
    "bodyStyleNum",
    "bodyStyle",
    "doorQuantity",
    "trim"
})
public class BodyType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "BodyStyleNum")
    protected String bodyStyleNum;
    @XmlElement(name = "BodyStyle")
    protected String bodyStyle;
    @XmlElement(name = "DoorQuantity")
    protected Integer doorQuantity;
    @XmlElement(name = "Trim")
    protected List<TrimType> trim;

    /**
     * Gets the value of the bodyStyleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyleNum() {
        return bodyStyleNum;
    }

    /**
     * Sets the value of the bodyStyleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyleNum(String value) {
        this.bodyStyleNum = value;
    }

    /**
     * Gets the value of the bodyStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    /**
     * Sets the value of the bodyStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyle(String value) {
        this.bodyStyle = value;
    }

    /**
     * Gets the value of the doorQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoorQuantity() {
        return doorQuantity;
    }

    /**
     * Sets the value of the doorQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoorQuantity(Integer value) {
        this.doorQuantity = value;
    }

    /**
     * Gets the value of the trim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrimType }
     * 
     * 
     */
    public List<TrimType> getTrim() {
        if (trim == null) {
            trim = new ArrayList<TrimType>();
        }
        return this.trim;
    }

}
