package se.kth.iv1350.amazingpos.model;

public class CashPayment implements PaymentStrategy{

    @Override
    public double calculateChange(double amountToPay, double paidAmount){
        return paidAmount-amountToPay;
    }


}
