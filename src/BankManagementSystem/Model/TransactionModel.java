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
public class TransactionModel {
    private String TID;
    private String AID;
    private String transactorName;
    private String date;
    private String transactionType;
    private double transactionAmount;

    public TransactionModel() {
    }

    public TransactionModel(String TID, String AID, String transactorName, String date, String transactionType, double transactionAmount) {
        this.TID = TID;
        this.AID = AID;
        this.transactorName = transactorName;
        this.date = date;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }


    /**
     * @return the TID
     */
    
    
    public String getTID() {
        return TID;
    }

    /**
     * @param TID the TID to set
     */
    public void setTID(String TID) {
        this.TID = TID;
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
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return the transactionAmount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * @param transactionAmount the transactionAmount to set
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * @return the transactorName
     */
    public String getTransactorName() {
        return transactorName;
    }

    /**
     * @param transactorName the transactorName to set
     */
    public void setTransactorName(String transactorName) {
        this.transactorName = transactorName;
    }
    
    
}
