package com.gupao.simplefactory;

public class WeChatPayment implements IPayment {


    public void micropay() {
        System.out.println("微信付款码支付");
    }

    public void getOrderState() {
        System.out.println("查询微信订单状态");
    }
}
