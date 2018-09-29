package com.pattern.factory;

/**
 * @author lina02
 * @date 2018/9/28
 *简单工厂模式客户端
 */
public class OperationFactory {
    public static void main(String[] args) {
        Operation oper=null;
        oper=OperationFactory.createOperate("-");
        oper.setNumberA(1);
        oper.setNumberB(0);
        double result=oper.getResult();
        System.out.println(result);
    }
    public static Operation createOperate(String operate){
        Operation oper=null;
        switch (operate){
            case "+":
                oper=new OperationAdd();
                break;
            case "-":
                oper=new OperationSub();
                break;
            case "*":
                oper=new OperationMul();
                break;
            case "/":
                oper=new OperationDiv();
                break;
        }
        return oper;
    }
}