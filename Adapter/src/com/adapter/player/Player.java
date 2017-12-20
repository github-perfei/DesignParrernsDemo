package com.adapter.player;

public abstract class Player {

    /**
     * 球员名字
     */
    protected String name = "";

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}
