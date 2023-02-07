package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 全性能报告表
 * @TableName FPR_REPORT
 */
@TableName(value ="FPR_REPORT")
@Data
public class Report implements Serializable {
    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 送检人/部门
     */
    private String submitter;

    /**
     * 检测依据
     */
    private String testBasis;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 型号规格
     */
    private String specification;

    /**
     * 报告编号
     */
    @TableId
    private String reportNo;

    /**
     * 送检日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date submitterDate;

    /**
     * 样品状态
     */
    private String sampleStatus;

    /**
     * 测试日期起始
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTestDate;

    /**
     * 测试日期终止
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTestDate;

    /**
     * 主检
     */
    private String majorMeasured;

    /**
     * 审核
     */
    private String checked;

    /**
     * 签发
     */
    private String approved;

    /**
     * 授权人
     */
    private String certigier;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    /**
     * 创建人id
     */
    private String createUserId;

    /**
     * 创建人名字
     */
    private String createUserName;

    /**
     * 备注
     */
    private String description;

    /**
     * 线类型
     */
    private String wireType;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    /**
     * 修改人id
     */
    private String updateUserId;

    /**
     * 修改人名字
     */
    private String updateUserName;

    /**
     * 计算模板
     */
    private String calculationTemplate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}