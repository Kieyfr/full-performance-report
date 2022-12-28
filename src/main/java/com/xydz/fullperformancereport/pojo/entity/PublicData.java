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
    private String thermalStability;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}