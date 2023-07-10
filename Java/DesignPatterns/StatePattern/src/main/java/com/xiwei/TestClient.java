package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Account account = new Account("张三", 0.0);
        // 存入1000
        account.deposit(1000);
        // 取出2000
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();
    }
}
