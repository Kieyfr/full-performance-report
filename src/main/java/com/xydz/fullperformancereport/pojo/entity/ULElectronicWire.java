package com.xydz.fullperformancereport.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * UI电子线表
 * @TableName FPR_UL_ELECTRONIC_WIRE
 */
@TableName(value ="FPR_UL_ELECTRONIC_WIRE")
@Data
public class ULElectronicWire implements Serializable {
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
     * 芯线1导体根数
     */
    private Long wire1ConductorsNum;

    /**
     * 芯线2导体根数
     */
    private Long wire2ConductorsNum;

    /**
     * 芯线1颜色
     */
    private String wire1Color;

    /**
     * 芯线2颜色
     */
    private String wire2Color;

    /**
     * 芯线1导体单根测试值1
     */
    private Double wire1ConductorTest1;

    /**
     * 芯线1导体单根测试值2
     */
    private Double wire1ConductorTest2;

    /**
     * 芯线1导体单根测试值3
     */
    private Double wire1ConductorTest3;

    /**
     * 芯线1导体单根测试值4
     */
    private Double wire1ConductorTest4;

    /**
     * 芯线1导体单根测试值5
     */
    private Double wire1ConductorTest5;

    /**
     * 芯线1导体单根测试值6
     */
    private Double wire1ConductorTest6;

    /**
     * 芯线2导体单根测试值1
     */
    private Double wire2ConductorTest1;

    /**
     * 芯线2导体单根测试值2
     */
    private Double wire2ConductorTest2;

    /**
     * 芯线2导体单根测试值3
     */
    private Double wire2ConductorTest3;

    /**
     * 芯线2导体单根测试值4
     */
    private Double wire2ConductorTest4;

    /**
     * 芯线2导体单根测试值5
     */
    private Double wire2ConductorTest5;

    /**
     * 芯线2导体单根测试值6
     */
    private Double wire2ConductorTest6;

    /**
     * 芯线1绝缘线径测试值1
     */
    private Double wire1InsulDiameterTest1;

    /**
     * 芯线1绝缘线径测试值2
     */
    private Double wire1InsulDiameterTest2;

    /**
     * 芯线1绝缘线径测试值3
     */
    private Double wire1InsulDiameterTest3;

    /**
     * 芯线1绝缘线径测试值4
     */
    private Double wire1InsulDiameterTest4;

    /**
     * 芯线1绝缘线径测试值5
     */
    private Double wire1InsulDiameterTest5;

    /**
     * 芯线1绝缘线径测试值6
     */
    private Double wire1InsulDiameterTest6;

    /**
     * 芯线2绝缘线径测试值1
     */
    private Double wire2InsulDiameterTest1;

    /**
     * 芯线2绝缘线径测试值2
     */
    private Double wire2InsulDiameterTest2;

    /**
     * 芯线2绝缘线径测试值3
     */
    private Double wire2InsulDiameterTest3;

    /**
     * 芯线2绝缘线径测试值4
     */
    private Double wire2InsulDiameterTest4;

    /**
     * 芯线2绝缘线径测试值5
     */
    private Double wire2InsulDiameterTest5;

    /**
     * 芯线2绝缘线径测试值6
     */
    private Double wire2InsulDiameterTest6;

    /**
     * 绝缘平均厚度判断值
     */
    private Double insulAvgThk;

    /**
     * 芯线1绝缘厚度测试值1
     */
    private Double wire1InsulThkTest1;

    /**
     * 芯线1绝缘厚度测试值2
     */
    private Double wire1InsulThkTest2;

    /**
     * 芯线1绝缘厚度测试值3
     */
    private Double wire1InsulThkTest3;

    /**
     * 芯线1绝缘厚度测试值4
     */
    private Double wire1InsulThkTest4;

    /**
     * 芯线1绝缘厚度测试值5
     */
    private Double wire1InsulThkTest5;

    /**
     * 芯线1绝缘厚度测试值6
     */
    private Double wire1InsulThkTest6;

    /**
     * 芯线1绝缘厚度测试值7
     */
    private Double wire1InsulThkTest7;

    /**
     * 芯线1绝缘厚度测试值8
     */
    private Double wire1InsulThkTest8;

    /**
     * 芯线1绝缘厚度测试值9
     */
    private Double wire1InsulThkTest9;

    /**
     * 芯线1绝缘厚度测试值10
     */
    private Double wire1InsulThkTest10;

    /**
     * 芯线2绝缘厚度测试值1
     */
    private Double wire2InsulThkTest1;

    /**
     * 芯线2绝缘厚度测试值2
     */
    private Double wire2InsulThkTest2;

    /**
     * 芯线2绝缘厚度测试值3
     */
    private Double wire2InsulThkTest3;

    /**
     * 芯线2绝缘厚度测试值4
     */
    private Double wire2InsulThkTest4;

    /**
     * 芯线2绝缘厚度测试值5
     */
    private Double wire2InsulThkTest5;

    /**
     * 芯线2绝缘厚度测试值6
     */
    private Double wire2InsulThkTest6;

    /**
     * 芯线2绝缘厚度测试值7
     */
    private Double wire2InsulThkTest7;

    /**
     * 芯线2绝缘厚度测试值8
     */
    private Double wire2InsulThkTest8;

    /**
     * 芯线2绝缘厚度测试值9
     */
    private Double wire2InsulThkTest9;

    /**
     * 芯线2绝缘厚度测试值10
     */
    private Double wire2InsulThkTest10;

    /**
     * 绝缘最小厚度判断值
     */
    private Double insulMinThk;

    /**
     * 护套外径测试值1
     */
    private Double sheathOdTest1;

    /**
     * 护套外径测试值2
     */
    private Double sheathOdTest2;

    /**
     * 护套外径测试值3
     */
    private Double sheathOdTest3;

    /**
     * 护套外径测试值4
     */
    private Double sheathOdTest4;

    /**
     * 护套外径测试值5
     */
    private Double sheathOdTest5;

    /**
     * 护套外径测试值6
     */
    private Double sheathOdTest6;

    /**
     * 护套平均厚度判断值
     */
    private Double sheathAvgThk;

    /**
     * 护套厚度测试值1
     */
    private Double sheathThkTest1;

    /**
     * 护套厚度测试值2
     */
    private Double sheathThkTest2;

    /**
     * 护套厚度测试值3
     */
    private Double sheathThkTest3;

    /**
     * 护套厚度测试值4
     */
    private Double sheathThkTest4;

    /**
     * 护套厚度测试值5
     */
    private Double sheathThkTest5;

    /**
     * 护套厚度测试值6
     */
    private Double sheathThkTest6;

    /**
     * 护套厚度测试值7
     */
    private Double sheathThkTest7;

    /**
     * 护套厚度测试值8
     */
    private Double sheathThkTest8;

    /**
     * 护套厚度测试值9
     */
    private Double sheathThkTest9;

    /**
     * 护套厚度测试值10
     */
    private Double sheathThkTest10;

    /**
     * 护套最小厚度判断值
     */
    private Double sheathMinThk;

    /**
     * 绝缘老化条件温度/℃
     */
    private Long insulAgingTemp;

    /**
     * 绝缘老化条件时间/H
     */
    private Long insulAgingTime;

    /**
     * 绝缘延伸率判断值
     */
    private Long insulEi;

    /**
     * 芯线1绝缘老化前伸长测试值1
     */
    private Long wire1InsulUnagedElongationTest1;

    /**
     * 芯线1绝缘老化前伸长测试值2
     */
    private Long wire1InsulUnagedElongationTest2;

    /**
     * 芯线1绝缘老化前伸长测试值3
     */
    private Long wire1InsulUnagedElongationTest3;

    /**
     * 芯线1绝缘老化前伸长测试值4
     */
    private Long wire1InsulUnagedElongationTest4;

    /**
     * 芯线1绝缘老化前伸长测试值5
     */
    private Long wire1InsulUnagedElongationTest5;

    /**
     * 芯线1绝缘老化前伸长测试值6
     */
    private Long wire1InsulUnagedElongationTest6;

    /**
     * 芯线2绝缘老化前伸长测试值1
     */
    private Long wire2InsulUnagedElongationTest1;

    /**
     * 芯线2绝缘老化前伸长测试值2
     */
    private Long wire2InsulUnagedElongationTest2;

    /**
     * 芯线2绝缘老化前伸长测试值3
     */
    private Long wire2InsulUnagedElongationTest3;

    /**
     * 芯线2绝缘老化前伸长测试值4
     */
    private Long wire2InsulUnagedElongationTest4;

    /**
     * 芯线2绝缘老化前伸长测试值5
     */
    private Long wire2InsulUnagedElongationTest5;

    /**
     * 芯线2绝缘老化前伸长测试值6
     */
    private Long wire2InsulUnagedElongationTest6;

    /**
     * 绝缘抗张强度判断值
     */
    private Double insulTs;

    /**
     * 芯线1绝缘老化前拉力测试值1
     */
    private Double wire1InsulUnagedPullTest1;

    /**
     * 芯线1绝缘老化前拉力测试值2
     */
    private Double wire1InsulUnagedPullTest2;

    /**
     * 芯线1绝缘老化前拉力测试值3
     */
    private Double wire1InsulUnagedPullTest3;

    /**
     * 芯线1绝缘老化前拉力测试值4
     */
    private Double wire1InsulUnagedPullTest4;

    /**
     * 芯线1绝缘老化前拉力测试值5
     */
    private Double wire1InsulUnagedPullTest5;

    /**
     * 芯线1绝缘老化前拉力测试值6
     */
    private Double wire1InsulUnagedPullTest6;

    /**
     * 芯线2绝缘老化前拉力测试值1
     */
    private Double wire2InsulUnagedPullTest1;

    /**
     * 芯线2绝缘老化前拉力测试值2
     */
    private Double wire2InsulUnagedPullTest2;

    /**
     * 芯线2绝缘老化前拉力测试值3
     */
    private Double wire2InsulUnagedPullTest3;

    /**
     * 芯线2绝缘老化前拉力测试值4
     */
    private Double wire2InsulUnagedPullTest4;

    /**
     * 芯线2绝缘老化前拉力测试值5
     */
    private Double wire2InsulUnagedPullTest5;

    /**
     * 芯线2绝缘老化前拉力测试值6
     */
    private Double wire2InsulUnagedPullTest6;

    /**
     * 绝缘老化后延伸残率判断值
     */
    private Long insulAgingElongationResidualRate;

    /**
     * 芯线1绝缘老化后伸长测试值1
     */
    private Long wire1InsulAgingElongationTest1;

    /**
     * 芯线1绝缘老化后伸长测试值2
     */
    private Long wire1InsulAgingElongationTest2;

    /**
     * 芯线1绝缘老化后伸长测试值3
     */
    private Long wire1InsulAgingElongationTest3;

    /**
     * 芯线1绝缘老化后伸长测试值4
     */
    private Long wire1InsulAgingElongationTest4;

    /**
     * 芯线1绝缘老化后伸长测试值5
     */
    private Long wire1InsulAgingElongationTest5;

    /**
     * 芯线1绝缘老化后伸长测试值6
     */
    private Long wire1InsulAgingElongationTest6;

    /**
     * 芯线2绝缘老化后伸长测试值1
     */
    private Long wire2InsulAgingElongationTest1;

    /**
     * 芯线2绝缘老化后伸长测试值2
     */
    private Long wire2InsulAgingElongationTest2;

    /**
     * 芯线2绝缘老化后伸长测试值3
     */
    private Long wire2InsulAgingElongationTest3;

    /**
     * 芯线2绝缘老化后伸长测试值4
     */
    private Long wire2InsulAgingElongationTest4;

    /**
     * 芯线2绝缘老化后伸长测试值5
     */
    private Long wire2InsulAgingElongationTest5;

    /**
     * 芯线2绝缘老化后伸长测试值6
     */
    private Long wire2InsulAgingElongationTest6;

    /**
     * 绝缘老化后抗张残率判断值
     */
    private Long insulAgingTensileResidualRate;

    /**
     * 芯线1绝缘老化后拉力测试值1
     */
    private Double wire1InsulAgingPullTest1;

    /**
     * 芯线1绝缘老化后拉力测试值2
     */
    private Double wire1InsulAgingPullTest2;

    /**
     * 芯线1绝缘老化后拉力测试值3
     */
    private Double wire1InsulAgingPullTest3;

    /**
     * 芯线1绝缘老化后拉力测试值4
     */
    private Double wire1InsulAgingPullTest4;

    /**
     * 芯线1绝缘老化后拉力测试值5
     */
    private Double wire1InsulAgingPullTest5;

    /**
     * 芯线1绝缘老化后拉力测试值6
     */
    private Double wire1InsulAgingPullTest6;

    /**
     * 芯线2绝缘老化后拉力测试值1
     */
    private Double wire2InsulAgingPullTest1;

    /**
     * 芯线2绝缘老化后拉力测试值2
     */
    private Double wire2InsulAgingPullTest2;

    /**
     * 芯线2绝缘老化后拉力测试值3
     */
    private Double wire2InsulAgingPullTest3;

    /**
     * 芯线2绝缘老化后拉力测试值4
     */
    private Double wire2InsulAgingPullTest4;

    /**
     * 芯线2绝缘老化后拉力测试值5
     */
    private Double wire2InsulAgingPullTest5;

    /**
     * 芯线2绝缘老化后拉力测试值6
     */
    private Double wire2InsulAgingPullTest6;

    /**
     * 护套老化条件温度/℃
     */
    private Long sheathAgingTemp;

    /**
     * 护套老化条件时间/H
     */
    private Long sheathAgingTime;

    /**
     * 比重法计算截面积:长/m
     */
    private Double hydrometricMethodLong;

    /**
     * 比重法计算截面积:空重
     */
    private Double hydrometricMethodEmptyWeight;

    /**
     * 比重法计算截面积:水重
     */
    private Double hydrometricMethodWaterWeight;

    /**
     * 护套延伸率判断值
     */
    private Long sheathEi;

    /**
     * 护套老化前伸长测试值1
     */
    private Long sheathUnagedElongationTest1;

    /**
     * 护套老化前伸长测试值2
     */
    private Long sheathUnagedElongationTest2;

    /**
     * 护套老化前伸长测试值3
     */
    private Long sheathUnagedElongationTest3;

    /**
     * 护套老化前伸长测试值4
     */
    private Long sheathUnagedElongationTest4;

    /**
     * 护套老化前伸长测试值5
     */
    private Long sheathUnagedElongationTest5;

    /**
     * 护套老化前伸长测试值6
     */
    private Long sheathUnagedElongationTest6;

    /**
     * 护套抗张强度判断值
     */
    private Double sheathTs;

    /**
     * 护套老化前拉力测试值1
     */
    private Double sheathUnagedPullTest1;

    /**
     * 护套老化前拉力测试值2
     */
    private Double sheathUnagedPullTest2;

    /**
     * 护套老化前拉力测试值3
     */
    private Double sheathUnagedPullTest3;

    /**
     * 护套老化前拉力测试值4
     */
    private Double sheathUnagedPullTest4;

    /**
     * 护套老化前拉力测试值5
     */
    private Double sheathUnagedPullTest5;

    /**
     * 护套老化前拉力测试值6
     */
    private Double sheathUnagedPullTest6;

    /**
     * 护套老化后延伸残率判断值
     */
    private Long sheathAgingElongationResidualRate;

    /**
     * 护套老化后伸长测试值1
     */
    private Long sheathAgingElongationTest1;

    /**
     * 护套老化后伸长测试值2
     */
    private Long sheathAgingElongationTest2;

    /**
     * 护套老化后伸长测试值3
     */
    private Long sheathAgingElongationTest3;

    /**
     * 护套老化后伸长测试值4
     */
    private Long sheathAgingElongationTest4;

    /**
     * 护套老化后伸长测试值5
     */
    private Long sheathAgingElongationTest5;

    /**
     * 护套老化后伸长测试值6
     */
    private Long sheathAgingElongationTest6;

    /**
     * 护套老化后抗张残率判断值
     */
    private Long sheathAgingTensileResidualRate;

    /**
     * 护套老化后拉力测试值1
     */
    private Double sheathAgingPullTest1;

    /**
     * 护套老化后拉力测试值2
     */
    private Double sheathAgingPullTest2;

    /**
     * 护套老化后拉力测试值3
     */
    private Double sheathAgingPullTest3;

    /**
     * 护套老化后拉力测试值4
     */
    private Double sheathAgingPullTest4;

    /**
     * 护套老化后拉力测试值5
     */
    private Double sheathAgingPullTest5;

    /**
     * 护套老化后拉力测试值6
     */
    private Double sheathAgingPullTest6;

    /**
     * 印字耐擦是否印字清晰
     */
    private String isClearPrinting;

    /**
     * 导体腐蚀温度/℃
     */
    private Long conductorCorrosionTemp;

    /**
     * 导体腐蚀时间/H
     */
    private Long conductorCorrosionTime;

    /**
     * 导体腐蚀是否无腐蚀
     */
    private String isConductorCorrosion;

    /**
     * 热冲击温度/℃
     */
    private Long tsTemp;

    /**
     * 热冲击时间/H
     */
    private Long tsTime;

    /**
     * 热冲击圈数/圈
     */
    private Long tsLn;

    /**
     * 热冲击是否无开裂
     */
    private String isTsCrack;

    /**
     * 低温弯曲温度/℃
     */
    private Long ltBendTemp;

    /**
     * 低温弯曲时间/H
     */
    private Long ltBendTime;

    /**
     * 低温弯曲圈数/圈
     */
    private Long ltBendLn;

    /**
     * 低温弯曲是否无开裂
     */
    private String isLtBendCrack;

    /**
     * 柔韧性温度/℃
     */
    private Long flexibilityTemp;

    /**
     * 柔韧性时间/H
     */
    private Long flexibilityTime;

    /**
     * 柔韧性圈数/圈
     */
    private Long flexibilityLn;

    /**
     * 柔韧性是否无开裂
     */
    private String flexibilityCrack;

    /**
     * 芯线1前线径平均线径测试值
     */
    private Long wire1FrontDiameterAvgTest;

    /**
     * 芯线1后线径平均线径测试值
     */
    private Long wire1RearDiameterAvgTest;

    /**
     * 芯线2前线径平均线径测试值
     */
    private Long wire2FrontDiameterAvgTest;

    /**
     * 芯线2后线径平均线径测试值
     */
    private Long wire2RearDiameterAvgTest;

    /**
     * 套管前厚度
     */
    private Long csgFrontThk;

    /**
     * 套管后厚度
     */
    private Long csgRearThk;

    /**
     * 20℃导体直流电阻判断值
     */
    private Long conductor20Dcr;

    /**
     * 20℃导体直流电阻测试值1
     */
    private Long conductor20DcrTest1;

    /**
     * 20℃导体直流电阻测试值2
     */
    private Long conductor20DcrTest2;

    /**
     * 芯线1绝缘电阻长度/M
     */
    private Long wire1IrLength;

    /**
     * 芯线1绝缘电阻测试值/MΩ
     */
    private Long wire1IrTest1;

    /**
     * 芯线2绝缘电阻长度/M
     */
    private Long wire2IrLength;

    /**
     * 芯线2绝缘电阻测试值/MΩ
     */
    private Long wire1IrTest2;

    /**
     * 耐电压测试(介电III)耐压/kv
     */
    private Long dielectricIiiWithstandVoltage;

    /**
     * 耐电压测试(介电III)耐压时间/min
     */
    private Long dielectricIiiWithstandVoltageTime;

    /**
     * 耐电压测试(介电III)是否击穿
     */
    private Long isDielectricIiiPok;

    /**
     * 耐电压测试(介电I)取样/个
     */
    private Long dielectricINum;

    /**
     * 耐电压测试(介电I)温度/℃
     */
    private Long dielectricITemp;

    /**
     * 耐电压测试(介电I)时间/H
     */
    private Long dielectricITime;

    /**
     * 耐电压测试(介电I)圈长/mm
     */
    private Long dielectricIGirth;

    /**
     * 耐电压测试(介电I)圈数/圈
     */
    private Long dielectricILn;

    /**
     * 耐电压测试(介电I)耐压/kv
     */
    private Long dielectricIWithstandVoltage;

    /**
     * 耐电压测试(介电I)耐压时间/min
     */
    private Long dielectricIWithstandVoltageTiem;

    /**
     * 耐电压测试(介电I)击穿值/kv
     */
    private Long dielectricIPokNum;

    /**
     * 耐电压测试(介电I)是否击穿
     */
    private Long isDielectricIPok;

    /**
     * 高压直流线介质耐压试验I取样/M
     */
    private Long hvdcWireNum;

    /**
     * 高压直流线介质耐压试验I烘温度/摄氏度
     */
    private Long hvdcWireBakingTemp;

    /**
     * 高压直流线介质耐压试验I烘时间/H
     */
    private Long hvdcWireBakingTime;

    /**
     * 高压直流线介质耐压试验I放温度/摄氏度
     */
    private Long hvdcWireDischargeTemp;

    /**
     * 高压直流线介质耐压试验I放%
     */
    private Long hvdcWireDischargePct;

    /**
     * 高压直流线介质耐压试验I放时间/H
     */
    private Long hvdcWireDischargeTime;

    /**
     * 高压直流线介质耐压试验I试棒/mm
     */
    private Long hvdcWireTestBar;

    /**
     * 高压直流线介质耐压试验I圈数/圈
     */
    private Long hvdcWireLn;

    /**
     * 高压直流线介质耐压试验I直流电压/kv
     */
    private Long hvdcWireDcv;

    /**
     * 高压直流线介质耐压试验I直流电压时间/min
     */
    private Long hvdcWireDcvTime;

    /**
     * 高压直流线介质耐压试验I是否击穿
     */
    private Long isHvdcWirePok;

    /**
     * 第1次施火延燃测试值1
     */
    private Long firstFlameRetardingTest1;

    /**
     * 第1次施火延燃测试值2
     */
    private Long firstFlameRetardingTest2;

    /**
     * 第1次施火延燃测试值3
     */
    private Long firstFlameRetardingTest3;

    /**
     * 第2次施火延燃测试值1
     */
    private Long secondFlameRetardingTest1;

    /**
     * 第2次施火延燃测试值2
     */
    private Long secondFlameRetardingTest2;

    /**
     * 第2次施火延燃测试值3
     */
    private Long secondFlameRetardingTest3;

    /**
     * 第3次施火延燃测试值1
     */
    private Long thirdFlameRetardingTest1;

    /**
     * 第3次施火延燃测试值2
     */
    private Long thirdFlameRetardingTest2;

    /**
     * 第3次施火延燃测试值3
     */
    private Long thirdFlameRetardingTest3;

    /**
     * 第4次施火延燃测试值1
     */
    private Long fourthFlameRetardingTest1;

    /**
     * 第4次施火延燃测试值2
     */
    private Long fourthFlameRetardingTest2;

    /**
     * 第4次施火延燃测试值3
     */
    private Long fourthFlameRetardingTest3;

    /**
     * 第5次施火延燃测试值1
     */
    private Long fifthFlameRetardingTest1;

    /**
     * 第5次施火延燃测试值2
     */
    private Long fifthFlameRetardingTest2;

    /**
     * 第5次施火延燃测试值3
     */
    private Long fifthFlameRetardingTest3;

    /**
     * 旗子烧毁面积测试值1
     */
    private Long flagBurningAreaTest1;

    /**
     * 旗子烧毁面积测试值2
     */
    private Long flagBurningAreaTest2;

    /**
     * 旗子烧毁面积测试值3
     */
    private Long flagBurningAreaTest3;

    /**
     * 棉花是否点燃测试值1
     */
    private Long isLightCottonVw1Test1;

    /**
     * 棉花是否点燃测试值2
     */
    private Long isLightCottonVw1Test2;

    /**
     * 棉花是否点燃测试值3
     */
    private Long isLightCottonVw1Test3;

    /**
     * 施火30秒后燃烧长度测试值1
     */
    private Long burningAfterLenghtTest1;

    /**
     * 施火30秒后燃烧长度测试值2
     */
    private Long burningAfterLenghtTest2;

    /**
     * 施火30秒后燃烧长度测试值3
     */
    private Long burningAfterLenghtTest3;

    /**
     * 棉花是否点燃测试值1
     */
    private Long isLightCottonFt2Test1;

    /**
     * 棉花是否点燃测试值2
     */
    private Long isLightCottonFt2Test2;

    /**
     * 棉花是否点燃测试值3
     */
    private Long isLightCottonFt2Test3;

    /**
     * UL水平燃烧时间测试值1
     */
    private Long burningTimeTest1;

    /**
     * UL水平燃烧时间测试值2
     */
    private Long burningTimeTest2;

    /**
     * UL水平燃烧时间测试值3
     */
    private Long burningTimeTest3;

    /**
     * UL水平燃烧测试值1
     */
    private Long isLightCottonUlTest1;

    /**
     * UL水平燃烧测试值2
     */
    private Long isLightCottonUlTest2;

    /**
     * UL水平燃烧测试值3
     */
    private Long isLightCottonUlTest3;

    /**
     * 热延伸率/g
     */
    private Long thermalElongation;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}