package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.logapi.FileLogger;
import se.kth.iv1350.amazingpos.model.Sale;
import se.kth.iv1350.amazingpos.model.SaleObserver;

import java.lang.*; 

public class TotalRevenueFileOutput implements SaleObserver{
    private double totalRevenue;
    
    FileLogger revenueLogger = new FileLogger("TotalRevenue.txt");

    @Override   
    public void notifyObserver(Sale sale){
        addToTotalRevenue(sale.getFinalAmount());
    }

   
    private void addToTotalRevenue(double amount){  
        this.totalRevenue += amount;
        
        String revenue = Double.toString(totalRevenue);
        revenueLogger.log(revenue);  

    }

    

    

}

