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
     * 印字耐擦是否印字清晰
     */
    private String printingErasibilit;

    /**
     * 导体腐蚀是否无腐蚀
     */
    private String conductorCorrosion;

    /**
     * 热冲击是否无开裂
     */
    private String tsCrack;

    /**
     * 低温弯曲是否无开裂
     */
    private String ltBendCrack;

    /**
     * 柔韧性是否无开裂
     */
    private String flexibilityCrack;

    /**
     * 耐电压测试(介电III)是否击穿
     */
    private String dielectricIiiPok;

    /**
     * 耐电压测试(介电I)是否击穿
     */
    private String dielectricIPok;

    /**
     * 高压直流线介质耐压试验I是否击穿
     */
    private String hvdcWirePok;

    /**
     * VW1棉花是否点燃测试数据1
     */
    private String lightCottonVw1Td1;

    /**
     * VW1棉花是否点燃测试数据2
     */
    private String lightCottonVw1Td2;

    /**
     * VW1棉花是否点燃测试数据3
     */
    private String lightCottonVw1Td3;

    /**
     * FT2棉花是否点燃测试数据1
     */
    private String lightCottonFt2Td1;

    /**
     * FT2棉花是否点燃测试数据2
     */
    private String lightCottonFt2Td2;

    /**
     * FT2棉花是否点燃测试数据3
     */
    private String lightCottonFt2Td3;

    /**
     * UL水平燃烧棉花是否点燃测试数据1
     */
    private String lightCottonUlTd1;

    /**
     * UL水平燃烧棉花是否点燃测试数据2
     */
    private String lightCottonUlTd2;

    /**
     * UL水平燃烧棉花是否点燃测试数据3
     */
    private String lightCottonUlTd3;

    /**
     * 护套材质
     */
    private String sheathMaterialQuality;

    /**
     * 绝缘热冲击是否无开裂
     */
    private String insulTsCrack;

    /**
     * 护套热冲击是否无开裂
     */
    private String sheathTsCrack;

    /**
     * 绝缘低温弯曲是否无开裂
     */
    private String insulLtBendCrack;

    /**
     * 护套低温弯曲是否无开裂
     */
    private String sheathLtBendCrack;

    /**
     * 低温冲击是否无开裂
     */
    private String lowTemperatureImpactCrack;

    /**
     * 热稳定性
     */
    private Double thermalStability;

    /**
     * 曲挠试验
     */
    private String flexureTest;

    /**
     * 绝缘耐电压测试是否击穿
     */
    private String insulDielectricPok;

    /**
     * 成品耐电压测试是否击穿
     */
    private String fgDielectricPok;

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
     * 绝缘平均厚度判断值
     */
    private Double insulAvgThk;

    /**
     * 绝缘最小厚度判断值
     */
    private Double insulMinThk;

    /**
     * 护套平均厚度判断值
     */
    private Double sheathAvgThk;

    /**
     * 护套最小厚度判断值
     */
    private Double sheathMinThk;

    /**
     * 绝缘老化条件温度/℃
     */
    private Double insulBiTemp;

    /**
     * 绝缘老化条件时间/H
     */
    private Double insulBiTime;

    /**
     * 绝缘延伸率判断值
     */
    private Double insulUnagedEi;

    /**
     * 绝缘抗张强度判断值
     */
    private Double insulUnagedTs;

    /**
     * 绝缘老化后延伸残率判断值||绝缘老化延伸变化率判断值
     */
    private Double insulAgingEi;

    /**
     * 绝缘老化后抗张残率判断值||绝缘老化抗张变化率判断值
     */
    private Double insulAgingTs;

    /**
     * 护套老化条件温度/℃
     */
    private Double sheathBiTemp;

    /**
     * 护套老化条件时间/H
     */
    private Double sheathBiTime;

    /**
     * 护套延伸率判断值
     */
    private Double sheathUnagedEi;

    /**
     * 护套抗张强度判断值
     */
    private Double sheathUnagedTs;

    /**
     * 护套老化后延伸残率判断值||护套老化延伸变化率判断值
     */
    private Double sheathAgingEi;

    /**
     * 护套老化后抗张残率判断值||护套老化抗张变化率判断值
     */
    private Double sheathAgingTs;

    /**
     * 导体腐蚀温度/℃
     */
    private Double conductorCorrosionTemp;

    /**
     * 导体腐蚀时间/H
     */
    private Double conductorCorrosionTime;

    /**
     * 热冲击温度/℃
     */
    private Double tsTemp;

    /**
     * 热冲击时间/H
     */
    private Double tsTime;

    /**
     * 热冲击圈数/圈
     */
    private Double tsLn;

    /**
     * 低温弯曲温度/℃
     */
    private Double ltBendTemp;

    /**
     * 低温弯曲时间/H
     */
    private Double ltBendTime;

    /**
     * 低温弯曲圈数/圈
     */
    private Double ltBendLn;

    /**
     * 柔韧性温度/℃
     */
    private Double flexibilityTemp;

    /**
     * 柔韧性时间/H
     */
    private Double flexibilityTime;

    /**
     * 柔韧性圈数/圈
     */
    private Double flexibilityLn;

    /**
     * 20℃导体直流电阻判断值
     */
    private Double conductor20Dcr;

    /**
     * 耐电压测试(介电III)耐压/kv
     */
    private Double dielectricIiiWithstandVoltage;

    /**
     * 耐电压测试(介电III)耐压时间/min
     */
    private Double dielectricIiiWithstandVoltageTime;

    /**
     * 耐电压测试(介电I)取样/个
     */
    private Double dielectricINum;

    /**
     * 耐电压测试(介电I)温度/℃
     */
    private Double dielectricITemp;

    /**
     * 耐电压测试(介电I)时间/H
     */
    private Double dielectricITime;

    /**
     * 耐电压测试(介电I)圈长/mm
     */
    private Double dielectricIGirth;

    /**
     * 耐电压测试(介电I)圈数/圈
     */
    private Double dielectricILn;

    /**
     * 耐电压测试(介电I)耐压/kv
     */
    private Double dielectricIWithstandVoltage;

    /**
     * 耐电压测试(介电I)耐压时间/min
     */
    private Double dielectricIWithstandVoltageTiem;

    /**
     * 耐电压测试(介电I)击穿值/kv
     */
    private Double dielectricIPokNum;

    /**
     * 高压直流线介质耐压试验I取样/M
     */
    private Double hvdcWireNum;

    /**
     * 高压直流线介质耐压试验I烘温度/摄氏度
     */
    private Double hvdcWireBakingTemp;

    /**
     * 高压直流线介质耐压试验I烘时间/H
     */
    private Double hvdcWireBakingTime;

    /**
     * 高压直流线介质耐压试验I放温度/摄氏度
     */
    private Double hvdcWireDischargeTemp;

    /**
     * 高压直流线介质耐压试验I放%
     */
    private Double hvdcWireDischargePct;

    /**
     * 高压直流线介质耐压试验I放时间/H
     */
    private Double hvdcWireDischargeTime;

    /**
     * 高压直流线介质耐压试验I试棒/mm
     */
    private Double hvdcWireTestBar;

    /**
     * 高压直流线介质耐压试验I圈数/圈
     */
    private Double hvdcWireLn;

    /**
     * 高压直流线介质耐压试验I直流电压/kv
     */
    private Double hvdcWireDcv;

    /**
     * 高压直流线介质耐压试验I直流电压时间/min
     */
    private Double hvdcWireDcvTime;

    /**
     * 第1次施火延燃测试数据1
     */
    private Double firstFlameRetardingTd1;

    /**
     * 第1次施火延燃测试数据2
     */
    private Double firstFlameRetardingTd2;

    /**
     * 第1次施火延燃测试数据3
     */
    private Double firstFlameRetardingTd3;

    /**
     * 第2次施火延燃测试数据1
     */
    private Double secondFlameRetardingTd1;

    /**
     * 第2次施火延燃测试数据2
     */
    private Double secondFlameRetardingTd2;

    /**
     * 第2次施火延燃测试数据3
     */
    private Double secondFlameRetardingTd3;

    /**
     * 第3次施火延燃测试数据1
     */
    private Double thirdFlameRetardingTd1;

    /**
     * 第3次施火延燃测试数据2
     */
    private Double thirdFlameRetardingTd2;

    /**
     * 第3次施火延燃测试数据3
     */
    private Double thirdFlameRetardingTd3;

    /**
     * 第4次施火延燃测试数据1
     */
    private Double fourthFlameRetardingTd1;

    /**
     * 第4次施火延燃测试数据2
     */
    private Double fourthFlameRetardingTd2;

    /**
     * 第4次施火延燃测试数据3
     */
    private Double fourthFlameRetardingTd3;

    /**
     * 第5次施火延燃测试数据1
     */
    private Double fifthFlameRetardingTd1;

    /**
     * 第5次施火延燃测试数据2
     */
    private Double fifthFlameRetardingTd2;

    /**
     * 第5次施火延燃测试数据3
     */
    private Double fifthFlameRetardingTd3;

    /**
     * 旗子烧毁面积测试数据1
     */
    private Double flagBurningAreaTd1;

    /**
     * 旗子烧毁面积测试数据2
     */
    private Double flagBurningAreaTd2;

    /**
     * 旗子烧毁面积测试数据3
     */
    private Double flagBurningAreaTd3;

    /**
     * 施火30秒后燃烧长度测试数据1
     */
    private Double burningAfterLenghtTd1;

    /**
     * 施火30秒后燃烧长度测试数据2
     */
    private Double burningAfterLenghtTd2;

    /**
     * 施火30秒后燃烧长度测试数据3
     */
    private Double burningAfterLenghtTd3;

    /**
     * UL水平燃烧时间测试数据1
     */
    private Double burningTimeTd1;

    /**
     * UL水平燃烧时间测试数据2
     */
    private Double burningTimeTd2;

    /**
     * UL水平燃烧时间测试数据3
     */
    private Double burningTimeTd3;

    /**
     * 热延伸率/g
     */
    private Double thermalElongation;

    /**
     * 平均外径上限值默认设置7.5
     */
    private Double avgOdUbv;

    /**
     * 同一截面最大值
     */
    private Double sectionMax;

    /**
     * 同一截面最小值
     */
    private Double sectionMin;

    /**
     * 护套80℃*7天 第一次(老化前)g
     */
    private Double sheathFirty807Unaged;

    /**
     * 护套80℃*7天 第二次(老化后)g
     */
    private Double sheathSecond807Aging;

    /**
     * 绝缘热冲击长度/mm
     */
    private Double insulTsLength;

    /**
     * 绝缘热冲击圈数/圈
     */
    private Double insulTsLn;

    /**
     * 护套热冲击长度/mm
     */
    private Double sheathTsLength;

    /**
     * 护套热冲击圈数/圈
     */
    private Double sheathTsLn;

    /**
     * 绝缘低温弯曲圈数/圈
     */
    private Double insulLtBendLn;

    /**
     * 护套低温弯曲圈数/圈
     */
    private Double sheathLtBendLn;

    /**
     * 低温冲击重量
     */
    private Double lowTemperatureImpact;

    /**
     * 绝缘高温压力
     */
    private Double sheathHthp;

    /**
     * 印字间距判断值
     */
    private Double printingSpaceDv;

    /**
     * 印字间距
     */
    private Double printingSpace;

    /**
     * 90℃绝缘电阻长
     */
    private Double ir90Length;

    /**
     * 90℃绝缘电阻测试数据
     */
    private Double ir90Td;

    /**
     * 绝缘电阻判断值||70℃绝缘电阻判断值||15℃绝缘电阻判断值
     */
    private Double irCalcDv;

    /**
     * 90℃绝缘电阻判断值
     */
    private Double ir90CalcDv;

    /**
     * 导体单根线径判断值
     */
    private Double diameterTdAvgDv;

    /**
     * 护套外径判断值起始范围
     */
    private Double sheathOdDvStart;

    /**
     * 护套外径判断值结束范围
     */
    private Double sheathOdDvEnd;

    /**
     * 绝缘延伸率中间值判断值
     */
    private Double insulUnagedEiMvsDv;

    /**
     * 绝缘抗张中间值判断值
     */
    private Double insulUnagedTsMvsDv;

    /**
     * 绝缘老化后延伸率中间值判断值
     */
    private Double insulAgingEiMvsDv;

    /**
     * 绝缘老化后抗张中间值判断值
     */
    private Double insulAgingTsMvsDv;

    /**
     * 护套延伸率中间值判断值
     */
    private Double sheathUnagedEiMvsDv;

    /**
     * 护套抗张中间值判断值
     */
    private Double sheathUnagedTsMvsDv;

    /**
     * 护套老化后延伸率中间值判断值
     */
    private Double sheathAgingEiMvsDv;

    /**
     * 护套老化后抗张中间值判断值
     */
    private Double sheathAgingTsMvsDv;

    /**
     * 绝缘耐电压测试耐压/kv
     */
    private Double insulDielectricWithstandVoltage;

    /**
     * 绝缘耐电压测试耐压时间/min
     */
    private Double insulDielectricWithstandVoltageTime;

    /**
     * 成品耐电压测试耐压/kv
     */
    private Double fgDielectricWithstandVoltage;

    /**
     * 成品耐电压测试耐压时间/min
     */
    private Double fgDielectricWithstandVoltageTime;

    /**
     * GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，上夹具下缘与碳化起始点距离
     */
    private Double gbTbfStartDistance;

    /**
     * GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，向下延燃至上夹具下缘距离
     */
    private Double gbTbfBurningDistance;

    /**
     * 护套厚度测试数据11
     */
    private Double sheathThkTd11;

    /**
     * 护套厚度测试数据12
     */
    private Double sheathThkTd12;

    /**
     * 护套厚度测试数据13
     */
    private Double sheathThkTd13;

    /**
     * 护套厚度测试数据14
     */
    private Double sheathThkTd14;

    /**
     * 护套厚度测试数据15
     */
    private Double sheathThkTd15;

    /**
     * 护套厚度测试数据16
     */
    private Double sheathThkTd16;

    /**
     * 护套厚度测试数据17
     */
    private Double sheathThkTd17;

    /**
     * 护套厚度测试数据18
     */
    private Double sheathThkTd18;

    /**
     * 比长L空重
     */
    private Double spgLengthEmptyWeight;

    /**
     * 平行软线撕裂前厚度测试数据1
     */
    private Double parallelCordBeforeTearingTd1;

    /**
     * 平行软线撕裂前厚度测试数据2
     */
    private Double parallelCordBeforeTearingTd2;

    /**
     * 平行软线撕裂前厚度测试数据3
     */
    private Double parallelCordBeforeTearingTd3;

    /**
     * 平行软线撕裂前厚度测试数据4
     */
    private Double parallelCordBeforeTearingTd4;

    /**
     * 平行软线撕裂前厚度测试数据5
     */
    private Double parallelCordBeforeTearingTd5;

    /**
     * 平行软线撕裂前厚度测试数据6
     */
    private Double parallelCordBeforeTearingTd6;

    /**
     * 平行软线撕裂后厚度测试数据1
     */
    private Double parallelCordAfterTearingTd1;

    /**
     * 平行软线撕裂后厚度测试数据2
     */
    private Double parallelCordAfterTearingTd2;

    /**
     * 平行软线撕裂后厚度测试数据3
     */
    private Double parallelCordAfterTearingTd3;

    /**
     * 平行软线撕裂后厚度测试数据4
     */
    private Double parallelCordAfterTearingTd4;

    /**
     * 平行软线撕裂后厚度测试数据5
     */
    private Double parallelCordAfterTearingTd5;

    /**
     * 平行软线撕裂后厚度测试数据6
     */
    private Double parallelCordAfterTearingTd6;

    /**
     * 平行软线隔离筋厚度测试数据1
     */
    private Double parallelCordSpacerBarTd1;

    /**
     * 平行软线隔离筋厚度测试数据2
     */
    private Double parallelCordSpacerBarTd2;

    /**
     * 平行软线隔离筋厚度测试数据3
     */
    private Double parallelCordSpacerBarTd3;

    /**
     * 平行软线隔离筋厚度测试数据4
     */
    private Double parallelCordSpacerBarTd4;

    /**
     * 平行软线隔离筋厚度测试数据5
     */
    private Double parallelCordSpacerBarTd5;

    /**
     * 平行软线隔离筋厚度测试数据6
     */
    private Double parallelCordSpacerBarTd6;

    /**
     * 平行软线撕裂前厚度判断值
     */
    private Double parallelCordBeforeTearingDv;

    /**
     * 平行软线撕裂后厚度判断值
     */
    private Double parallelCordAfterTearingDv;

    /**
     * 平行软线隔离筋厚度判断值
     */
    private Double parallelCordSpacerBarDv;

    /**
     * 绝缘热冲击时间/h
     */
    private Double insulTsTime;

    /**
     * 绝缘热冲击温度/℃
     */
    private Double insulTsTemp;

    /**
     * 护套热冲击时间/h
     */
    private Double sheathTsTime;

    /**
     * 护套热冲击温度/℃
     */
    private Double sheathTsTemp;

    /**
     * 绝缘低温弯曲温度/℃
     */
    private Double insulLtBendTemp;

    /**
     * 绝缘低温弯曲时间/H
     */
    private Double insulLtBendTime;

    /**
     * 绝缘低温弯曲长度
     */
    private Double insulLtBendLenght;

    /**
     * 护套低温弯曲温度/℃
     */
    private Double sheathLtBendTemp;

    /**
     * 护套低温弯曲时间/H
     */
    private Double sheathLtBendTime;

    /**
     * 护套低温弯曲长度
     */
    private Double sheathLtBendLenght;

    /**
     * 绝缘加热变形判断值
     */
    private Double insulHtgDv;

    /**
     * 护套加热变形判断值
     */
    private Double sheathHtgDv;

    /**
     * 护套表面电阻
     */
    private Double sheathSurfaceR;

    /**
     * 护套表面电阻判断值
     */
    private Double sheathSurfaceRDv;

    /**
     * 截面积判断值
     */
    private Double csaDv;

    /**
     * 锭子总数
     */
    private Double spindleNum;

    /**
     * 每锭根数
     */
    private Double spindleRootNum;

    /**
     * 屏蔽单根直径
     */
    private Double singleShieldDiameter;

    /**
     * 节距
     */
    private Double pitch;

    /**
     * 屏蔽层直径
     */
    private Double shieldDiameter;

    /**
     * 绝缘外径判断值
     */
    private Double insulOdDv;

    /**
     * 剥离力测试数据1
     */
    private Double peelStrengthTd1;

    /**
     * 剥离力测试数据2
     */
    private Double peelStrengthTd2;

    /**
     * 剥离力测试数据3
     */
    private Double peelStrengthTd3;

    /**
     * 剥离力测试数据4
     */
    private Double peelStrengthTd4;

    /**
     * 低温弯曲是否无击穿
     */
    private String ltBendBreakdown;

    /**
     * 低温弯曲长度
     */
    private Double ltBendLenght;

    /**
     * 温湿度循环长度
     */
    private Double thcLenght;

    /**
     * 温湿度循环圈数
     */
    private Double thcLn;

    /**
     * 温湿度循环是否无击穿
     */
    private String thcCrack;

    /**
     * 耐热水长度
     */
    private Double hotWaterResistanceLenght;

    /**
     * 耐热水圈数
     */
    private Double hotWaterResistanceLn;

    /**
     * 耐热水是否无击穿
     */
    private String hotWaterResistanceCrack;

    /**
     * 耐热水测试值(正向)
     */
    private Double hotWaterResistanceForward;

    /**
     * 耐热水测试值(反向)
     */
    private Double hotWaterResistanceReverse;

    /**
     * 耐液体性汽油圈数
     */
    private Double waterResistanceGasolineLn;

    /**
     * 耐液体性汽油测试数据
     */
    private Double waterResistanceGasolineTd;

    /**
     * 耐液体性汽油百分比
     */
    private Double waterResistanceGasolinePct;

    /**
     * 耐液体性汽油是否无击穿
     */
    private String waterResistanceGasolineCrack;

    /**
     * 耐液体性乙醇圈数
     */
    private Double waterResistanceEthanolLn;

    /**
     * 耐液体性乙醇测试数据
     */
    private Double waterResistanceEthanolTd;

    /**
     * 耐液体性乙醇百分比
     */
    private Double waterResistanceEthanolPct;

    /**
     * 耐液体性乙醇是否无击穿
     */
    private String waterResistanceEthanolCrack;

    /**
     * 耐液体性柴油圈数
     */
    private Double waterResistanceDieselOilLn;

    /**
     * 耐液体性柴油测试数据
     */
    private Double waterResistanceDieselOilTd;

    /**
     * 耐液体性柴油百分比
     */
    private Double waterResistanceDieselOilPct;

    /**
     * 耐液体性柴油是否无击穿
     */
    private String waterResistanceDieselOilCrack;

    /**
     * 耐液体性IRM-902圈数
     */
    private Double waterResistanceIrm902Ln;

    /**
     * 耐液体性IRM-902测试数据
     */
    private Double waterResistanceIrm902Td;

    /**
     * 耐液体性IRM-902百分比
     */
    private Double waterResistanceIrm902Pct;

    /**
     * 耐液体性IRM-902是否无击穿
     */
    private String waterResistanceIrm902Crack;

    /**
     * 耐液体性IRM-903圈数
     */
    private Double waterResistanceIrm903Ln;

    /**
     * 耐液体性IRM-903测试数据
     */
    private Double waterResistanceIrm903Td;

    /**
     * 耐液体性IRM-903百分比
     */
    private Double waterResistanceIrm903Pct;

    /**
     * 耐液体性IRM-903是否无击穿
     */
    private String waterResistanceIrm903Crack;

    /**
     * 耐液体性自动排挡液圈数
     */
    private Double waterResistanceAtfLn;

    /**
     * 耐液体性自动排挡液测试数据
     */
    private Double waterResistanceAtfTd;

    /**
     * 耐液体性自动排挡液百分比
     */
    private Double waterResistanceAtfPct;

    /**
     * 耐液体性自动排挡液是否无击穿
     */
    private String waterResistanceAtfCrack;

    /**
     * 耐液体性防冻液圈数
     */
    private Double waterResistanceAntifreezeLn;

    /**
     * 耐液体性防冻液测试数据
     */
    private Double waterResistanceAntifreezeTd;

    /**
     * 耐液体性防冻液百分比
     */
    private Double waterResistanceAntifreezePct;

    /**
     * 耐液体性防冻液是否无击穿
     */
    private String waterResistanceAntifreezeCrack;

    /**
     * 耐液体性电池酸圈数
     */
    private Double waterResistanceBatteryAcidLn;

    /**
     * 耐液体性电池酸测试数据
     */
    private Double waterResistanceBatteryAcidTd;

    /**
     * 耐液体性电池酸百分比
     */
    private Double waterResistanceBatteryAcidPct;

    /**
     * 耐液体性电池酸是否无击穿
     */
    private String waterResistanceBatteryAcidCrack;

    /**
     * 阻燃试验自熄判断值
     */
    private Double frSelfExtinguishingDv;

    /**
     * 阻燃试验自熄时间
     */
    private Double frSelfExtinguishingTime;

    /**
     * 阻燃试验自熄测试值1
     */
    private Double frSelfExtinguishingTd1;

    /**
     * 阻燃试验自熄测试值2
     */
    private Double frSelfExtinguishingTd2;

    /**
     * 阻燃试验自熄测试值3
     */
    private Double frSelfExtinguishingTd3;

    /**
     * 阻燃试验未燃测试值1
     */
    private Double frUnburnedTd1;

    /**
     * 阻燃试验未燃测试值2
     */
    private Double frUnburnedTd2;

    /**
     * 阻燃试验未燃测试值3
     */
    private Double frUnburnedTd3;

    /**
     * 热延伸率
     */
    private Double hte;

    /**
     * 耐电压测试是否击穿
     */
    private String dielectricPok;

    /**
     * 剥离力
     */
    private Double peelStrength;

    /**
     * 高温压力温度
     */
    private Double hthpTemp;

    /**
     * 高温压力是否开裂
     */
    private String hthpCrack;

    /**
     * 低温卷绕重量/kg
     */
    private Double lowTemperatureWindingWeight;

    /**
     * 低温卷绕圈数
     */
    private Double lowTemperatureWindingLn;

    /**
     * 低温卷绕是否开裂
     */
    private String lowTemperatureWindingCrack;

    /**
     * 耐磨性（刮磨）判断值
     */
    private Double arDv;

    /**
     * 耐磨性（刮磨）测试值
     */
    private Double ar;

    /**
     * 长期老化摄氏度
     */
    private Double longTermAgingTemp;

    /**
     * 长期老化圈数
     */
    private Double longTermAgingLn;

    /**
     * 长期老化是否开裂
     */
    private String longTermAgingCrack;

    /**
     * 短期老化摄氏度
     */
    private Double shortTermAgingTemp;

    /**
     * 短期老化圈数
     */
    private Double shortTermAgingLn;

    /**
     * 短期老化重量/kg
     */
    private Double shortTermAgingWeight;

    /**
     * 短期老化是否开裂
     */
    private String shortTermAgingCrack;

    /**
     * 热过载圈数
     */
    private Double thermalOverloadLn;

    /**
     * 热过载是否开裂
     */
    private String thermalOverloadCrack;

    /**
     * 热收缩测试值
     */
    private Double thermalShrinkage;

    /**
     * 温湿度交变圈数
     */
    private Double temperatureHumidityHlternationLn;

    /**
     * 温湿度交变摄氏度1
     */
    private Double temperatureHumidityHlternationTemp1;

    /**
     * 温湿度交变摄氏度2
     */
    private Double temperatureHumidityHlternationTemp2;

    /**
     * 温湿度交变是否开裂
     */
    private String temperatureHumidityHlternationCrack;

    /**
     * 耐臭氧圈数
     */
    private Double ozoneResistanceLn;

    /**
     * 耐臭氧是否击穿
     */
    private String ozoneResistancePok;

    /**
     * 耐液体性发动机冷却液圈数
     */
    private Double waterResistanceEngineCoolantLn;

    /**
     * 耐液体性发动机冷却液测试数据
     */
    private Double waterResistanceEngineCoolantTd;

    /**
     * 耐液体性发动机冷却液百分比
     */
    private Double waterResistanceEngineCoolantPct;

    /**
     * 耐液体性发动机冷却液是否无击穿
     */
    private String waterResistanceEngineCoolantCrack;

    /**
     * 耐液体性发动机润滑油圈数
     */
    private Double waterResistanceEngineOilLn;

    /**
     * 耐液体性发动机润滑油测试数据
     */
    private Double waterResistanceEngineOilTd;

    /**
     * 耐液体性发动机润滑油百分比
     */
    private Double waterResistanceEngineOilPct;

    /**
     * 耐液体性发动机润滑油是否无击穿
     */
    private String waterResistanceEngineOilCrack;

    /**
     * 耐液体性转向助力液圈数
     */
    private Double waterResistancePowerSteeringFluidLn;

    /**
     * 耐液体性转向助力液测试数据
     */
    private Double waterResistancePowerSteeringFluidTd;

    /**
     * 耐液体性转向助力液百分比
     */
    private Double waterResistancePowerSteeringFluidPct;

    /**
     * 耐液体性转向助力液是否无击穿
     */
    private String waterResistancePowerSteeringFluidCrack;

    /**
     * 耐液体性电池酸是否无击穿
     */
    private String waterResistanceBatteryAcidPok;

    /**
     * 阻燃试验供火时间
     */
    private Double frFireSupplyTime;

    /**
     * 附着力判断值
     */
    private Double adhesionDv;

    /**
     * 附着力测试数据1
     */
    private Double adhesionTd1;

    /**
     * 附着力测试数据2
     */
    private Double adhesionTd2;

    /**
     * 附着力测试数据3
     */
    private Double adhesionTd3;

    /**
     * 附着力测试数据4
     */
    private Double adhesionTd4;

    /**
     * 附着力测试数据5
     */
    private Double adhesionTd5;

    /**
     * 加热变形摄氏度
     */
    private Double htgTemp;

    /**
     * 加热变形是否无开裂
     */
    private String htgCrack;

    /**
     * 加热变形是否无击穿
     */
    private String htgPok;

    /**
     * 低温弯曲重量
     */
    private Double ltBendWeight;

    /**
     * 低温冲击是否无击穿
     */
    private String lowTemperatureImpactPok;

    /**
     * 耐热性1(A)摄氏度
     */
    private Double hr1ATemp;

    /**
     * 耐热性1(A)时间
     */
    private Double hr1ATime;

    /**
     * 耐热性1(A)长度
     */
    private Double hr1ALenght;

    /**
     * 耐热性1(A)重量
     */
    private Double hr1AWeight;

    /**
     * 耐热性1(A)是否无开裂
     */
    private String hr1ACrack;

    /**
     * 耐热性1(A)是否无击穿
     */
    private String hr1APok;

    /**
     * 耐热性1(B)摄氏度
     */
    private Double hr1BTemp;

    /**
     * 耐热性1(B)时间
     */
    private Double hr1BTime;

    /**
     * 耐热性1(B)长度
     */
    private Double hr1BLenght;

    /**
     * 耐热性1(B)重量
     */
    private Double hr1BWeight;

    /**
     * 热性1(B)是否无开裂
     */
    private String hr1BCrack;

    /**
     * 耐热性1(B)是否无击穿
     */
    private String hr1BPok;

    /**
     * 耐热性1(C)是否无开裂
     */
    private String hr1CCrack;

    /**
     * 耐液体性汽油是否无击穿
     */
    private String waterResistanceGasolinePok;

    /**
     * 耐液体性柴油是否无击穿
     */
    private String waterResistanceDieselOilPok;

    /**
     * 耐液体性乙醇是否无击穿
     */
    private String waterResistanceEthanolPok;

    /**
     * 耐液体性自动排挡液是否无击穿
     */
    private String waterResistanceAtfPok;

    /**
     * 耐液体性防冻液是否无击穿
     */
    private String waterResistanceAntifreezePok;

    /**
     * 耐液体性IRM-902是否无击穿
     */
    private String waterResistanceIrm902Pok;

    /**
     * 耐液体性IRM-903是否无击穿
     */
    private String waterResistanceIrm903Pok;

    /**
     * 阻燃试验自熄测试值
     */
    private Double frSelfExtinguishingTd;

    /**
     * 热冲击长度
     */
    private Double tsLenght;

    /**
     * 热延伸试验负荷下长度
     */
    private Double hotStretchLoadLenght;

    /**
     * 热延伸试验冷却后长度
     */
    private Double hotStretchCoolingLenght;

    /**
     * 标志连续性
     */
    private Double signContinuity;

    /**
     * 浸水工频电压试验耐压
     */
    private Double immersionPowerFrequencyVoltageVoltage;

    /**
     * 浸水工频电压试验耐压时间
     */
    private Double immersionPowerFrequencyVoltageVoltageTime;

    /**
     * 浸水工频电压试验是否无击穿
     */
    private String immersionPowerFrequencyVoltagePok;

    /**
     * 室温工频电压试验摄氏度
     */
    private Double roomTempPowerFrequencyVoltageTemp;

    /**
     * 室温工频电压试验时间
     */
    private Double roomTempPowerFrequencyVoltageTime;

    /**
     * 室温工频电压试验长度
     */
    private String roomTempPowerFrequencyVoltageLenght;

    /**
     * 室温工频电压试验圈数
     */
    private Double roomTempPowerFrequencyVoltageLn;

    /**
     * 室温工频电压试验未老化样品耐压
     */
    private Double roomTempPowerFrequencyVoltageUnagedVoltage;

    /**
     * 室温工频电压试验未老化样品耐压时间
     */
    private Double roomTempPowerFrequencyVoltageUnagedVoltageTime;

    /**
     * 室温工频电压试验老化样品耐压
     */
    private Double roomTempPowerFrequencyVoltageAgingVoltage;

    /**
     * 室温工频电压试验老化样品耐压时间
     */
    private Double roomTempPowerFrequencyVoltageAgingVoltageTime;

    /**
     * 室温工频电压试验是否无击穿
     */
    private String roomTempPowerFrequencyVoltagePok;

    /**
     * 额定温度工频电压试验摄氏度
     */
    private Double ratedTempPowerFrequencyVoltageTemp;

    /**
     * 额定温度工频电压试验时间
     */
    private Double ratedTempPowerFrequencyVoltageTime;

    /**
     * 额定温度工频电压试验烤摄氏度
     */
    private Double ratedTempPowerFrequencyVoltageRoastTemp;

    /**
     * 额定温度工频电压试验烤耐压
     */
    private Double ratedTempPowerFrequencyVoltageVoltage;

    /**
     * 额定温度工频电压试验耐压时间
     */
    private Double ratedTempPowerFrequencyVoltageVoltageTime;

    /**
     * 额定温度工频电压试验是否无击穿
     */
    private String ratedTempPowerFrequencyVoltagePok;

    /**
     * 水平燃烧棉花是否点燃测试数据1
     */
    private String lightCottonHorizontalTd1;

    /**
     * 水平燃烧棉花是否点燃测试数据2
     */
    private String lightCottonHorizontalTd2;

    /**
     * 水平燃烧棉花是否点燃测试数据3
     */
    private String lightCottonHorizontalTd3;

    /**
     * 垂直燃烧棉花是否点燃测试数据1
     */
    private String lightCottonVerticalTd1;

    /**
     * 垂直燃烧棉花是否点燃测试数据2
     */
    private String lightCottonVerticalTd2;

    /**
     * 垂直燃烧棉花是否点燃测试数据3
     */
    private String lightCottonVerticalTd3;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据1
     */
    private Double z1TbfStartDistanceTd1;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据2
     */
    private Double z1TbfStartDistanceTd2;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据3
     */
    private Double z1TbfStartDistanceTd3;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据1
     */
    private Double z1TbfBurningDistanceTd1;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据2
     */
    private Double z1TbfBurningDistanceTd2;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据3
     */
    private Double z1TbfBurningDistanceTd3;

    /**
     * 兼容性护套老化前伸长测试数据1
     */
    private Double compatibilitySheathUnagedElongationTd1;

    /**
     * 兼容性护套老化前伸长测试数据2
     */
    private Double compatibilitySheathUnagedElongationTd2;

    /**
     * 兼容性护套老化前伸长测试数据3
     */
    private Double compatibilitySheathUnagedElongationTd3;

    /**
     * 兼容性护套老化前伸长测试数据4
     */
    private Double compatibilitySheathUnagedElongationTd4;

    /**
     * 兼容性护套老化前伸长测试数据5
     */
    private Double compatibilitySheathUnagedElongationTd5;

    /**
     * 兼容性护套老化前伸长测试数据6
     */
    private Double compatibilitySheathUnagedElongationTd6;

    /**
     * 兼容性护套老化前拉力测试数据1
     */
    private Double compatibilitySheathUnagedPullTd1;

    /**
     * 兼容性护套老化前拉力测试数据2
     */
    private Double compatibilitySheathUnagedPullTd2;

    /**
     * 兼容性护套老化前拉力测试数据3
     */
    private Double compatibilitySheathUnagedPullTd3;

    /**
     * 兼容性护套老化前拉力测试数据4
     */
    private Double compatibilitySheathUnagedPullTd4;

    /**
     * 兼容性护套老化前拉力测试数据5
     */
    private Double compatibilitySheathUnagedPullTd5;

    /**
     * 兼容性护套老化前拉力测试数据6
     */
    private Double compatibilitySheathUnagedPullTd6;

    /**
     * 兼容性护套老化后伸长测试数据1
     */
    private Double compatibilitySheathAgingElongationTd1;

    /**
     * 兼容性护套老化后伸长测试数据2
     */
    private Double compatibilitySheathAgingElongationTd2;

    /**
     * 兼容性护套老化后伸长测试数据3
     */
    private Double compatibilitySheathAgingElongationTd3;

    /**
     * 兼容性护套老化后伸长测试数据4
     */
    private Double compatibilitySheathAgingElongationTd4;

    /**
     * 兼容性护套老化后伸长测试数据5
     */
    private Double compatibilitySheathAgingElongationTd5;

    /**
     * 兼容性护套老化后伸长测试数据6
     */
    private Double compatibilitySheathAgingElongationTd6;

    /**
     * 兼容性护套老化后拉力测试数据1
     */
    private Double compatibilitySheathAgingPullTd1;

    /**
     * 兼容性护套老化后拉力测试数据2
     */
    private Double compatibilitySheathAgingPullTd2;

    /**
     * 兼容性护套老化后拉力测试数据3
     */
    private Double compatibilitySheathAgingPullTd3;

    /**
     * 兼容性护套老化后拉力测试数据4
     */
    private Double compatibilitySheathAgingPullTd4;

    /**
     * 兼容性护套老化后拉力测试数据5
     */
    private Double compatibilitySheathAgingPullTd5;

    /**
     * 兼容性护套老化后拉力测试数据6
     */
    private Double compatibilitySheathAgingPullTd6;

    /**
     * 兼容性绝缘延伸率中间值判断值
     */
    private Double compatibilityInsulUnagedEiMvsDv;

    /**
     * 兼容性绝缘抗张中间值判断值
     */
    private Double compatibilityInsulUnagedTsMvsDv;

    /**
     * 兼容性绝缘老化后延伸率中间值判断值
     */
    private Double compatibilityInsulAgingEiMvsDv;

    /**
     * 兼容性绝缘老化后抗张中间值判断值
     */
    private Double compatibilityInsulAgingTsMvsDv;

    /**
     * 兼容性绝缘老化后延伸残率判断值||兼容性绝缘老化延伸变化率判断值
     */
    private Double compatibilityInsulAgingEi;

    /**
     * 兼容性绝缘老化后抗张残率判断值||兼容性绝缘老化抗张变化率判断值
     */
    private Double compatibilityInsulAgingTs;

    /**
     * 兼容性护套延伸率中间值判断值
     */
    private Double compatibilitySheathUnagedEiMvsDv;

    /**
     * 兼容性护套抗张中间值判断值
     */
    private Double compatibilitySheathUnagedTsMvsDv;

    /**
     * 兼容性护套老化后延伸率中间值判断值
     */
    private Double compatibilitySheathAgingEiMvsDv;

    /**
     * 兼容性护套老化后抗张中间值判断值
     */
    private Double compatibilitySheathAgingTsMvsDv;

    /**
     * 兼容性护套老化后延伸残率判断值||兼容性护套老化延伸变化率判断值
     */
    private Double compatibilitySheathAgingEi;

    /**
     * 兼容性护套老化后抗张残率判断值||兼容性护套老化抗张变化率判断值
     */
    private Double compatibilitySheathAgingTs;

    /**
     * 曲挠次数
     */
    private Double flexureFrequency;

    /**
     * 90℃绝缘电阻
     */
    private Double ir90Calc;

    /**
     * 绝缘耐电压测试电流/M
     */
    private Double insulDielectricWithstandVoltageCurrent;

    /**
     * 成品耐电压测试电流/M||护套耐电压测试电流/M
     */
    private Double fgDielectricWithstandVoltageCurrent;

    /**
     * 护套外径判断值
     */
    private Double sheathOdDv;

    /**
     * 耐酸护套老化前伸长测试数据1
     */
    private Double arSheathUnagedElongationTd1;

    /**
     * 耐酸护套老化前伸长测试数据2
     */
    private Double arSheathUnagedElongationTd2;

    /**
     * 耐酸护套老化前伸长测试数据3
     */
    private Double arSheathUnagedElongationTd3;

    /**
     * 耐酸护套老化前伸长测试数据4
     */
    private Double arSheathUnagedElongationTd4;

    /**
     * 耐酸护套老化前伸长测试数据5
     */
    private Double arSheathUnagedElongationTd5;

    /**
     * 耐酸护套老化前伸长测试数据6
     */
    private Double arSheathUnagedElongationTd6;

    /**
     * 耐酸护套老化前拉力测试数据1
     */
    private Double arSheathUnagedPullTd1;

    /**
     * 耐酸护套老化前拉力测试数据2
     */
    private Double arSheathUnagedPullTd2;

    /**
     * 耐酸护套老化前拉力测试数据3
     */
    private Double arSheathUnagedPullTd3;

    /**
     * 耐酸护套老化前拉力测试数据4
     */
    private Double arSheathUnagedPullTd4;

    /**
     * 耐酸护套老化前拉力测试数据5
     */
    private Double arSheathUnagedPullTd5;

    /**
     * 耐酸护套老化前拉力测试数据6
     */
    private Double arSheathUnagedPullTd6;

    /**
     * 耐酸护套老化后伸长测试数据1
     */
    private Double arSheathAgingElongationTd1;

    /**
     * 耐酸护套老化后伸长测试数据2
     */
    private Double arSheathAgingElongationTd2;

    /**
     * 耐酸护套老化后伸长测试数据3
     */
    private Double arSheathAgingElongationTd3;

    /**
     * 耐酸护套老化后伸长测试数据4
     */
    private Double arSheathAgingElongationTd4;

    /**
     * 耐酸护套老化后伸长测试数据5
     */
    private Double arSheathAgingElongationTd5;

    /**
     * 耐酸护套老化后伸长测试数据6
     */
    private Double arSheathAgingElongationTd6;

    /**
     * 耐酸护套老化后拉力测试数据1
     */
    private Double arSheathAgingPullTd1;

    /**
     * 耐酸护套老化后拉力测试数据2
     */
    private Double arSheathAgingPullTd2;

    /**
     * 耐酸护套老化后拉力测试数据3
     */
    private Double arSheathAgingPullTd3;

    /**
     * 耐酸护套老化后拉力测试数据4
     */
    private Double arSheathAgingPullTd4;

    /**
     * 耐酸护套老化后拉力测试数据5
     */
    private Double arSheathAgingPullTd5;

    /**
     * 耐酸护套老化后拉力测试数据6
     */
    private Double arSheathAgingPullTd6;
    
    /**
     * 耐碱护套老化前伸长测试数据1
     */
    private Double apSheathUnagedElongationTd1;

    /**
     * 耐碱护套老化前伸长测试数据2
     */
    private Double apSheathUnagedElongationTd2;

    /**
     * 耐碱护套老化前伸长测试数据3
     */
    private Double apSheathUnagedElongationTd3;

    /**
     * 耐碱护套老化前伸长测试数据4
     */
    private Double apSheathUnagedElongationTd4;

    /**
     * 耐碱护套老化前伸长测试数据5
     */
    private Double apSheathUnagedElongationTd5;

    /**
     * 耐碱护套老化前伸长测试数据6
     */
    private Double apSheathUnagedElongationTd6;

    /**
     * 耐碱护套老化前拉力测试数据1
     */
    private Double apSheathUnagedPullTd1;

    /**
     * 耐碱护套老化前拉力测试数据2
     */
    private Double apSheathUnagedPullTd2;

    /**
     * 耐碱护套老化前拉力测试数据3
     */
    private Double apSheathUnagedPullTd3;

    /**
     * 耐碱护套老化前拉力测试数据4
     */
    private Double apSheathUnagedPullTd4;

    /**
     * 耐碱护套老化前拉力测试数据5
     */
    private Double apSheathUnagedPullTd5;

    /**
     * 耐碱护套老化前拉力测试数据6
     */
    private Double apSheathUnagedPullTd6;

    /**
     * 耐碱护套老化后伸长测试数据1
     */
    private Double apSheathAgingElongationTd1;

    /**
     * 耐碱护套老化后伸长测试数据2
     */
    private Double apSheathAgingElongationTd2;

    /**
     * 耐碱护套老化后伸长测试数据3
     */
    private Double apSheathAgingElongationTd3;

    /**
     * 耐碱护套老化后伸长测试数据4
     */
    private Double apSheathAgingElongationTd4;

    /**
     * 耐碱护套老化后伸长测试数据5
     */
    private Double apSheathAgingElongationTd5;

    /**
     * 耐碱护套老化后伸长测试数据6
     */
    private Double apSheathAgingElongationTd6;

    /**
     * 耐碱护套老化后拉力测试数据1
     */
    private Double apSheathAgingPullTd1;

    /**
     * 耐碱护套老化后拉力测试数据2
     */
    private Double apSheathAgingPullTd2;

    /**
     * 耐碱护套老化后拉力测试数据3
     */
    private Double apSheathAgingPullTd3;

    /**
     * 耐碱护套老化后拉力测试数据4
     */
    private Double apSheathAgingPullTd4;

    /**
     * 耐碱护套老化后拉力测试数据5
     */
    private Double apSheathAgingPullTd5;

    /**
     * 耐碱护套老化后拉力测试数据6
     */
    private Double apSheathAgingPullTd6;

    /**
     * 热寿命护套老化前伸长测试数据1
     */
    private Double thermalLifeSheathUnagedElongationTd1;

    /**
     * 热寿命护套老化前伸长测试数据2
     */
    private Double thermalLifeSheathUnagedElongationTd2;

    /**
     * 热寿命护套老化前伸长测试数据3
     */
    private Double thermalLifeSheathUnagedElongationTd3;

    /**
     * 热寿命护套老化前伸长测试数据4
     */
    private Double thermalLifeSheathUnagedElongationTd4;

    /**
     * 热寿命护套老化前伸长测试数据5
     */
    private Double thermalLifeSheathUnagedElongationTd5;

    /**
     * 热寿命护套老化前伸长测试数据6
     */
    private Double thermalLifeSheathUnagedElongationTd6;

    /**
     * 热寿命护套老化前拉力测试数据1
     */
    private Double thermalLifeSheathUnagedPullTd1;

    /**
     * 热寿命护套老化前拉力测试数据2
     */
    private Double thermalLifeSheathUnagedPullTd2;

    /**
     * 热寿命护套老化前拉力测试数据3
     */
    private Double thermalLifeSheathUnagedPullTd3;

    /**
     * 热寿命护套老化前拉力测试数据4
     */
    private Double thermalLifeSheathUnagedPullTd4;

    /**
     * 热寿命护套老化前拉力测试数据5
     */
    private Double thermalLifeSheathUnagedPullTd5;

    /**
     * 热寿命护套老化前拉力测试数据6
     */
    private Double thermalLifeSheathUnagedPullTd6;

    /**
     * 热寿命护套老化后伸长测试数据1
     */
    private Double thermalLifeSheathAgingElongationTd1;

    /**
     * 热寿命护套老化后伸长测试数据2
     */
    private Double thermalLifeSheathAgingElongationTd2;

    /**
     * 热寿命护套老化后伸长测试数据3
     */
    private Double thermalLifeSheathAgingElongationTd3;

    /**
     * 热寿命护套老化后伸长测试数据4
     */
    private Double thermalLifeSheathAgingElongationTd4;

    /**
     * 热寿命护套老化后伸长测试数据5
     */
    private Double thermalLifeSheathAgingElongationTd5;

    /**
     * 热寿命护套老化后伸长测试数据6
     */
    private Double thermalLifeSheathAgingElongationTd6;

    /**
     * 热寿命护套老化后拉力测试数据1
     */
    private Double thermalLifeSheathAgingPullTd1;

    /**
     * 热寿命护套老化后拉力测试数据2
     */
    private Double thermalLifeSheathAgingPullTd2;

    /**
     * 热寿命护套老化后拉力测试数据3
     */
    private Double thermalLifeSheathAgingPullTd3;

    /**
     * 热寿命护套老化后拉力测试数据4
     */
    private Double thermalLifeSheathAgingPullTd4;

    /**
     * 热寿命护套老化后拉力测试数据5
     */
    private Double thermalLifeSheathAgingPullTd5;

    /**
     * 热寿命护套老化后拉力测试数据6
     */
    private Double thermalLifeSheathAgingPullTd6;

    /**
     * 护套热延伸试验负荷下热延伸率
     */
    private Double sheathHotStretchLoadHte;

    /**
     * 护套热延伸试验冷却后热延伸率
     */
    private Double sheathHotStretchCoolingHte;

    /**
     * 耐电压测试耐压/kv
     */
    private Double dielectricWithstandVoltage;

    /**
     * 耐电压测试耐压时间/min
     */
    private Double dielectricWithstandVoltageTiem;

    /**
     * Cl测试值
     */
    private String cl;

    /**
     * Br测试值
     */
    private String br;

    /**
     * 数量
     */
    private Double numUl;

    /**
     * UL线径测试数据1
     */
    private Double diameterUlTd1;

    /**
     * UL线径测试数据2
     */
    private Double diameterUlTd2;

    /**
     * UL线径测试数据3
     */
    private Double diameterUlTd3;

    /**
     * UL线径测试数据4
     */
    private Double diameterUlTd4;

    /**
     * UL线径测试数据5
     */
    private Double diameterUlTd5;

    /**
     * UL线径测试数据6
     */
    private Double diameterUlTd6;

    /**
     * UL绝缘外径测试数据1
     */
    private Double insulOdUlTd1;

    /**
     * UL绝缘外径测试数据2
     */
    private Double insulOdUlTd2;

    /**
     * UL绝缘外径测试数据3
     */
    private Double insulOdUlTd3;

    /**
     * UL绝缘外径测试数据4
     */
    private Double insulOdUlTd4;

    /**
     * UL绝缘外径测试数据5
     */
    private Double insulOdUlTd5;

    /**
     * UL绝缘外径测试数据6
     */
    private Double insulOdUlTd6;

    /**
     * UL绝缘外径测试数据
     */
    private Double insulOdUlTd;

    /**
     * UL绝缘厚度测试数据1
     */
    private Double insulThkUlTd1;

    /**
     * UL绝缘厚度测试数据2
     */
    private Double insulThkUlTd2;

    /**
     * UL绝缘厚度测试数据3
     */
    private Double insulThkUlTd3;

    /**
     * UL绝缘厚度测试数据4
     */
    private Double insulThkUlTd4;

    /**
     * UL绝缘厚度测试数据5
     */
    private Double insulThkUlTd5;

    /**
     * UL绝缘厚度测试数据6
     */
    private Double insulThkUlTd6;

    /**
     * UL绝缘厚度测试数据7
     */
    private Double insulThkUlTd7;

    /**
     * UL绝缘厚度测试数据8
     */
    private Double insulThkUlTd8;

    /**
     * UL绝缘厚度测试数据9
     */
    private Double insulThkUlTd9;

    /**
     * UL绝缘厚度测试数据10
     */
    private Double insulThkUlTd10;

    /**
     * Ul护套厚度测试数据1
     */
    private Double sheathThkUlTd1;

    /**
     * Ul护套厚度测试数据2
     */
    private Double sheathThkUlTd2;

    /**
     * Ul护套厚度测试数据3
     */
    private Double sheathThkUlTd3;

    /**
     * Ul护套厚度测试数据4
     */
    private Double sheathThkUlTd4;

    /**
     * Ul护套厚度测试数据5
     */
    private Double sheathThkUlTd5;

    /**
     * Ul护套厚度测试数据6
     */
    private Double sheathThkUlTd6;

    /**
     * Ul护套厚度测试数据7
     */
    private Double sheathThkUlTd7;

    /**
     * Ul护套厚度测试数据8
     */
    private Double sheathThkUlTd8;

    /**
     * Ul护套厚度测试数据9
     */
    private Double sheathThkUlTd9;

    /**
     * Ul护套厚度测试数据10
     */
    private Double sheathThkUlTd10;

    /**
     * 绝缘平均厚度判断值
     */
    private Double insulAvgThkUl;

    /**
     * 绝缘最小厚度判断值
     */
    private Double insulMinThkUl;

    /**
     * 护套平均厚度判断值
     */
    private Double sheathAvgThkUl;

    /**
     * 护套最小厚度判断值
     */
    private Double sheathMinThkUl;

    /**
     * Ul老化条件温度/℃
     */
    private Double biTempUl;

    /**
     * Ul老化条件时间/H
     */
    private Double biTimeUl;

    /**
     * Ul护套老化前伸长测试数据1
     */
    private Double sheathUnagedElongationUlTd1;

    /**
     * Ul护套老化前伸长测试数据2
     */
    private Double sheathUnagedElongationUlTd2;

    /**
     * Ul护套老化前伸长测试数据3
     */
    private Double sheathUnagedElongationUlTd3;

    /**
     * Ul护套老化前伸长测试数据4
     */
    private Double sheathUnagedElongationUlTd4;

    /**
     * Ul护套老化前伸长测试数据5
     */
    private Double sheathUnagedElongationUlTd5;

    /**
     * Ul护套老化前伸长测试数据6
     */
    private Double sheathUnagedElongationUlTd6;

    /**
     * Ul护套老化前拉力测试数据1
     */
    private Double sheathUnagedPullUlTd1;

    /**
     * Ul护套老化前拉力测试数据2
     */
    private Double sheathUnagedPullUlTd2;

    /**
     * Ul护套老化前拉力测试数据3
     */
    private Double sheathUnagedPullUlTd3;

    /**
     * Ul护套老化前拉力测试数据4
     */
    private Double sheathUnagedPullUlTd4;

    /**
     * Ul护套老化前拉力测试数据5
     */
    private Double sheathUnagedPullUlTd5;

    /**
     * Ul护套老化前拉力测试数据6
     */
    private Double sheathUnagedPullUlTd6;

    /**
     * Ul护套老化后伸长测试数据1
     */
    private Double sheathAgingElongationUlTd1;

    /**
     * Ul护套老化后伸长测试数据2
     */
    private Double sheathAgingElongationUlTd2;

    /**
     * Ul护套老化后伸长测试数据3
     */
    private Double sheathAgingElongationUlTd3;

    /**
     * Ul护套老化后伸长测试数据4
     */
    private Double sheathAgingElongationUlTd4;

    /**
     * Ul护套老化后伸长测试数据5
     */
    private Double sheathAgingElongationUlTd5;

    /**
     * Ul护套老化后伸长测试数据6
     */
    private Double sheathAgingElongationUlTd6;

    /**
     * Ul护套老化后拉力测试数据1
     */
    private Double sheathAgingPullUlTd1;

    /**
     * Ul护套老化后拉力测试数据2
     */
    private Double sheathAgingPullUlTd2;

    /**
     * Ul护套老化后拉力测试数据3
     */
    private Double sheathAgingPullUlTd3;

    /**
     * Ul护套老化后拉力测试数据4
     */
    private Double sheathAgingPullUlTd4;

    /**
     * Ul护套老化后拉力测试数据5
     */
    private Double sheathAgingPullUlTd5;

    /**
     * Ul护套老化后拉力测试数据6
     */
    private Double sheathAgingPullUlTd6;

    /**
     * IEC热延伸试验负荷下热延伸率
     */
    private Double sheathHotStretchLoadHteIec;

    /**
     * IEC热延伸试验冷却后热延伸率
     */
    private Double sheathHotStretchCoolingHteIec;

    /**
     * IEC护套低温弯曲圈数/圈
     */
    private Double sheathLtBendLnIec;

    /**
     * IEC护套低温弯曲是否无开裂
     */
    private String sheathLtBendCrackIec;

    /**
     * 加热前值
     */
    private Double sheathBeforeHeatingTd;

    /**
     * 加热后值
     */
    private Double sheathAfterHeatingTd;

    /**
     * IEC绝缘电阻判断值
     */
    private Double irCalcIecDv;

    /**
     * IEC耐电压测试是否击穿
     */
    private String dielectricPokIec;

    /**
     * 附着力
     */
    private Double adhesion;

    /**
     * 低温卷绕直径
     */
    private Double lowTemperatureWindingDiameter;

    /**
     * 热过载直径
     */
    private Double thermalOverloadDiameter;

    /**
     * 热过载重量
     */
    private Double thermalOverloadWeight;

    /**
     * 耐液体性汽油直径
     */
    private Double waterResistanceGasolineDiameter;

    /**
     * 耐液体性柴油直径
     */
    private Double waterResistanceDieselOilDiameter;

    /**
     * 耐液体性乙醇直径
     */
    private Double waterResistanceEthanolDiameter;

    /**
     * 耐液体性电池酸直径
     */
    private Double waterResistanceBatteryAcidDiameter;

    /**
     * 耐液体性发动机润滑油直径
     */
    private Double waterResistanceEngineOilDiameter;

    /**
     * 耐液体性转向助力液直径
     */
    private Double waterResistancePowerSteeringFluidDiameter;

    /**
     * 耐液体性自动排挡液直径||耐液体性自动变速箱油直径
     */
    private Double waterResistanceAtfDiameter;

    /**
     * 耐液体性防冻液直径
     */
    private Double waterResistanceAntifreezeDiameter;

    /**
     * 工频交流电压是否无击穿
     */
    private String powerFrequencyVoltagePok;

    /**
     * 击穿电压是否无击穿
     */
    private String breakdownVoltagePok;

    /**
     * 高温压力测试值
     */
    private Double hthpTd;

    /**
     * 热收缩原长
     */
    private Double thermalShrinkageOriginalLength;

    /**
     * 热收缩加热后长
     */
    private Double thermalShrinkageHeatingLenght;

    /**
     * 过热试验是否无开裂
     */
    private String overheatCrack;

    /**
     * 低温冲击4hr是否无开裂
     */
    private String lowTemperatureImpact4hrCrack;

    /**
     * 附着力是否无脱落
     */
    private String adhesionFallOff;

    /**
     * 剥离是否容易
     */
    private String peelEasy;

    /**
     * 耐油是否无开裂
     */
    private String oilResistantCrack;

    /**
     * 耐燃料是否无开裂
     */
    private String fuelResistantCrack;

    /**
     * 耐磨性重量
     */
    private Double arWeight;

    /**
     * 耐电压测试介电文字
     */
    private String withstandVoltageDielectricText;

    /**
     * 耐电压测试介电浸水
     */
    private String withstandVoltageDielectricImmersion;

    /**
     * 耐电压测试电压
     */
    private Double withstandVoltageVoltage;

    /**
     * 耐电压测试升高电压
     */
    private Double withstandVoltageRaiseVoltage;

    /**
     * 短期老化直径
     */
    private Double shortTermAgingDiameter;

    /**
     * 耐液体性转向助力液是否无击穿
     */
    private String waterResistancePowerSteeringFluidPok;

    /**
     * 耐液体性制动液圈数
     */
    private Double waterResistanceBrakeFluidLn;

    /**
     * 耐液体性制动液是否无开裂
     */
    private String waterResistanceBrakeFluidCrack;

    /**
     * 耐液体性制动液是否无击穿
     */
    private String waterResistanceBrakeFluidPok;

    /**
     * 卷绕加热圈数
     */
    private Double windingHeatingLn;

    /**
     * 卷绕加热是否开裂
     */
    private String windingHeatingCrack;

    /**
     * 卷绕加热直径
     */
    private Double windingHeatingDiameter;

    /**
     * 20℃绝缘电阻长
     */
    private Double ir20Length;

    /**
     * 20℃绝缘电阻测试数据
     */
    private Double ir20Td;

    /**
     * 20℃绝缘电阻判断值
     */
    private Double ir20CalcDv;

    /**
     * 60℃绝缘电阻长
     */
    private Double ir60Length;

    /**
     * 60℃绝缘电阻测试数据
     */
    private Double ir60Td;

    /**
     * 60℃绝缘电阻判断值
     */
    private Double ir60CalcDv;

    /**
     * 耐电压测试(浸水)耐压/kv
     */
    private Double dielectricImmersionWithstandVoltage;

    /**
     * 耐电压测试(浸水)耐压时间/min
     */
    private Double dielectricImmersionWithstandVoltageTime;

    /**
     * 耐电压测试(浸水)是否击穿
     */
    private String dielectricImmersionWithstandVoltagePok;

    /**
     * 耐电压测试(空气)耐压/kv
     */
    private Double dielectricAirWithstandVoltage;

    /**
     * 耐电压测试(空气)耐压时间/min
     */
    private Double dielectricAirWithstandVoltageTime;

    /**
     * 耐电压测试(空气)是否击穿
     */
    private String dielectricAirWithstandVoltagePok;

    /**
     * 护套哑铃片老化前厚度测试数据1
     */
    private Double sheathDumbbellSliceUnagedThkTd1;

    /**
     * 护套哑铃片老化前厚度测试数据2
     */
    private Double sheathDumbbellSliceUnagedThkTd2;

    /**
     * 护套哑铃片老化前厚度测试数据3
     */
    private Double sheathDumbbellSliceUnagedThkTd3;

    /**
     * 护套哑铃片老化前厚度测试数据4
     */
    private Double sheathDumbbellSliceUnagedThkTd4;

    /**
     * 护套哑铃片老化前厚度测试数据5
     */
    private Double sheathDumbbellSliceUnagedThkTd5;

    /**
     * 护套哑铃片老化前厚度测试数据6
     */
    private Double sheathDumbbellSliceUnagedThkTd6;

    /**
     * 护套哑铃片老化后厚度测试数据1
     */
    private Double sheathDumbbellSliceAgingThkTd1;

    /**
     * 护套哑铃片老化后厚度测试数据2
     */
    private Double sheathDumbbellSliceAgingThkTd2;

    /**
     * 护套哑铃片老化后厚度测试数据3
     */
    private Double sheathDumbbellSliceAgingThkTd3;

    /**
     * 护套哑铃片老化后厚度测试数据4
     */
    private Double sheathDumbbellSliceAgingThkTd4;

    /**
     * 护套哑铃片老化后厚度测试数据5
     */
    private Double sheathDumbbellSliceAgingThkTd5;

    /**
     * 护套哑铃片老化后厚度测试数据6
     */
    private Double sheathDumbbellSliceAgingThkTd6;

    /**
     * 热冲击文本
     */
    private String tsText;

    /**
     * 低温弯曲文本
     */
    private String ltBendText;

    /**
     * 柔韧性文本
     */
    private String flexibilityText;

    /**
     * 护套老化计算模板
     */
    private String sheathAgingCt;

    /**
     * 加热变形计算模板
     */
    private String htgDeformationRateCt;

    /**
     * 加热变形前线径测试数据
     */
    private Double htgFrontDiameter;

    /**
     * 加热变形后线径测试数据
     */
    private Double htgRearDiameter;

    /**
     * 加热变形心棒直径测试数据
     */
    private Double htgMandrelDiameter;

    /**
     * 绝缘电阻判断文本
     */
    private String irCalcDvText;

    /**
     * 绝缘电阻判断结果
     */
    private String irCalcDvResult;

    /**
     * 绝缘电阻温度
     */
    private Double irCalcTemp;

    /**
     * 绝缘热冲击直径
     */
    private String insulTsDiameter;

    /**
     * 护套热冲击直径
     */
    private String sheathTsDiameter;

    /**
     * 绝缘低温弯曲直径
     */
    private String insulLtBendDiameter;

    /**
     * 护套低温弯曲直径
     */
    private String sheathLtBendDiameter;

    /**
     * 耐热水测试值MΩ(正向)
     */
    private Double hotWaterResistanceForwardSampleLength;

    /**
     * 耐热水测试值MΩ(反向)
     */
    private Double hotWaterResistanceReverseSampleLength;

    /**
     * 热过载温度
     */
    private Double thermalOverloadTemp;

    /**
     * 护套热收缩测试值
     */
    private Double sheathThermalShrinkage;

    /**
     * 低温冲击温度
     */
    private Double lowTemperatureTemp;

    /**
     * 绝缘失重判断值
     */
    private Double insulWlDv;

    /**
     * 护套失重判断值
     */
    private Double sheathWlDv;

    /**
     * 低温弯曲直径
     */
    private String ltBendDiameter;

    /**
     * 低温冲击重量(带符号)
     */
    private String lowTemperatureImpactString;

    /**
     * 过热试验直径
     */
    private String overheatDiameter;

    /**
     * 过热试验圈数
     */
    private String overheatLn;

    /**
     * 整体厚度测试值1
     */
    private Double wholeThkTd1;

    /**
     * 整体厚度测试值2
     */
    private Double wholeThkTd2;

    /**
     * 整体厚度测试值3
     */
    private Double wholeThkTd3;

    /**
     * 整体厚度测试值4
     */
    private Double wholeThkTd4;

    /**
     * 整体厚度测试值5
     */
    private Double wholeThkTd5;

    /**
     * 整体厚度测试值6
     */
    private Double wholeThkTd6;

    /**
     * 整体厚度测试值7
     */
    private Double wholeThkTd7;

    /**
     * 整体厚度测试值8
     */
    private Double wholeThkTd8;

    /**
     * 整体厚度测试值9
     */
    private Double wholeThkTd9;

    /**
     * 整体厚度测试值10
     */
    private Double wholeThkTd10;

    /**
     * 整体厚度测试值11
     */
    private Double wholeThkTd11;

    /**
     * 整体厚度测试值12
     */
    private Double wholeThkTd12;

    /**
     * 整体厚度测试值13
     */
    private Double wholeThkTd13;

    /**
     * 整体厚度测试值14
     */
    private Double wholeThkTd14;

    /**
     * 整体厚度测试值15
     */
    private Double wholeThkTd15;

    /**
     * 整体厚度测试值16
     */
    private Double wholeThkTd16;

    /**
     * 整体厚度测试值17
     */
    private Double wholeThkTd17;

    /**
     * 整体厚度测试值18
     */
    private Double wholeThkTd18;

    /**
     * 85℃耐凹痕无开裂
     */
    private String dentResistance85Crack;

    /**
     * 20℃耐凹痕无开裂
     */
    private String dentResistance20Crack;

    /**
     * -15℃耐凹痕无开裂
     */
    private String dentResistance15Crack;

    /**
     * 护套表面绝缘电阻测试值1
     */
    private Double sheathSurfaceIrCalc1;

    /**
     * 护套表面绝缘电阻测试值2
     */
    private Double sheathSurfaceIrCalc2;

    /**
     * 护套表面绝缘电阻测试值3
     */
    private Double sheathSurfaceIrCalc3;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}