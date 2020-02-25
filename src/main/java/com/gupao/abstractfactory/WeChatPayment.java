package com.gupao.abstractfactory;


/**
 * 微信支付
 */
public class WeChatPayment implements IPayment {


    public void pay() {
        System.out.println("使用微信支付");
    }
}
