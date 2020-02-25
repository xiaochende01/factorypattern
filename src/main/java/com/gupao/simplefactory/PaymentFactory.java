package com.gupao.simplefactory;

/**
 * 支付工厂
 */
public class PaymentFactory {

    /**
     * 创建支付类
     * @param clazz
     * @return
     */
    public IPayment createPayment(Class<? extends IPayment> clazz){
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
