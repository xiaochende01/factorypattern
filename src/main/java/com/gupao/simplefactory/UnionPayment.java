package com.gupao.simplefactory;

public class UnionPayment implements IPayment {

    public void micropay() {
        System.out.println("银联付款码支付");
    }

    public void getOrderState() {
        System.out.println("查询银联订单状态");
    }
}
