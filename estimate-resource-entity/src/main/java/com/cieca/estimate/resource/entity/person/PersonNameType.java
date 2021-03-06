package com.cieca.estimate.resource.entity.person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://www.cieca.com/BMS}NamePrefixEnum" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.cieca.com/BMS}NameType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.cieca.com/BMS}MiddleNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.cieca.com/BMS}LastNameType" minOccurs="0"/>
 *         &lt;element name="NameSuffix" type="{http://www.cieca.com/BMS}NameSuffixEnum" minOccurs="0"/>
 *         &lt;element name="AliasName" type="{http://www.cieca.com/BMS}AliasNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "namePrefix",
    "firstName",
    "middleName",
    "lastName",
    "nameSuffix",
    "aliasName"
})
public class PersonNameType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "NamePrefix")
    protected NamePrefixEnum namePrefix;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected List<String> middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "NameSuffix")
    protected NameSuffixEnum nameSuffix;
    @XmlElement(name = "AliasName")
    protected List<String> aliasName;

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefixEnum }
     *     
     */
    public NamePrefixEnum getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefixEnum }
     *     
     */
    public void setNamePrefix(NamePrefixEnum value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffixEnum }
     *     
     */
    public NameSuffixEnum getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffixEnum }
     *     
     */
    public void setNameSuffix(NameSuffixEnum value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAliasName() {
        if (aliasName == null) {
            aliasName = new ArrayList<String>();
        }
        return this.aliasName;
    }

}
