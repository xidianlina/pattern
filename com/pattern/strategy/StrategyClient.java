package com.pattern.strategy;

/**
 * @author lina02
 * @date 2018/9/29
 * 客户端使用策略
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;
        context=new Context(new ConcreteStrategyA());
        context.contextInterface();
        context=new Context(new ConcreteStrategyB());
        context.contextInterface();
        context=new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}