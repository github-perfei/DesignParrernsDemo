package com.factoryFunction.factory;

import com.factoryFunction.product.ILeiFeng;

/**
 * “雷锋”工厂接口
 */
public interface ILeiFengFactory {
    ILeiFeng createLeiFeng(String typeName,String leiFengName);
}
