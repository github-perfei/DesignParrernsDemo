package com.strategy.cashStrategy;

/**
 * 正常收费 策略
 */
public class CashNormal implements CashInterface {
    @Override
    public String getResult(double money) {
        return String.valueOf(money);
    }
}
