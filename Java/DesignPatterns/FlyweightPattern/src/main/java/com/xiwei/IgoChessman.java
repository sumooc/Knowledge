package com.xiwei;

/**
 * 围棋棋子类：抽象享元类
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子的颜色：" + this.getColor() + ",棋子的位置：(" + coordinates.getX() + "," + coordinates.getY() + ")");
    }
}
