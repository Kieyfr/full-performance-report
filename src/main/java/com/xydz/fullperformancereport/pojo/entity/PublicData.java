package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 全性能报告表公共数据表
 * @TableName FPR_PUBLIC_DATA
 */
@TableName(value ="FPR_PUBLIC_DATA")
@Data
public class PublicData implements Serializable {
    /**
     * 报告编号
     */
    @TableId
    private String reportNo;

    /**
     * 护套外径测试数据1
     */
    private Double sheathOdTd1;

    /**
     * 护套外径测试数据2
     */
    private Double sheathOdTd2;

    /**
     * 护套外径测试数据3
     */
    private Double sheathOdTd3;

    /**
     * 护套外径测试数据4
     */
    private Double sheathOdTd4;

    /**
     * 护套外径测试数据5
     */
    private Double sheathOdTd5;

    /**
     * 护套外径测试数据6
     */
    private Double sheathOdTd6;

    /**
     * 护套厚度测试数据1
     */
    private Double sheathThkTd1;

    /**
     * 护套厚度测试数据2
     */
    private Double sheathThkTd2;

    /**
     * 护套厚度测试数据3
     */
    private Double sheathThkTd3;

    /**
     * 护套厚度测试数据4
     */
    private Double sheathThkTd4;

    /**
     * 护套厚度测试数据5
     */
    private Double sheathThkTd5;

    /**
     * 护套厚度测试数据6
     */
    private Double sheathThkTd6;

    /**
     * 护套厚度测试数据7
     */
    private Double sheathThkTd7;

    /**
     * 护套厚度测试数据8
     */
    private Double sheathThkTd8;

    /**
     * 护套厚度测试数据9
     */
    private Double sheathThkTd9;

    /**
     * 护套厚度测试数据10
     */
    private Double sheathThkTd10;

    /**
     * 护套老化前伸长测试数据1
     */
    private Double sheathUnagedElongationTd1;

    /**
     * 护套老化前伸长测试数据2
     */
    private Double sheathUnagedElongationTd2;

    /**
     * 护套老化前伸长测试数据3
     */
    private Double sheathUnagedElongationTd3;

    /**
     * 护套老化前伸长测试数据4
     */
    private Double sheathUnagedElongationTd4;

    /**
     * 护套老化前伸长测试数据5
     */
    private Double sheathUnagedElongationTd5;

    /**
     * 护套老化前伸长测试数据6
     */
    private Double sheathUnagedElongationTd6;

    /**
     * 护套老化前拉力测试数据1
     */
    private Double sheathUnagedPullTd1;

    /**
     * 护套老化前拉力测试数据2
     */
    private Double sheathUnagedPullTd2;

    /**
     * 护套老化前拉力测试数据3
     */
    private Double sheathUnagedPullTd3;

    /**
     * 护套老化前拉力测试数据4
     */
    private Double sheathUnagedPullTd4;

    /**
     * 护套老化前拉力测试数据5
     */
    private Double sheathUnagedPullTd5;

    /**
     * 护套老化前拉力测试数据6
     */
    private Double sheathUnagedPullTd6;

    /**
     * 护套老化后伸长测试数据1
     */
    private Double sheathAgingElongationTd1;

    /**
     * 护套老化后伸长测试数据2
     */
    private Double sheathAgingElongationTd2;

    /**
     * 护套老化后伸长测试数据3
     */
    private Double sheathAgingElongationTd3;

    /**
     * 护套老化后伸长测试数据4
     */
    private Double sheathAgingElongationTd4;

    /**
     * 护套老化后伸长测试数据5
     */
    private Double sheathAgingElongationTd5;

    /**
     * 护套老化后伸长测试数据6
     */
    private Double sheathAgingElongationTd6;

    /**
     * 护套老化后拉力测试数据1
     */
    private Double sheathAgingPullTd1;

    /**
     * 护套老化后拉力测试数据2
     */
    private Double sheathAgingPullTd2;

    /**
     * 护套老化后拉力测试数据3
     */
    private Double sheathAgingPullTd3;

    /**
     * 护套老化后拉力测试数据4
     */
    private Double sheathAgingPullTd4;

    /**
     * 护套老化后拉力测试数据5
     */
    private Double sheathAgingPullTd5;

    /**
     * 护套老化后拉力测试数据6
     */
    private Double sheathAgingPullTd6;

    /**
     * 套管前厚度
     */
    private Double csgFrontThk;

    /**
     * 套管后厚度
     */
    private Double csgRearThk;

    /**
     * 比重长
     */
    private Double spgLength;

    /**
     * 比重空重
     */
    private Double spgEmptyWeight;

    /**
     * 比重水重
     */
    private Double spgWaterWeight;

    /**
     * 热延伸标记长度
     */
    private Double hteMarkLength;

    /**
     * 热延伸延伸长度
     */
    private Double hteExtensionLength;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}