package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        // 定义具体构件
        Component component = new Window();
        // 定义装饰后的构件
        Component scrollBarDecorator = new ScrollBarDecorator(component);
        scrollBarDecorator.display();
    }
}
