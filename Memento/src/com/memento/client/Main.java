package com.memento.client;

import com.memento.role.Role;
import com.memento.role.RoleStateCaretaker;

public class Main {
    public static void main(String[] args){
        Role nick = new Role("nick");
        nick.show();
        System.out.println();

        // 备份状态
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(nick.saveState());

        // 大战
        nick.fight();
        System.out.println("经过大战。。。。。。");
        nick.show();
        System.out.println();

        //恢复 备份状态
        System.out.println("恢复备份状态。。。。。。");
        nick.recoveryState(roleStateCaretaker.getMemento());
        nick.show();
    }
}
