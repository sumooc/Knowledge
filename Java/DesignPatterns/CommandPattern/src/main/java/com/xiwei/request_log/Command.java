package com.xiwei.request_log;

import java.io.Serializable;

/**
 * request_log里是请求日志是完整实现方案，没使用到其他包里的类
 * --------------------------------------------------
 * 抽象命令类
 */
public abstract class Command implements Serializable {
    // 命令名称
    protected String name;
    // 命令参数
    protected String cmdParam;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    // 声明两个抽象的执行方法execute()
    public abstract void execute();

    public abstract void execute(String cmdParam);
}
