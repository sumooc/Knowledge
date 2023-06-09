package com.xiwei;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类：容器构件
 */
public class Folder extends AbstractFile {
    //定义集合fileList用于存储AbstractFile类型的成员
    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹'" + name + "'进行杀毒");
        //递归调用成员构件的killVirus方法
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirus();
        }
    }
}
