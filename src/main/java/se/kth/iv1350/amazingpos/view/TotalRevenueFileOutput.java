package se.kth.iv1350.amazingpos.view;

import java.io.PrintWriter;
import se.kth.iv1350.amazingpos.logapi.*;

import se.kth.iv1350.amazingpos.model.Observer;

public class TotalRevenueFileOutput implements Observer{
    private double totalRevenue;
    
    FileLogger revenueLogger = new FileLogger("TotalRevenue.txt");

    public void addToTotalRevenue(double amount){
        this.totalRevenue += amount;
    }

    

    String revenue = Double.toString(totalRevenue);
    revenueLogger.log(revenue); 

}
