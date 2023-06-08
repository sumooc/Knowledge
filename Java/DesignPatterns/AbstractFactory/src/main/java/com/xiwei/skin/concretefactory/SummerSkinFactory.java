package com.xiwei.skin.concretefactory;

import com.xiwei.skin.abstractfactory.SkinFactory;
import com.xiwei.skin.abstractproduct.Button;
import com.xiwei.skin.abstractproduct.Label;
import com.xiwei.skin.abstractproduct.TextField;
import com.xiwei.skin.concreteproduct.*;

/**
 * Summer风格皮肤工厂：具体工厂
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public Label createLabel() {
        return new SummerLabel();
    }
}
