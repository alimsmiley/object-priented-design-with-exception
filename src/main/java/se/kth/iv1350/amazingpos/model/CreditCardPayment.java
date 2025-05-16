package se.kth.iv1350.amazingpos.model;

/**
 * 
 */
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public double calculateChange(double amountToPay, double paidAmount){
        return 0;
    }

}
