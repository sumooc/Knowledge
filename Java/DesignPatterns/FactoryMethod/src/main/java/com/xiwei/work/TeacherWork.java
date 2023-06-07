package com.xiwei.work;

/**
 * ConcreteProduct 具体产品
 * Work接口的具体实现类
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师在做事情！");
    }
}
