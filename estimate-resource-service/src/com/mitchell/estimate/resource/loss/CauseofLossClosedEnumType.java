//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseofLossClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseofLossClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="ANI"/>
 *     &lt;enumeration value="ASB"/>
 *     &lt;enumeration value="BKU"/>
 *     &lt;enumeration value="CLS"/>
 *     &lt;enumeration value="CTM"/>
 *     &lt;enumeration value="EQK"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="FIR"/>
 *     &lt;enumeration value="FLD"/>
 *     &lt;enumeration value="FLO"/>
 *     &lt;enumeration value="GLS"/>
 *     &lt;enumeration value="HAL"/>
 *     &lt;enumeration value="HUR"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="MEC"/>
 *     &lt;enumeration value="MLD"/>
 *     &lt;enumeration value="MUD"/>
 *     &lt;enumeration value="MVC"/>
 *     &lt;enumeration value="NUC"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PED"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="PTH"/>
 *     &lt;enumeration value="ROR"/>
 *     &lt;enumeration value="RRP"/>
 *     &lt;enumeration value="SMK"/>
 *     &lt;enumeration value="THF"/>
 *     &lt;enumeration value="TOR"/>
 *     &lt;enumeration value="TOW"/>
 *     &lt;enumeration value="VMM"/>
 *     &lt;enumeration value="VOL"/>
 *     &lt;enumeration value="WAR"/>
 *     &lt;enumeration value="WEA"/>
 *     &lt;enumeration value="WND"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CauseofLossClosedEnumType")
@XmlEnum
public enum CauseofLossClosedEnumType {

    ANI,
    ASB,
    BKU,
    CLS,
    CTM,
    EQK,
    EXP,
    FIR,
    FLD,
    FLO,
    GLS,
    HAL,
    HUR,
    LSL,
    MEC,
    MLD,
    MUD,
    MVC,
    NUC,
    OTH,
    PED,
    PRK,
    PTH,
    ROR,
    RRP,
    SMK,
    THF,
    TOR,
    TOW,
    VMM,
    VOL,
    WAR,
    WEA,
    WND,
    ZZZ;

    public String value() {
        return name();
    }

    public static CauseofLossClosedEnumType fromValue(String v) {
        return valueOf(v);
    }

}
