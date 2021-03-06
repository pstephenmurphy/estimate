package com.cieca.estimate.resource.entity.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PMP"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VRI"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="RL"/>
 *     &lt;enumeration value="VRR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeEnum")
@XmlEnum
public enum DocumentTypeEnum {

    A,
    AO,
    C,
    D,
    E,
    F,
    GI,
    P,
    PMP,
    R,
    RA,
    RI,
    S,
    U,
    VA,
    VE,
    VI,
    VRI,
    Z,
    GR,
    PS,
    PR,
    RR,
    GA,
    RL,
    VRR;

    public String value() {
        return name();
    }

    public static DocumentTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
