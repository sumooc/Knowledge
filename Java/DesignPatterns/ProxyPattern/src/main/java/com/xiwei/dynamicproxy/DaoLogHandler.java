package com.xiwei.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 自定义请求处理程序类
 */
public class DaoLogHandler implements InvocationHandler {

    private Object object;

    public DaoLogHandler() {
    }

    // 自定义有参构造函数，用于注入一个需要提供代理的真实主题对象
    public DaoLogHandler(Object object) {
        this.object = object;
    }

    // 实现invoke()方法，调用在真实主题类中定义的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        // 转发调用
        Object invoke = method.invoke(object, args);
        afterInvoke();
        return invoke;
    }

    // 记录方法调用时间
    private void beforeInvoke() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String time = sdf.format(date);
        System.out.println("执行方法beforeInvoke()");
        System.out.println("调用时间：" + time);
    }

    private void afterInvoke() {
        System.out.println("afterInvoke()");
        System.out.println("方法调用结束。");
    }
}

