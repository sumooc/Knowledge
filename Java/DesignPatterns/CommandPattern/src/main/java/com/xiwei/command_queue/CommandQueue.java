package com.xiwei.command_queue;

import com.xiwei.common.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令队列实现
 * 命令队列
 * 当一个请求发送者发送一个请求时，不止一个请求接收者产生响应，这些请求接收者将逐个执行业务方法，完成对请求的处理。
 */
public class CommandQueue {
    // 存储命令的队列
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    // 循环调用每个命令对象的execute()方法
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
