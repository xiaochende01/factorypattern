package com.gupao.factorymethod;

/**
 * 支付宝工厂类
 */
public class AliPaymentFactory implements  PaymentFactory {

    /**
     * 创建支付对象
     * @return
     */
    public IPayment createPayment() {
        return new AliPayment();
    }
}
