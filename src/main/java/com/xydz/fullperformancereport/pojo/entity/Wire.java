package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 全性能报告表芯线表
 * @TableName FPR_WIRE
 */
@TableName(value ="FPR_WIRE")
@Data
public class Wire implements Serializable {
    /**
     * 报告编号
     */
    @TableId
    private String reportNo;

    /**
     * 芯线序号
     */
    private Long id;

    /**
     * 数量
     */
    private Long num;

    /**
     * 颜色
     */
    private String color;

    /**
     * 线径测试数据1
     */
    private Double diameterTd1;

    /**
     * 线径测试数据2
     */
    private Double diameterTd2;

    /**
     * 线径测试数据3
     */
    private Double diameterTd3;

    /**
     * 线径测试数据4
     */
    private Double diameterTd4;

    /**
     * 线径测试数据5
     */
    private Double diameterTd5;

    /**
     * 线径测试数据6
     */
    private Double diameterTd6;

    /**
     * 绝缘外径测试数据1
     */
    private Double insulOdTd1;

    /**
     * 绝缘外径测试数据2
     */
    private Double insulOdTd2;

    /**
     * 绝缘外径测试数据3
     */
    private Double insulOdTd3;

    /**
     * 绝缘外径测试数据4
     */
    private Double insulOdTd4;

    /**
     * 绝缘外径测试数据5
     */
    private Double insulOdTd5;

    /**
     * 绝缘外径测试数据6
     */
    private Double insulOdTd6;

    /**
     * 绝缘厚度测试数据1
     */
    private Double insulThkTd1;

    /**
     * 绝缘厚度测试数据2
     */
    private Double insulThkTd2;

    /**
     * 绝缘厚度测试数据3
     */
    private Double insulThkTd3;

    /**
     * 绝缘厚度测试数据4
     */
    private Double insulThkTd4;

    /**
     * 绝缘厚度测试数据5
     */
    private Double insulThkTd5;

    /**
     * 绝缘厚度测试数据6
     */
    private Double insulThkTd6;

    /**
     * 绝缘厚度测试数据7
     */
    private Double insulThkTd7;

    /**
     * 绝缘厚度测试数据8
     */
    private Double insulThkTd8;

    /**
     * 绝缘厚度测试数据9
     */
    private Double insulThkTd9;

    /**
     * 绝缘厚度测试数据10
     */
    private Double insulThkTd10;

    /**
     * 绝缘老化前伸长测试数据1
     */
    private Double insulUnagedElongationTd1;

    /**
     * 绝缘老化前伸长测试数据2
     */
    private Double insulUnagedElongationTd2;

    /**
     * 绝缘老化前伸长测试数据3
     */
    private Double insulUnagedElongationTd3;

    /**
     * 绝缘老化前伸长测试数据4
     */
    private Double insulUnagedElongationTd4;

    /**
     * 绝缘老化前伸长测试数据5
     */
    private Double insulUnagedElongationTd5;

    /**
     * 绝缘老化前伸长测试数据6
     */
    private Double insulUnagedElongationTd6;

    /**
     * 绝缘老化前拉力测试数据1
     */
    private Double insulUnagedPullTd1;

    /**
     * 绝缘老化前拉力测试数据2
     */
    private Double insulUnagedPullTd2;

    /**
     * 绝缘老化前拉力测试数据3
     */
    private Double insulUnagedPullTd3;

    /**
     * 绝缘老化前拉力测试数据4
     */
    private Double insulUnagedPullTd4;

    /**
     * 绝缘老化前拉力测试数据5
     */
    private Double insulUnagedPullTd5;

    /**
     * 绝缘老化前拉力测试数据6
     */
    private Double insulUnagedPullTd6;

    /**
     * 绝缘老化后伸长测试数据1
     */
    private Double insulAgingElongationTd1;

    /**
     * 绝缘老化后伸长测试数据2
     */
    private Double insulAgingElongationTd2;

    /**
     * 绝缘老化后伸长测试数据3
     */
    private Double insulAgingElongationTd3;

    /**
     * 绝缘老化后伸长测试数据4
     */
    private Double insulAgingElongationTd4;

    /**
     * 绝缘老化后伸长测试数据5
     */
    private Double insulAgingElongationTd5;

    /**
     * 绝缘老化后伸长测试数据6
     */
    private Double insulAgingElongationTd6;

    /**
     * 绝缘老化后拉力测试数据1
     */
    private Double insulAgingPullTd1;

    /**
     * 绝缘老化后拉力测试数据2
     */
    private Double insulAgingPullTd2;

    /**
     * 绝缘老化后拉力测试数据3
     */
    private Double insulAgingPullTd3;

    /**
     * 绝缘老化后拉力测试数据4
     */
    private Double insulAgingPullTd4;

    /**
     * 绝缘老化后拉力测试数据5
     */
    private Double insulAgingPullTd5;

    /**
     * 绝缘老化后拉力测试数据6
     */
    private Double insulAgingPullTd6;

    /**
     * 加热变形前平均线径测试数据
     */
    private Double htgFrontAvgDiameter;

    /**
     * 加热变形后平均线径测试数据
     */
    private Double htgRearAvgDiameter;

    /**
     * 20℃导体直流电阻测试数据
     */
    private Double conductor20DcrTd;

    /**
     * 绝缘电阻长
     */
    private Double irLength;

    /**
     * 绝缘电阻测试数据
     */
    private Double irTd;

    /**
     * 导体材质
     */
    private String materialQuality;

    /**
     * 绝缘材质
     */
    private String insulMaterialQuality;

    /**
     * 80℃*7天 第一次(老化前)g
     */
    private Double firty807Unaged;

    /**
     * 80℃*7天 第二次(老化后)g
     */
    private Double second807Aging;

    /**
     * 高温压力
     */
    private Double insulHthp;

    /**
     * 绝缘厚度测试数据11
     */
    private Double insulThkTd11;

    /**
     * 绝缘厚度测试数据12
     */
    private Double insulThkTd12;

    /**
     * 绝缘厚度测试数据13
     */
    private Double insulThkTd13;

    /**
     * 绝缘厚度测试数据14
     */
    private Double insulThkTd14;

    /**
     * 绝缘厚度测试数据15
     */
    private Double insulThkTd15;

    /**
     * 绝缘厚度测试数据16
     */
    private Double insulThkTd16;

    /**
     * 绝缘厚度测试数据17
     */
    private Double insulThkTd17;

    /**
     * 绝缘厚度测试数据18
     */
    private Double insulThkTd18;

    /**
     * 兼容性绝缘老化前伸长测试数据1
     */
    private Double compatibilityInsulUnagedElongationTd1;

    /**
     * 兼容性绝缘老化前伸长测试数据2
     */
    private Double compatibilityInsulUnagedElongationTd2;

    /**
     * 兼容性绝缘老化前伸长测试数据3
     */
    private Double compatibilityInsulUnagedElongationTd3;

    /**
     * 兼容性绝缘老化前伸长测试数据4
     */
    private Double compatibilityInsulUnagedElongationTd4;

    /**
     * 兼容性绝缘老化前伸长测试数据5
     */
    private Double compatibilityInsulUnagedElongationTd5;

    /**
     * 兼容性绝缘老化前伸长测试数据6
     */
    private Double compatibilityInsulUnagedElongationTd6;

    /**
     * 兼容性绝缘老化前拉力测试数据1
     */
    private Double compatibilityInsulUnagedPullTd1;

    /**
     * 兼容性绝缘老化前拉力测试数据2
     */
    private Double compatibilityInsulUnagedPullTd2;

    /**
     * 兼容性绝缘老化前拉力测试数据3
     */
    private Double compatibilityInsulUnagedPullTd3;

    /**
     * 兼容性绝缘老化前拉力测试数据4
     */
    private Double compatibilityInsulUnagedPullTd4;

    /**
     * 兼容性绝缘老化前拉力测试数据5
     */
    private Double compatibilityInsulUnagedPullTd5;

    /**
     * 兼容性绝缘老化前拉力测试数据6
     */
    private Double compatibilityInsulUnagedPullTd6;

    /**
     * 兼容性绝缘老化后伸长测试数据1
     */
    private Double compatibilityInsulAgingElongationTd1;

    /**
     * 兼容性绝缘老化后伸长测试数据2
     */
    private Double compatibilityInsulAgingElongationTd2;

    /**
     * 兼容性绝缘老化后伸长测试数据3
     */
    private Double compatibilityInsulAgingElongationTd3;

    /**
     * 兼容性绝缘老化后伸长测试数据4
     */
    private Double compatibilityInsulAgingElongationTd4;

    /**
     * 兼容性绝缘老化后伸长测试数据5
     */
    private Double compatibilityInsulAgingElongationTd5;

    /**
     * 兼容性绝缘老化后伸长测试数据6
     */
    private Double compatibilityInsulAgingElongationTd6;

    /**
     * 兼容性绝缘老化后拉力测试数据1
     */
    private Double compatibilityInsulAgingPullTd1;

    /**
     * 兼容性绝缘老化后拉力测试数据2
     */
    private Double compatibilityInsulAgingPullTd2;

    /**
     * 兼容性绝缘老化后拉力测试数据3
     */
    private Double compatibilityInsulAgingPullTd3;

    /**
     * 兼容性绝缘老化后拉力测试数据4
     */
    private Double compatibilityInsulAgingPullTd4;

    /**
     * 兼容性绝缘老化后拉力测试数据5
     */
    private Double compatibilityInsulAgingPullTd5;

    /**
     * 兼容性绝缘老化后拉力测试数据6
     */
    private Double compatibilityInsulAgingPullTd6;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}