package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.address.CountryCodeClosedEnum;
import com.cieca.estimate.resource.entity.currency.CurrencyInfoType;


/**
 * <p>Java class for DocumentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMSVer" type="{http://www.cieca.com/BMS}BMSVersionEnum"/>
 *         &lt;element name="DocumentType" type="{http://www.cieca.com/BMS}DocumentTypeEnum"/>
 *         &lt;element name="DocumentID" type="{http://www.cieca.com/BMS}DocumentIDType" minOccurs="0"/>
 *         &lt;element name="VendorCode" type="{http://www.cieca.com/BMS}VendorCodeEnum" minOccurs="0"/>
 *         &lt;element name="DocumentVer" type="{http://www.cieca.com/BMS}DocumentVerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="DocumentVerCode" type="{http://www.cieca.com/BMS}DocumentVersionEnum"/>
 *           &lt;element name="DocumentVerNum" type="{http://www.cieca.com/BMS}DocumentVerNumType"/>
 *         &lt;/sequence>
 *         &lt;element name="DocumentStatus" type="{http://www.cieca.com/BMS}DocumentStatusEnum" minOccurs="0"/>
 *         &lt;element name="CreateDateTime" type="{http://www.cieca.com/BMS}DateTime"/>
 *         &lt;element name="TransmitDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ReferenceInfo" type="{http://www.cieca.com/BMS}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.cieca.com/BMS}CountryCodeClosedEnum" minOccurs="0"/>
 *         &lt;element name="CurrencyInfo" type="{http://www.cieca.com/BMS}CurrencyInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfoType", propOrder = {
    "bmsVer",
    "documentType",
    "documentID",
    "vendorCode",
    "documentVer",
    "documentVerCode",
    "documentVerNum",
    "documentStatus",
    "createDateTime",
    "transmitDateTime",
    "referenceInfo",
    "countryCode",
    "currencyInfo"
})
public class DocumentInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "BMSVer", required = true)
    protected BMSVersionEnum bmsVer;
    @XmlElement(name = "DocumentType", required = true)
    protected DocumentTypeEnum documentType;
    @XmlElement(name = "DocumentID")
    protected String documentID;
    @XmlElement(name = "VendorCode")
    protected VendorCodeEnum vendorCode;
    @XmlElement(name = "DocumentVer")
    protected List<DocumentVerType> documentVer;
    @XmlElement(name = "DocumentVerCode")
    protected DocumentVersionEnum documentVerCode;
    @XmlElement(name = "DocumentVerNum")
    protected Integer documentVerNum;
    @XmlElement(name = "DocumentStatus")
    protected DocumentStatusEnum documentStatus;
    @XmlElement(name = "CreateDateTime", required = true)
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "TransmitDateTime")
    protected XMLGregorianCalendar transmitDateTime;
    @XmlElement(name = "ReferenceInfo")
    protected ReferenceInfoType referenceInfo;
    @XmlElement(name = "CountryCode")
    protected CountryCodeClosedEnum countryCode;
    @XmlElement(name = "CurrencyInfo")
    protected CurrencyInfoType currencyInfo;

    /**
     * Gets the value of the bmsVer property.
     * 
     * @return
     *     possible object is
     *     {@link BMSVersionEnum }
     *     
     */
    public BMSVersionEnum getBMSVer() {
        return bmsVer;
    }

    /**
     * Sets the value of the bmsVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMSVersionEnum }
     *     
     */
    public void setBMSVer(BMSVersionEnum value) {
        this.bmsVer = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeEnum }
     *     
     */
    public DocumentTypeEnum getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeEnum }
     *     
     */
    public void setDocumentType(DocumentTypeEnum value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link VendorCodeEnum }
     *     
     */
    public VendorCodeEnum getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorCodeEnum }
     *     
     */
    public void setVendorCode(VendorCodeEnum value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the documentVer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentVer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentVer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentVerType }
     * 
     * 
     */
    public List<DocumentVerType> getDocumentVer() {
        if (documentVer == null) {
            documentVer = new ArrayList<DocumentVerType>();
        }
        return this.documentVer;
    }

    /**
     * Gets the value of the documentVerCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public DocumentVersionEnum getDocumentVerCode() {
        return documentVerCode;
    }

    /**
     * Sets the value of the documentVerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public void setDocumentVerCode(DocumentVersionEnum value) {
        this.documentVerCode = value;
    }

    /**
     * Gets the value of the documentVerNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentVerNum() {
        return documentVerNum;
    }

    /**
     * Sets the value of the documentVerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentVerNum(Integer value) {
        this.documentVerNum = value;
    }

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusEnum }
     *     
     */
    public DocumentStatusEnum getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusEnum }
     *     
     */
    public void setDocumentStatus(DocumentStatusEnum value) {
        this.documentStatus = value;
    }

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
     * Gets the value of the transmitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmitDateTime() {
        return transmitDateTime;
    }

    /**
     * Sets the value of the transmitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmitDateTime(XMLGregorianCalendar value) {
        this.transmitDateTime = value;
    }

    /**
     * Gets the value of the referenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getReferenceInfo() {
        return referenceInfo;
    }

    /**
     * Sets the value of the referenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setReferenceInfo(ReferenceInfoType value) {
        this.referenceInfo = value;
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

    /**
     * Gets the value of the currencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInfoType }
     *     
     */
    public CurrencyInfoType getCurrencyInfo() {
        return currencyInfo;
    }

    /**
     * Sets the value of the currencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInfoType }
     *     
     */
    public void setCurrencyInfo(CurrencyInfoType value) {
        this.currencyInfo = value;
    }

}
