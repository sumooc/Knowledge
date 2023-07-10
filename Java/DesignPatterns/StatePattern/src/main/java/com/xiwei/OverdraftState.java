package com.xiwei;

/**
 * 透支状态：具体状态类
 */
public class OverdraftState extends AccountState {

    public OverdraftState(AccountState accountState) {
        this.account = accountState.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    // 状态转换
    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            // 正常状态
            account.setState(new NormalState(this));
        } else if (account.getBalance() == -2000) {
            // 受限状态
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限");
        }
    }
}
