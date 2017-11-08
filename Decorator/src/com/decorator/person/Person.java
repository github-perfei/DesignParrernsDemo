package com.decorator.person;

import com.decorator.finery.Finery;

/**
 * 被装饰者类 人
 */
public class Person implements Finery{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print(name + "穿着:" );
    }
}
