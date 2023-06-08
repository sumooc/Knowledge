package com.xiwei.skin.concreteproduct;

import com.xiwei.skin.abstractproduct.TextField;

/**
 * Summer风格文本框：具体产品
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示Summer风格文本框。");
    }
}
