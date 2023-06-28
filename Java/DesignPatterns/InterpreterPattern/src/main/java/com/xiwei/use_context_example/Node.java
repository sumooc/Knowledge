package com.xiwei.use_context_example;

public abstract class Node {
    // 用于解释语句
    public abstract void interpret(Context context);

    // 用于执行标记对应的命令
    public abstract void execute();
}
