package com.xiwei;

public class StudentWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
