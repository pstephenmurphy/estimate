package com.cieca.estimate.resource.entity.totals;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalSubTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TotalSubTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="18"/>
 *     &lt;enumeration value="AAH"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BTR"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="D2"/>
 *     &lt;enumeration value="D8"/>
 *     &lt;enumeration value="ECT"/>
 *     &lt;enumeration value="F7"/>
 *     &lt;enumeration value="M8"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="RP"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="TT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TotalSubTypeEnum")
@XmlEnum
public enum TotalSubTypeEnum {

    @XmlEnumValue("1")
    LINE_ITEM_TOTAL("1"),
    @XmlEnumValue("18")
    PREPAID_ITEMS_AMOUNT("18"),
    @XmlEnumValue("AAH")
    REPLACEMENT_AMOUNT("AAH"),
    @XmlEnumValue("BM")
    ADJUSTMENT("BM"),
    @XmlEnumValue("BTR")
    BETTERMENT("BTR"),
    @XmlEnumValue("CA")
    CORE_ADJUSTMENT("CA"),
    @XmlEnumValue("CC")
    CORE_CHARGE("CC"),
    @XmlEnumValue("CE")
    SUMMARY_AMOUNT("CE"),
    @XmlEnumValue("D2")
    DEDUCTIBLE_AMOUNT("D2"),
    @XmlEnumValue("D8")
    DISCOUNT_AMOUNT("D8"),
    @XmlEnumValue("ECT")
    SUBTOTAL("ECT"),
    @XmlEnumValue("F7")
    SALES_TAX("F7"),
    @XmlEnumValue("M8")
    MARKUP_AMOUNT("M8"),
    @XmlEnumValue("ML")
    PRIOR_NET_INVOICE_TOTAL("ML"),
    @XmlEnumValue("N")
    NET("N"),
    @XmlEnumValue("PN")
    PRIOR_GROSS_INVOICE_TOTAL("PN"),
    @XmlEnumValue("RP")
    REPAIR("RP"),
    @XmlEnumValue("SM")
    SUPPLEMENTAL("SM"),
    @XmlEnumValue("T")
    TAX("T"),
    @XmlEnumValue("T2")
    TOTAL_CLAIM_BEFORE_TAXES("T2"),
    @XmlEnumValue("TT")
    TOTAL_TRANSACTION_AMOUNT("TT");
    
    private final String value;

    TotalSubTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TotalSubTypeEnum fromValue(String v) {
        for (TotalSubTypeEnum c: TotalSubTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
