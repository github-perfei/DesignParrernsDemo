package com.factoryFunction.product;

/**
 * jiayindaxue 大学生 雷锋 类
 */
public class JiaYinUndergraduate extends Undergraduate {

    public JiaYinUndergraduate(String name){
        this.schoolName = "JiaYinDaXue";
        this.name = name;
    }

    @Override
    public void sweep() {
        System.out.println(schoolName + "`s student " + name + " help you sweep");
    }

    @Override
    public void wash() {
        System.out.println(schoolName + "`s student " + name +  " help you wash");
    }

    @Override
    public void buyRice() {
        System.out.println(schoolName + "`s student " + name + " help you buy rice");
    }
}
