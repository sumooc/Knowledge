package com.xiwei;

/**
 * 部门类：抽象访问者类
 */
public abstract class Department {
    // 用于访问不同类型的具体元素的一组方法
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
