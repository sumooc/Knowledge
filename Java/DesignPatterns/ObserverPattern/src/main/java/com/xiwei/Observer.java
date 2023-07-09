package com.xiwei;

/**
 * 抽象观察者类
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    // 支援盟友的方法
    public void help();

    // 遭受攻击的方法
    public void beAttacked(AllyControlCenter controlCenter);
}
