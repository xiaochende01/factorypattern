package com.gupao.factorymethod;



/**
 * 微信支付工厂类
 */
public class WeChatPaymentFactory implements  PaymentFactory {

    /**
     * 创建支付对象
     * @return
     */
    public IPayment createPayment() {
        return new WeChatPayment();
    }
}
