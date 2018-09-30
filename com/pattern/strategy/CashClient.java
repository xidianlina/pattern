package com.pattern.strategy;

/**
 * @author lina02
 * @date 2018/9/29
 * 客户端
 */
public class CashClient {
    public static void main(String[] args) {
        CashClient cashClient=new CashClient();
        double money=cashClient.getTotal("正常收费");
        System.out.println(money);
        double total=cashClient.getTotal2("满300返100");
        System.out.println(total);
    }
    /*客户端代码*/
    private double getTotal(String type){
        CashContext cc=null;
        switch (type){
            case "正常收费":
                cc=new CashContext(new CashNormal());
                break;
            case "满300返100":
                cc=new CashContext(new CashReturn("300","100"));
                break;
            case "打8折":
                cc=new CashContext(new CashRebate(0.8));
                break;
        }
        double total=0d;
        double totalPrice=0d;
        totalPrice=cc.getResult(280);
        total+=totalPrice;
        return total;
    }
    /*策略模式和简单工厂模式结合后的客户端代码*/
    private double getTotal2(String type){
        CashContext2 cashContext=new CashContext2(type);
        double totalPrices=0d;
        totalPrices=cashContext.getResult(310);
        return totalPrices;
    }
}