package com.xiwei.request_log;

import java.io.*;
import java.util.List;

public class FileUtil {
    public static void writeCommands(List commands) {
        try {
            FileOutputStream file = new FileOutputStream("config.log");
            //创建对象输出流用于将对象写入到文件中
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
            //将对象写入文件
            objout.writeObject(commands);
            objout.close();
        } catch (Exception e) {
            System.out.println("命令保存失败！");
            e.printStackTrace();
        }
    }

    public static List readCommands() {
        try {
            FileInputStream file = new FileInputStream("config.log");
            //创建对象输入流用于从文件中读取对象
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));
            //将文件中的对象读出并转换为List类型
            List commands = (List) objin.readObject();
            objin.close();
            return commands;
        } catch (Exception e) {
            System.out.println("命令读取失败！");
            e.printStackTrace();
            return null;
        }
    }

}
