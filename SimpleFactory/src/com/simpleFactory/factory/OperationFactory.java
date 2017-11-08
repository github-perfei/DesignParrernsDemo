package com.simpleFactory.factory;

import com.simpleFactory.operation.*;

/**
 * 运算工厂类
 */
public class OperationFactory {

    public final static String OPERATION_ADD_STRING = "+";
    public final static String OPERATION_SUB_STRING = "-";
    public final static String OPERATION_MUL_STRING = "*";
    public final static String OPERATION_DIV_STRING = "/";

    /**
     * 获取具体运算类
     */
    public static Operation getOperation(String operationStr){
        Operation operation = null;
        switch (operationStr){
            case OPERATION_ADD_STRING :
                operation = new OperatinAdd();
                break;
            case OPERATION_SUB_STRING :
                operation = new OperationSub();
                break;
            case OPERATION_MUL_STRING :
                operation = new OperationMul();
                break;
            case OPERATION_DIV_STRING :
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }

}
