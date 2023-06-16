package com.xiwei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件报讯类：子系统类
 */
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.print("保存密文，写入文件。");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误!");
        }
    }
}
