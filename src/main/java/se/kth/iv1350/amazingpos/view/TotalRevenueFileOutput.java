package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.logapi.FileLogger;
import se.kth.iv1350.amazingpos.model.Observer;

public class TotalRevenueFileOutput implements Observer{
    private double totalRevenue;
    
    FileLogger revenueLogger = new FileLogger("TotalRevenue.txt");

    @Override 
    public void addToTotalRevenue(double amount){
        this.totalRevenue += amount;
        
        String revenue = Double.toString(totalRevenue);
        revenueLogger.log(revenue); 

    }

    

    

}

