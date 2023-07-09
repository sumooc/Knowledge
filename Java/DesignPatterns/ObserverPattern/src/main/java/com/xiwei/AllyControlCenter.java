package com.xiwei;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类：目标类
 */
public abstract class AllyControlCenter {
    // 战队名称
    protected String allyName;

    // 存储战队成员
    protected List<Observer> players = new ArrayList<>();

    // 注册方法
    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
        players.add(observer);
    }

    // 通知方法
    public abstract void notifyObserver(String name);

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }


}
