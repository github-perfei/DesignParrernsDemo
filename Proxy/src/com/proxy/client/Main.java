package com.proxy.client;

import com.proxy.girl.SchoolGirl;
import com.proxy.giveGift.Proxy;

public class Main {
    public static void main(String[] args) {
        SchoolGirl Amy = new SchoolGirl("Amy");
        Proxy proxy = new Proxy(Amy);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
