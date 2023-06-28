package com.xiwei.use_context_example;

/**
 * 循环命令节点类：非终结符表达式
 */
class LoopCommandNode extends Node {
    // 循环次数
    private int number;
    // 循环语句中的表达式
    private Node commandNode;

    // 解释循环命令
    public void interpret(Context context) {
        context.skipToken("LOOP");
        number = context.currentNumber();
        context.nextToken();
        //循环语句中的表达式
        commandNode = new ExpressionNode();
        commandNode.interpret(context);
    }

    public void execute() {
        for (int i = 0; i < number; i++)
            commandNode.execute();
    }
}
