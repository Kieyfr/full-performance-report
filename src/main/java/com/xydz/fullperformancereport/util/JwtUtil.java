package com.xydz.fullperformancereport.util;


import cn.hutool.core.date.DateUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTValidator;
import cn.hutool.jwt.signers.JWTSignerUtil;
import com.xydz.fullperformancereport.pojo.entity.User;

/**
 * @Author xiachenchen
 * @ClassName: JwtUtil
 * @Description: token解析工具类
 * @Date 2022/12/14
 */
public class JwtUtil {

    public static final byte[] SECRET = "SECRET".getBytes();

    public static String createToken(User user){
        String token = JWT.create()
                .setExpiresAt(DateUtil.offsetDay(DateUtil.date(),3))
                .setPayload("id", user.getUserId())
                .setKey(SECRET)
                .sign();
        return token;
    }

    public static boolean verify(String token){
        try {
            JWTValidator.of(token)
                    .validateDate()
                    .validateAlgorithm(JWTSignerUtil.hs256(SECRET));
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static String getData(String token,String dataName){
        JWT jwt = JWT.of(token);
        return (String)jwt.getPayload(dataName);
    }




}