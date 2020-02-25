package com.gupao.abstractfactory;

/**
 * 订单接口实现类
 */
public class IOrderServiceImpl implements IOrderService {

    /**
     * 添加订单信息
     */
    public void insertOrder() {
        System.out.println("添加了一条订单信息");
    }
}
