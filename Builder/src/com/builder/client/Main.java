package com.builder.client;

import com.builder.builder.KfcPackage;
import com.builder.builder.OneKfcPackageBuilder;
import com.builder.builder.TwoKfcPackageBuilder;
import com.builder.director.Waiter;

public class Main {
    public static void main(String[] args){
        OneKfcPackageBuilder oneKfcPackageBuilder = new OneKfcPackageBuilder();
        TwoKfcPackageBuilder twoKfcPackageBuilder = new TwoKfcPackageBuilder();
        Waiter waiter = new Waiter();

        // 顾客A需要套餐一
        waiter.setmBuilder(oneKfcPackageBuilder);
        waiter.preparePackage();
        KfcPackage oneKfcPackage = waiter.getKfcPackage();
        oneKfcPackage.showPackage();

        // 顾客B需要套餐二
        waiter.setmBuilder(twoKfcPackageBuilder);
        waiter.preparePackage();
        KfcPackage twoKfcPackage = waiter.getKfcPackage();
        twoKfcPackage.showPackage();
    }
}
