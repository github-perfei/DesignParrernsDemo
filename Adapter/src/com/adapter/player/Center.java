package com.adapter.player;

public class Center extends Player {

    public Center(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("中锋球员" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋球员" + name + "防守");
    }
}
