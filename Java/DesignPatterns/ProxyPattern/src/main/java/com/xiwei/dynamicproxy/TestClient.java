package com.xiwei.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestClient {
    public static void main(String[] args) {
        AbstractUserDAO userDAO = new UserDAO();
        InvocationHandler handler = new DaoLogHandler(userDAO);
        // 动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
        AbstractUserDAO daoProxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        // 调用代理对象的业务方法
        daoProxy.findUserById("zhangsan");

        // AbstractDocumentDAO代码一样
    }
}
