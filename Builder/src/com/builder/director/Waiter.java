package com.builder.director;

import com.builder.builder.Builder;
import com.builder.builder.KfcPackage;

public class Waiter {
    private Builder mBuilder;

    public void setmBuilder(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void preparePackage(){
        mBuilder.setDrink();
        mBuilder.setMainFood();
    }

    public KfcPackage getKfcPackage(){
        return mBuilder.getKfcPackage();
    }
}
