package com.simpleFactory.operation;

public class OperationSub extends Operation{

    @Override
    public double operate() {
        return this.getNumberA() - this.getNumberB();
    }
}
