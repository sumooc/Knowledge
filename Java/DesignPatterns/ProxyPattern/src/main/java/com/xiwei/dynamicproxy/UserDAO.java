package com.xiwei.dynamicproxy;

/**
 * 具体UserDAO：真实角色
 */
public class UserDAO implements AbstractUserDAO {
    @Override
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("zhangsan")) {
            System.out.println("查询ID为" + userId + "的用户信息成功！");
            return true;
        } else {
            System.out.println("查询ID为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
