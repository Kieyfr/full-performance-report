package com.xydz.fullperformancereport.controller;

import cn.hutool.crypto.SecureUtil;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.UserService;
import com.xydz.fullperformancereport.util.JwtUtil;
import com.xydz.fullperformancereport.util.LoginUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
//            System.out.println(user);

            if (user.getUserPassword().equals(SecureUtil.md5(LoginUser.getUserPassword()))){
                if (user.getUserPassword().equals(SecureUtil.md5(LoginUser.getUserId()))){
                    String token = JwtUtil.createToken(user);
                    return new ResponseData<String>("402","请更改密码",token);
                }
                String token = JwtUtil.createToken(user);
                return new ResponseData<String>("200","登录成功",token);
            }
            return new ResponseData<>("401","密码错误",null);
        }
        return new ResponseData<>("404","用户不存在",null);
    }

    /**
     * 获取登录的用户信息
     *
     */
    @PostMapping("getLoginUserData")
    @ApiOperation(value = "获取登录用户信息")
    public ResponseData<User> getLoginUserData(){
        User user = LoginUtil.getLoginUser();
        user.setUserPassword("");
        return new ResponseData<User>("200","获取成功",user);
    }

    /**
     * 获取人员信息
     *
     * @param user
     * @return List<User>
     */
    @PostMapping("getUsers")
    @ApiOperation(value = "获取人员信息")
    public ResponseData<List<User>> getUser(@RequestBody User user){
            List<User> users=userService.selectAllByUserIdAndUserNameAndUserPermissions(user.getUserId(),user.getUserName(),user.getUserPermissions());
            if (users!=null){
                return new ResponseData<>("200","获取数据成功",users);
            }
        return new ResponseData<>("404","数据为空",null);
    }

    /**
     * 添加人员信息
     *
     * @param user
     * @return null
     */
    @PostMapping("addUser")
    @ApiOperation(value = "添加人员信息")
    public synchronized ResponseData<String> addUser(@RequestBody User user){


        if (user!=null){
            User user2 = userService.searchByUserId(user.getUserId());
            if (user2!=null){
                return new ResponseData<>("403","工号不能重复",null);
            }else{
                User Loginuser=LoginUtil.getLoginUser();
                user.setUserPassword(SecureUtil.md5(user.getUserPassword()));
                if (user.getUserPermissions()<Loginuser.getUserPermissions()){
                    int i = userService.insertSelective(user);
                    if (i>0){
                        return new ResponseData<>("200","添加成功",null);
                    }else{
                        return new ResponseData<>("401","添加失败",null);
                    }
                }else{
                    return new ResponseData<>("402","权限不足",null);
                }
            }


        }
        return new ResponseData<>("404","数据有误",null);
    }

    /**
     * 修改权限
     *
     * @param
     * @return null
     */
    @PostMapping("modPermissions")
    @ApiOperation(value = "修改权限")
    public ResponseData<String> modPermissions(@RequestBody User user){

        User oldUser=userService.searchByUserId(user.getUserId());

        User loginUser=LoginUtil.getLoginUser();

        if (oldUser.getUserPermissions()<loginUser.getUserPermissions()&&user.getUserPermissions()<loginUser.getUserPermissions()){
            int i = userService.updateUserPermissionsByUserId(user.getUserPermissions(), user.getUserId());
            if (i>0){
                return new ResponseData<>("200","更改成功",null);
            }else {
                return new ResponseData<>("401","更改失败",null);
            }
        }else{
            return new ResponseData<>("402","权限不足",null);
        }
    }

    /**
     * 删除用户
     *
     * @param user
     * @return null
     */
    @PostMapping("delUser")
    @ApiOperation(value = "删除用户")
    public ResponseData<String> delUser(@RequestBody User user){
        User Loginuser=LoginUtil.getLoginUser();
        if (user.getUserPermissions()<Loginuser.getUserPermissions()){
            int i = userService.delByUserId(user.getUserId());
            if (i>0){
                return new ResponseData<>("200","删除成功",null);
            }else {
                return new ResponseData<>("401","删除失败",null);
            }
        }else{
            return new ResponseData<>("402","权限不足",null);
        }
    }

    /**
     * 重置密码
     *
     * @param user
     * @return null
     */
    @PostMapping("resetUserPassword")
    @ApiOperation(value = "重置密码")
    public ResponseData<String> resetUserPassword(@RequestBody User user){

        User Loginuser=LoginUtil.getLoginUser();
        if (user.getUserPermissions()<=Loginuser.getUserPermissions()){
            user.setUserPassword(SecureUtil.md5(user.getUserId()));
            int i = userService.updateUserPasswordByUserId(user.getUserPassword(),user.getUserId());
            if (i>0){
                return new ResponseData<>("200","重置成功",null);
            }else {
                return new ResponseData<>("401","重置失败",null);
            }
        }else{
            return new ResponseData<>("402","权限不足",null);
        }
    }
    /**
     * 首次登录更改密码
     *
     * @param newPassword
     * @return null
     */
    @PostMapping("firstLoginChangePassword")
    @ApiOperation(value = "首次登录更改密码")
    public ResponseData<String> firstLoginChangePassword(@Param("newPassword")String newPassword){

        User LoginUser=LoginUtil.getLoginUser();
            int i = userService.updateUserPasswordByUserId(SecureUtil.md5(newPassword),LoginUser.getUserId());
            if (i>0){
                User newLogin=userService.getById(LoginUser.getUserId());
                String token = JwtUtil.createToken(newLogin);
                return new ResponseData<>("200","更改成功",token);
            }else {
                return new ResponseData<>("401","更改失败",null);
            }
    }

//    /**
//     * 更改目前登录账号密码
//     *
//     * @param userId,oldPassword,newPassword
//     * @return null
//     */
//    @PostMapping("updateUserPassword")
//    public ResponseData<String> updateUserPassword(@RequestParam("userId")String userId,
//                                                   @RequestParam("oldPassword")String oldPassword,
//                                                   @RequestParam("newPassword")String newPassword){
//
//        User Loginuser=LoginUtil.getLoginUser();
//        if (userId.equals(Loginuser.getUserId())){
//            if (Loginuser.getUserPassword().equals(SecureUtil.md5(oldPassword))){
//                newPassword=SecureUtil.md5(newPassword);
//                int i = userService.updateUserPasswordByUserId(newPassword, userId);
//                if (i>0){
//                    return new ResponseData<>("200","更改成功",null);
//                }else{
//                    return new ResponseData<>("401","信息有误",null);
//                }
//            }else{
//                return new ResponseData<>("401","原密码错误",null);
//            }
//        }else{
//            return new ResponseData<>("402","更改的账号与登录的不相符",null);
//        }
//
//    }


}
