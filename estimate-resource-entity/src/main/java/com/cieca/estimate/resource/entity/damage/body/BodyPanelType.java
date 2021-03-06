package com.cieca.estimate.resource.entity.damage.body;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="BodyPanelDesc" type="{http://www.cieca.com/BMS}BodyPanelDescType"/>
 *           &lt;element name="BodyPanelCode" type="{http://www.cieca.com/BMS}PanelCodeEnum"/>
 *         &lt;/choice>
 *         &lt;element name="Dents" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="NumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *                     &lt;element name="MaxNumOfDents" type="{http://www.cieca.com/BMS}NumOfDentsType"/>
 *                   &lt;/choice>
 *                   &lt;element name="DentsSize" type="{http://www.cieca.com/BMS}DentsSizeEnum"/>
 *                   &lt;element name="DentsSeverity" type="{http://www.cieca.com/BMS}DamageSeverityEnum"/>
 *                   &lt;element name="DentsRepairAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyPanelType", propOrder = { "bodyPanelDesc", "bodyPanelCode", "dents" })
public class BodyPanelType implements Serializable {

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "BodyPanelDesc")
    protected String bodyPanelDesc;
    @XmlElement(name = "BodyPanelCode")
    protected PanelCodeEnum bodyPanelCode;
    @XmlElement(name = "Dents", required = true)
    protected List<DentsType> dents;

    /**
     * Gets the value of the bodyPanelDesc property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBodyPanelDesc() {
        return bodyPanelDesc;
    }

    /**
     * Sets the value of the bodyPanelDesc property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBodyPanelDesc(String value) {
        this.bodyPanelDesc = value;
    }

    /**
     * Gets the value of the bodyPanelCode property.
     * 
     * @return possible object is {@link PanelCodeEnum }
     * 
     */
    public PanelCodeEnum getBodyPanelCode() {
        return bodyPanelCode;
    }

    /**
     * Sets the value of the bodyPanelCode property.
     * 
     * @param value allowed object is {@link PanelCodeEnum }
     * 
     */
    public void setBodyPanelCode(PanelCodeEnum value) {
        this.bodyPanelCode = value;
    }

    /**
     * Gets the value of the dents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the dents
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DentsType }
     * 
     * 
     */
    public List<DentsType> getDents() {
        if (dents == null) {
            dents = new ArrayList<DentsType>();
        }
        return this.dents;
    }

}