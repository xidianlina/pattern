package com.pattern.strategy;

/**
 * @author lina02
 * @date 2018/9/29
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}