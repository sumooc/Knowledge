package com.xiwei.use_context_example;

public class TestClient {
    public static void main(String[] args) {
        /**
         * 定义的一个文法规则
         * expression ::= command* //表达式，一个表达式包含多条命令
         * command ::= loop | primitive //语句命令
         * loop ::= 'loopnumber' expression  'end' //循环命令，其中number为自然数
         * primitive ::= 'printstring'  | 'space' | 'break' //基本命令，其中string为字符串
         */
        String text = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        Context context = new Context(text);

        Node node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}
