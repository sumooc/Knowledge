package com.xiwei;

/**
 * 未引入抽象外观类后
 * 外观类
 */
public class FileEncryptFacade {
    //维持对子系统对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public FileEncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
