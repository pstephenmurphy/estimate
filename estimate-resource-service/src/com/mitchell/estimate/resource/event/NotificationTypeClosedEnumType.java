//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTypeClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationTypeClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Adjuster"/>
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="Call Center"/>
 *     &lt;enumeration value="Claim Office"/>
 *     &lt;enumeration value="Third Party Administrator"/>
 *     &lt;enumeration value="Web Site"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationTypeClosedEnumType")
@XmlEnum
public enum NotificationTypeClosedEnumType {

    @XmlEnumValue("Adjuster")
    ADJUSTER("Adjuster"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Call Center")
    CALL_CENTER("Call Center"),
    @XmlEnumValue("Claim Office")
    CLAIM_OFFICE("Claim Office"),
    @XmlEnumValue("Third Party Administrator")
    THIRD_PARTY_ADMINISTRATOR("Third Party Administrator"),
    @XmlEnumValue("Web Site")
    WEB_SITE("Web Site");
    private final String value;

    NotificationTypeClosedEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationTypeClosedEnumType fromValue(String v) {
        for (NotificationTypeClosedEnumType c: NotificationTypeClosedEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
