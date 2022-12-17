package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Permissions {

    private String userId;

    /**
     * 用户名称
     */

    private String userName;

    private Integer oldPermissions;

    private Integer newPermissions;


}
