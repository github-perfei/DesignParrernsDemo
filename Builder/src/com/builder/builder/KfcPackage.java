package com.builder.builder;

/**
 * 套餐类  产品类
 */
public class KfcPackage {
    private MainFood mMainFood;
    private Drink mDrink;

    public MainFood getmMainFood() {
        return mMainFood;
    }

    public void setmMainFood(MainFood mMainFood) {
        this.mMainFood = mMainFood;
    }

    public Drink getmDrink() {
        return mDrink;
    }

    public void setmDrink(Drink mDrink) {
        this.mDrink = mDrink;
    }

    public void showPackage(){
        System.out.println("套餐详情:");
        System.out.println("饮料为" + mDrink.getDrinkName());
        System.out.println("主食为" + mMainFood.getMainFoodName());
    }
}
