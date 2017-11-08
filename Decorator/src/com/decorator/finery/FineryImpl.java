package com.decorator.finery;

/**
 * 装饰者 包装类 抽象类 基类
 */
public abstract class FineryImpl implements Finery {
    private Finery mFinery;

    public void adress(Finery mFinery){
        this.mFinery = mFinery;
    }

    @Override
    public void show() {
        mFinery.show();
    }
}
