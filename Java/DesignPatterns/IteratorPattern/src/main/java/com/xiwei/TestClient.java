package com.xiwei;

import java.util.ArrayList;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("西瓜");
        products.add("花生");
        products.add("牛奶");
        products.add("西红柿");
        products.add("豇豆");
        products.add("茄子");

        AbstractObjectList productList = new ProductList(products);
        AbstractIterator iterator = productList.createIterator();
        System.out.println("正向遍历：");
        while (!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + ",");
            iterator.next();
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("反向遍历：");
        while (!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + ",");
            iterator.previous();
        }
    }
}
