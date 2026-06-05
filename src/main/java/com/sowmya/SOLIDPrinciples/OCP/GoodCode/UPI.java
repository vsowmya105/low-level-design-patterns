package com.sowmya.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("MAking payment via UPI "+amount);
    }
}
