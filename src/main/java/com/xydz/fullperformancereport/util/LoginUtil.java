package com.xydz.fullperformancereport.util;

import com.xydz.fullperformancereport.pojo.entity.User;

/**
 * @Author xiachenchen
 * @ClassName: LoginUtil
 * @Description: 登录用户信息工具类
 * @Date 2022/11/22
*/

public class LoginUtil {
    private static final ThreadLocal<User> threadLocal = new ThreadLocal<User>();

    public static void setLoginUser(User user){
        threadLocal.set(user);
    }

    public static User getLoginUser(){
        User user = threadLocal.get();
        return user;
    }
    public static void remove(){
        threadLocal.remove();
    }
}
