package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        currentAccount.handle("zhangsan", "123456");

        Account savingAccount = new SavingAccount();
        savingAccount.handle("lisi", "123456");
    }
}
