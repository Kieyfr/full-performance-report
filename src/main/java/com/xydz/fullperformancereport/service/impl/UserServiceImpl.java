package com.xydz.fullperformancereport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.service.UserService;
import com.xydz.fullperformancereport.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author ThinkPad
* @description 针对表【FPR_USER(全性能报告表用户表)】的数据库操作Service实现
* @createDate 2022-12-07 16:37:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




