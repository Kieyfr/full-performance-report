package com.xydz.fullperformancereport.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.jwt.JWT;
import com.xydz.fullperformancereport.pojo.entity.User;

/**
 * @Author xiachenchen
 * @ClassName: JwtUtil
 * @Description: token解析工具类
 * @Date 2022/12/14
 */
public class JwtUtil {

    public static final byte[] SECRET = "SECRET".getBytes();

    /**
     * 根据用户创建token
     * @param user
     * @return
     */
    public static String createToken(User user){
        String token = JWT.create()
                .setExpiresAt(DateUtil.offsetDay(DateUtil.date(),3))
                .setPayload("id", user.getUserId())
                .setKey(SECRET)
                .sign();
        return token;
    }

    /**
     * 验证token
     * @param token
     * @return
     */
    public static boolean verify(String token){
        return JWT.of(token).setKey(SECRET).validate(0);
    }

    /**
     * 获取token中的信息
     * @param token
     * @param dataName
     * @return
     */
    public static String getData(String token,String dataName){
        return (String)JWT.of(token).getPayload(dataName);
    }




}