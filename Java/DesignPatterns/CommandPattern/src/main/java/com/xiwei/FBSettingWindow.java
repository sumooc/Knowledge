package com.xiwei;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    // 窗口标题
    private String title;
    // 存储所有功能键
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton functionButton) {
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton) {
        functionButtons.remove(functionButton);
    }

    public void display() {
        System.out.println("显示窗口" + this.title);
        System.out.println("显示功能键：");
        for (Object functionButton : functionButtons) {
            System.out.println(((FunctionButton) functionButton).getName());
        }
    }
}
