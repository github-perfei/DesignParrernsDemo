package com.simpleFactory.operation;

/**
 * 运算类 基类
 */
public abstract class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public Operation(){

    }
    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public String getResult() throws Exception {
        double result = this.operate();
        return String.format("%.2f",result);
    }
    /**
     * 子类 需要实现的方法
     */
    public abstract double operate() throws Exception;

}
