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
public class LoanModel {
    private String LID;
    private String AID;
    private String reason;
    private String loanType;
    private String duration;
    private String date;
    private double amount;
    private double Periodical;
    private double toBePaid;

    public LoanModel(String LID, String AID, String reason, String loanType, String duration, String date, double amount, double Periodical, double toBePaid) {
        this.LID = LID;
        this.AID = AID;
        this.reason = reason;
        this.loanType = loanType;
        this.duration = duration;
        this.date = date;
        this.amount = amount;
        this.Periodical = Periodical;
        this.toBePaid = toBePaid;
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
     * @return the AID
     */
    public String getAID() {
        return AID;
    }

    /**
     * @param AID the AID to set
     */
    public void setAID(String AID) {
        this.AID = AID;
    }

    /**
     * @return the loanType
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * @param loanType the loanType to set
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the guarantor
     */
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the Periodical
     */
    public double getPeriodical() {
        return Periodical;
    }

    /**
     * @param Periodical the Periodical to set
     */
    public void setPeriodical(double Periodical) {
        this.Periodical = Periodical;
    }

    /**
     * @return the toBePaid
     */
    public double getToBePaid() {
        return toBePaid;
    }

    /**
     * @param toBePaid the toBePaid to set
     */
    public void setToBePaid(double toBePaid) {
        this.toBePaid = toBePaid;
    }
    
    
}
