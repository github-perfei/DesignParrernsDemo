package com.decorator.finery;

/**
 * T恤 装饰类
 */
public class Tshirts extends FineryImpl {
    @Override
    public void show() {
        super.show();
        System.out.print(" 大T恤 ");
    }
}
