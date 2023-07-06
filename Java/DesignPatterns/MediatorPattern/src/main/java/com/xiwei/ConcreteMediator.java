package com.xiwei;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    public Button button;
    public ListBox listBox;
    public TextBox userNameTextBox;
    public ComboBox comboBox;

    // 封装同事对象之间的交互
    @Override
    public void componentChanged(Component component) {
        // 单击按钮
        if (component == button) {
            System.out.println("======单击增加按钮=====");
            listBox.update();
            comboBox.update();
            userNameTextBox.update();
        }

        // 从列表框选择客户
        if (component == listBox) {
            System.out.println("======从列表框选择客户=====");
            comboBox.select();
            userNameTextBox.setText();
        }

        // 从组合框选择客户
        if (component == comboBox) {
            System.out.println("======从组合框选择客户=====");
            listBox.select();
            userNameTextBox.setText();
        }
    }
}
