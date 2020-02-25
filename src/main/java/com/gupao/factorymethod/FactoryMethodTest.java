package com.gupao.factorymethod;




public class FactoryMethodTest {

    public static void main(String[] args) {
        PaymentFactory aliPaymentFactory = new AliPaymentFactory();
        IPayment aliPayment  = aliPaymentFactory.createPayment();
        aliPayment.micropay();
        aliPayment.getOrderState();

        System.out.println("--------------------------------------");

        PaymentFactory applePaymentFactory = new ApplePaymentFactory();
        IPayment applePayment  = applePaymentFactory.createPayment();
        applePayment.micropay();
        applePayment.getOrderState();

        System.out.println("--------------------------------------");

        PaymentFactory unionPaymentFactory = new UnionPaymentFactory();
        IPayment unionPayment  = unionPaymentFactory.createPayment();
        unionPayment.micropay();
        unionPayment.getOrderState();

        System.out.println("--------------------------------------");

        PaymentFactory weChatPaymentFactory = new WeChatPaymentFactory();
        IPayment weChatPayment  = weChatPaymentFactory.createPayment();
        weChatPayment.micropay();
        weChatPayment.getOrderState();

        System.out.println("--------------------------------------");



    }
}
