package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.Label;

/**
 * Summer风格标签：具体产品
 */
public class SummerLabel implements Label {
    @Override
    public void display() {
        System.out.println("显示Summer风格标签。");
    }
}
