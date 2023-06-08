package com.xiwei.skin.concretefactory;

import com.xiwei.skin.abstractfactory.SkinFactory;
import com.xiwei.skin.abstractproduct.Button;
import com.xiwei.skin.abstractproduct.Label;
import com.xiwei.skin.abstractproduct.TextField;
import com.xiwei.skin.concreteproduct.SpringButton;
import com.xiwei.skin.concreteproduct.SpringLabel;
import com.xiwei.skin.concreteproduct.SpringTextField;

/**
 * Spring风格皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public Label createLabel() {
        return new SpringLabel();
    }
}
