package com.xydz.fullperformancereport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.service.UserService;
import com.xydz.fullperformancereport.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author ThinkPad
* @description 针对表【FPR_USER(全性能报告表用户表)】的数据库操作Service实现
* @createDate 2022-12-07 16:37:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectAllByUserIdAndUserNameAndUserPermissions(String userId, String userName, Integer userPermissions) {
        return userMapper.selectAllByUserIdAndUserNameAndUserPermissions(userId,userName,userPermissions);
    }

    @Override
    public User searchByUserId(String userId) {
        return userMapper.searchByUserId(userId);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUserPermissionsByUserId(Integer userPermissions, String userId) {
        return userMapper.updateUserPermissionsByUserId(userPermissions,userId);
    }

    @Override
    public int delByUserId(String userId) {
        return userMapper.delByUserId(userId);
    }

    @Override
    public int updateUserPasswordByUserId(String userPassword, String userId) {
        return userMapper.updateUserPasswordByUserId(userPassword,userId);
    }

}




