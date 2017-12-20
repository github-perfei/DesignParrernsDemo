package com.adapter.player;

/**
 * 前锋类
 */
public class Forwards extends Player {

    public Forwards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("前锋球员" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋球员" + name + "防守");
    }
}
