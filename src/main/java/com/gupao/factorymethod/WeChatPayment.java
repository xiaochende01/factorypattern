package com.gupao.factorymethod;



public class WeChatPayment implements IPayment {


    public void micropay() {
        System.out.println("【工厂方法】微信付款码支付");
    }

    public void getOrderState() {
        System.out.println("【工厂方法】查询微信订单状态");
    }
}
