//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.vehicle.vin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINAvailabilityClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VINAvailabilityClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Inaccessible"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Unreadable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VINAvailabilityClosedEnumType")
@XmlEnum
public enum VINAvailabilityClosedEnumType {

    @XmlEnumValue("Inaccessible")
    INACCESSIBLE("Inaccessible"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Unreadable")
    UNREADABLE("Unreadable");
    private final String value;

    VINAvailabilityClosedEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VINAvailabilityClosedEnumType fromValue(String v) {
        for (VINAvailabilityClosedEnumType c: VINAvailabilityClosedEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
