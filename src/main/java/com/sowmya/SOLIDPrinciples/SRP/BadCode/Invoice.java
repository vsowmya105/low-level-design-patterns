package com.sowmya.SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount=amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount "+amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving Invoice to Database ");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice ");
    }

}
