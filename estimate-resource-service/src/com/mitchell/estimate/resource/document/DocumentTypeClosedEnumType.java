//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CSR"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PDE"/>
 *     &lt;enumeration value="PGI"/>
 *     &lt;enumeration value="PGR"/>
 *     &lt;enumeration value="PGS"/>
 *     &lt;enumeration value="PMP"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="RL"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SCA"/>
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="SDE"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SIM"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="SPE"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SRM"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="SSM"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="ValCanCfm"/>
 *     &lt;enumeration value="ValCanRq"/>
 *     &lt;enumeration value="ValInfoRq"/>
 *     &lt;enumeration value="ValInqRq"/>
 *     &lt;enumeration value="ValRpt"/>
 *     &lt;enumeration value="ValRq"/>
 *     &lt;enumeration value="ValSts"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VRI"/>
 *     &lt;enumeration value="VRR"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeClosedEnumType")
@XmlEnum
public enum DocumentTypeClosedEnumType {

    A("A"),
    AO("AO"),
    AP("AP"),
    C("C"),
    CI("CI"),
    CR("CR"),
    CS("CS"),
    CSR("CSR"),
    D("D"),
    E("E"),
    F("F"),
    GA("GA"),
    GI("GI"),
    GR("GR"),
    GS("GS"),
    P("P"),
    PA("PA"),
    PDE("PDE"),
    PGI("PGI"),
    PGR("PGR"),
    PGS("PGS"),
    PMP("PMP"),
    PR("PR"),
    PS("PS"),
    R("R"),
    RA("RA"),
    RI("RI"),
    RL("RL"),
    RO("RO"),
    RR("RR"),
    S("S"),
    SA("SA"),
    SB("SB"),
    SC("SC"),
    SCA("SCA"),
    SCH("SCH"),
    SDE("SDE"),
    SI("SI"),
    SIM("SIM"),
    SP("SP"),
    SPE("SPE"),
    SR("SR"),
    SRM("SRM"),
    SS("SS"),
    SSM("SSM"),
    ST("ST"),
    TA("TA"),
    TI("TI"),
    TM("TM"),
    TR("TR"),
    U("U"),
    VA("VA"),
    @XmlEnumValue("ValCanCfm")
    VAL_CAN_CFM("ValCanCfm"),
    @XmlEnumValue("ValCanRq")
    VAL_CAN_RQ("ValCanRq"),
    @XmlEnumValue("ValInfoRq")
    VAL_INFO_RQ("ValInfoRq"),
    @XmlEnumValue("ValInqRq")
    VAL_INQ_RQ("ValInqRq"),
    @XmlEnumValue("ValRpt")
    VAL_RPT("ValRpt"),
    @XmlEnumValue("ValRq")
    VAL_RQ("ValRq"),
    @XmlEnumValue("ValSts")
    VAL_STS("ValSts"),
    VE("VE"),
    VI("VI"),
    VRI("VRI"),
    VRR("VRR"),
    Z("Z");
    private final String value;

    DocumentTypeClosedEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeClosedEnumType fromValue(String v) {
        for (DocumentTypeClosedEnumType c: DocumentTypeClosedEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
