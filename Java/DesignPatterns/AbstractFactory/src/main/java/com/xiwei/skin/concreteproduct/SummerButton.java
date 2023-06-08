package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.Button;

/**
 * Summer风格按钮：具体产品
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示Summer风格按钮。");
    }
}
