package com.cieca.estimate.resource.entity.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="ADDA"/>
 *     &lt;enumeration value="ADDAB"/>
 *     &lt;enumeration value="ADDC"/>
 *     &lt;enumeration value="ADDD"/>
 *     &lt;enumeration value="ADDG"/>
 *     &lt;enumeration value="ADDN"/>
 *     &lt;enumeration value="ASUMP"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="CAC"/>
 *     &lt;enumeration value="CCOL"/>
 *     &lt;enumeration value="CCOMP"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="CSL"/>
 *     &lt;enumeration value="FTC"/>
 *     &lt;enumeration value="FTWFR"/>
 *     &lt;enumeration value="LUSE"/>
 *     &lt;enumeration value="MEDPM"/>
 *     &lt;enumeration value="MEXCO"/>
 *     &lt;enumeration value="MHC"/>
 *     &lt;enumeration value="PARK"/>
 *     &lt;enumeration value="PCL"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="PHE"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="RREIM"/>
 *     &lt;enumeration value="SORCV"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="UMCSL"/>
 *     &lt;enumeration value="UMIPD"/>
 *     &lt;enumeration value="UMISG"/>
 *     &lt;enumeration value="UMISP"/>
 *     &lt;enumeration value="UNCSL"/>
 *     &lt;enumeration value="UNDPD"/>
 *     &lt;enumeration value="UNDSG"/>
 *     &lt;enumeration value="UNDSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverageEnum")
@XmlEnum
public enum CoverageEnum {

    ADDA,
    ADDAB,
    ADDC,
    ADDD,
    ADDG,
    ADDN,
    ASUMP,
    BI,
    CAC,
    CCOL,
    CCOMP,
    COLL,
    COMP,
    CSL,
    FTC,
    FTWFR,
    LUSE,
    MEDPM,
    MEXCO,
    MHC,
    PARK,
    PCL,
    PD,
    PHE,
    RR,
    RREIM,
    SORCV,
    TL,
    TR,
    UMCSL,
    UMIPD,
    UMISG,
    UMISP,
    UNCSL,
    UNDPD,
    UNDSG,
    UNDSP;

    public String value() {
        return name();
    }

    public static CoverageEnum fromValue(String v) {
        return valueOf(v);
    }

}
