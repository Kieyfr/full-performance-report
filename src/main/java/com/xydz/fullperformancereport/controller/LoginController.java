package com.xydz.fullperformancereport.controller;

import cn.hutool.crypto.SecureUtil;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.UserService;
import com.xydz.fullperformancereport.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public ResponseData<String> login(@RequestBody User LoginUser){
        User user = userService.getById(LoginUser.getUserId());
        if (user!=null){
            if (user.getUserPassword().equals(SecureUtil.md5(LoginUser.getUserPassword()))){
                String token = JwtUtil.sign(user);
                return new ResponseData<String>("200","登录成功",token);
            }
            return new ResponseData<>("401","密码错误",null);
        }
        return new ResponseData<>("404","用户不存在",null);
    }

}
