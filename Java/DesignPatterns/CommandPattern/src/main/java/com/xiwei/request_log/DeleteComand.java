package com.xiwei.request_log;

/**
 * 删除命令类：具体命令
 */
public class DeleteComand extends Command {
    public DeleteComand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.delete(this.cmdParam);
    }

    @Override
    public void execute(String cmdParam) {
        this.cmdParam = cmdParam;
        configOperator.delete(cmdParam);
    }
}
