package com.xiwei;

/**
 * 抽象成绩操作类：目标接口
 */
public interface ScoreOperation {
    // 成绩排序
    public int[] sort(int scores[]);

    // 成绩查找
    public int search(int scores[], int key);
}
