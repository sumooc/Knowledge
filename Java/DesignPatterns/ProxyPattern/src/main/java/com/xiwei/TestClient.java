package com.xiwei;

/**
 *
 */
public class TestClient {
    public static void main(String[] args) {
        Searcher proxySearcher = new ProxySearcher();
        String result = proxySearcher.doSearch("zhangsan", "查询关键字");
        System.out.println(result);
    }
}
