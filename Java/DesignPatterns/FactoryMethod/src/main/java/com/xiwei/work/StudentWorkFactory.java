package com.xiwei.work;

/**
 * 具体工厂
 */
public class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
