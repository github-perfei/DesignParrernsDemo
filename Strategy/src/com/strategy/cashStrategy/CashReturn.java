package com.strategy.cashStrategy;

/**
 * 满减收费 策略
 */
public class CashReturn implements CashInterface {

    private double moneyCondition = 0;
    private double moneyReturn = 0;
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public String getResult(double money) {
        double result = money;
        if (result >= moneyCondition){
            result = result - moneyReturn;
        }
        return String.valueOf(result);
    }
}
