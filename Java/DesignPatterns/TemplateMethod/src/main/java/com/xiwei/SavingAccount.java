package com.xiwei;

/**
 * 定期账户类：具体子类
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
