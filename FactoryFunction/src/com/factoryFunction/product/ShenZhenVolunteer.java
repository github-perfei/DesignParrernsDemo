package com.factoryFunction.product;

/**
 * shenzhen 志愿者 雷锋 类
 */
public class ShenZhenVolunteer extends Volunteer {

    public ShenZhenVolunteer(String name) {
        this.cityName = "ShenZhen";
        this.name = name;
    }

    @Override
    public void sweep() {
        System.out.println(cityName + "`s volunteer " + name +  " help you sweep");
    }

    @Override
    public void wash() {
        System.out.println(cityName + "`s volunteer " + name +  " help you wash");
    }

    @Override
    public void buyRice() {
        System.out.println(cityName + "`s volunteer " + name +  " help you buy rice");
    }
}
