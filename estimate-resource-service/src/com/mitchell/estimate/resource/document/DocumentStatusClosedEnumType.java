//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatusClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatusClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatusClosedEnumType")
@XmlEnum
public enum DocumentStatusClosedEnumType {

    C,
    I,
    O,
    V,
    Z;

    public String value() {
        return name();
    }

    public static DocumentStatusClosedEnumType fromValue(String v) {
        return valueOf(v);
    }

}
