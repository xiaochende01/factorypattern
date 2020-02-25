package com.gupao.factorymethod;


/**
 * 苹果支付工厂类
 */
public class ApplePaymentFactory implements  PaymentFactory {

    /**
     * 创建支付对象
     * @return
     */
    public IPayment createPayment() {
        return new ApplePayment();
    }
}
