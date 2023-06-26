package com.xiwei.request_log;

/**
 * 修改命令类：具体命令
 */
public class ModifyComand extends Command {
    public ModifyComand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.modify(this.cmdParam);
    }

    @Override
    public void execute(String cmdParam) {
        this.cmdParam = cmdParam;
        configOperator.modify(cmdParam);
    }
}
