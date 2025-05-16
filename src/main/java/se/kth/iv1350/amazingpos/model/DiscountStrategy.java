package se.kth.iv1350.amazingpos.model;

import se.kth.iv1350.amazingpos.integration.RegistryCreator;

public interface DiscountStrategy {
    public double calculateDiscount(int customerID, SaleDTO saleDTO, RegistryCreator exSystem);
}
