package com.pattern.template;

/**
 * ConcreteClass实现父类所定义的一个或多个抽象方法。每一个AbstractTemplate都可以有任意多个ConcreteClass与之对应，
 * 而每一个ConcreteClass都可以给出这些抽象方法(也就是顶级逻辑的组成步骤)的不同实现，从而使得顶级逻辑的实现各不相同。
 */
public class ConcreteClassA extends AbstractTemplate{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A的方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A的方法2实现");
    }
}