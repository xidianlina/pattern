package com.pattern.template;

/**
 * AbstractTemplate是抽象类，其实也就是一抽象模板，定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出一个顶级逻辑骨架，
 * 而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。
 * 模板方法抽象类：不变的部分给出具体实现，变化的部分封装为抽象方法延迟到子类实现。
 */
public abstract class AbstractTemplate {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法结束\n");
    }
}