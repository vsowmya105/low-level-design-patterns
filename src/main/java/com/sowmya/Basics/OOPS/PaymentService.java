package com.sowmya.Basics.OOPS;

import java.util.HashMap;

public class PaymentService {

    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods=new HashMap<>();
    }
    public void addPaymentMethod(String name,PaymentMethod method){
        paymentMethods.put(name,method);
    }

    public void makePayment(String name){
        PaymentMethod pm=paymentMethods.get(name);
        pm.pay();  // Run time polymorphism
    }
}
