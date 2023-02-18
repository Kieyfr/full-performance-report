package com.xydz.fullperformancereport.util;


import cn.hutool.crypto.SecureUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.xydz.fullperformancereport.pojo.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiachenchen
 * @ClassName: JwtUtil
 * @Description: token解析工具类
 * @Date 2022/12/14
*/
public class JwtUtil {

    public static final byte[] SECRET = "SECRET".getBytes();

    public static Map<String, Object> getMap(User user){
        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("id", user.getUserId());
                if(user.getUserPassword().equals(SecureUtil.md5(user.getUserId()))){
                    put("expire_time", System.currentTimeMillis() + 1000);
                }else{
                    put("expire_time", System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15);
                }

            }
        };
        return map;
    }

    public static String createToken(User user){
        return JWTUtil.createToken(getMap(user), SECRET);
    }

    public static boolean verify(String token){
        return JWTUtil.verify(token,SECRET);
    }

    public static String getData(String token,String dataName){
        JWT jwt = JWTUtil.parseToken(token);
        return (String)jwt.getPayload(dataName);
    }




}