package com.xiwei;

/**
 * 正常状态：具体状态类
 */
public class NormalState extends AccountState {
    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState accountState) {
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
        System.out.println("正常状态，无需支付利息！");
    }

    // 状态转换
    @Override
    public void stateCheck() {
        if (account.getBalance() > -2000 & account.getBalance() <= 0) {
            // 透支状态
            account.setState(new OverdraftState(this));
        } else if (account.getBalance() == -2000) {
            // 受限状态
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限");
        }
    }
}
