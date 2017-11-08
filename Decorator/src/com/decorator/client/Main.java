package com.decorator.client;

import com.decorator.finery.BigTrouser;
import com.decorator.finery.Tshirts;
import com.decorator.person.Person;

public class Main {
    public static void main(String[] args) {
        // 创建被装饰者 对象
        Person person = new Person("perfei");
        // 创建装饰者 对象
        Tshirts tshirts = new Tshirts();
        BigTrouser bigTrouser = new BigTrouser();
        // 装饰者对象 装饰
        // 人穿上T恤 垮裤
        tshirts.adress(person);
        bigTrouser.adress(tshirts);
        // 装饰好后 展示穿着
        bigTrouser.show();
    }
}
