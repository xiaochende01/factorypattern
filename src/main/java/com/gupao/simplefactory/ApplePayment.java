package com.gupao.simplefactory;

public class ApplePayment implements IPayment {

    public void micropay() {
        System.out.println("苹果付款码支付");
    }

    public void getOrderState() {
        System.out.println("查询苹果订单状态");
    }
}
