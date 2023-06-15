package com.xiwei;

/**
 * 图像文件类：叶子构件
 * 叶子对象不可能有下一个层次的对象，即不可能包含成员对象
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("对不起，不支持该方法-add");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("对不起，不支持该方法-remove");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法-getChild");
        return null;
    }

    @Override
    public void killVirus() {
        // 执行杀毒操作
        System.out.println("对图像文件'" + name + "'进行杀毒");
    }
}
