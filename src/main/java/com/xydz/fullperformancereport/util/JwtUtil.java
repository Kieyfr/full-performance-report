package com.xydz.fullperformancereport.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.xydz.fullperformancereport.pojo.entity.User;

import java.util.Date;

public class JwtUtil {

    /**
     * 过期时间
     */
    public static final long EXPIRE_TIME = 3 * 24 * 60 * 60 * 1000;

    public static final String SECRET = "SECRET";

    /**
     * 生成token
     * @param user
     * @return
     */
    public static String sign(User user){
        Date expireDate = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        return JWT.create()
                .withClaim("id", user.getUserId())
                .withClaim("name", user.getUserName())
                .withClaim("password", user.getUserPassword())
                .withClaim("permissions", user.getUserPermissions())
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(SECRET));
    }

    /**
     * 校验token
     * @param token
     * @return
     */
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT decodedJWT  = verifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 获取token内的携带的用户名信息
     * @param token
     * @return
     */
    public static String getUserNameByToken(String token){
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaim("name").asString();
    }

    /**
     * 获取token内的携带的所有用户名信息
     * @param token
     * @return
     */
    public static User getUserByToken(String token){
        DecodedJWT decodedJWT = JWT.decode(token);
        User user = new User();
        user.setUserId(decodedJWT.getClaim("id").asString());
        user.setUserName(decodedJWT.getClaim("name").asString());
        user.setUserPassword(decodedJWT.getClaim("password").asString());
        user.setUserPermissions(decodedJWT.getClaim("permissions").asString());
        return user;
    }

}