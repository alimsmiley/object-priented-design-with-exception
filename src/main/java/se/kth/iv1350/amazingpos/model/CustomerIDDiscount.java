package se.kth.iv1350.amazingpos.model;

import se.kth.iv1350.amazingpos.integration.*;

public class CustomerIDDiscount implements DiscountStrategy {
    private double discount;
    DiscountDTO totalDiscount;

    @Override
    public double calculateDiscount(int customerID, SaleDTO saleDTO, RegistryCreator exSystem){
        DiscountDataBase discountDatabase = exSystem.getDiscountDataBase();

        totalDiscount = discountDatabase.searchForDiscount(saleDTO, customerID);
        discount = totalDiscount.getCustomerDiscount();
        return discount;
        
    }

}
