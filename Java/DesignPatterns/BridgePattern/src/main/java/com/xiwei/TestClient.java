package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        Image jpgImage = new JPGImage();
        ImageImp windowsImp = new WindowsImp();
        jpgImage.setImageImp(windowsImp);
        jpgImage.parseFile("张三");
    }
}
