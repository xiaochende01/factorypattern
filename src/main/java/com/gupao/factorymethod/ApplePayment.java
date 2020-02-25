package com.gupao.factorymethod;



public class ApplePayment implements IPayment {

    public void micropay() {
        System.out.println("【工厂方法】苹果付款码支付");
    }

    public void getOrderState() {
        System.out.println("【工厂方法】查询苹果订单状态");
    }
}
