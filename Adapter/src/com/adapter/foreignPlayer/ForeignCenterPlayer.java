package com.adapter.foreignPlayer;

public class ForeignCenterPlayer extends ForeignPlayer {

    public ForeignCenterPlayer(String name) {
        this.foreignName = name;
    }

    @Override
    public void foreignAttack() {
        System.out.println("外籍中锋球员" + foreignName + "进攻");
    }

    @Override
    public void foreignDefense() {
        System.out.println("外籍中锋球员" + foreignName + "防守");
    }
}
