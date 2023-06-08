package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.Button;

/**
 * Spring风格按钮：具体产品
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示Spring风格按钮。");
    }
}
