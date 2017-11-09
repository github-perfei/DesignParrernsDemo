package com.factoryFunction.factory;


import com.factoryFunction.product.ILeiFeng;
import com.factoryFunction.product.JiaYinUndergraduate;
import com.factoryFunction.product.ShenZhenDaXueUndergraduate;

/**
 * 大学生“雷锋” 工厂
 */
public class UndergraduateFactory implements ILeiFengFactory {
    public final static String SHENDAUNDERGRADUATE = "深大学生";
    public final static String JIAYINUNDERGRADUATE = "嘉应学生";
    @Override
    public ILeiFeng createLeiFeng(String typeName,String leiFengName) {
        ILeiFeng mILeiFeng = null;
        switch (typeName){
            case SHENDAUNDERGRADUATE :
                mILeiFeng = new ShenZhenDaXueUndergraduate(leiFengName);
                break;
            case JIAYINUNDERGRADUATE :
                mILeiFeng = new JiaYinUndergraduate(leiFengName);
                break;
        }
        return mILeiFeng;
    }
}
