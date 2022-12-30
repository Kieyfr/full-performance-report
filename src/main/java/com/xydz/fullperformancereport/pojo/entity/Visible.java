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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}