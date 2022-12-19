package com.xydz.fullperformancereport.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.xydz.fullperformancereport.pojo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author ThinkPad
* @description 针对表【FPR_USER(全性能报告表用户表)】的数据库操作Mapper
* @createDate 2022-12-07 16:37:55
* @Entity com.xydz.fullperformancereport.pojo.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllByUserIdAndUserNameAndUserPermissions(@Param("userId") String userId, @Param("userName") String userName, @Param("userPermissions") Integer userPermissions);

    int insertSelective(User user);

    int updateUserPermissionsByUserId(@Param("userPermissions") Integer userPermissions, @Param("userId") String userId);

    int delByUserId(@Param("userId") String userId);

    int updateUserPasswordByUserId(@Param("userPassword") String userPassword, @Param("userId") String userId);

}




