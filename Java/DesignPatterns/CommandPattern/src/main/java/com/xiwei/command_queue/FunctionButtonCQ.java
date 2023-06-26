package com.xiwei.command_queue;

/**
 * 增加了命令队列类CommandQueue以后，请求发送者类针对CommandQueue编程。
 * 功能键类：请求发送者
 */
public class FunctionButtonCQ {
    // 功能键名称
    private String name;
    // 维持一个抽象命令对象的引用
    //private Command command;
    private CommandQueue commandQueue;

    public FunctionButtonCQ(String name) {
        this.name = name;
    }

    //构造注入
    public FunctionButtonCQ(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public String getName() {
        return name;
    }

    // 设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    // 调用CommandQueue类的execute()方法
    public void call() {
        System.out.println("点击功能键：");
        commandQueue.execute();
    }
}
