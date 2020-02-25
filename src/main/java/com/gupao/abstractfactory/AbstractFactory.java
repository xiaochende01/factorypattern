package com.gupao.abstractfactory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    /**
     * 添加评价信息
     * @return
     */
    public abstract IEvaluateService createEvaluate();

    /**
     * 添加物流信息
     * @return
     */
    public abstract ILogisticsService createLogistics();

    /**
     * 添加订单信息
     * @return
     */
    public abstract IOrderService createOrder();


    /**
     * 付款
     */
    public abstract IPayment createPay(Class<? extends IPayment> clazz);



}
