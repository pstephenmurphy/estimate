package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalvageEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalvageEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalToMove" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="EstimatedPickup" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualPickup" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="VendorCheckIn" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="LienReleased" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="PrepaidChargesPaid" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="ApprovalforSaleRequested" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="ApprovalforSaleReceived" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="FinalPayment" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="SellerSettlement" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="VendorStorageStart" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="VehicleOut" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="VehicleDelivered" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="SalvageClosed" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="StartSalvageHold" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="ReleaseSalvageHold" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *         &lt;element name="ReactivationDate" type="{http://www.cieca.com/BMS}EventDateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalvageEventType", propOrder = {
    "approvalToMove",
    "estimatedPickup",
    "actualPickup",
    "vendorCheckIn",
    "lienReleased",
    "prepaidChargesPaid",
    "approvalforSaleRequested",
    "approvalforSaleReceived",
    "finalPayment",
    "sellerSettlement",
    "vendorStorageStart",
    "vehicleOut",
    "vehicleDelivered",
    "salvageClosed",
    "startSalvageHold",
    "releaseSalvageHold",
    "reactivationDate"
})
public class SalvageEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ApprovalToMove")
    protected EventDateTimeType approvalToMove;
    @XmlElement(name = "EstimatedPickup")
    protected EventDateTimeType estimatedPickup;
    @XmlElement(name = "ActualPickup")
    protected EventDateTimeType actualPickup;
    @XmlElement(name = "VendorCheckIn")
    protected EventDateTimeType vendorCheckIn;
    @XmlElement(name = "LienReleased")
    protected EventDateTimeType lienReleased;
    @XmlElement(name = "PrepaidChargesPaid")
    protected EventDateTimeType prepaidChargesPaid;
    @XmlElement(name = "ApprovalforSaleRequested")
    protected EventDateTimeType approvalforSaleRequested;
    @XmlElement(name = "ApprovalforSaleReceived")
    protected EventDateTimeType approvalforSaleReceived;
    @XmlElement(name = "FinalPayment")
    protected EventDateTimeType finalPayment;
    @XmlElement(name = "SellerSettlement")
    protected EventDateTimeType sellerSettlement;
    @XmlElement(name = "VendorStorageStart")
    protected EventDateTimeType vendorStorageStart;
    @XmlElement(name = "VehicleOut")
    protected EventDateTimeType vehicleOut;
    @XmlElement(name = "VehicleDelivered")
    protected EventDateTimeType vehicleDelivered;
    @XmlElement(name = "SalvageClosed")
    protected EventDateTimeType salvageClosed;
    @XmlElement(name = "StartSalvageHold")
    protected EventDateTimeType startSalvageHold;
    @XmlElement(name = "ReleaseSalvageHold")
    protected EventDateTimeType releaseSalvageHold;
    @XmlElement(name = "ReactivationDate")
    protected EventDateTimeType reactivationDate;

    /**
     * Gets the value of the approvalToMove property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getApprovalToMove() {
        return approvalToMove;
    }

    /**
     * Sets the value of the approvalToMove property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setApprovalToMove(EventDateTimeType value) {
        this.approvalToMove = value;
    }

    /**
     * Gets the value of the estimatedPickup property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getEstimatedPickup() {
        return estimatedPickup;
    }

    /**
     * Sets the value of the estimatedPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setEstimatedPickup(EventDateTimeType value) {
        this.estimatedPickup = value;
    }

    /**
     * Gets the value of the actualPickup property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getActualPickup() {
        return actualPickup;
    }

    /**
     * Sets the value of the actualPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setActualPickup(EventDateTimeType value) {
        this.actualPickup = value;
    }

    /**
     * Gets the value of the vendorCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getVendorCheckIn() {
        return vendorCheckIn;
    }

    /**
     * Sets the value of the vendorCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setVendorCheckIn(EventDateTimeType value) {
        this.vendorCheckIn = value;
    }

    /**
     * Gets the value of the lienReleased property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getLienReleased() {
        return lienReleased;
    }

    /**
     * Sets the value of the lienReleased property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setLienReleased(EventDateTimeType value) {
        this.lienReleased = value;
    }

    /**
     * Gets the value of the prepaidChargesPaid property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getPrepaidChargesPaid() {
        return prepaidChargesPaid;
    }

    /**
     * Sets the value of the prepaidChargesPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setPrepaidChargesPaid(EventDateTimeType value) {
        this.prepaidChargesPaid = value;
    }

    /**
     * Gets the value of the approvalforSaleRequested property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getApprovalforSaleRequested() {
        return approvalforSaleRequested;
    }

    /**
     * Sets the value of the approvalforSaleRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setApprovalforSaleRequested(EventDateTimeType value) {
        this.approvalforSaleRequested = value;
    }

    /**
     * Gets the value of the approvalforSaleReceived property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getApprovalforSaleReceived() {
        return approvalforSaleReceived;
    }

    /**
     * Sets the value of the approvalforSaleReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setApprovalforSaleReceived(EventDateTimeType value) {
        this.approvalforSaleReceived = value;
    }

    /**
     * Gets the value of the finalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getFinalPayment() {
        return finalPayment;
    }

    /**
     * Sets the value of the finalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setFinalPayment(EventDateTimeType value) {
        this.finalPayment = value;
    }

    /**
     * Gets the value of the sellerSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getSellerSettlement() {
        return sellerSettlement;
    }

    /**
     * Sets the value of the sellerSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setSellerSettlement(EventDateTimeType value) {
        this.sellerSettlement = value;
    }

    /**
     * Gets the value of the vendorStorageStart property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getVendorStorageStart() {
        return vendorStorageStart;
    }

    /**
     * Sets the value of the vendorStorageStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setVendorStorageStart(EventDateTimeType value) {
        this.vendorStorageStart = value;
    }

    /**
     * Gets the value of the vehicleOut property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getVehicleOut() {
        return vehicleOut;
    }

    /**
     * Sets the value of the vehicleOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setVehicleOut(EventDateTimeType value) {
        this.vehicleOut = value;
    }

    /**
     * Gets the value of the vehicleDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getVehicleDelivered() {
        return vehicleDelivered;
    }

    /**
     * Sets the value of the vehicleDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setVehicleDelivered(EventDateTimeType value) {
        this.vehicleDelivered = value;
    }

    /**
     * Gets the value of the salvageClosed property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getSalvageClosed() {
        return salvageClosed;
    }

    /**
     * Sets the value of the salvageClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setSalvageClosed(EventDateTimeType value) {
        this.salvageClosed = value;
    }

    /**
     * Gets the value of the startSalvageHold property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getStartSalvageHold() {
        return startSalvageHold;
    }

    /**
     * Sets the value of the startSalvageHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setStartSalvageHold(EventDateTimeType value) {
        this.startSalvageHold = value;
    }

    /**
     * Gets the value of the releaseSalvageHold property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getReleaseSalvageHold() {
        return releaseSalvageHold;
    }

    /**
     * Sets the value of the releaseSalvageHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setReleaseSalvageHold(EventDateTimeType value) {
        this.releaseSalvageHold = value;
    }

    /**
     * Gets the value of the reactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EventDateTimeType }
     *     
     */
    public EventDateTimeType getReactivationDate() {
        return reactivationDate;
    }

    /**
     * Sets the value of the reactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDateTimeType }
     *     
     */
    public void setReactivationDate(EventDateTimeType value) {
        this.reactivationDate = value;
    }

}
