package com.xiwei.work;

/**
 * 具体产品
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生在做事情！");
    }
}
