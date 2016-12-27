package com.cieca.estimate.resource.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.claim.ClaimInfoType;
import com.cieca.estimate.resource.entity.vehicle.VehicleInfoType;


/**
 * <p>Java class for RepresentativePartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepresentativePartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="ClaimInfo" type="{http://www.cieca.com/BMS}ClaimInfoType" minOccurs="0"/>
 *         &lt;element name="VehicleInfo" type="{http://www.cieca.com/BMS}VehicleInfoType" minOccurs="0"/>
 *         &lt;element name="AccompanyingParty" type="{http://www.cieca.com/BMS}AccompanyingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentativePartyType", propOrder = {
    "party",
    "claimInfo",
    "vehicleInfo",
    "accompanyingParty"
})
public class RepresentativePartyType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "ClaimInfo")
    protected ClaimInfoType claimInfo;
    @XmlElement(name = "VehicleInfo")
    protected VehicleInfoType vehicleInfo;
    @XmlElement(name = "AccompanyingParty")
    protected List<AccompanyingPartyType> accompanyingParty;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the claimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoType }
     *     
     */
    public ClaimInfoType getClaimInfo() {
        return claimInfo;
    }

    /**
     * Sets the value of the claimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoType }
     *     
     */
    public void setClaimInfo(ClaimInfoType value) {
        this.claimInfo = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInfoType }
     *     
     */
    public VehicleInfoType getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInfoType }
     *     
     */
    public void setVehicleInfo(VehicleInfoType value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the accompanyingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accompanyingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccompanyingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccompanyingPartyType }
     * 
     * 
     */
    public List<AccompanyingPartyType> getAccompanyingParty() {
        if (accompanyingParty == null) {
            accompanyingParty = new ArrayList<AccompanyingPartyType>();
        }
        return this.accompanyingParty;
    }

}
