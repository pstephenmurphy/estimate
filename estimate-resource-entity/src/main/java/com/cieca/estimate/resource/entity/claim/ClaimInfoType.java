package com.cieca.estimate.resource.entity.claim;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.loss.LossInfoType;
import com.cieca.estimate.resource.entity.policy.PolicyInfoType;


/**
 * <p>Java class for ClaimInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimNum" type="{http://www.cieca.com/BMS}ClaimNumType"/>
 *         &lt;element name="PolicyInfo" type="{http://www.cieca.com/BMS}PolicyInfoType" minOccurs="0"/>
 *         &lt;element name="LossInfo" type="{http://www.cieca.com/BMS}LossInfoType" minOccurs="0"/>
 *         &lt;element name="ClaimMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInfoType", propOrder = {
    "claimNum",
    "policyInfo",
    "lossInfo",
    "claimMemo"
})
public class ClaimInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ClaimNum", required = true)
    protected String claimNum;
    @XmlElement(name = "PolicyInfo")
    protected PolicyInfoType policyInfo;
    @XmlElement(name = "LossInfo")
    protected LossInfoType lossInfo;
    @XmlElement(name = "ClaimMemo")
    protected String claimMemo;

    /**
     * Gets the value of the claimNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNum() {
        return claimNum;
    }

    /**
     * Sets the value of the claimNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNum(String value) {
        this.claimNum = value;
    }

    /**
     * Gets the value of the policyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyInfoType }
     *     
     */
    public PolicyInfoType getPolicyInfo() {
        return policyInfo;
    }

    /**
     * Sets the value of the policyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInfoType }
     *     
     */
    public void setPolicyInfo(PolicyInfoType value) {
        this.policyInfo = value;
    }

    /**
     * Gets the value of the lossInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LossInfoType }
     *     
     */
    public LossInfoType getLossInfo() {
        return lossInfo;
    }

    /**
     * Sets the value of the lossInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossInfoType }
     *     
     */
    public void setLossInfo(LossInfoType value) {
        this.lossInfo = value;
    }

    /**
     * Gets the value of the claimMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimMemo() {
        return claimMemo;
    }

    /**
     * Sets the value of the claimMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimMemo(String value) {
        this.claimMemo = value;
    }

}
