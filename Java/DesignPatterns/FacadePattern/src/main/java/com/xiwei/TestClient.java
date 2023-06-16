package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        FileEncryptFacade facade = new FileEncryptFacade();
        facade.fileEncrypt("path1", "path2");

        NewFileEncryptFacade newFileEncryptFacade = new NewFileEncryptFacade();
        newFileEncryptFacade.fileEncrypt("path1", "path2");
    }
}
