package com.cieca.estimate.resource.entity.damage.body;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.damage.DamageSeverityEnum;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="NumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *           &lt;element name="MaxNumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *         &lt;/choice>
 *         &lt;element name="DentsSize" type="{http://www.cieca.com/BMS}DentsSizeEnum"/>
 *         &lt;element name="DentsSeverity" type="{http://www.cieca.com/BMS}DamageSeverityEnum"/>
 *         &lt;element name="DentsRepairAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DentsType", propOrder = { "numOfDents", "maxNumOfDents", "dentsSize", "dentsSeverity", "dentsRepairAmt" })
public class DentsType implements Serializable {

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "NumOfDents")
    protected Integer numOfDents;
    @XmlElement(name = "MaxNumOfDents")
    protected Integer maxNumOfDents;
    @XmlElement(name = "DentsSize", required = true)
    protected DentsSizeEnum dentsSize;
    @XmlElement(name = "DentsSeverity", required = true)
    protected DamageSeverityEnum dentsSeverity;
    @XmlElement(name = "DentsRepairAmt", required = true)
    protected BigDecimal dentsRepairAmt;

    /**
     * Gets the value of the numOfDents property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getNumOfDents() {
        return numOfDents;
    }

    /**
     * Sets the value of the numOfDents property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setNumOfDents(Integer value) {
        this.numOfDents = value;
    }

    /**
     * Gets the value of the maxNumOfDents property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getMaxNumOfDents() {
        return maxNumOfDents;
    }

    /**
     * Sets the value of the maxNumOfDents property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setMaxNumOfDents(Integer value) {
        this.maxNumOfDents = value;
    }

    /**
     * Gets the value of the dentsSize property.
     * 
     * @return possible object is {@link DentsSizeEnum }
     * 
     */
    public DentsSizeEnum getDentsSize() {
        return dentsSize;
    }

    /**
     * Sets the value of the dentsSize property.
     * 
     * @param value allowed object is {@link DentsSizeEnum }
     * 
     */
    public void setDentsSize(DentsSizeEnum value) {
        this.dentsSize = value;
    }

    /**
     * Gets the value of the dentsSeverity property.
     * 
     * @return possible object is {@link DamageSeverityEnum }
     * 
     */
    public DamageSeverityEnum getDentsSeverity() {
        return dentsSeverity;
    }

    /**
     * Sets the value of the dentsSeverity property.
     * 
     * @param value allowed object is {@link DamageSeverityEnum }
     * 
     */
    public void setDentsSeverity(DamageSeverityEnum value) {
        this.dentsSeverity = value;
    }

    /**
     * Gets the value of the dentsRepairAmt property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getDentsRepairAmt() {
        return dentsRepairAmt;
    }

    /**
     * Sets the value of the dentsRepairAmt property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setDentsRepairAmt(BigDecimal value) {
        this.dentsRepairAmt = value;
    }

}
