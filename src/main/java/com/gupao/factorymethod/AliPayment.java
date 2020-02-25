package com.gupao.factorymethod;


public class AliPayment implements  IPayment{

    public void micropay() {
        System.out.println("【工厂方法】支付宝付款码支付");
    }

    public void getOrderState() {
        System.out.println("【工厂方法】查询支付订单状态");
    }
}
