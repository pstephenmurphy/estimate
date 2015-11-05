//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.03 at 12:33:26 PM PST 
//


package com.mitchell.estimate.resource.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageClosedEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageClosedEnumType">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AALMT"/>
 *     &lt;enumeration value="AASPC"/>
 *     &lt;enumeration value="Accidental Death"/>
 *     &lt;enumeration value="Accidental Death Benefit"/>
 *     &lt;enumeration value="ADDA"/>
 *     &lt;enumeration value="ADDAB"/>
 *     &lt;enumeration value="ADDC"/>
 *     &lt;enumeration value="ADDD"/>
 *     &lt;enumeration value="ADDG"/>
 *     &lt;enumeration value="ADDN"/>
 *     &lt;enumeration value="ADDRP"/>
 *     &lt;enumeration value="ADDRR"/>
 *     &lt;enumeration value="APPAW"/>
 *     &lt;enumeration value="APPSR"/>
 *     &lt;enumeration value="ASUMP"/>
 *     &lt;enumeration value="BAA"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BUSNS"/>
 *     &lt;enumeration value="CAC"/>
 *     &lt;enumeration value="CCOL"/>
 *     &lt;enumeration value="CCOMP"/>
 *     &lt;enumeration value="Child Care Expenses"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="Commercial Property Damage"/>
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="CSL"/>
 *     &lt;enumeration value="Death Benefit"/>
 *     &lt;enumeration value="Death Benefits"/>
 *     &lt;enumeration value="Death Benefits - Essential Services Provider"/>
 *     &lt;enumeration value="Death Benefits - Income Producer"/>
 *     &lt;enumeration value="DWELL"/>
 *     &lt;enumeration value="ERQK"/>
 *     &lt;enumeration value="Essential Service Expenses"/>
 *     &lt;enumeration value="Essential Services"/>
 *     &lt;enumeration value="Essential Services Benefits"/>
 *     &lt;enumeration value="FCPL"/>
 *     &lt;enumeration value="FTC"/>
 *     &lt;enumeration value="FTWFR"/>
 *     &lt;enumeration value="Funeral Expense Benefits"/>
 *     &lt;enumeration value="Funeral Expenses"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="GLABR"/>
 *     &lt;enumeration value="GLASS"/>
 *     &lt;enumeration value="IFPL"/>
 *     &lt;enumeration value="Income Continuation"/>
 *     &lt;enumeration value="Income Continuation Benefits"/>
 *     &lt;enumeration value="Income Continuation Expenses"/>
 *     &lt;enumeration value="Income Loss"/>
 *     &lt;enumeration value="LAC"/>
 *     &lt;enumeration value="LACEQ"/>
 *     &lt;enumeration value="Loss of Earnings"/>
 *     &lt;enumeration value="Loss of Income"/>
 *     &lt;enumeration value="Loss of Services"/>
 *     &lt;enumeration value="Loss of Services Benefit"/>
 *     &lt;enumeration value="Loss of Services Expenses"/>
 *     &lt;enumeration value="LOU"/>
 *     &lt;enumeration value="LUSE"/>
 *     &lt;enumeration value="Medical and Funeral Expenses"/>
 *     &lt;enumeration value="Medical and Hospital Expenses"/>
 *     &lt;enumeration value="Medical Expense Benefits"/>
 *     &lt;enumeration value="Medical Expenses"/>
 *     &lt;enumeration value="Medical Payments"/>
 *     &lt;enumeration value="MEDPM"/>
 *     &lt;enumeration value="MEDPM Other"/>
 *     &lt;enumeration value="MEXCO"/>
 *     &lt;enumeration value="MHC"/>
 *     &lt;enumeration value="MISBD"/>
 *     &lt;enumeration value="Obtaining Services Expense"/>
 *     &lt;enumeration value="OFFNR"/>
 *     &lt;enumeration value="OFFRP"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="Other Expenses"/>
 *     &lt;enumeration value="OTSRP"/>
 *     &lt;enumeration value="OTSTR"/>
 *     &lt;enumeration value="PARK"/>
 *     &lt;enumeration value="PCL"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="Personal Property Damage"/>
 *     &lt;enumeration value="PHE"/>
 *     &lt;enumeration value="PIHOM"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="PPTC"/>
 *     &lt;enumeration value="Rehabilitation Expenses"/>
 *     &lt;enumeration value="Replacement Services"/>
 *     &lt;enumeration value="Replacement Services Expense"/>
 *     &lt;enumeration value="Replacement Services Loss"/>
 *     &lt;enumeration value="RESPR"/>
 *     &lt;enumeration value="RNTOT"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="RREIM"/>
 *     &lt;enumeration value="RRT"/>
 *     &lt;enumeration value="SINK"/>
 *     &lt;enumeration value="SORCV"/>
 *     &lt;enumeration value="SPP"/>
 *     &lt;enumeration value="SPPP"/>
 *     &lt;enumeration value="SRBAA"/>
 *     &lt;enumeration value="SRORP"/>
 *     &lt;enumeration value="Substitute Expenses"/>
 *     &lt;enumeration value="Substitute Service Expenses"/>
 *     &lt;enumeration value="Survivor's Economic Loss"/>
 *     &lt;enumeration value="Survivors' Income Loss"/>
 *     &lt;enumeration value="Survivors' Loss"/>
 *     &lt;enumeration value="Survivors Loss - Income Loss"/>
 *     &lt;enumeration value="Survivor's Loss - Income Loss"/>
 *     &lt;enumeration value="Survivor's Loss - Loss of Contributions"/>
 *     &lt;enumeration value="Survivors Loss - Replacement Services"/>
 *     &lt;enumeration value="Survivor's Loss - Replacement Services"/>
 *     &lt;enumeration value="Survivor's Loss - Substitute Services"/>
 *     &lt;enumeration value="Survivors' Replacement Loss"/>
 *     &lt;enumeration value="Survivor's Replacement Services Loss"/>
 *     &lt;enumeration value="TFFDP"/>
 *     &lt;enumeration value="THEFT"/>
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
 *     &lt;enumeration value="WATER"/>
 *     &lt;enumeration value="Work Loss"/>
 *     &lt;enumeration value="Work Loss - Loss of Income"/>
 *     &lt;enumeration value="Work Loss - Replacement Services"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverageClosedEnumType")
@XmlEnum
public enum CoverageClosedEnumType {

    AALMT("AALMT"),
    AASPC("AASPC"),
    @XmlEnumValue("Accidental Death")
    ACCIDENTAL_DEATH("Accidental Death"),
    @XmlEnumValue("Accidental Death Benefit")
    ACCIDENTAL_DEATH_BENEFIT("Accidental Death Benefit"),
    ADDA("ADDA"),
    ADDAB("ADDAB"),
    ADDC("ADDC"),
    ADDD("ADDD"),
    ADDG("ADDG"),
    ADDN("ADDN"),
    ADDRP("ADDRP"),
    ADDRR("ADDRR"),
    APPAW("APPAW"),
    APPSR("APPSR"),
    ASUMP("ASUMP"),
    BAA("BAA"),
    BI("BI"),
    BUSNS("BUSNS"),
    CAC("CAC"),
    CCOL("CCOL"),
    CCOMP("CCOMP"),
    @XmlEnumValue("Child Care Expenses")
    CHILD_CARE_EXPENSES("Child Care Expenses"),
    COLL("COLL"),
    @XmlEnumValue("Commercial Property Damage")
    COMMERCIAL_PROPERTY_DAMAGE("Commercial Property Damage"),
    COMP("COMP"),
    CSL("CSL"),
    @XmlEnumValue("Death Benefit")
    DEATH_BENEFIT("Death Benefit"),
    @XmlEnumValue("Death Benefits")
    DEATH_BENEFITS("Death Benefits"),
    @XmlEnumValue("Death Benefits - Essential Services Provider")
    DEATH_BENEFITS_ESSENTIAL_SERVICES_PROVIDER("Death Benefits - Essential Services Provider"),
    @XmlEnumValue("Death Benefits - Income Producer")
    DEATH_BENEFITS_INCOME_PRODUCER("Death Benefits - Income Producer"),
    DWELL("DWELL"),
    ERQK("ERQK"),
    @XmlEnumValue("Essential Service Expenses")
    ESSENTIAL_SERVICE_EXPENSES("Essential Service Expenses"),
    @XmlEnumValue("Essential Services")
    ESSENTIAL_SERVICES("Essential Services"),
    @XmlEnumValue("Essential Services Benefits")
    ESSENTIAL_SERVICES_BENEFITS("Essential Services Benefits"),
    FCPL("FCPL"),
    FTC("FTC"),
    FTWFR("FTWFR"),
    @XmlEnumValue("Funeral Expense Benefits")
    FUNERAL_EXPENSE_BENEFITS("Funeral Expense Benefits"),
    @XmlEnumValue("Funeral Expenses")
    FUNERAL_EXPENSES("Funeral Expenses"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    GLABR("GLABR"),
    GLASS("GLASS"),
    IFPL("IFPL"),
    @XmlEnumValue("Income Continuation")
    INCOME_CONTINUATION("Income Continuation"),
    @XmlEnumValue("Income Continuation Benefits")
    INCOME_CONTINUATION_BENEFITS("Income Continuation Benefits"),
    @XmlEnumValue("Income Continuation Expenses")
    INCOME_CONTINUATION_EXPENSES("Income Continuation Expenses"),
    @XmlEnumValue("Income Loss")
    INCOME_LOSS("Income Loss"),
    LAC("LAC"),
    LACEQ("LACEQ"),
    @XmlEnumValue("Loss of Earnings")
    LOSS_OF_EARNINGS("Loss of Earnings"),
    @XmlEnumValue("Loss of Income")
    LOSS_OF_INCOME("Loss of Income"),
    @XmlEnumValue("Loss of Services")
    LOSS_OF_SERVICES("Loss of Services"),
    @XmlEnumValue("Loss of Services Benefit")
    LOSS_OF_SERVICES_BENEFIT("Loss of Services Benefit"),
    @XmlEnumValue("Loss of Services Expenses")
    LOSS_OF_SERVICES_EXPENSES("Loss of Services Expenses"),
    LOU("LOU"),
    LUSE("LUSE"),
    @XmlEnumValue("Medical and Funeral Expenses")
    MEDICAL_AND_FUNERAL_EXPENSES("Medical and Funeral Expenses"),
    @XmlEnumValue("Medical and Hospital Expenses")
    MEDICAL_AND_HOSPITAL_EXPENSES("Medical and Hospital Expenses"),
    @XmlEnumValue("Medical Expense Benefits")
    MEDICAL_EXPENSE_BENEFITS("Medical Expense Benefits"),
    @XmlEnumValue("Medical Expenses")
    MEDICAL_EXPENSES("Medical Expenses"),
    @XmlEnumValue("Medical Payments")
    MEDICAL_PAYMENTS("Medical Payments"),
    MEDPM("MEDPM"),
    @XmlEnumValue("MEDPM Other")
    MEDPM_OTHER("MEDPM Other"),
    MEXCO("MEXCO"),
    MHC("MHC"),
    MISBD("MISBD"),
    @XmlEnumValue("Obtaining Services Expense")
    OBTAINING_SERVICES_EXPENSE("Obtaining Services Expense"),
    OFFNR("OFFNR"),
    OFFRP("OFFRP"),
    OS("OS"),
    @XmlEnumValue("Other Expenses")
    OTHER_EXPENSES("Other Expenses"),
    OTSRP("OTSRP"),
    OTSTR("OTSTR"),
    PARK("PARK"),
    PCL("PCL"),
    PD("PD"),
    @XmlEnumValue("Personal Property Damage")
    PERSONAL_PROPERTY_DAMAGE("Personal Property Damage"),
    PHE("PHE"),
    PIHOM("PIHOM"),
    PL("PL"),
    PP("PP"),
    PPTC("PPTC"),
    @XmlEnumValue("Rehabilitation Expenses")
    REHABILITATION_EXPENSES("Rehabilitation Expenses"),
    @XmlEnumValue("Replacement Services")
    REPLACEMENT_SERVICES("Replacement Services"),
    @XmlEnumValue("Replacement Services Expense")
    REPLACEMENT_SERVICES_EXPENSE("Replacement Services Expense"),
    @XmlEnumValue("Replacement Services Loss")
    REPLACEMENT_SERVICES_LOSS("Replacement Services Loss"),
    RESPR("RESPR"),
    RNTOT("RNTOT"),
    RR("RR"),
    RREIM("RREIM"),
    RRT("RRT"),
    SINK("SINK"),
    SORCV("SORCV"),
    SPP("SPP"),
    SPPP("SPPP"),
    SRBAA("SRBAA"),
    SRORP("SRORP"),
    @XmlEnumValue("Substitute Expenses")
    SUBSTITUTE_EXPENSES("Substitute Expenses"),
    @XmlEnumValue("Substitute Service Expenses")
    SUBSTITUTE_SERVICE_EXPENSES("Substitute Service Expenses"),
    @XmlEnumValue("Survivor's Economic Loss")
    SURVIVOR_S_ECONOMIC_LOSS("Survivor's Economic Loss"),
    @XmlEnumValue("Survivors' Income Loss")
    SURVIVORS_INCOME_LOSS("Survivors' Income Loss"),
    @XmlEnumValue("Survivors' Loss")
    SURVIVORS_LOSS("Survivors' Loss"),
    @XmlEnumValue("Survivors Loss - Income Loss")
    SURVIVORS_LOSS_INCOME_LOSS("Survivors Loss - Income Loss"),
    @XmlEnumValue("Survivor's Loss - Income Loss")
    SURVIVOR_S_LOSS_INCOME_LOSS("Survivor's Loss - Income Loss"),
    @XmlEnumValue("Survivor's Loss - Loss of Contributions")
    SURVIVOR_S_LOSS_LOSS_OF_CONTRIBUTIONS("Survivor's Loss - Loss of Contributions"),
    @XmlEnumValue("Survivors Loss - Replacement Services")
    SURVIVORS_LOSS_REPLACEMENT_SERVICES("Survivors Loss - Replacement Services"),
    @XmlEnumValue("Survivor's Loss - Replacement Services")
    SURVIVOR_S_LOSS_REPLACEMENT_SERVICES("Survivor's Loss - Replacement Services"),
    @XmlEnumValue("Survivor's Loss - Substitute Services")
    SURVIVOR_S_LOSS_SUBSTITUTE_SERVICES("Survivor's Loss - Substitute Services"),
    @XmlEnumValue("Survivors' Replacement Loss")
    SURVIVORS_REPLACEMENT_LOSS("Survivors' Replacement Loss"),
    @XmlEnumValue("Survivor's Replacement Services Loss")
    SURVIVOR_S_REPLACEMENT_SERVICES_LOSS("Survivor's Replacement Services Loss"),
    TFFDP("TFFDP"),
    THEFT("THEFT"),
    TL("TL"),
    TR("TR"),
    UMCSL("UMCSL"),
    UMIPD("UMIPD"),
    UMISG("UMISG"),
    UMISP("UMISP"),
    UNCSL("UNCSL"),
    UNDPD("UNDPD"),
    UNDSG("UNDSG"),
    UNDSP("UNDSP"),
    WATER("WATER"),
    @XmlEnumValue("Work Loss")
    WORK_LOSS("Work Loss"),
    @XmlEnumValue("Work Loss - Loss of Income")
    WORK_LOSS_LOSS_OF_INCOME("Work Loss - Loss of Income"),
    @XmlEnumValue("Work Loss - Replacement Services")
    WORK_LOSS_REPLACEMENT_SERVICES("Work Loss - Replacement Services");
    private final String value;

    CoverageClosedEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverageClosedEnumType fromValue(String v) {
        for (CoverageClosedEnumType c: CoverageClosedEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
