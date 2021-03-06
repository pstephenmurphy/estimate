package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssignmentEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="SendDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ReceiveDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="InspectionRequiredByDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="InitialContactDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="AppointmentDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="InspectionDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="InspectionCompleteInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="CancelDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;element name="ReactivationDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentEventType", propOrder = {
    "createDateTime",
    "sendDateTime",
    "receiveDateTime",
    "inspectionRequiredByDateTime",
    "initialContactDateTime",
    "appointmentDateTime",
    "inspectionDateTime",
    "inspectionCompleteInd",
    "cancelDate",
    "reactivationDate"
})
public class AssignmentEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "CreateDateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "SendDateTime")
    protected XMLGregorianCalendar sendDateTime;
    @XmlElement(name = "ReceiveDateTime")
    protected XMLGregorianCalendar receiveDateTime;
    @XmlElement(name = "InspectionRequiredByDateTime")
    protected XMLGregorianCalendar inspectionRequiredByDateTime;
    @XmlElement(name = "InitialContactDateTime")
    protected XMLGregorianCalendar initialContactDateTime;
    @XmlElement(name = "AppointmentDateTime")
    protected XMLGregorianCalendar appointmentDateTime;
    @XmlElement(name = "InspectionDateTime")
    protected XMLGregorianCalendar inspectionDateTime;
    @XmlElement(name = "InspectionCompleteInd")
    protected Boolean inspectionCompleteInd;
    @XmlElement(name = "CancelDate")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(name = "ReactivationDate")
    protected XMLGregorianCalendar reactivationDate;

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the sendDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDateTime() {
        return sendDateTime;
    }

    /**
     * Sets the value of the sendDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDateTime(XMLGregorianCalendar value) {
        this.sendDateTime = value;
    }

    /**
     * Gets the value of the receiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDateTime() {
        return receiveDateTime;
    }

    /**
     * Sets the value of the receiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDateTime(XMLGregorianCalendar value) {
        this.receiveDateTime = value;
    }

    /**
     * Gets the value of the inspectionRequiredByDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectionRequiredByDateTime() {
        return inspectionRequiredByDateTime;
    }

    /**
     * Sets the value of the inspectionRequiredByDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectionRequiredByDateTime(XMLGregorianCalendar value) {
        this.inspectionRequiredByDateTime = value;
    }

    /**
     * Gets the value of the initialContactDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialContactDateTime() {
        return initialContactDateTime;
    }

    /**
     * Sets the value of the initialContactDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialContactDateTime(XMLGregorianCalendar value) {
        this.initialContactDateTime = value;
    }

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
     * Gets the value of the inspectionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectionDateTime() {
        return inspectionDateTime;
    }

    /**
     * Sets the value of the inspectionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectionDateTime(XMLGregorianCalendar value) {
        this.inspectionDateTime = value;
    }

    /**
     * Gets the value of the inspectionCompleteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInspectionCompleteInd() {
        return inspectionCompleteInd;
    }

    /**
     * Sets the value of the inspectionCompleteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInspectionCompleteInd(Boolean value) {
        this.inspectionCompleteInd = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the reactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReactivationDate() {
        return reactivationDate;
    }

    /**
     * Sets the value of the reactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReactivationDate(XMLGregorianCalendar value) {
        this.reactivationDate = value;
    }

}
