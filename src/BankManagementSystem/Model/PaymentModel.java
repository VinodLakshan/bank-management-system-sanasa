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
public class PaymentModel {
    private String PID;
    private String LID;
    private String date;
    private double amount;
    private String cashOrCheque;

    public PaymentModel() {
    }

    public PaymentModel(String PID, String LID, String date, double amount, String cashOrCheque) {
        this.PID = PID;
        this.LID = LID;
        this.date = date;
        this.amount = amount;
        this.cashOrCheque = cashOrCheque;
    }

    /**
     * @return the PID
     */
    
    
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
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
     * @return the cashOrCheque
     */
    public String getCashOrCheque() {
        return cashOrCheque;
    }

    /**
     * @param cashOrCheque the cashOrCheque to set
     */
    public void setCashOrCheque(String cashOrCheque) {
        this.cashOrCheque = cashOrCheque;
    }
    
    
}
