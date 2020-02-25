package com.gupao.abstractfactory;

import com.gupao.simplefactory.ApplePayment;

public class TestAbstractFactory {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new BusinessFactory();

        abstractFactory.createOrder().insertOrder();

        abstractFactory.createPay(WeChatPayment.class).pay();

        abstractFactory.createPay(AliPayment.class).pay();

        abstractFactory.createPay(UnionPayment.class).pay();

        abstractFactory.createLogistics().insertLogistics();

        abstractFactory.createEvaluate().insertEvaluate();


    }



}
