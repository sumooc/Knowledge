package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.TextField;

/**
 * Spring风格文本框：具体产品
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示Spring风格文本框。");
    }
}
