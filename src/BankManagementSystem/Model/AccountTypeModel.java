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
public class AccountTypeModel {
    private String ACTID;
    private String name;
    private double installment;

    public AccountTypeModel() {
    }

    public AccountTypeModel(String ACTID, String name, double installment) {
        this.ACTID = ACTID;
        this.name = name;
        this.installment = installment;
    }

    /**
     * @return the ACTID
     */
    
    
    public String getACTID() {
        return ACTID;
    }

    /**
     * @param ACTID the ACTID to set
     */
    public void setACTID(String ACTID) {
        this.ACTID = ACTID;
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
    public double getInstallment() {
        return installment;
    }

    /**
     * @param installment the installment to set
     */
    public void setInstallment(double installment) {
        this.installment = installment;
    }
    
    
}
