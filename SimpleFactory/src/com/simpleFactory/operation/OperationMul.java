package com.simpleFactory.operation;

public class OperationMul extends Operation {

    @Override
    public double operate() {
        return this.getNumberA() * this.getNumberB();
    }
}
