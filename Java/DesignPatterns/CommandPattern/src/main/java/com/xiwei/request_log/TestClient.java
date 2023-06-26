package com.xiwei.request_log;

public class TestClient {
    public static void main(String[] args) {
        // 请求发送者
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        // 命令对象
        Command command;
        //请求接收者
        ConfigOperator configOperator = new ConfigOperator();

        // 4次对配置文件的操作
        command = new InsertComand("插入");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        command = new InsertComand("插入");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("端口号");

        command = new ModifyComand("修改");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        command = new ModifyComand("修改");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        System.out.println("----------------------------------------");
        System.out.println("保存配置！");
        configSettingWindow.save();

        System.out.println("----------------------------------------");
        System.out.println("恢复配置");
        System.out.println("----------------------------------------");
        configSettingWindow.recover();
    }
}
