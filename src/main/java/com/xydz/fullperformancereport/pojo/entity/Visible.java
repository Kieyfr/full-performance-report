package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 全性能报告显示表
 * @TableName FPR_VISIBLE
 */
@TableName(value ="FPR_VISIBLE")
@Data
public class Visible implements Serializable {
    /**
     * 绝缘颜色是否可见
     */
    private Boolean isColor;

    /**
     * 导体根数是否可见
     */
    private Boolean isNum;

    /**
     * 导体单根线径是否可见
     */
    private Boolean isDiameter;

    /**
     * 导体截面积是否可见||截面规格是否可见
     */
    private Boolean isCsa;

    /**
     * 绝缘外径是否可见
     */
    private Boolean isInsulOd;

    /**
     * 绝缘平均厚度是否可见
     */
    private Boolean isInsulThkAvg;

    /**
     * 绝缘最小厚度是否可见
     */
    private Boolean isInsulThkMin;

    /**
     * 护套外径是否可见
     */
    private Boolean isSheathOd;

    /**
     * 护套平均厚度是否可见
     */
    private Boolean isSheathThkAvg;

    /**
     * 护套最小厚度是否可见
     */
    private Boolean isSheathThkMin;

    /**
     * 绝缘老化条件是否可见
     */
    private Boolean isInsulBiCondition;

    /**
     * 绝缘延伸率是否可见
     */
    private Boolean isInsulUnagedEi;

    /**
     * 绝缘抗张强度是否可见
     */
    private Boolean isInsulUnagedTs;

    /**
     * 绝缘老化后延伸残率是否可见||绝缘老化延伸变化率是否可见
     */
    private Boolean isInsulAgingEi;

    /**
     * 绝缘老化后抗张残率是否可见||绝缘老化抗张变化率是否可见
     */
    private Boolean isInsulAgingTs;

    /**
     * 护套老化条件是否可见
     */
    private Boolean isSheathBiCondition;

    /**
     * 护套延伸率是否可见
     */
    private Boolean isSheathUnagedEi;

    /**
     * 护套抗张强度是否可见
     */
    private Boolean isSheathUnagedTs;

    /**
     * 护套老化后延伸残率是否可见||护套老化延伸变化率是否可见
     */
    private Boolean isSheathAgingEi;

    /**
     * 护套老化后抗张残率是否可见||护套老化抗张变化率是否可见
     */
    private Boolean isSheathAgingTs;

    /**
     * 印字耐擦是否可见
     */
    private Boolean isPrintingErasibilit;

    /**
     * 导体腐蚀是否可见
     */
    private Boolean isConductorCorrosion;

    /**
     * 热冲击是否可见
     */
    private Boolean isTsCrack;

    /**
     * 低温弯曲是否可见
     */
    private Boolean isLtBendCrack;

    /**
     * 柔韧性是否可见
     */
    private Boolean isFlexibilityCrack;

    /**
     * 绝缘加热变形是否可见
     */
    private Boolean isInsulHtgDeformationRate;

    /**
     * 护套加热变形是否可见
     */
    private Boolean isSheathHtgDeformationRate;

    /**
     * 20℃导体直流电阻是否可见
     */
    private Boolean isConductor20Dcr;

    /**
     * 绝缘电阻是否可见
     */
    private Boolean isIrCalc;

    /**
     * 耐电压测试(介电III)是否可见
     */
    private Boolean isDielectricIiiPok;

    /**
     * 耐电压测试(介电I)是否可见
     */
    private Boolean isDielectricIPok;

    /**
     * 高压直流线介质耐压试验I是否可见
     */
    private Boolean isHvdcWirePok;

    /**
     * VW-1是否可见
     */
    private Boolean isVw1;

    /**
     * FT2是否可见
     */
    private Boolean isFt2;

    /**
     * UL水平燃烧是否可见
     */
    private Boolean isUlHorizontalBurning;

    /**
     * 热延伸率是否可见
     */
    private Boolean isThermalElongation;

    /**
     * 报告编号
     */
    @TableId
    private String reportNo;

    /**
     * 导体材质是否可见
     */
    private Boolean isMaterialQuality;

    /**
     * 绝缘材质是否可见
     */
    private Boolean isInsulMaterialQuality;

    /**
     * 护套材质是否可见
     */
    private Boolean isSheathMaterialQuality;

    /**
     * 椭圆度是否可见
     */
    private Boolean isEllipticity;

    /**
     * 绝缘延伸率中间值是否可见
     */
    private Boolean isInsulUnagedEiMvs;

    /**
     * 绝缘抗张中间值是否可见
     */
    private Boolean isInsulUnagedTsMvs;

    /**
     * 绝缘老化后延伸率中间值是否可见
     */
    private Boolean isInsulAgingEiMvs;

    /**
     * 绝缘老化后抗张中间值是否可见
     */
    private Boolean isInsulAgingTsMvs;

    /**
     * 护套延伸率中间值是否可见
     */
    private Boolean isSheathUnagedEiMvs;

    /**
     * 护套抗张中间值是否可见
     */
    private Boolean isSheathUnagedTsMvs;

    /**
     * 护套老化后延伸率中间值是否可见
     */
    private Boolean isSheathAgingEiMvs;

    /**
     * 护套老化后抗张中间值是否可见
     */
    private Boolean isSheathAgingTsMvs;

    /**
     * 失重是否可见
     */
    private Boolean isWl;

    /**
     * 低温冲击是否可见
     */
    private Boolean isLowTemperatureImpact;

    /**
     * 高温压力是否可见
     */
    private Boolean isHthp;

    /**
     * 热稳定性是否可见
     */
    private Boolean isThermalStability;

    /**
     * 曲挠试验是否可见
     */
    private Boolean isFlexureTest;

    /**
     * 印字间距是否可见
     */
    private Boolean isPrintingSpace;

    /**
     * 90℃绝缘电阻是否可见
     */
    private Boolean isIr90Calc;

    /**
     * 耐电压测试是否可见
     */
    private Boolean isDielectricPok;

    /**
     * GB/T 18380.12-2008单根电线垂直蔓延燃烧试验是否可见
     */
    private Boolean isGbTbfStartDistance;

    /**
     * 撕裂前最小厚度是否可见
     */
    private Boolean isBeforeTearingThkMin;

    /**
     * 撕裂后最小厚度是否可见
     */
    private Boolean isAfterTearingThkMin;

    /**
     * 隔离筋最小厚度是否可见
     */
    private Boolean isSpacerBarThkMin;

    /**
     * 护套表面电阻是否可见
     */
    private Boolean isSheathSurfaceR;

    /**
     * 编织密度是否可见
     */
    private Boolean isBraidingDensity;

    /**
     * 剥离力是否可见
     */
    private Boolean isPeelStrength;

    /**
     * 温湿度循环是否可见
     */
    private Boolean isThc;

    /**
     * 耐热水是否可见
     */
    private Boolean isHotWaterResistance;

    /**
     * 耐液体性是否可见
     */
    private Boolean isWaterResistance;

    /**
     * 阻燃试验是否可见
     */
    private Boolean isFr;

    /**
     * 低温卷绕是否可见
     */
    private Boolean isLowTemperatureWinding;

    /**
     * 耐磨性（刮磨）是否可见
     */
    private Boolean isAr;

    /**
     * 长期老化是否可见
     */
    private Boolean isLongTermAging;

    /**
     * 短期老化是否可见
     */
    private Boolean isShortTermAging;

    /**
     * 热过载是否可见
     */
    private Boolean isThermalOverload;

    /**
     * 热收缩是否可见
     */
    private Boolean isThermalShrinkage;

    /**
     * 温湿度交变是否可见
     */
    private Boolean isTemperatureHumidityHlternation;

    /**
     * 耐臭氧是否可见
     */
    private Boolean isOzoneResistance;

    /**
     * 耐电池酸是否可见
     */
    private Boolean isBatteryAcid;

    /**
     * 附着力是否可见
     */
    private Boolean isAdhesion;

    /**
     * 加热变形是否可见
     */
    private Boolean isHtg;

    /**
     * 耐热性1(A)是否可见
     */
    private Boolean isHr1A;

    /**
     * 耐热性1(B)是否可见
     */
    private Boolean isHr1B;

    /**
     * 耐热性1(C)是否可见
     */
    private Boolean isHr1C;

    /**
     * 热延伸试验是否可见
     */
    private Boolean isHotStretch;

    /**
     * 标志连续性是否可见
     */
    private Boolean isSignContinuity;

    /**
     * 浸水工频电压试验是否可见
     */
    private Boolean isImmersionPowerFrequencyVoltage;

    /**
     * 室温工频电压试验是否可见
     */
    private Boolean isRoomTempPowerFrequencyVoltage;

    /**
     * 额定温度工频电压试验是否可见
     */
    private Boolean isRatedTempPowerFrequencyVoltage;

    /**
     * 水平燃烧试验是否可见
     */
    private Boolean isHorizontalBurning;

    /**
     * 垂直燃烧试验是否可见
     */
    private Boolean isVerticalBurning;

    /**
     * 垂直燃烧试验（代号Z或Z1电缆)是否可见
     */
    private Boolean isZVerticalBurning;

    /**
     * 兼容性条件是否可见
     */
    private Boolean isCompatibility;

    /**
     * 兼容性绝缘延伸率中间值是否可见
     */
    private Boolean isCompatibilityInsulUnagedEiMvs;

    /**
     * 兼容性绝缘抗张中间值是否可见
     */
    private Boolean isCompatibilityInsulUnagedTsMvs;

    /**
     * 兼容性绝缘老化后延伸率中间值是否可见
     */
    private Boolean isCompatibilityInsulAgingEiMvs;

    /**
     * 兼容性绝缘老化后抗张中间值是否可见
     */
    private Boolean isCompatibilityInsulAgingTsMvs;

    /**
     * 兼容性绝缘老化后延伸残率是否可见||兼容性绝缘老化延伸变化率是否可见
     */
    private Boolean isCompatibilityInsulAgingEi;

    /**
     * 兼容性绝缘老化后抗张残率是否可见||兼容性绝缘老化抗张变化率是否可见
     */
    private Boolean isCompatibilityInsulAgingTs;

    /**
     * 兼容性护套延伸率中间值是否可见
     */
    private Boolean isCompatibilitySheathUnagedEiMvs;

    /**
     * 兼容性护套抗张中间值是否可见
     */
    private Boolean isCompatibilitySheathUnagedTsMvs;

    /**
     * 兼容性护套老化后延伸率中间值是否可见
     */
    private Boolean isCompatibilitySheathAgingEiMvs;

    /**
     * 兼容性护套老化后抗张中间值是否可见
     */
    private Boolean isCompatibilitySheathAgingTsMvs;

    /**
     * 兼容性护套老化后延伸残率是否可见||兼容性护套老化延伸变化率是否可见
     */
    private Boolean isCompatibilitySheathAgingEi;

    /**
     * 兼容性护套老化后抗张残率是否可见||兼容性护套老化抗张变化率是否可见
     */
    private Boolean isCompatibilitySheathAgingTs;

    /**
     * 老化条件是否可见
     */
    private Boolean isBiCondition;

    /**
     * 耐酸条件是否可见
     */
    private Boolean isArCondition;

    /**
     * 护套耐酸前延伸率是否可见
     */
    private Boolean isArSheathUnagedEi;

    /**
     * 护套耐酸后延伸率是否可见
     */
    private Boolean isArSheathAgingEi;

    /**
     * 护套耐酸抗张变化率是否可见
     */
    private Boolean isArSheathAgingTsChang;

    /**
     * 护套耐碱前延伸率是否可见
     */
    private Boolean isApSheathUnagedEi;

    /**
     * 护套耐碱后延伸率是否可见
     */
    private Boolean isApSheathAgingEi;

    /**
     * 护套耐碱抗张变化率是否可见
     */
    private Boolean isApSheathAgingTsChang;

    /**
     * 热寿命条件是否可见
     */
    private Boolean isThermalLifeCondition;

    /**
     * 绝缘热寿命后延伸保留率是否可见
     */
    private Boolean isThermalLifeInsulAgingEiRetain;

    /**
     * 护套热寿命后延伸保留率是否可见
     */
    private Boolean isThermalLifeSheathAgingEiRetain;

    /**
     * 绝缘热延伸是否可见
     */
    private Boolean isInsulHotStretchLoadHte;

    /**
     * 护套热延伸是否可见
     */
    private Boolean isSheathHotStretchLoadHte;

    /**
     * Cl是否可见
     */
    private Boolean isCl;

    /**
     * Br是否可见
     */
    private Boolean isBr;

    /**
     * 耐碱条件是否可见
     */
    private Boolean isApCondition;

    /**
     * Ul导体根数是否可见
     */
    private Boolean isNumUl;

    /**
     * Ul导体单根线径是否可见
     */
    private Boolean isDiameterUl;

    /**
     * Ul绝缘外径是否可见
     */
    private Boolean isInsulOdUl;

    /**
     * Ul绝缘平均厚度是否可见
     */
    private Boolean isInsulThkUlAvg;

    /**
     * Ul绝缘最小厚度是否可见
     */
    private Boolean isInsulThkUlMin;

    /**
     * Ul护套外径是否可见
     */
    private Boolean isSheathOdUl;

    /**
     * Ul护套平均厚度是否可见
     */
    private Boolean isSheathThkUlAvg;

    /**
     * Ul护套最小厚度是否可见
     */
    private Boolean isSheathThkUlMin;

    /**
     * Ul老化条件是否可见
     */
    private Boolean isBiConditionUl;

    /**
     * Ul护套延伸率是否可见
     */
    private Boolean isSheathUnagedEiUl;

    /**
     * Ul护套抗张强度是否可见
     */
    private Boolean isSheathUnagedTsUl;

    /**
     * Ul护套老化后延伸残率是否可见||Ul护套老化延伸变化率是否可见
     */
    private Boolean isSheathAgingEiUl;

    /**
     * Ul护套老化后抗张残率是否可见||Ul护套老化抗张变化率是否可见
     */
    private Boolean isSheathAgingTsUl;

    /**
     * IEC热延伸是否可见
     */
    private Boolean isSheathHotStretchLoadHteIec;

    /**
     * IEC低温弯曲是否可见
     */
    private Boolean isLtBendCrackIec;

    /**
     * IEC绝缘电阻是否可见
     */
    private Boolean isIrCalcIec;

    /**
     * IEC耐电压测试是否可见
     */
    private Boolean isDielectricPokIec;

    /**
     * 工频交流电压是否可见
     */
    private Boolean isPowerFrequencyVoltage;

    /**
     * 击穿电压是否可见
     */
    private Boolean isBreakdownVoltage;

    /**
     * 过热试验是否可见
     */
    private Boolean isOverheat;

    /**
     * 低温冲击4hr是否可见
     */
    private Boolean isLowTemperatureImpact4hr;

    /**
     * 剥离是否可见
     */
    private Boolean isPeel;

    /**
     * 耐油是否可见
     */
    private Boolean isOilResistant;

    /**
     * 耐燃料是否可见
     */
    private Boolean isFuelResistant;

    /**
     * 卷绕加热是否可见
     */
    private Boolean isWindingHeating;

    /**
     * 20℃绝缘电阻是否可见
     */
    private Boolean isIr20Calc;

    /**
     * 60℃绝缘电阻是否可见
     */
    private Boolean isIr60Calc;

    /**
     * 耐电压测试(浸水)是否可见
     */
    private Boolean isDielectricImmersion;

    /**
     * 耐电压测试(空气)是否可见
     */
    private Boolean isDielectricAir;

    /**
     * 绝缘低温弯曲是否可见
     */
    private Boolean isInsulLtBendCrack;

    /**
     * 护套低温弯曲是否可见
     */
    private Boolean isSheathLtBendCrack;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}