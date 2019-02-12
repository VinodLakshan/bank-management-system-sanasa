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
public class BlacklistCustomerModel {
    private String BID;
    private String CID;
    private String LID;
    private double amountToBePaid;

    public BlacklistCustomerModel(String BID, String CID, String LID, double amountToBePaid) {
        this.BID = BID;
        this.CID = CID;
        this.LID = LID;
        this.amountToBePaid = amountToBePaid;
    }

    /**
     * @return the BID
     */
    
    
    public String getBID() {
        return BID;
    }

    /**
     * @param BID the BID to set
     */
    public void setBID(String BID) {
        this.BID = BID;
    }

    /**
     * @return the CID
     */
    public String getCID() {
        return CID;
    }

    /**
     * @param CID the CID to set
     */
    public void setCID(String CID) {
        this.CID = CID;
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
     * @return the amountToBePaid
     */
    public double getAmountToBePaid() {
        return amountToBePaid;
    }

    /**
     * @param amountToBePaid the amountToBePaid to set
     */
    public void setAmountToBePaid(double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }
    
    
    
}
