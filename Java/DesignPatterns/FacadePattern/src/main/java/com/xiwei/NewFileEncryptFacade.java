package com.xiwei;

/**
 * 引入抽象外观类后
 * 新加密外观类：具体外观类
 */
public class NewFileEncryptFacade extends AbstractFileEncryptFacade {
    //维持对子系统对象的引用
    private FileReader reader;
    private NewCipherMachine cipherMachine;
    private FileWriter writer;

    public NewFileEncryptFacade() {
        reader = new FileReader();
        cipherMachine = new NewCipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
