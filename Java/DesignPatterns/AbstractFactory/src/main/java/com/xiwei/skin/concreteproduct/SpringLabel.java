package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.Label;

/**
 * Spring风格标签：具体产品
 */
public class SpringLabel implements Label {
    @Override
    public void display() {
        System.out.println("显示Spring风格标签。");
    }
}
