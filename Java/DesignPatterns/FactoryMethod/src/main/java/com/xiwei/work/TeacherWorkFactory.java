package com.xiwei.work;

/**
 * 具体工厂
 */
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
