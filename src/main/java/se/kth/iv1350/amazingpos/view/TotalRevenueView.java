package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.model.Observer;


public class TotalRevenueView implements Observer {
    private double totalRevenue;

    public void addToTotalRevenue(double amount){
        this.totalRevenue += amount;
    }

}
