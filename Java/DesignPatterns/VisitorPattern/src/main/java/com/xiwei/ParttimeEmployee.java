package com.xiwei;

/**
 * 兼职员工类：具体元素类
 */
public class ParttimeEmployee implements Employee {
    //员工姓名
    private String name;
    //员工时薪
    private double hourWage;
    //工作时间
    private int workTime;

    public ParttimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        // 调用访问者的访问方法
        handler.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
