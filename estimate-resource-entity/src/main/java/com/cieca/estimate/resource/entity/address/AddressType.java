package com.cieca.estimate.resource.entity.address;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address1" type="{http://www.cieca.com/BMS}GenericAddressType" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.cieca.com/BMS}GenericAddressType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.cieca.com/BMS}CityType" minOccurs="0"/>
 *         &lt;element name="StateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.cieca.com/BMS}PostalCodeType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.cieca.com/BMS}CountryCodeClosedEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "address1",
    "address2",
    "city",
    "stateProvince",
    "postalCode",
    "countryCode"
})
public class AddressType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "Address1")
    protected String address1;
    
    @XmlElement(name = "Address2")
    protected String address2;
    
    @XmlElement(name = "City")
    protected String city;
    
    @XmlElement(name = "StateProvince")
    protected StateProvinceEnum stateProvince;
    
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    
    @XmlElement(name = "CountryCode")
    protected CountryCodeClosedEnum countryCode;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceEnum }
     *     
     */
    public StateProvinceEnum getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceEnum }
     *     
     */
    public void setStateProvince(StateProvinceEnum value) {
        this.stateProvince = value;
    }

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
     *     {@link CountryCodeClosedEnum }
     *     
     */
    public CountryCodeClosedEnum getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeClosedEnum }
     *     
     */
    public void setCountryCode(CountryCodeClosedEnum value) {
        this.countryCode = value;
    }

}
