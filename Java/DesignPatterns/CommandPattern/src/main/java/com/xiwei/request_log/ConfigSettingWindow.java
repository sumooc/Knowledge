package com.xiwei.request_log;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置文件设置窗口类：请求发送者
 */
public class ConfigSettingWindow {
    // 存储每次操作时的命令对象
    private List<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行配置文件修改命令，同时将命令对象添加到命令集合中
    public void call(String cmdParam) {
        command.execute(cmdParam);
        commands.add(command);
    }

    //记录请求日志，生成日志文件，将命令集合写入日志文件
    public void save() {
        FileUtil.writeCommands(commands);
    }

    //从日志文件中提取命令集合，并循环调用每一个命令对象的execute（）方法来实现配置文件的重新设置
    public void recover() {
        List List = FileUtil.readCommands();
        for (Object obj : List) {
            ((Command) obj).execute();
        }
    }
}
