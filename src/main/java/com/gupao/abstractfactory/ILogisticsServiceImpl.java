package com.gupao.abstractfactory;

/**
 * 物流接口实现类
 */
public class ILogisticsServiceImpl implements  ILogisticsService {

    /**
     * 添加物流信息
     */
    public void insertLogistics() {
        System.out.println("添加了一条物流信息");
    }
}
