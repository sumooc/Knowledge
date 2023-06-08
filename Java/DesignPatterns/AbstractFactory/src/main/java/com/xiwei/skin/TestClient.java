package com.xiwei.skin;

import com.xiwei.skin.abstractfactory.SkinFactory;
import com.xiwei.skin.abstractproduct.Button;
import com.xiwei.skin.abstractproduct.Label;
import com.xiwei.skin.abstractproduct.TextField;
import com.xiwei.skin.concretefactory.SpringSkinFactory;

public class TestClient {
    public static void main(String[] args) {
        SkinFactory springSkinFactory = new SpringSkinFactory();
        Button button = springSkinFactory.createButton();
        button.display();
        TextField textField = springSkinFactory.createTextField();
        textField.display();
        Label label = springSkinFactory.createLabel();
        label.display();
    }
}
