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
     * 报告编号
     */
    @TableId
    private String reportNo;

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
     * 导体截面积是否可见
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
     * 绝缘老化后延伸残率是否可见
     */
    private Boolean isInsulAgingEi;

    /**
     * 绝缘老化后抗张残率是否可见
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
     * 护套老化后延伸残率是否可见
     */
    private Boolean isSheathAgingEi;

    /**
     * 护套老化后抗张残率是否可见
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
     * VW-1第1次施火延燃是否可见
     */
    private Boolean isFirstFlameRetarding;

    /**
     * VW-1第2次施火延燃是否可见
     */
    private Boolean isSecondFlameRetarding;

    /**
     * VW-1第3次施火延燃是否可见
     */
    private Boolean isThirdFlameRetarding;

    /**
     * VW-1第4次施火延燃是否可见
     */
    private Boolean isFourthFlameRetarding;

    /**
     * VW-1第5次施火延燃是否可见
     */
    private Boolean isFifthFlameRetarding;

    /**
     * VW-1旗子烧毁面积是否可见
     */
    private Boolean isFlagBurningArea;

    /**
     * VW-1棉花是否点燃是否可见
     */
    private Boolean isLightCottonVw1;

    /**
     * FT2施火30秒后燃烧长度是否可见
     */
    private Boolean isBurningAfterLenght;

    /**
     * FT2棉花是否点燃是否可见
     */
    private Boolean isLightCottonFt2;

    /**
     * UL水平燃烧时间是否可见
     */
    private Boolean isBurningTime;

    /**
     * UL水平燃烧棉花是否点燃是否可见
     */
    private Boolean isLightCottonUl;

    /**
     * 热延伸率是否可见
     */
    private Boolean isThermalElongation;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}