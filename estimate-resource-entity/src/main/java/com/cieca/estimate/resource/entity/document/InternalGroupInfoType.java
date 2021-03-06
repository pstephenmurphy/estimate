package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalGroupInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalGroupInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternalGroupID" type="{http://www.cieca.com/BMS}Char_9"/>
 *         &lt;element name="InternalGroupItemID" type="{http://www.cieca.com/BMS}Char_9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalGroupInfoType", propOrder = {
    "internalGroupID",
    "internalGroupItemID"
})
public class InternalGroupInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "InternalGroupID", required = true)
    protected String internalGroupID;
    @XmlElement(name = "InternalGroupItemID", required = true)
    protected String internalGroupItemID;

    /**
     * Gets the value of the internalGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalGroupID() {
        return internalGroupID;
    }

    /**
     * Sets the value of the internalGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalGroupID(String value) {
        this.internalGroupID = value;
    }

    /**
     * Gets the value of the internalGroupItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalGroupItemID() {
        return internalGroupItemID;
    }

    /**
     * Sets the value of the internalGroupItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalGroupItemID(String value) {
        this.internalGroupItemID = value;
    }

}
