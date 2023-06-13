package com.xiwei;

/**
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sort;
    private BinarySearch search;

    public OperationAdapter() {
        sort = new QuickSort();
        search = new BinarySearch();
    }

    @Override
    public int[] sort(int[] scores) {
        return sort.quickSort(scores);
    }

    @Override
    public int search(int[] scores, int key) {
        return search.binarySearch(scores, key);
    }
}
