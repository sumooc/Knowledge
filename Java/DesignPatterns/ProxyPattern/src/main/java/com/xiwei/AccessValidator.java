package com.xiwei;

/**
 * 身份验证类：业务类
 */
public class AccessValidator {
    // 模拟实现登录验证
    public boolean validate(String userId) {
        System.out.println("根据userId获取到了用户对象！");
        if (userId.equalsIgnoreCase("zhangsan")) {
            System.out.println("登录成功！");
            return true;
        } else {
            System.out.println("登录失败！");
            return false;
        }
    }
}
