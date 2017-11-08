package com.simpleFactory.client;

import com.simpleFactory.factory.OperationFactory;
import com.simpleFactory.operation.Operation;

public class Main {
    public static void main (String[] args){
        String operationStr = OperationFactory.OPERATION_ADD_STRING;
        // 运算工厂 获取具体运算对象
        Operation operation = OperationFactory.getOperation(operationStr);
        // 设置属性
        operation.setNumberA(100.22);
        operation.setNumberB(12);
        try {
            // 调用运算对象的 获取运算结果的行为
            String result = operation.getResult();
            System.out.printf(operation.getNumberA() + operationStr + operation.getNumberB() + " = " + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.printf(e.getMessage());
        }
    }
}
