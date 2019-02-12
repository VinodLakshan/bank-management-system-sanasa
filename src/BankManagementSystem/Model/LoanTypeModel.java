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
public class LoanTypeModel {
    private String LONTID;
    private String name;
    private String interestRate;
    private double max;
    private double min;

    public LoanTypeModel(String LONTID, String name, String interestRate, double max, double min) {
        this.LONTID = LONTID;
        this.name = name;
        this.interestRate = interestRate;
        this.max = max;
        this.min = min;
    }


    /**
     * @return the LONTID
     */
    
    
    
    public String getLONTID() {
        return LONTID;
    }

    /**
     * @param LONTID the LONTID to set
     */
    public void setLONTID(String LONTID) {
        this.LONTID = LONTID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the installment
     */
    /**
     * @return the max
     */
    public double getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(double max) {
        this.max = max;
    }

    /**
     * @return the min
     */
    public double getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(double min) {
        this.min = min;
    }

    /**
     * @return the interestRate
     */
    public String getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    
    
}
