package com.ps;

public class LeaseContract extends Contract{

    private double expectedEnding;
    private double leaseFee;
    private double monthlyPayment;

    public LeaseContract(double expectedEnding, double leaseFee, String date, String customerName, String vehicleSold, String customerEmail) {
        super( date,  customerName, vehicleSold, customerEmail);
        this.expectedEnding = expectedEnding;
        this.leaseFee = leaseFee;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    public double getExpectedEnding() {
        return expectedEnding;
    }

    public void setExpectedEnding(double expectedEnding) {
        this.expectedEnding = expectedEnding;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double monthlyPayment() {
        return 0;
    }
}
