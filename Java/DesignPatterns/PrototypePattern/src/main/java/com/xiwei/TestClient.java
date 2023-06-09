package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype("prototype");
        System.out.println(prototype1.getName());
        Prototype prototype2 = (Prototype) prototype1.clone();
        System.out.println(prototype2.getName());
    }
}
