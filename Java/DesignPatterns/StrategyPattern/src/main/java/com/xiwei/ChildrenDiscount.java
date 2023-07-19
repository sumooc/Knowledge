package com.xiwei;

/**
 * 儿童票折扣价：具体策略类
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        if (price >= 20) {
            return price - 10;
        } else {
            return price;
        }
    }
}
