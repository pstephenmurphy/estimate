//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.currency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="USD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyClosedEnumType")
@XmlEnum
public enum CurrencyClosedEnumType {

    CAD,
    CAN,
    CZK,
    EUR,
    GBP,
    RON,
    TRY,
    USD;

    public String value() {
        return name();
    }

    public static CurrencyClosedEnumType fromValue(String v) {
        return valueOf(v);
    }

}
