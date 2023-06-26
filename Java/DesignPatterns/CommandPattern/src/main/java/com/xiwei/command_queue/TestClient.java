package com.xiwei.command_queue;

import com.xiwei.common.HelpCommand;
import com.xiwei.common.MinimizeCommand;

public class TestClient {
    public static void main(String[] args) {
        FBSettingWindowCQ settingWindow = new FBSettingWindowCQ("功能键设置队列！");

        FunctionButtonCQ functionButton1 = new FunctionButtonCQ("功能键1");
        FunctionButtonCQ functionButton2 = new FunctionButtonCQ("功能键2");

        CommandQueue commandQueue = new CommandQueue();
        HelpCommand helpCommand = new HelpCommand();
        MinimizeCommand minimizeCommand = new MinimizeCommand();
        commandQueue.addCommand(helpCommand);
        commandQueue.addCommand(minimizeCommand);

        // 将命令对象注入功能键
        functionButton1.setCommandQueue(commandQueue);
        functionButton2.setCommandQueue(commandQueue);

        settingWindow.addFunctionButton(functionButton1);
        settingWindow.addFunctionButton(functionButton2);
        settingWindow.display();

        // 调用功能键的业务方法
        functionButton1.call();
        functionButton2.call();

    }
}
