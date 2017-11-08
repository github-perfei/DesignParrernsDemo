package com.strategy.cashStrategy;

/**
 * 打折收费 策略
 */
public class CashRebate implements CashInterface {

    // 折扣
    private double moneyRebate = 0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public String getResult(double money) {
        return String.valueOf((float) (money * moneyRebate));
    }
}
