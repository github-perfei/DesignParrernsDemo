package com.decorator.finery;

/**
 * 垮裤 装饰类
 */
public class BigTrouser extends FineryImpl {

    @Override
    public void show() {
        super.show();
        System.out.print(" 垮裤 ");
    }
}
