package com.pattern.factory;

import java.util.Scanner;

/**
 * @author lina02
 * @date 2018/9/28
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("请输入数字A：");
            Double numberA=sc.nextDouble();
            System.out.println("请输入运算符(+,-,*,/)：");
            String operate=sc.next();
            System.out.println("请输入数字B：");
            Double numberB=sc.nextDouble();
            Double result=SimpleOperation.getResult(numberA,numberB,operate);
            System.out.println(numberA+operate+numberB+"结果是："+result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class SimpleOperation{
    public static double getResult(double numberA,double numberB,String operate){
        double result=0d;
        switch (operate){
            case "+":
                result=numberA+numberB;
                break;
            case "-":
                result=numberA-numberB;
                break;
            case "*":
                result=numberA*numberB;
                break;
            case "/":
                result=numberA/numberB;
                break;
        }
        return result;
    }
}