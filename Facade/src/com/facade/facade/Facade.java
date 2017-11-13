package com.facade.facade;

import com.facade.subSystem.SubSystemFour;
import com.facade.subSystem.SubSystemOne;
import com.facade.subSystem.SubSystemThree;
import com.facade.subSystem.SubSystemTwo;

public class Facade {
    private SubSystemOne mSubSystemOne;
    private SubSystemTwo mSubSystemTwo;
    private SubSystemThree mSubSystemThree;
    private SubSystemFour mSubSystemFour;

    public Facade(){
        mSubSystemOne = new SubSystemOne();
        mSubSystemTwo = new SubSystemTwo();
        mSubSystemThree = new SubSystemThree();
        mSubSystemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A：");
        mSubSystemOne.methodOne();
        mSubSystemTwo.methodTwo();
    }

    public void methodB(){
        System.out.println("方法组B：");
        mSubSystemThree.methodThree();
        mSubSystemFour.methodFour();
    }
}
