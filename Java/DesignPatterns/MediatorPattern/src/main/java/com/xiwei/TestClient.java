package com.xiwei;

public class TestClient {

    public static void main(String[] args) {
        // 中介对象
        ConcreteMediator concreteMediator = new ConcreteMediator();

        // 同事对象
        Button addButton = new Button();
        ListBox listBox = new ListBox();
        ComboBox comboBox = new ComboBox();
        TextBox usernameTextBox = new TextBox();

        addButton.setMediator(concreteMediator);
        listBox.setMediator(concreteMediator);
        comboBox.setMediator(concreteMediator);
        usernameTextBox.setMediator(concreteMediator);

        concreteMediator.button = addButton;
        concreteMediator.listBox = listBox;
        concreteMediator.comboBox = comboBox;
        concreteMediator.userNameTextBox = usernameTextBox;

        addButton.changed();
        System.out.println("***********************************");
        listBox.changed();

        System.out.println("#########################################################");
        ///////////////////////////////////////////////////////////////////////////

        // 新增文本标签组件后
        SubConcreteMediator subConcreteMediator = new SubConcreteMediator();
        Label label = new Label();

        addButton.setMediator(subConcreteMediator);
        listBox.setMediator(subConcreteMediator);
        comboBox.setMediator(subConcreteMediator);
        usernameTextBox.setMediator(subConcreteMediator);
        label.setMediator(subConcreteMediator);


        subConcreteMediator.button = addButton;
        subConcreteMediator.listBox = listBox;
        subConcreteMediator.comboBox = comboBox;
        subConcreteMediator.userNameTextBox = usernameTextBox;
        subConcreteMediator.label = label;

        addButton.changed();
        System.out.println("***********************************");
        listBox.changed();
    }

}
