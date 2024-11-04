package com.ps;

public class SalesContract extends Contract {

    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private Boolean isFinanced;
    private double monthlyPayment;


    public SalesContract(double salesTaxAmount, double recordingFee, Boolean isFinanced, double processingFee,String date, String customerName, String vehicleSold, String customerEmail) {
        super( date,  customerName, vehicleSold,  customerEmail);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.isFinanced = isFinanced;
        this.processingFee = processingFee;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public Boolean getFinanced() {
        return isFinanced;
    }

    public void setFinanced(Boolean financed) {
        isFinanced = financed;
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
