package com.xiwei.command_queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindowCQ {
    // 窗口标题
    private String title;
    // 存储所有功能键
    private List<FunctionButtonCQ> functionButtons = new ArrayList<>();

    public FBSettingWindowCQ(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButtonCQ functionButton) {
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButtonCQ functionButton) {
        functionButtons.remove(functionButton);
    }

    public void display() {
        System.out.println("显示窗口" + this.title);
        System.out.println("显示功能键：");
        for (Object functionButton : functionButtons) {
            System.out.println(((FunctionButtonCQ) functionButton).getName());
        }
    }
}
