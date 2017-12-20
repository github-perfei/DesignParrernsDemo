package com.adapter.foreignPlayer;

public abstract class ForeignPlayer {
    /**
     * 球员名字
     */
    protected String foreignName = "";

    /**
     * 进攻
     */
    public abstract void foreignAttack();

    /**
     * 防守
     */
    public abstract void foreignDefense();
}
