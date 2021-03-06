package com.cieca.estimate.resource.entity.rate.tax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CB"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="DL"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="HZ"/>
 *     &lt;enumeration value="LO"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="O2"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="T1"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeEnum")
@XmlEnum
public enum TaxTypeEnum {

    BE("BE"),
    CA("CA"),
    CB("CB"),
    CG("CG"),
    CP("CP"),
    CS("CS"),
    CT("CT"),
    CV("CV"),
    DL("DL"),
    GS("GS"),
    HZ("HZ"),
    LO("LO"),
    LS("LS"),
    LT("LT"),
    MA("MA"),
    MP("MP"),
    MS("MS"),
    O2("O2"),
    OH("OH"),
    PG("PG"),
    PS("PS"),
    SB("SB"),
    SL("SL"),
    SP("SP"),
    SS("SS"),
    ST("ST"),
    SU("SU"),
    T1("T1"),
    T2("T2"),
    TL("TL"),
    TX("TX");
    
    private final String value;

    TaxTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeEnum fromValue(String v) {
        for (TaxTypeEnum c: TaxTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
