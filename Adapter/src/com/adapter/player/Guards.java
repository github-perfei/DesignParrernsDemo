package com.adapter.player;

public class Guards extends Player {
    public Guards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("后卫球员" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫球员" + name + "防守");
    }
}
