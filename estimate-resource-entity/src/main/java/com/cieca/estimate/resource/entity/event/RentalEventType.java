package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RentalEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RentalEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeededDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RentalStartDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RentalEndDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RenterNotifiedDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="RentalEstimatedReturnDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;element name="TerminationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ShortenAuthorizationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CancelDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalEventType", propOrder = {
    "neededDateTime",
    "rentalStartDateTime",
    "rentalEndDateTime",
    "renterNotifiedDateTime",
    "expirationDateTime",
    "rentalEstimatedReturnDate",
    "terminationDateTime",
    "shortenAuthorizationDateTime",
    "cancelDateTime"
})
public class RentalEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "NeededDateTime")
    protected XMLGregorianCalendar neededDateTime;
    @XmlElement(name = "RentalStartDateTime")
    protected XMLGregorianCalendar rentalStartDateTime;
    @XmlElement(name = "RentalEndDateTime")
    protected XMLGregorianCalendar rentalEndDateTime;
    @XmlElement(name = "RenterNotifiedDateTime")
    protected XMLGregorianCalendar renterNotifiedDateTime;
    @XmlElement(name = "ExpirationDateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "RentalEstimatedReturnDate")
    protected XMLGregorianCalendar rentalEstimatedReturnDate;
    @XmlElement(name = "TerminationDateTime")
    protected XMLGregorianCalendar terminationDateTime;
    @XmlElement(name = "ShortenAuthorizationDateTime")
    protected XMLGregorianCalendar shortenAuthorizationDateTime;
    @XmlElement(name = "CancelDateTime")
    protected XMLGregorianCalendar cancelDateTime;

    /**
     * Gets the value of the neededDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNeededDateTime() {
        return neededDateTime;
    }

    /**
     * Sets the value of the neededDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNeededDateTime(XMLGregorianCalendar value) {
        this.neededDateTime = value;
    }

    /**
     * Gets the value of the rentalStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRentalStartDateTime() {
        return rentalStartDateTime;
    }

    /**
     * Sets the value of the rentalStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRentalStartDateTime(XMLGregorianCalendar value) {
        this.rentalStartDateTime = value;
    }

    /**
     * Gets the value of the rentalEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRentalEndDateTime() {
        return rentalEndDateTime;
    }

    /**
     * Sets the value of the rentalEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRentalEndDateTime(XMLGregorianCalendar value) {
        this.rentalEndDateTime = value;
    }

    /**
     * Gets the value of the renterNotifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenterNotifiedDateTime() {
        return renterNotifiedDateTime;
    }

    /**
     * Sets the value of the renterNotifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenterNotifiedDateTime(XMLGregorianCalendar value) {
        this.renterNotifiedDateTime = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the rentalEstimatedReturnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRentalEstimatedReturnDate() {
        return rentalEstimatedReturnDate;
    }

    /**
     * Sets the value of the rentalEstimatedReturnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRentalEstimatedReturnDate(XMLGregorianCalendar value) {
        this.rentalEstimatedReturnDate = value;
    }

    /**
     * Gets the value of the terminationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDateTime() {
        return terminationDateTime;
    }

    /**
     * Sets the value of the terminationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDateTime(XMLGregorianCalendar value) {
        this.terminationDateTime = value;
    }

    /**
     * Gets the value of the shortenAuthorizationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShortenAuthorizationDateTime() {
        return shortenAuthorizationDateTime;
    }

    /**
     * Sets the value of the shortenAuthorizationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShortenAuthorizationDateTime(XMLGregorianCalendar value) {
        this.shortenAuthorizationDateTime = value;
    }

    /**
     * Gets the value of the cancelDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDateTime() {
        return cancelDateTime;
    }

    /**
     * Sets the value of the cancelDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDateTime(XMLGregorianCalendar value) {
        this.cancelDateTime = value;
    }

}
