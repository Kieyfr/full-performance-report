package com.xydz.fullperformancereport.pojo.entity;

import lombok.Data;

@Data
public class UpdateUser {

    private String userId;

    /**
     * 用户名称
     */

    private String userName;

    private String oldPassword;

    private String newPassword;

    private Integer oldPermissions;

    private Integer newPermissions;


}
