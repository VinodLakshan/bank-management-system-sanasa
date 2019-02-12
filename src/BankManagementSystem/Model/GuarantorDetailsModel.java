/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.Model;

/**
 *
 * @author NEOx
 */
public class GuarantorDetailsModel {
        private String GuarantID;
	private String LID;
	private String Guarantor;
        private String CertificateNo;
	private double ValueOfHouse;
	private double ValueOfLand;
	private String NameOfOwner;
	private String AddressOfProperty;

    public GuarantorDetailsModel(String GuarantID, String LID, String Guarantor, String CertificateNo, double ValueOfHouse, double ValueOfLand, String NameOfOwner, String AddressOfProperty) {
        this.GuarantID = GuarantID;
        this.LID = LID;
        this.Guarantor = Guarantor;
        this.CertificateNo = CertificateNo;
        this.ValueOfHouse = ValueOfHouse;
        this.ValueOfLand = ValueOfLand;
        this.NameOfOwner = NameOfOwner;
        this.AddressOfProperty = AddressOfProperty;
    }

    
    /**
     * @return the GuarantID
     */
        
        
    public String getGuarantID() {
        return GuarantID;
    }

    /**
     * @param GuarantID the GuarantID to set
     */
    public void setGuarantID(String GuarantID) {
        this.GuarantID = GuarantID;
    }

    /**
     * @return the LID
     */
    public String getLID() {
        return LID;
    }

    /**
     * @param LID the LID to set
     */
    public void setLID(String LID) {
        this.LID = LID;
    }

    /**
     * @return the Guarantor
     */
    public String getGuarantor() {
        return Guarantor;
    }

    /**
     * @param Guarantor the Guarantor to set
     */
    public void setGuarantor(String Guarantor) {
        this.Guarantor = Guarantor;
    }

    /**
     * @return the ValueOfHouse
     */
    public double getValueOfHouse() {
        return ValueOfHouse;
    }

    /**
     * @param ValueOfHouse the ValueOfHouse to set
     */
    public void setValueOfHouse(double ValueOfHouse) {
        this.ValueOfHouse = ValueOfHouse;
    }

    /**
     * @return the ValueOfLand
     */
    public double getValueOfLand() {
        return ValueOfLand;
    }

    /**
     * @param ValueOfLand the ValueOfLand to set
     */
    public void setValueOfLand(double ValueOfLand) {
        this.ValueOfLand = ValueOfLand;
    }

    /**
     * @return the NameOfOwner
     */
    public String getNameOfOwner() {
        return NameOfOwner;
    }

    /**
     * @param NameOfOwner the NameOfOwner to set
     */
    public void setNameOfOwner(String NameOfOwner) {
        this.NameOfOwner = NameOfOwner;
    }

    /**
     * @return the AddressOfProperty
     */
    public String getAddressOfProperty() {
        return AddressOfProperty;
    }

    /**
     * @param AddressOfProperty the AddressOfProperty to set
     */
    public void setAddressOfProperty(String AddressOfProperty) {
        this.AddressOfProperty = AddressOfProperty;
    }

    /**
     * @return the CertificateNo
     */
    public String getCertificateNo() {
        return CertificateNo;
    }

    /**
     * @param CertificateNo the CertificateNo to set
     */
    public void setCertificateNo(String CertificateNo) {
        this.CertificateNo = CertificateNo;
    }


}
