package com.sowmya.Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.addPaymentMethod("SowmyaDebitCard",new DebitCard("1234","Sowmya"));
        paymentService.addPaymentMethod("SowmyaCreditCard",new CreditCard("5678","Sowmya"));
        paymentService.addPaymentMethod("SowmyaUPI",new UPI("sowmya10"));
        paymentService.addPaymentMethod("SowmyaWallet",new Wallet());


        paymentService.makePayment("SowmyaUPI");
        paymentService.makePayment("SowmyaDebitCard");
        paymentService.makePayment("SowmyaCreditCard");
        paymentService.makePayment("SowmyaWallet");
    }
}
