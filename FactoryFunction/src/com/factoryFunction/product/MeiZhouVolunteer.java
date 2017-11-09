package com.factoryFunction.product;

/**
 * meizhou 志愿者 雷锋 类
 */
public class MeiZhouVolunteer extends Volunteer {

    public MeiZhouVolunteer(String name){
        this.cityName = "MeiZhou";
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
