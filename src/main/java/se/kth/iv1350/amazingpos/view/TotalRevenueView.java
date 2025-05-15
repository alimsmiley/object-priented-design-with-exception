package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.model.Sale;
import se.kth.iv1350.amazingpos.model.SaleObserver;


public class TotalRevenueView implements SaleObserver { 
    private double totalRevenue;

    

    @Override   
    public void notifyObserver(Sale sale){
        addToTotalRevenue(sale.getFinalAmount());
    }

   
    private void addToTotalRevenue(double amount){  
        this.totalRevenue += amount;
        
        String revenue = Double.toString(totalRevenue);
        System.out.println(revenue);  

    }

}
