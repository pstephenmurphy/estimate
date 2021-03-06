package com.cieca.estimate.resource.entity.vehicle.valuation;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.person.ContactInfoType;


/**
 * <p>Java class for ValuationTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValuationType" type="{http://www.cieca.com/BMS}ValuationTypeEnum"/>
 *         &lt;element name="ValuationAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *         &lt;element name="ValuationSource" type="{http://www.cieca.com/BMS}ValuationSourceType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.cieca.com/BMS}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="ValuationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ValuationIDNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValuationExpirationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationTypeType", propOrder = {
    "valuationType",
    "valuationAmt",
    "valuationSource",
    "contactInfo",
    "valuationDateTime",
    "valuationIDNum",
    "valuationExpirationDateTime"
})
public class ValuationTypeType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ValuationType", required = true)
    protected String valuationType;
    @XmlElement(name = "ValuationAmt", required = true)
    protected BigDecimal valuationAmt;
    @XmlElement(name = "ValuationSource")
    protected String valuationSource;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "ValuationDateTime")
    protected XMLGregorianCalendar valuationDateTime;
    @XmlElement(name = "ValuationIDNum")
    protected String valuationIDNum;
    @XmlElement(name = "ValuationExpirationDateTime")
    protected XMLGregorianCalendar valuationExpirationDateTime;

    /**
     * Gets the value of the valuationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationType() {
        return valuationType;
    }

    /**
     * Sets the value of the valuationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationType(String value) {
        this.valuationType = value;
    }

    /**
     * Gets the value of the valuationAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuationAmt() {
        return valuationAmt;
    }

    /**
     * Sets the value of the valuationAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuationAmt(BigDecimal value) {
        this.valuationAmt = value;
    }

    /**
     * Gets the value of the valuationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationSource() {
        return valuationSource;
    }

    /**
     * Sets the value of the valuationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationSource(String value) {
        this.valuationSource = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the valuationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValuationDateTime() {
        return valuationDateTime;
    }

    /**
     * Sets the value of the valuationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValuationDateTime(XMLGregorianCalendar value) {
        this.valuationDateTime = value;
    }

    /**
     * Gets the value of the valuationIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuationIDNum() {
        return valuationIDNum;
    }

    /**
     * Sets the value of the valuationIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuationIDNum(String value) {
        this.valuationIDNum = value;
    }

    /**
     * Gets the value of the valuationExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValuationExpirationDateTime() {
        return valuationExpirationDateTime;
    }

    /**
     * Sets the value of the valuationExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValuationExpirationDateTime(XMLGregorianCalendar value) {
        this.valuationExpirationDateTime = value;
    }

}
