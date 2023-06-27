package com.xiwei;

/**
 * 简单句子解释：非终结符表达式
 */
public class SentenceNode extends AbstractNode {
    // 移动方向
    private AbstractNode direction;
    // 移动方式
    private AbstractNode action;
    // 移动距离
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    // 简单句子的解释操作
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
