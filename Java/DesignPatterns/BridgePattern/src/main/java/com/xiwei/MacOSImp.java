package com.xiwei;

/**
 * MacOS操作系统实现类：具体实现类
 */
public class MacOSImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        // 调用MacOS系统的绘制函数绘制像素矩阵
        System.out.println("在MacOS操作系统中显示图像：");
    }

}
