package com.xiwei;

/**
 * 帮助命令类：具体命令类
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        helpHandler = new HelpHandler();
    }

    // 命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        helpHandler.display();
    }
}
