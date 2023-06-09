package com.xiwei;

import java.util.Stack;

/**
 * 指令处理类：工具类
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        // 存储抽象语法树
        Stack stack = new Stack();
        // 以空格分隔指令字符串
        String[] words = instruction.split(" ");
        // 本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的3个单词作为3个终
        // 结符表达式连成一个简单句子SentenceNode作为“and”的右表达式，而将从栈顶弹
        // 出的表达式作为“and”的左表达式，最后将新的“and”表达式压入栈中
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and")) {
                // 弹出栈顶表达式作为左表达式
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                // 右表达式
                right = new SentenceNode(direction, action, distance);
                // 将新表达式压入栈中
                stack.push(new AndNode(left, right));
            } else {
                //如果是从头开始进行解释，则将前3个单词组成一个简单句子SentenceNode并将该句子压入栈中
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                //将新表达式压入栈中
                stack.push(left);
            }
        }
        this.node = (AbstractNode) stack.pop();
    }

    public String output() {
        // 解释表达式
        String result = node.interpret();
        return result;
    }
}
