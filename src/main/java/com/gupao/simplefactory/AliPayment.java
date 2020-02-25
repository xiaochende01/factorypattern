package com.gupao.simplefactory;

public class AliPayment  implements  IPayment{

    public void micropay() {
        System.out.println("支付宝付款码支付");
    }

    public void getOrderState() {
        System.out.println("查询支付订单状态");
    }
}
