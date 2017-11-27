package com.builder.builder;

public class TwoKfcPackageBuilder implements Builder {

    private KfcPackage mKfcPackage;

    public TwoKfcPackageBuilder() {
        this.mKfcPackage = new KfcPackage();
    }

    @Override
    public void setMainFood() {
        MainFood chickenRoll = new MainFood("chickenRoll");
        mKfcPackage.setmMainFood(chickenRoll);
    }

    @Override
    public void setDrink() {
        Drink coffee = new Drink("coffee");
        mKfcPackage.setmDrink(coffee);
    }

    @Override
    public KfcPackage getKfcPackage() {
        return mKfcPackage;
    }
}
