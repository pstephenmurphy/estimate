//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.vehicle.valuation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationRqSourceOpenEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationRqSourceOpenEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="Call Center"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Offline"/>
 *     &lt;enumeration value="Online"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationRqSourceOpenEnumType")
@XmlEnum
public enum ValuationRqSourceOpenEnumType {

    @XmlEnumValue("Call Center")
    CALL_CENTER("Call Center"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline"),
    @XmlEnumValue("Online")
    ONLINE("Online");
    private final String value;

    ValuationRqSourceOpenEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationRqSourceOpenEnumType fromValue(String v) {
        for (ValuationRqSourceOpenEnumType c: ValuationRqSourceOpenEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
