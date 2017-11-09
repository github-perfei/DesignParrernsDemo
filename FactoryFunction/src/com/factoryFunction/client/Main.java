package com.factoryFunction.client;

import com.factoryFunction.factory.ILeiFengFactory;
import com.factoryFunction.factory.UndergraduateFactory;
import com.factoryFunction.factory.VolunteerFactory;
import com.factoryFunction.product.ILeiFeng;

public class Main {
    public static void main(String[] args) {
        // 深大学生 学雷锋做好事
        ILeiFengFactory mILeiFengFactory = new UndergraduateFactory();
        ILeiFeng leiFeng = mILeiFengFactory.createLeiFeng(UndergraduateFactory.SHENDAUNDERGRADUATE, "Amy");
        leiFeng.wash();
        leiFeng.sweep();
        leiFeng.buyRice();
        System.out.println();

        // 嘉大学生 学雷锋做好事
        leiFeng = mILeiFengFactory.createLeiFeng(UndergraduateFactory.JIAYINUNDERGRADUATE,"Page");
        leiFeng.wash();
        leiFeng.sweep();
        leiFeng.buyRice();
        System.out.println();

        // 梅州志愿者 学雷锋做好事
        mILeiFengFactory = new VolunteerFactory();
        leiFeng = mILeiFengFactory.createLeiFeng(VolunteerFactory.MEIZHOUVOLUNTEER,"Nick");
        leiFeng.wash();
        leiFeng.sweep();
        leiFeng.buyRice();
        System.out.println();

        // 深圳志愿者 学雷锋做好事
        leiFeng = mILeiFengFactory.createLeiFeng(VolunteerFactory.SHENZHENVOLUNTEER,"Park");
        leiFeng.wash();
        leiFeng.sweep();
        leiFeng.buyRice();
        System.out.println();
    }
}
