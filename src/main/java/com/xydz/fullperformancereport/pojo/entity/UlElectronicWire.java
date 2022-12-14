package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 全性能报告表UI电子线表
 * @TableName FPR_UL_ELECTRONIC_WIRE
 */
@TableName(value ="FPR_UL_ELECTRONIC_WIRE")
@Data
public class UlElectronicWire implements Serializable {
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
    private String reportNo;

    /**
     * 送检日期
     */
    private Date submitterDate;

    /**
     * 样品状态
     */
    private String sampleStatus;

    /**
     * 测试日期起始
     */
    private Date startTestDate;

    /**
     * 测试日期终止
     */
    private Date endTestDate;

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
     * 棉花是否点燃测试数据1
     */
    private String lightCottonVw1Td1;

    /**
     * 棉花是否点燃测试数据2
     */
    private String lightCottonVw1Td2;

    /**
     * 棉花是否点燃测试数据3
     */
    private String lightCottonVw1Td3;

    /**
     * 棉花是否点燃测试数据1
     */
    private String lightCottonFt2Td1;

    /**
     * 棉花是否点燃测试数据2
     */
    private String lightCottonFt2Td2;

    /**
     * 棉花是否点燃测试数据3
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
     * 绝缘老化后延伸残率判断值
     */
    private Double insulAgingEi;

    /**
     * 绝缘老化后抗张残率判断值
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
     * 护套老化后延伸残率判断值
     */
    private Double sheathAgingEi;

    /**
     * 护套老化后抗张残率判断值
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}