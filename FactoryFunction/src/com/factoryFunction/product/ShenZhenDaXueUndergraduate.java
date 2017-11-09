package com.factoryFunction.product;

/**
 * shenzhendaxue 大学生 雷锋 类
 */
public class ShenZhenDaXueUndergraduate extends Undergraduate {

    public ShenZhenDaXueUndergraduate(String name) {
        this.schoolName = "ShenZhenDaXue";
        this.name = name;
    }

    @Override
    public void sweep() {
        System.out.println(schoolName + "`s student " + name + " help you sweep");
    }

    @Override
    public void wash() {
        System.out.println(schoolName + "`s student " + name + " help you wash");
    }

    @Override
    public void buyRice() {
        System.out.println(schoolName + "`s student " + name + " help you buy rice");
    }
}
