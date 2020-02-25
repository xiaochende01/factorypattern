package com.gupao.abstractfactory;

/**
 * 业务工厂
 */
public class BusinessFactory extends   AbstractFactory {


    public IEvaluateService createEvaluate() {
       return new IEvaluateServiceImpl();
    }

    public ILogisticsService createLogistics() {
        return new ILogisticsServiceImpl();
    }

    public IOrderService createOrder() {
        return new IOrderServiceImpl();
    }

    public IPayment createPay(Class<? extends IPayment> clazz) {
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
