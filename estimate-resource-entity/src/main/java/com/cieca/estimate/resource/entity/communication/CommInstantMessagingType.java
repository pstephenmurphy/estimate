package com.cieca.estimate.resource.entity.communication;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommInstantMessagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommInstantMessagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstantMessagingAddress" type="{http://www.cieca.com/BMS}InstantMessagingAddressType"/>
 *         &lt;element name="InstantMessagingType" type="{http://www.cieca.com/BMS}InstantMessagingTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommInstantMessagingType", propOrder = {
    "instantMessagingAddress",
    "instantMessagingType"
})
public class CommInstantMessagingType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "InstantMessagingAddress", required = true)
    protected String instantMessagingAddress;
    @XmlElement(name = "InstantMessagingType", required = true)
    protected InstantMessagingTypeEnum instantMessagingType;

    /**
     * Gets the value of the instantMessagingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantMessagingAddress() {
        return instantMessagingAddress;
    }

    /**
     * Sets the value of the instantMessagingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantMessagingAddress(String value) {
        this.instantMessagingAddress = value;
    }

    /**
     * Gets the value of the instantMessagingType property.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessagingTypeEnum }
     *     
     */
    public InstantMessagingTypeEnum getInstantMessagingType() {
        return instantMessagingType;
    }

    /**
     * Sets the value of the instantMessagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessagingTypeEnum }
     *     
     */
    public void setInstantMessagingType(InstantMessagingTypeEnum value) {
        this.instantMessagingType = value;
    }

}
