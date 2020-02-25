package com.gupao.factorymethod;



/**
 * 银联支付工厂类
 */
public class UnionPaymentFactory implements  PaymentFactory {

    /**
     * 创建支付对象
     * @return
     */
    public IPayment createPayment() {
        return new UnionPayment();
    }
}
