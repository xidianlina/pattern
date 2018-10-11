package com.pattern.factoryMethod;

import java.util.Optional;

/**
 * 工厂方法客户端
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        IFactory operFactory=new DivFactory();
        Operation operation=operFactory.createOperation();

        operation.setNumberA(3.4);
        operation.setNumberB(4.5);
        System.out.println(operation.getResult());
    }
}