//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.policy;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerPersonLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PerOccurrenceLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PerDayRentalLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageLimitsType", propOrder = {
    "perPersonLimit",
    "perOccurrenceLimit",
    "perDayRentalLimit"
})
public class CoverageLimitsType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "PerPersonLimit")
    protected BigDecimal perPersonLimit;
    @XmlElement(name = "PerOccurrenceLimit")
    protected BigDecimal perOccurrenceLimit;
    @XmlElement(name = "PerDayRentalLimit")
    protected BigDecimal perDayRentalLimit;

    /**
     * Gets the value of the perPersonLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPersonLimit() {
        return perPersonLimit;
    }

    /**
     * Sets the value of the perPersonLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPersonLimit(BigDecimal value) {
        this.perPersonLimit = value;
    }

    /**
     * Gets the value of the perOccurrenceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerOccurrenceLimit() {
        return perOccurrenceLimit;
    }

    /**
     * Sets the value of the perOccurrenceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerOccurrenceLimit(BigDecimal value) {
        this.perOccurrenceLimit = value;
    }

    /**
     * Gets the value of the perDayRentalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerDayRentalLimit() {
        return perDayRentalLimit;
    }

    /**
     * Sets the value of the perDayRentalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerDayRentalLimit(BigDecimal value) {
        this.perDayRentalLimit = value;
    }

}
