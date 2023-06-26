package com.xiwei.request_log;

import java.io.Serializable;

/**
 * 配置文件操作类：请求接收者
 */
public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }

}
