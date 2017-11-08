package com.simpleFactory.operation;

public class OperationDiv extends Operation {

    @Override
    public double operate() throws Exception {
        if (this.getNumberB() == 0){
            throw new Exception("除数不能为零");
        }
        return this.getNumberA() / this.getNumberB();
    }
}
