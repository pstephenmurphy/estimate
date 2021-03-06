package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherChargesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherChargesEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="MA2S"/>
 *     &lt;enumeration value="MA2T"/>
 *     &lt;enumeration value="MA3S"/>
 *     &lt;enumeration value="MABL"/>
 *     &lt;enumeration value="MACS"/>
 *     &lt;enumeration value="MAHW"/>
 *     &lt;enumeration value="MAPA"/>
 *     &lt;enumeration value="MASH"/>
 *     &lt;enumeration value="MATD"/>
 *     &lt;enumeration value="OT1"/>
 *     &lt;enumeration value="OT2"/>
 *     &lt;enumeration value="OT3"/>
 *     &lt;enumeration value="OT4"/>
 *     &lt;enumeration value="OTAC"/>
 *     &lt;enumeration value="OTCO"/>
 *     &lt;enumeration value="OTCP"/>
 *     &lt;enumeration value="OTDE"/>
 *     &lt;enumeration value="OTEC"/>
 *     &lt;enumeration value="OTFA"/>
 *     &lt;enumeration value="OTFO"/>
 *     &lt;enumeration value="OTFS"/>
 *     &lt;enumeration value="OTLU"/>
 *     &lt;enumeration value="OTMA"/>
 *     &lt;enumeration value="OTRC"/>
 *     &lt;enumeration value="OTSH"/>
 *     &lt;enumeration value="OTSI"/>
 *     &lt;enumeration value="OTSL"/>
 *     &lt;enumeration value="OTST"/>
 *     &lt;enumeration value="OTTL"/>
 *     &lt;enumeration value="OTTW"/>
 *     &lt;enumeration value="OTUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OtherChargesEnum")
@XmlEnum
public enum OtherChargesEnum {

    @XmlEnumValue("MA2S")
    MA_2_S("MA2S"),
    @XmlEnumValue("MA2T")
    MA_2_T("MA2T"),
    @XmlEnumValue("MA3S")
    MA_3_S("MA3S"),
    MABL("MABL"),
    MACS("MACS"),
    MAHW("MAHW"),
    MAPA("MAPA"),
    MASH("MASH"),
    MATD("MATD"),
    @XmlEnumValue("OT1")
    OT_1("OT1"),
    @XmlEnumValue("OT2")
    OT_2("OT2"),
    @XmlEnumValue("OT3")
    OT_3("OT3"),
    @XmlEnumValue("OT4")
    OT_4("OT4"),
    OTAC("OTAC"),
    OTCO("OTCO"),
    OTCP("OTCP"),
    OTDE("OTDE"),
    OTEC("OTEC"),
    OTFA("OTFA"),
    OTFO("OTFO"),
    OTFS("OTFS"),
    OTLU("OTLU"),
    OTMA("OTMA"),
    OTRC("OTRC"),
    OTSH("OTSH"),
    OTSI("OTSI"),
    OTSL("OTSL"),
    OTST("OTST"),
    OTTL("OTTL"),
    OTTW("OTTW"),
    OTUM("OTUM");
    private final String value;

    OtherChargesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherChargesEnum fromValue(String v) {
        for (OtherChargesEnum c: OtherChargesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
