package com.xiwei.use_context_example;

import java.util.StringTokenizer;

/**
 * 环境类：用于存储和操作需要解释的语句
 * 本例中每个需要解释的单词可以称为一个动作标记或命令
 * <p>
 * 环境类Context类似一个工具类，它提供了用于处理指令的方法，如nextToken()、currentToken()、skipToken()等，
 * 同时它存储了需要解释的指令并记录了每一次解释的当前标记(Token)，而具体的解释过程交给表达式解释器类来处理。
 */
public class Context {
    // StringTokenizer类用于将字符串分解为更小的字符串标记（Token），默认情况下以空格作为分隔符
    private StringTokenizer tokenizer;
    // 当前字符串标记
    private String currentToken;

    public Context(String text) {
        //通过传入的指令字符串创建StringTokenizer对象
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    // 返回下一个标记
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    // 返回当前的标记
    public String currentToken() {
        return currentToken;
    }

    // 跳过一个标记
    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("错误提示：" + currentToken + "解释错误！");
        }
        nextToken();
    }

    // 如果当前的标记是一个数字，则返回对应的数值
    public int currentNumber() {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken); //将字符串转换为整数
        } catch (NumberFormatException e) {
            System.err.println("错误提示：" + e);
        }
        return number;
    }
}
