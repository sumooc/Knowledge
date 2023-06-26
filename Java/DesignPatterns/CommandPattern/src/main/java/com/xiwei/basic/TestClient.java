package com.xiwei.basic;

import com.xiwei.common.HelpCommand;
import com.xiwei.common.MinimizeCommand;

public class TestClient {
    public static void main(String[] args) {
        FBSettingWindow settingWindow = new FBSettingWindow("功能键设置！");

        FunctionButton functionButton1 = new FunctionButton("功能键1");
        FunctionButton functionButton2 = new FunctionButton("功能键2");

        HelpCommand helpCommand = new HelpCommand();
        MinimizeCommand minimizeCommand = new MinimizeCommand();

        // 将命令对象注入功能键
        functionButton1.setCommand(helpCommand);
        functionButton2.setCommand(minimizeCommand);

        settingWindow.addFunctionButton(functionButton1);
        settingWindow.addFunctionButton(functionButton2);
        settingWindow.display();

        // 调用功能键的业务方法
        functionButton1.onClick();
        functionButton2.onClick();

    }
}
