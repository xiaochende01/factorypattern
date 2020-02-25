package com.gupao.factorymethod;

import com.gupao.factorymethod.IPayment;

/**
 * 支付工厂
 */
public interface PaymentFactory {

    /**
     * 创建支付对象
     */
    IPayment createPayment();



}
