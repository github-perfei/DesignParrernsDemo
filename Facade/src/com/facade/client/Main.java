package com.facade.client;

import com.facade.facade.Facade;

public class Main {
    public static void main(String[] args){

        Facade mFacade = new Facade();

        mFacade.methodA();
        mFacade.methodB();
    }
}
