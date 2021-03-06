package com.cieca.estimate.resource.entity.adjustment;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for LaborAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaborAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeClosedEnumType"/>
 *         &lt;element name="AdjustmentPct" type="{http://www.cieca.com/BMS}Decimal_Range_-100.00-100.00" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="AdjustmentHours" type="{http://www.cieca.com/BMS}Decimal_Range_-999.9-999.9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaborAdjustmentType", propOrder = {
    "adjustmentType",
    "adjustmentPct",
    "adjustmentAmt",
    "adjustmentHours"
})
public class LaborAdjustmentType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "AdjustmentType", required = true)
    protected AdjustmentTypeEnum adjustmentType;
    
    @XmlElement(name = "AdjustmentPct")
    protected BigDecimal adjustmentPct;
    
    @XmlElement(name = "AdjustmentAmt")
    protected BigDecimal adjustmentAmt;
    
    @XmlElement(name = "AdjustmentHours")
    protected BigDecimal adjustmentHours;

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentTypeEnum }
     *     
     */
    public AdjustmentTypeEnum getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentTypeEnum }
     *     
     */
    public void setAdjustmentType(AdjustmentTypeEnum value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentPct() {
        return adjustmentPct;
    }

    /**
     * Sets the value of the adjustmentPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentPct(BigDecimal value) {
        this.adjustmentPct = value;
    }

    /**
     * Gets the value of the adjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Sets the value of the adjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmt(BigDecimal value) {
        this.adjustmentAmt = value;
    }

    /**
     * Gets the value of the adjustmentHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentHours() {
        return adjustmentHours;
    }

    /**
     * Sets the value of the adjustmentHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentHours(BigDecimal value) {
        this.adjustmentHours = value;
    }

}
