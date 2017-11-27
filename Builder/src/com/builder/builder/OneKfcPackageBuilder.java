package com.builder.builder;

public class OneKfcPackageBuilder implements Builder {
    private KfcPackage mKfcPackage;

    public OneKfcPackageBuilder() {
        this.mKfcPackage = new KfcPackage();
    }

    @Override
    public void setMainFood() {
        MainFood hamburger = new MainFood("hamburger");
        mKfcPackage.setmMainFood(hamburger);
    }

    @Override
    public void setDrink() {
        Drink coke = new Drink("coke");
        mKfcPackage.setmDrink(coke);
    }

    @Override
    public KfcPackage getKfcPackage() {
        return mKfcPackage;
    }
}
