package com.xiwei.request_log;

/**
 * 插入命令类：具体命令
 */
public class InsertComand extends Command {
    public InsertComand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.insert(this.cmdParam);
    }

    @Override
    public void execute(String cmdParam) {
        this.cmdParam = cmdParam;
        configOperator.insert(cmdParam);
    }
}
