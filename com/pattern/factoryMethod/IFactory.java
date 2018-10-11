package com.pattern.factoryMethod;

/**
 * 工厂接口
 */
public interface IFactory {
    Operation createOperation();
}

/**
 * 加法类工厂
 */
class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

/**
 * 减法类工厂
 */
class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

/**
 * 乘法工厂类
 */
class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

/**
 * 除法类工厂
 */
class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}