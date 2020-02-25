package com.gupao.simplefactory;

public class simpleFactoryTest {

    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        IPayment weChatPayment = paymentFactory.createPayment(WeChatPayment.class);
        weChatPayment.micropay();
        weChatPayment.getOrderState();

        System.out.println("--------------------------------");

        IPayment aliPayment = paymentFactory.createPayment(AliPayment.class);
        aliPayment.micropay();
        aliPayment.getOrderState();

        System.out.println("--------------------------------");

        IPayment unionPayment = paymentFactory.createPayment(UnionPayment.class);
        unionPayment.micropay();
        unionPayment.getOrderState();

        System.out.println("--------------------------------");

        IPayment applePayment = paymentFactory.createPayment(ApplePayment.class);
        applePayment.micropay();
        applePayment.getOrderState();
    }
}
