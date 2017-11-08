package com.strategy.client;

import com.strategy.context.CashContext;

public class Main {
    public static void main( String[] args ){
        double money = 500;
        // 正常收费
        CashContext mCashContext = new CashContext(CashContext.CASH_TYPE_NORMAL,null);
        String result = mCashContext.getResult(money);
        System.out.println(result);

        // 满减收费
        double[] params1 = {300,100};
        CashContext mCashContext1 = new CashContext(CashContext.CASH_TYPE_RETURN,params1);
        String result1 = mCashContext1.getResult(money);
        System.out.println(result1);

        // 打折收费
        double[] params2 = {0.8};
        CashContext mCashContext2 = new CashContext(CashContext.CASH_TYPE_REBATE,params2);
        String result2 = mCashContext2.getResult(money);
        System.out.println(result2);
    }
}

