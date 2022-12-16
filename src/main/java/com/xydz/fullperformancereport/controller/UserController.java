package com.xydz.fullperformancereport.controller;

import cn.hutool.crypto.SecureUtil;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.UserService;
import com.xydz.fullperformancereport.util.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(tags = "用户控制器")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @param LoginUser
     * @return token
    */
    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public ResponseData<String> login(@RequestBody User LoginUser){
        User user = userService.getById(LoginUser.getUserId());
        if (user!=null){
            if (user.getUserPassword().equals(SecureUtil.md5(LoginUser.getUserPassword()))){
                String token = JwtUtil.createToken(user);
                return new ResponseData<String>("200","登录成功",token);
            }
            return new ResponseData<>("401","密码错误",null);
        }
        return new ResponseData<>("404","用户不存在",null);
    }

}
