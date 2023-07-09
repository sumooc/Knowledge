package com.xiwei;

/**
 * 战队成员类：具体观察者类
 */
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    // 当遭受到攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
    @Override
    public void beAttacked(AllyControlCenter controlCenter) {
        System.out.println(this.name + "被攻击");
        controlCenter.notifyObserver(name);
    }
}
