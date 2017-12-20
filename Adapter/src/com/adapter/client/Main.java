package com.adapter.client;

import com.adapter.foreignPlayer.ForeignCenterPlayer;
import com.adapter.foreignPlayer.ForeignPlayer;
import com.adapter.player.ChineseTranslator;
import com.adapter.player.Forwards;
import com.adapter.player.Guards;
import com.adapter.player.Player;

public class Main {
    public static void main(String[] args){
        // 球员 翻译 集合
        Player B = new Forwards("巴蒂尔");
        Player M = new Guards("麦格雷迪");
        ForeignPlayer Yao = new ForeignCenterPlayer("姚明");
        ChineseTranslator YaoTranslator = new ChineseTranslator(Yao);

        // 教练布置进攻战术
        B.attack();
        M.attack();
        YaoTranslator.attack();

        // 教练布置防守战术
        B.defense();
        M.defense();
        YaoTranslator.defense();
    }
}
