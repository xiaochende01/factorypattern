package com.gupao.abstractfactory;

/**
 * 支付宝支付
 */
public class AliPayment  implements  IPayment{

    public void pay() {
        System.out.println("使用支付宝付款");
    }
}
