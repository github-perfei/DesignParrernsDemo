package com.proxy.giveGift;

import com.proxy.girl.SchoolGirl;

/**
 * 代理类
 */
public class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm){
        this.gg = new Pursuit(mm);
    }
    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
