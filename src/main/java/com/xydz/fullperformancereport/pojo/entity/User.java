package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * 全性能报告表用户表
 * @TableName FPR_USER
 */
@TableName(value ="FPR_USER")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private String userId;

    /**
     * 用户名称
     */

    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户权限
     */
    private Integer userPermissions;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}