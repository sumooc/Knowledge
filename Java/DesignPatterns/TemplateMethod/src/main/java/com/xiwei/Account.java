package com.xiwei;

/**
 * 账户类：抽象类
 * 基本方法是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为3种：
 * 抽象方法（Abstract Method）、具体方法（Concrete Method）和钩子方法（Hook Method）。
 */
public abstract class Account {
    // 基本方法——具体方法
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        if (account.equalsIgnoreCase("zhangsan") && password.equalsIgnoreCase("123456")) {
            return true;
        } else {
            return false;
        }
    }

    // 基本方法——抽象方法
    public abstract void calculateInterest();

    // 基本方法——具体方法
    public void display() {
        System.out.println("显示利息！");
    }

    // 模板方法
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或者用户名错误！");
            System.out.println("退出");
        }
        calculateInterest();
        display();
    }
}
