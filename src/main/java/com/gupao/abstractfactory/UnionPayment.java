package com.gupao.abstractfactory;

/**
 * 银联支付
 */
public class UnionPayment implements IPayment {

    public void pay() {
        System.out.println("使用银联支付");
    }
}
