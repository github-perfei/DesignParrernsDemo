package com.factoryFunction.factory;

import com.factoryFunction.product.ILeiFeng;
import com.factoryFunction.product.MeiZhouVolunteer;
import com.factoryFunction.product.ShenZhenVolunteer;

/**
 * 志愿者“雷锋” 工厂
 */
public class VolunteerFactory implements ILeiFengFactory {

    public final static String SHENZHENVOLUNTEER = "深圳志愿者";
    public final static String MEIZHOUVOLUNTEER = "梅州志愿者";

    @Override
    public ILeiFeng createLeiFeng(String typeName,String leiFengName) {
        ILeiFeng mILeiFeng = null;
        switch (typeName){
            case SHENZHENVOLUNTEER :
                mILeiFeng = new ShenZhenVolunteer(leiFengName);
                break;
            case MEIZHOUVOLUNTEER :
                mILeiFeng = new MeiZhouVolunteer(leiFengName);
                break;
        }
        return mILeiFeng;
    }
}
