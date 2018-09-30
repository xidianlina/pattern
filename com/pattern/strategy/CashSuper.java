package com.pattern.strategy;

/**
 * @author lina02
 * @date 2018/9/29
 */

/*现金收费抽象类*/
public abstract class CashSuper {
    public abstract double acceptCash(double money);
}

/*正常收费子类*/
class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

/*打折收费子类*/
class CashRebate extends CashSuper{
    private double moneyRebate=1d;

    public CashRebate(double money){
        this.moneyRebate=money;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}

/*返利收费子类*/
class CashReturn extends CashSuper{
    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;
    public CashReturn(String moneyCondition,String moneyReturn ){
        this.moneyCondition=Double.parseDouble(moneyCondition);
        this.moneyReturn=Double.parseDouble(moneyReturn);
    }
    @Override
    public double acceptCash(double money) {
        double result=money;
        if(money>=moneyCondition){
            result=money-money/moneyCondition*moneyReturn;
        }
        return result;
    }
}

/*现金上下文*/
class CashContext{
    private CashSuper cs;
    public CashContext(CashSuper cs){
        this.cs=cs;
    }
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}

/*策略模式和简单工厂模式结合后的现金上下文*/
class CashContext2{
    CashSuper cs=null;
    public CashContext2(String type){
        switch (type){
            case "正常收费":
                CashNormal cn=new CashNormal();
                cs=cn;
                break;
            case "满300返100":
                CashReturn cr=new CashReturn("300","100");
                cs=cr;
                break;
            case "打8折":
                CashRebate crb=new CashRebate(350);
                cs=crb;
                break;
        }
    }
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}