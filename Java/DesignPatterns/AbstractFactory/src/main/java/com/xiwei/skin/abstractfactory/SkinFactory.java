package com.xiwei.skin.abstractfactory;

import com.xiwei.skin.abstractproduct.Button;
import com.xiwei.skin.abstractproduct.Label;
import com.xiwei.skin.abstractproduct.TextField;

/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public Label createLabel();
}
