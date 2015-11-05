//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.address;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CultureCodeClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CultureCodeClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="tr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CultureCodeClosedEnumType")
@XmlEnum
public enum CultureCodeClosedEnumType {

    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("tr")
    TR("tr");
    private final String value;

    CultureCodeClosedEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CultureCodeClosedEnumType fromValue(String v) {
        for (CultureCodeClosedEnumType c: CultureCodeClosedEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
