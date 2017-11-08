package com.proxy.giveGift;

import com.proxy.girl.SchoolGirl;

/**
 * 追求者类
 */
public class Pursuit implements IGiveGift{

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }
    @Override
    public void giveDolls() {
        System.out.println(mm.name + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.name + "送你玫瑰花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.name + "送你巧克力");
    }
}
