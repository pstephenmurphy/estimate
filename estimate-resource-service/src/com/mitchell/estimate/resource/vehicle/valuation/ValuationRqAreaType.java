//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.vehicle.valuation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.address.CountryCodeClosedEnumType;
import com.mitchell.estimate.resource.address.StateProvinceClosedEnumType;
import com.mitchell.estimate.resource.vehicle.UnitOfMeasureClosedEnumType;


/**
 * <p>Java class for ValuationRqAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationRqAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalCode" type="{http://www.cieca.com/BMS}Char_15"/>
 *         &lt;element name="CountryCode" type="{http://www.cieca.com/BMS}CountryCodeClosedEnumType" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://www.cieca.com/BMS}Integer_Range_0-9999" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.cieca.com/BMS}UnitOfMeasureClosedEnumType" minOccurs="0"/>
 *         &lt;element name="StateProvince" type="{http://www.cieca.com/BMS}StateProvinceClosedEnumType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedArea" type="{http://www.cieca.com/BMS}Char_120" minOccurs="0"/>
 *         &lt;element name="NationalSearchInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationRqAreaType", propOrder = {
    "postalCode",
    "countryCode",
    "radius",
    "unitOfMeasure",
    "stateProvince",
    "userDefinedArea",
    "nationalSearchInd"
})
public class ValuationRqAreaType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeClosedEnumType countryCode;
    @XmlElement(name = "Radius")
    protected Integer radius;
    @XmlElement(name = "UnitOfMeasure")
    protected UnitOfMeasureClosedEnumType unitOfMeasure;
    @XmlElement(name = "StateProvince")
    protected List<StateProvinceClosedEnumType> stateProvince;
    @XmlElement(name = "UserDefinedArea")
    protected String userDefinedArea;
    @XmlElement(name = "NationalSearchInd")
    protected Boolean nationalSearchInd;

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeClosedEnumType }
     *     
     */
    public CountryCodeClosedEnumType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeClosedEnumType }
     *     
     */
    public void setCountryCode(CountryCodeClosedEnumType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRadius(Integer value) {
        this.radius = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureClosedEnumType }
     *     
     */
    public UnitOfMeasureClosedEnumType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureClosedEnumType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureClosedEnumType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateProvince property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateProvince().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateProvinceClosedEnumType }
     * 
     * 
     */
    public List<StateProvinceClosedEnumType> getStateProvince() {
        if (stateProvince == null) {
            stateProvince = new ArrayList<StateProvinceClosedEnumType>();
        }
        return this.stateProvince;
    }

    /**
     * Gets the value of the userDefinedArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefinedArea() {
        return userDefinedArea;
    }

    /**
     * Sets the value of the userDefinedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefinedArea(String value) {
        this.userDefinedArea = value;
    }

    /**
     * Gets the value of the nationalSearchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationalSearchInd() {
        return nationalSearchInd;
    }

    /**
     * Sets the value of the nationalSearchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNationalSearchInd(Boolean value) {
        this.nationalSearchInd = value;
    }

}
