package com.xiwei;

public class TestClient {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int scores[] = {83, 66, 97, 81, 99, 78, 69, 88, 76, 95};
        
        System.out.println("成绩排序的结果：");
        int[] sort = operation.sort(scores);
        System.out.println(sort);

        System.out.println("查询成绩为99的：");
        int search = operation.search(scores, 99);
        System.out.println(search);
    }
}
