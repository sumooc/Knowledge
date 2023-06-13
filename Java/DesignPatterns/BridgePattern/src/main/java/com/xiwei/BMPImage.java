package com.xiwei;

/**
 * BMP格式图像：扩充抽象类
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileNane) {
        // 模拟解析BMP文件并获得一个像素矩阵m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileNane + "，格式为BMP");
    }
}
