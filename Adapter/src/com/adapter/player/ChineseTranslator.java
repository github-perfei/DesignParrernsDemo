package com.adapter.player;

import com.adapter.foreignPlayer.ForeignPlayer;

/**
 * 翻译 适配器类
 */
public class ChineseTranslator extends Player {

    private ForeignPlayer mForeignPlayer;

    public ChineseTranslator(ForeignPlayer mForeignPlayer) {
        this.mForeignPlayer = mForeignPlayer;
    }

    @Override
    public void attack() {
        if (mForeignPlayer != null){
            mForeignPlayer.foreignAttack();
        }
    }

    @Override
    public void defense() {
        if (mForeignPlayer != null){
            mForeignPlayer.foreignDefense();
        }
    }
}
