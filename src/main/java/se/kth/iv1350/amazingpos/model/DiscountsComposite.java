package se.kth.iv1350.amazingpos.model;

import se.kth.iv1350.amazingpos.integration.RegistryCreator;
import java.util.*;

public class DiscountsComposite implements DiscountStrategy{
    double totalDiscount;
    private List<DiscountStrategy> strategyList = new ArrayList<>();

    void addDiscountStrategies(DiscountStrategy discountType){
        this.strategyList.add(discountType);
    }

    @Override
    public double calculateDiscount(int customerID, SaleDTO saleDTO, RegistryCreator exSystem){

        for(DiscountStrategy discount : strategyList){
            totalDiscount += discount.calculateDiscount(customerID, saleDTO, exSystem);
        }
        return totalDiscount;
    }

}
