package com.gupao.factorymethod;



public class UnionPayment implements IPayment {

    public void micropay() {
        System.out.println("【工厂方法】银联付款码支付");
    }

    public void getOrderState() {
        System.out.println("【工厂方法】查询银联订单状态");
    }
}
