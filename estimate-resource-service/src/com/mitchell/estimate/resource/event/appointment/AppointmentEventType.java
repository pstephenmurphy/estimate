//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.event.appointment;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AppointmentEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="BeginDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="AppointmentPriority" type="{http://www.cieca.com/BMS}AppointmentPriorityOpenEnumType" minOccurs="0"/>
 *         &lt;element name="AppointmentDuration" type="{http://www.cieca.com/BMS}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentEventType", propOrder = {
    "appointmentDateTime",
    "beginDateTime",
    "endDateTime",
    "appointmentPriority",
    "appointmentDuration"
})
public class AppointmentEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "AppointmentDateTime")
    protected XMLGregorianCalendar appointmentDateTime;
    @XmlElement(name = "BeginDateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlElement(name = "EndDateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "AppointmentPriority")
    protected AppointmentPriorityOpenEnumType appointmentPriority;
    @XmlElement(name = "AppointmentDuration")
    protected Duration appointmentDuration;

    /**
     * Gets the value of the appointmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDateTime() {
        return appointmentDateTime;
    }

    /**
     * Sets the value of the appointmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDateTime(XMLGregorianCalendar value) {
        this.appointmentDateTime = value;
    }

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateTime(XMLGregorianCalendar value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the appointmentPriority property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentPriorityOpenEnumType }
     *     
     */
    public AppointmentPriorityOpenEnumType getAppointmentPriority() {
        return appointmentPriority;
    }

    /**
     * Sets the value of the appointmentPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentPriorityOpenEnumType }
     *     
     */
    public void setAppointmentPriority(AppointmentPriorityOpenEnumType value) {
        this.appointmentPriority = value;
    }

    /**
     * Gets the value of the appointmentDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAppointmentDuration() {
        return appointmentDuration;
    }

    /**
     * Sets the value of the appointmentDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAppointmentDuration(Duration value) {
        this.appointmentDuration = value;
    }

}
