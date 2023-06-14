package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        // 针对抽象构件编程
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
        folder1 = new Folder("张三的资料");
        folder2 = new Folder("图像文件夹");
        folder3 = new Folder("文本文件夹");
        folder4 = new Folder("视频文件夹");

        file1 = new ImageFile("张三.jpg");
        file2 = new ImageFile("李四.png");
        file3 = new TextFile("亮剑小说.txt");
        file4 = new TextFile("杀毒软件产品说明书.docx");
        file5 = new VideoFile("赘婿.MP4");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        //从 张三的资料 节点开始进行杀毒操作
        folder1.killVirus();
    }

}
