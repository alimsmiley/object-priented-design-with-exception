
package se.kth.iv1350.amazingpos.model;

import se.kth.iv1350.amazingpos.integration.ExternalAccountingSystem;

/**
 *  Represents the cash register.
 * 
 */
public class CashRegister {
    private double balance;
    private static final CASH_REGISTER = new CashRegister(); 

    public static CashRegister getCashRegister(){ 
        return CASH_REGISTER;  
    }


    /**
     * Creates a new instance of cash register.
     */
    private CashRegister(){
        this.balance = 5000;

    }


    



    /**
     * Updates the balance in the cashregister given a {@link payment}.
     * @param payment   The information about how much has been paid.
     */
    public void updateCashRegister(Payment payment){
        this.balance += payment.getPaidAmount() - payment.getChange();
    }

    public double getBalance(){
        return this.balance;
    }



}
