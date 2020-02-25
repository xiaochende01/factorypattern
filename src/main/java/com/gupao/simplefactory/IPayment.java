package com.gupao.simplefactory;

/**
 * 支付接口
 */
public interface IPayment {

    /**
     * 付款码支付
     */
    void micropay();


    /**
     * 获取订单状态
     */
    void  getOrderState();
}
