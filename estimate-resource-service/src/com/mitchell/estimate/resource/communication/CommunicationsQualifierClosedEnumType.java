//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.communication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationsQualifierClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsQualifierClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="EM"/>
 *     &lt;enumeration value="FX"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HF"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="VM"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WC"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="WP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsQualifierClosedEnumType")
@XmlEnum
public enum CommunicationsQualifierClosedEnumType {

    AL,
    BN,
    CP,
    EM,
    FX,
    HA,
    HF,
    HP,
    IM,
    MA,
    NP,
    PC,
    SA,
    TE,
    UR,
    VM,
    WA,
    WC,
    WF,
    WP;

    public String value() {
        return name();
    }

    public static CommunicationsQualifierClosedEnumType fromValue(String v) {
        return valueOf(v);
    }

}
