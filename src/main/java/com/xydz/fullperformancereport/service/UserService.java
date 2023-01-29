package com.xydz.fullperformancereport.service;

import com.xydz.fullperformancereport.pojo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author ThinkPad
* @description 针对表【FPR_USER(全性能报告表用户表)】的数据库操作Service
* @createDate 2022-12-07 16:37:55
*/
public interface UserService extends IService<User> {
    List<User> selectAllByUserIdAndUserNameAndUserPermissions(String userId,String userName,Integer userPermissions);

    User searchByUserId(String userId);

    int insertSelective(User user);

    int updateUserPermissionsByUserId(Integer userPermissions,String userId);

    int delByUserId(String userId);

    int updateUserPasswordByUserId(String userPassword,String userId);
}
