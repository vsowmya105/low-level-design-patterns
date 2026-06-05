package com.sowmya.SOLIDPrinciples.OCP.GoodCode;

public class PayPal implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via PayPal "+amount);
    }
}
