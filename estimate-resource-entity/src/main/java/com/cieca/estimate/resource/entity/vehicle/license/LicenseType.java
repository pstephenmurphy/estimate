package com.cieca.estimate.resource.entity.vehicle.license;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.address.CountryCodeClosedEnum;
import com.cieca.estimate.resource.entity.address.StateProvinceEnum;


/**
 * <p>Java class for LicenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicensePlateNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicensePlateStateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *         &lt;element name="LicensePlateExpirationDate" type="{http://www.cieca.com/BMS}YrMon" minOccurs="0"/>
 *         &lt;element name="LicensePlateType" type="{http://www.cieca.com/BMS}LicensePlateTypeEnum" minOccurs="0"/>
 *         &lt;element name="LicenseCountryCode" type="{http://www.cieca.com/BMS}CountryCodeClosedEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseType", propOrder = {
    "licensePlateNum",
    "licensePlateStateProvince",
    "licensePlateExpirationDate",
    "licensePlateType",
    "licenseCountryCode"
})
public class LicenseType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "LicensePlateNum")
    protected String licensePlateNum;
    @XmlElement(name = "LicensePlateStateProvince")
    protected StateProvinceEnum licensePlateStateProvince;
    @XmlElement(name = "LicensePlateExpirationDate")
    protected XMLGregorianCalendar licensePlateExpirationDate;
    @XmlElement(name = "LicensePlateType")
    protected LicensePlateTypeEnum licensePlateType;
    @XmlElement(name = "LicenseCountryCode")
    protected CountryCodeClosedEnum licenseCountryCode;

    /**
     * Gets the value of the licensePlateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlateNum() {
        return licensePlateNum;
    }

    /**
     * Sets the value of the licensePlateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlateNum(String value) {
        this.licensePlateNum = value;
    }

    /**
     * Gets the value of the licensePlateStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceEnum }
     *     
     */
    public StateProvinceEnum getLicensePlateStateProvince() {
        return licensePlateStateProvince;
    }

    /**
     * Sets the value of the licensePlateStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceEnum }
     *     
     */
    public void setLicensePlateStateProvince(StateProvinceEnum value) {
        this.licensePlateStateProvince = value;
    }

    /**
     * Gets the value of the licensePlateExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicensePlateExpirationDate() {
        return licensePlateExpirationDate;
    }

    /**
     * Sets the value of the licensePlateExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicensePlateExpirationDate(XMLGregorianCalendar value) {
        this.licensePlateExpirationDate = value;
    }

    /**
     * Gets the value of the licensePlateType property.
     * 
     * @return
     *     possible object is
     *     {@link LicensePlateTypeEnum }
     *     
     */
    public LicensePlateTypeEnum getLicensePlateType() {
        return licensePlateType;
    }

    /**
     * Sets the value of the licensePlateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensePlateTypeEnum }
     *     
     */
    public void setLicensePlateType(LicensePlateTypeEnum value) {
        this.licensePlateType = value;
    }

    /**
     * Gets the value of the licenseCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeClosedEnum }
     *     
     */
    public CountryCodeClosedEnum getLicenseCountryCode() {
        return licenseCountryCode;
    }

    /**
     * Sets the value of the licenseCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeClosedEnum }
     *     
     */
    public void setLicenseCountryCode(CountryCodeClosedEnum value) {
        this.licenseCountryCode = value;
    }

}
