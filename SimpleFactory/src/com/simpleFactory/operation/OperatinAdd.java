package com.simpleFactory.operation;

public class OperatinAdd extends Operation {

    @Override
    public double operate() {
        return this.getNumberA() + this.getNumberB();
    }
}
