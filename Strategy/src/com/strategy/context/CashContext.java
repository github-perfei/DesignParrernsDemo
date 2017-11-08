package com.strategy.context;

import com.strategy.cashStrategy.CashInterface;
import com.strategy.cashStrategy.CashNormal;
import com.strategy.cashStrategy.CashRebate;
import com.strategy.cashStrategy.CashReturn;

public class CashContext  {

    public final static String CASH_TYPE_NORMAL = "正常收费";

    public final static String CASH_TYPE_REBATE = "打折";

    public final static String CASH_TYPE_RETURN = "满返";

    private CashInterface mCash = null;

    public CashContext(String cashTypeStr,double[] params ) {
        switch (cashTypeStr){
            case CASH_TYPE_NORMAL :
                mCash = new CashNormal();
                break;
            case CASH_TYPE_REBATE :
                double moneyRebate = params[0];
                mCash = new CashRebate(moneyRebate);
                break;
            case CASH_TYPE_RETURN :
                double moneyCondition = params[0];
                double moneyReturn = params[1];
                mCash = new CashReturn(moneyCondition, moneyReturn);
                break;
        }
    }

    public String getResult(double money) {
        return mCash.getResult(money);
    }
}
