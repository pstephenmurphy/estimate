package com.cieca.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="HW"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PAA"/>
 *     &lt;enumeration value="PAC"/>
 *     &lt;enumeration value="PAD"/>
 *     &lt;enumeration value="PAE"/>
 *     &lt;enumeration value="PAGN"/>
 *     &lt;enumeration value="PAL"/>
 *     &lt;enumeration value="PAM"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PAND"/>
 *     &lt;enumeration value="PAO"/>
 *     &lt;enumeration value="PAP"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="RP"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="WE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartTypeEnum")
@XmlEnum
public enum PartTypeEnum {

    AD,
    GA,
    GL,
    HW,
    IM,
    LO,
    MO,
    OT,
    PAA,
    PAC,
    PAD,
    PAE,
    PAGN,
    PAL,
    PAM,
    PAN,
    PAND,
    PAO,
    PAP,
    PAR,
    RP,
    TI,
    WE;

    public String value() {
        return name();
    }

    public static PartTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
