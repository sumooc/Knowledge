package com.xiwei.hookmethod;

public class TestClient {
    public static void main(String[] args) {
        DataViewer subDataViewer = new SubDataViewer();
        subDataViewer.process();
    }
}
