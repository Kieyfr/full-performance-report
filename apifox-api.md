# ReportController

ReportController


---
## 生成报告

> BASIC

**Path:** report/saveReport

**Method:** POST

**Desc:**

 生成报告

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| report | object | UI电子线表 |
| &ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |
| wireList | array | 芯线列表 |
| &ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─id | integer | 芯线序号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─num | integer | 数量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─color | string | 颜色 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd1 | number | 线径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd2 | number | 线径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd3 | number | 线径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd4 | number | 线径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd5 | number | 线径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd6 | number | 线径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd1 | number | 绝缘外径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd2 | number | 绝缘外径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd3 | number | 绝缘外径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd4 | number | 绝缘外径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd5 | number | 绝缘外径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd6 | number | 绝缘外径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd1 | number | 绝缘厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd2 | number | 绝缘厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd3 | number | 绝缘厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd4 | number | 绝缘厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd5 | number | 绝缘厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd6 | number | 绝缘厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd7 | number | 绝缘厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd8 | number | 绝缘厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd9 | number | 绝缘厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd10 | number | 绝缘厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd1 | number | 绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd2 | number | 绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd3 | number | 绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd4 | number | 绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd5 | number | 绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd6 | number | 绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd1 | number | 绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd2 | number | 绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd3 | number | 绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd4 | number | 绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd5 | number | 绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd6 | number | 绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd1 | number | 绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd2 | number | 绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd3 | number | 绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd4 | number | 绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd5 | number | 绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd6 | number | 绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd1 | number | 绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd2 | number | 绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd3 | number | 绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd4 | number | 绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd5 | number | 绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd6 | number | 绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgFrontAvgDiameter | number | 加热变形前平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgRearAvgDiameter | number | 加热变形后平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductor20DcrTd | number | 20℃导体直流电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irLength | number | 绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irTd | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─materialQuality | string | 导体材质 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulMaterialQuality | string | 绝缘材质 |
| &ensp;&ensp;&ensp;&ensp;&#124;─firty807Unaged | number | 80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─second807Aging | number | 80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHthp | number | 高温压力 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd11 | number | 绝缘厚度测试数据11 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd12 | number | 绝缘厚度测试数据12 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd13 | number | 绝缘厚度测试数据13 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd14 | number | 绝缘厚度测试数据14 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd15 | number | 绝缘厚度测试数据15 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd16 | number | 绝缘厚度测试数据16 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd17 | number | 绝缘厚度测试数据17 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd18 | number | 绝缘厚度测试数据18 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd1 | number | 兼容性绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd2 | number | 兼容性绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd3 | number | 兼容性绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd4 | number | 兼容性绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd5 | number | 兼容性绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd6 | number | 兼容性绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd1 | number | 兼容性绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd2 | number | 兼容性绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd3 | number | 兼容性绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd4 | number | 兼容性绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd5 | number | 兼容性绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd6 | number | 兼容性绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd1 | number | 兼容性绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd2 | number | 兼容性绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd3 | number | 兼容性绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd4 | number | 兼容性绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd5 | number | 兼容性绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd6 | number | 兼容性绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd1 | number | 兼容性绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd2 | number | 兼容性绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd3 | number | 兼容性绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd4 | number | 兼容性绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd5 | number | 兼容性绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd6 | number | 兼容性绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd1 | number | 热寿命绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd2 | number | 热寿命绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd3 | number | 热寿命绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd4 | number | 热寿命绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd5 | number | 热寿命绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd6 | number | 热寿命绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd1 | number | 热寿命绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd2 | number | 热寿命绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd3 | number | 热寿命绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd4 | number | 热寿命绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd5 | number | 热寿命绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd6 | number | 热寿命绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd1 | number | 热寿命绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd2 | number | 热寿命绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd3 | number | 热寿命绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd4 | number | 热寿命绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd5 | number | 热寿命绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd6 | number | 热寿命绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd1 | number | 热寿命绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd2 | number | 热寿命绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd3 | number | 热寿命绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd4 | number | 热寿命绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd5 | number | 热寿命绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd6 | number | 热寿命绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchLoadHte | number | 绝缘热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchCoolingHte | number | 绝缘热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalc | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcIec | number | IEC绝缘电阻测试数据 |
| publicData | object | 公共数据 |
| &ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&#124;─printingErasibilit | string | 印字耐擦是否印字清晰 |
| &ensp;&ensp;&#124;─conductorCorrosion | string | 导体腐蚀是否无腐蚀 |
| &ensp;&ensp;&#124;─tsCrack | string | 热冲击是否无开裂 |
| &ensp;&ensp;&#124;─ltBendCrack | string | 低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─flexibilityCrack | string | 柔韧性是否无开裂 |
| &ensp;&ensp;&#124;─dielectricIiiPok | string | 耐电压测试(介电III)是否击穿 |
| &ensp;&ensp;&#124;─dielectricIPok | string | 耐电压测试(介电I)是否击穿 |
| &ensp;&ensp;&#124;─hvdcWirePok | string | 高压直流线介质耐压试验I是否击穿 |
| &ensp;&ensp;&#124;─lightCottonVw1Td1 | string | VW1棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonVw1Td2 | string | VW1棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonVw1Td3 | string | VW1棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonFt2Td1 | string | FT2棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonFt2Td2 | string | FT2棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonFt2Td3 | string | FT2棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonUlTd1 | string | UL水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonUlTd2 | string | UL水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonUlTd3 | string | UL水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─sheathMaterialQuality | string | 护套材质 |
| &ensp;&ensp;&#124;─insulTsCrack | string | 绝缘热冲击是否无开裂 |
| &ensp;&ensp;&#124;─sheathTsCrack | string | 护套热冲击是否无开裂 |
| &ensp;&ensp;&#124;─insulLtBendCrack | string | 绝缘低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─sheathLtBendCrack | string | 护套低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─lowTemperatureImpactCrack | string | 低温冲击是否无开裂 |
| &ensp;&ensp;&#124;─thermalStability | number | 热稳定性 |
| &ensp;&ensp;&#124;─flexureTest | string | 曲挠试验 |
| &ensp;&ensp;&#124;─insulDielectricPok | string | 绝缘耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─fgDielectricPok | string | 成品耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─sheathOdTd1 | number | 护套外径测试数据1 |
| &ensp;&ensp;&#124;─sheathOdTd2 | number | 护套外径测试数据2 |
| &ensp;&ensp;&#124;─sheathOdTd3 | number | 护套外径测试数据3 |
| &ensp;&ensp;&#124;─sheathOdTd4 | number | 护套外径测试数据4 |
| &ensp;&ensp;&#124;─sheathOdTd5 | number | 护套外径测试数据5 |
| &ensp;&ensp;&#124;─sheathOdTd6 | number | 护套外径测试数据6 |
| &ensp;&ensp;&#124;─sheathThkTd1 | number | 护套厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathThkTd2 | number | 护套厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathThkTd3 | number | 护套厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathThkTd4 | number | 护套厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathThkTd5 | number | 护套厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathThkTd6 | number | 护套厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd1 | number | 护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd2 | number | 护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd3 | number | 护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd4 | number | 护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd5 | number | 护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd6 | number | 护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd1 | number | 护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd2 | number | 护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd3 | number | 护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd4 | number | 护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd5 | number | 护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd6 | number | 护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd1 | number | 护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd2 | number | 护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd3 | number | 护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd4 | number | 护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd5 | number | 护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd6 | number | 护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingPullTd1 | number | 护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingPullTd2 | number | 护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingPullTd3 | number | 护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingPullTd4 | number | 护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingPullTd5 | number | 护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingPullTd6 | number | 护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─csgFrontThk | number | 套管前厚度 |
| &ensp;&ensp;&#124;─csgRearThk | number | 套管后厚度 |
| &ensp;&ensp;&#124;─spgLength | number | 比重长 |
| &ensp;&ensp;&#124;─spgEmptyWeight | number | 比重空重 |
| &ensp;&ensp;&#124;─spgWaterWeight | number | 比重水重 |
| &ensp;&ensp;&#124;─hteMarkLength | number | 热延伸标记长度 |
| &ensp;&ensp;&#124;─hteExtensionLength | number | 热延伸延伸长度 |
| &ensp;&ensp;&#124;─sheathThkTd7 | number | 护套厚度测试数据7 |
| &ensp;&ensp;&#124;─sheathThkTd8 | number | 护套厚度测试数据8 |
| &ensp;&ensp;&#124;─sheathThkTd9 | number | 护套厚度测试数据9 |
| &ensp;&ensp;&#124;─sheathThkTd10 | number | 护套厚度测试数据10 |
| &ensp;&ensp;&#124;─insulAvgThk | number | 绝缘平均厚度判断值 |
| &ensp;&ensp;&#124;─insulMinThk | number | 绝缘最小厚度判断值 |
| &ensp;&ensp;&#124;─sheathAvgThk | number | 护套平均厚度判断值 |
| &ensp;&ensp;&#124;─sheathMinThk | number | 护套最小厚度判断值 |
| &ensp;&ensp;&#124;─insulBiTemp | number | 绝缘老化条件温度/℃ |
| &ensp;&ensp;&#124;─insulBiTime | number | 绝缘老化条件时间/H |
| &ensp;&ensp;&#124;─insulUnagedEi | number | 绝缘延伸率判断值 |
| &ensp;&ensp;&#124;─insulUnagedTs | number | 绝缘抗张强度判断值 |
| &ensp;&ensp;&#124;─insulAgingEi | number | 绝缘老化后延伸残率判断值\|\|绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─insulAgingTs | number | 绝缘老化后抗张残率判断值\|\|绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─sheathBiTemp | number | 护套老化条件温度/℃ |
| &ensp;&ensp;&#124;─sheathBiTime | number | 护套老化条件时间/H |
| &ensp;&ensp;&#124;─sheathUnagedEi | number | 护套延伸率判断值 |
| &ensp;&ensp;&#124;─sheathUnagedTs | number | 护套抗张强度判断值 |
| &ensp;&ensp;&#124;─sheathAgingEi | number | 护套老化后延伸残率判断值\|\|护套老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─sheathAgingTs | number | 护套老化后抗张残率判断值\|\|护套老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─conductorCorrosionTemp | number | 导体腐蚀温度/℃ |
| &ensp;&ensp;&#124;─conductorCorrosionTime | number | 导体腐蚀时间/H |
| &ensp;&ensp;&#124;─tsTemp | number | 热冲击温度/℃ |
| &ensp;&ensp;&#124;─tsTime | number | 热冲击时间/H |
| &ensp;&ensp;&#124;─tsLn | number | 热冲击圈数/圈 |
| &ensp;&ensp;&#124;─ltBendTemp | number | 低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─ltBendTime | number | 低温弯曲时间/H |
| &ensp;&ensp;&#124;─ltBendLn | number | 低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─flexibilityTemp | number | 柔韧性温度/℃ |
| &ensp;&ensp;&#124;─flexibilityTime | number | 柔韧性时间/H |
| &ensp;&ensp;&#124;─flexibilityLn | number | 柔韧性圈数/圈 |
| &ensp;&ensp;&#124;─conductor20Dcr | number | 20℃导体直流电阻判断值 |
| &ensp;&ensp;&#124;─dielectricIiiWithstandVoltage | number | 耐电压测试(介电III)耐压/kv |
| &ensp;&ensp;&#124;─dielectricIiiWithstandVoltageTime | number | 耐电压测试(介电III)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricINum | number | 耐电压测试(介电I)取样/个 |
| &ensp;&ensp;&#124;─dielectricITemp | number | 耐电压测试(介电I)温度/℃ |
| &ensp;&ensp;&#124;─dielectricITime | number | 耐电压测试(介电I)时间/H |
| &ensp;&ensp;&#124;─dielectricIGirth | number | 耐电压测试(介电I)圈长/mm |
| &ensp;&ensp;&#124;─dielectricILn | number | 耐电压测试(介电I)圈数/圈 |
| &ensp;&ensp;&#124;─dielectricIWithstandVoltage | number | 耐电压测试(介电I)耐压/kv |
| &ensp;&ensp;&#124;─dielectricIWithstandVoltageTiem | number | 耐电压测试(介电I)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricIPokNum | number | 耐电压测试(介电I)击穿值/kv |
| &ensp;&ensp;&#124;─hvdcWireNum | number | 高压直流线介质耐压试验I取样/M |
| &ensp;&ensp;&#124;─hvdcWireBakingTemp | number | 高压直流线介质耐压试验I烘温度/摄氏度 |
| &ensp;&ensp;&#124;─hvdcWireBakingTime | number | 高压直流线介质耐压试验I烘时间/H |
| &ensp;&ensp;&#124;─hvdcWireDischargeTemp | number | 高压直流线介质耐压试验I放温度/摄氏度 |
| &ensp;&ensp;&#124;─hvdcWireDischargePct | number | 高压直流线介质耐压试验I放% |
| &ensp;&ensp;&#124;─hvdcWireDischargeTime | number | 高压直流线介质耐压试验I放时间/H |
| &ensp;&ensp;&#124;─hvdcWireTestBar | number | 高压直流线介质耐压试验I试棒/mm |
| &ensp;&ensp;&#124;─hvdcWireLn | number | 高压直流线介质耐压试验I圈数/圈 |
| &ensp;&ensp;&#124;─hvdcWireDcv | number | 高压直流线介质耐压试验I直流电压/kv |
| &ensp;&ensp;&#124;─hvdcWireDcvTime | number | 高压直流线介质耐压试验I直流电压时间/min |
| &ensp;&ensp;&#124;─firstFlameRetardingTd1 | number | 第1次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─firstFlameRetardingTd2 | number | 第1次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─firstFlameRetardingTd3 | number | 第1次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd1 | number | 第2次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd2 | number | 第2次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd3 | number | 第2次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd1 | number | 第3次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd2 | number | 第3次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd3 | number | 第3次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd1 | number | 第4次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd2 | number | 第4次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd3 | number | 第4次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd1 | number | 第5次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd2 | number | 第5次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd3 | number | 第5次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─flagBurningAreaTd1 | number | 旗子烧毁面积测试数据1 |
| &ensp;&ensp;&#124;─flagBurningAreaTd2 | number | 旗子烧毁面积测试数据2 |
| &ensp;&ensp;&#124;─flagBurningAreaTd3 | number | 旗子烧毁面积测试数据3 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd1 | number | 施火30秒后燃烧长度测试数据1 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd2 | number | 施火30秒后燃烧长度测试数据2 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd3 | number | 施火30秒后燃烧长度测试数据3 |
| &ensp;&ensp;&#124;─burningTimeTd1 | number | UL水平燃烧时间测试数据1 |
| &ensp;&ensp;&#124;─burningTimeTd2 | number | UL水平燃烧时间测试数据2 |
| &ensp;&ensp;&#124;─burningTimeTd3 | number | UL水平燃烧时间测试数据3 |
| &ensp;&ensp;&#124;─thermalElongation | number | 热延伸率/g |
| &ensp;&ensp;&#124;─avgOdUbv | number | 平均外径上限值默认设置7.5 |
| &ensp;&ensp;&#124;─sectionMax | number | 同一截面最大值 |
| &ensp;&ensp;&#124;─sectionMin | number | 同一截面最小值 |
| &ensp;&ensp;&#124;─sheathFirty807Unaged | number | 护套80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&#124;─sheathSecond807Aging | number | 护套80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&#124;─insulTsLength | number | 绝缘热冲击长度/mm |
| &ensp;&ensp;&#124;─insulTsLn | number | 绝缘热冲击圈数/圈 |
| &ensp;&ensp;&#124;─sheathTsLength | number | 护套热冲击长度/mm |
| &ensp;&ensp;&#124;─sheathTsLn | number | 护套热冲击圈数/圈 |
| &ensp;&ensp;&#124;─insulLtBendLn | number | 绝缘低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─sheathLtBendLn | number | 护套低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─lowTemperatureImpact | number | 低温冲击重量 |
| &ensp;&ensp;&#124;─sheathHthp | number | 绝缘高温压力 |
| &ensp;&ensp;&#124;─printingSpaceDv | number | 印字间距判断值 |
| &ensp;&ensp;&#124;─printingSpace | number | 印字间距 |
| &ensp;&ensp;&#124;─ir90Length | number | 90℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir90Td | number | 90℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─irCalcDv | number | 绝缘电阻判断值\|\|70℃绝缘电阻判断值\|\|15℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─ir90CalcDv | number | 90℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─diameterTdAvgDv | number | 导体单根线径判断值 |
| &ensp;&ensp;&#124;─sheathOdDvStart | number | 护套外径判断值起始范围 |
| &ensp;&ensp;&#124;─sheathOdDvEnd | number | 护套外径判断值结束范围 |
| &ensp;&ensp;&#124;─insulUnagedEiMvsDv | number | 绝缘延伸率中间值判断值 |
| &ensp;&ensp;&#124;─insulUnagedTsMvsDv | number | 绝缘抗张中间值判断值 |
| &ensp;&ensp;&#124;─insulAgingEiMvsDv | number | 绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─insulAgingTsMvsDv | number | 绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─sheathUnagedEiMvsDv | number | 护套延伸率中间值判断值 |
| &ensp;&ensp;&#124;─sheathUnagedTsMvsDv | number | 护套抗张中间值判断值 |
| &ensp;&ensp;&#124;─sheathAgingEiMvsDv | number | 护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─sheathAgingTsMvsDv | number | 护套老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltage | number | 绝缘耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltageTime | number | 绝缘耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltage | number | 成品耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltageTime | number | 成品耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─gbTbfStartDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，上夹具下缘与碳化起始点距离 |
| &ensp;&ensp;&#124;─gbTbfBurningDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，向下延燃至上夹具下缘距离 |
| &ensp;&ensp;&#124;─sheathThkTd11 | number | 护套厚度测试数据11 |
| &ensp;&ensp;&#124;─sheathThkTd12 | number | 护套厚度测试数据12 |
| &ensp;&ensp;&#124;─sheathThkTd13 | number | 护套厚度测试数据13 |
| &ensp;&ensp;&#124;─sheathThkTd14 | number | 护套厚度测试数据14 |
| &ensp;&ensp;&#124;─sheathThkTd15 | number | 护套厚度测试数据15 |
| &ensp;&ensp;&#124;─sheathThkTd16 | number | 护套厚度测试数据16 |
| &ensp;&ensp;&#124;─sheathThkTd17 | number | 护套厚度测试数据17 |
| &ensp;&ensp;&#124;─sheathThkTd18 | number | 护套厚度测试数据18 |
| &ensp;&ensp;&#124;─spgLengthEmptyWeight | number | 比长L空重 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd1 | number | 平行软线撕裂前厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd2 | number | 平行软线撕裂前厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd3 | number | 平行软线撕裂前厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd4 | number | 平行软线撕裂前厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd5 | number | 平行软线撕裂前厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd6 | number | 平行软线撕裂前厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd1 | number | 平行软线撕裂后厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd2 | number | 平行软线撕裂后厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd3 | number | 平行软线撕裂后厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd4 | number | 平行软线撕裂后厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd5 | number | 平行软线撕裂后厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd6 | number | 平行软线撕裂后厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd1 | number | 平行软线隔离筋厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd2 | number | 平行软线隔离筋厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd3 | number | 平行软线隔离筋厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd4 | number | 平行软线隔离筋厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd5 | number | 平行软线隔离筋厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd6 | number | 平行软线隔离筋厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingDv | number | 平行软线撕裂前厚度判断值 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingDv | number | 平行软线撕裂后厚度判断值 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarDv | number | 平行软线隔离筋厚度判断值 |
| &ensp;&ensp;&#124;─insulTsTime | number | 绝缘热冲击时间/h |
| &ensp;&ensp;&#124;─insulTsTemp | number | 绝缘热冲击温度/℃ |
| &ensp;&ensp;&#124;─sheathTsTime | number | 护套热冲击时间/h |
| &ensp;&ensp;&#124;─sheathTsTemp | number | 护套热冲击温度/℃ |
| &ensp;&ensp;&#124;─insulLtBendTemp | number | 绝缘低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─insulLtBendTime | number | 绝缘低温弯曲时间/H |
| &ensp;&ensp;&#124;─insulLtBendLenght | number | 绝缘低温弯曲长度 |
| &ensp;&ensp;&#124;─sheathLtBendTemp | number | 护套低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─sheathLtBendTime | number | 护套低温弯曲时间/H |
| &ensp;&ensp;&#124;─sheathLtBendLenght | number | 护套低温弯曲长度 |
| &ensp;&ensp;&#124;─insulHtgDv | number | 绝缘加热变形判断值 |
| &ensp;&ensp;&#124;─sheathHtgDv | number | 护套加热变形判断值 |
| &ensp;&ensp;&#124;─sheathSurfaceR | number | 护套表面电阻 |
| &ensp;&ensp;&#124;─sheathSurfaceRDv | number | 护套表面电阻判断值 |
| &ensp;&ensp;&#124;─csaDv | number | 截面积判断值 |
| &ensp;&ensp;&#124;─spindleNum | number | 锭子总数 |
| &ensp;&ensp;&#124;─spindleRootNum | number | 每锭根数 |
| &ensp;&ensp;&#124;─singleShieldDiameter | number | 屏蔽单根直径 |
| &ensp;&ensp;&#124;─pitch | number | 节距 |
| &ensp;&ensp;&#124;─shieldDiameter | number | 屏蔽层直径 |
| &ensp;&ensp;&#124;─insulOdDv | number | 绝缘外径判断值 |
| &ensp;&ensp;&#124;─peelStrengthTd1 | number | 剥离力测试数据1 |
| &ensp;&ensp;&#124;─peelStrengthTd2 | number | 剥离力测试数据2 |
| &ensp;&ensp;&#124;─peelStrengthTd3 | number | 剥离力测试数据3 |
| &ensp;&ensp;&#124;─peelStrengthTd4 | number | 剥离力测试数据4 |
| &ensp;&ensp;&#124;─ltBendBreakdown | string | 低温弯曲是否无击穿 |
| &ensp;&ensp;&#124;─ltBendLenght | number | 低温弯曲长度 |
| &ensp;&ensp;&#124;─thcLenght | number | 温湿度循环长度 |
| &ensp;&ensp;&#124;─thcLn | number | 温湿度循环圈数 |
| &ensp;&ensp;&#124;─thcCrack | string | 温湿度循环是否无击穿 |
| &ensp;&ensp;&#124;─hotWaterResistanceLenght | number | 耐热水长度 |
| &ensp;&ensp;&#124;─hotWaterResistanceLn | number | 耐热水圈数 |
| &ensp;&ensp;&#124;─hotWaterResistanceCrack | string | 耐热水是否无击穿 |
| &ensp;&ensp;&#124;─hotWaterResistanceForward | number | 耐热水测试值(正向) |
| &ensp;&ensp;&#124;─hotWaterResistanceReverse | number | 耐热水测试值(反向) |
| &ensp;&ensp;&#124;─waterResistanceGasolineLn | number | 耐液体性汽油圈数 |
| &ensp;&ensp;&#124;─waterResistanceGasolineTd | number | 耐液体性汽油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceGasolinePct | number | 耐液体性汽油百分比 |
| &ensp;&ensp;&#124;─waterResistanceGasolineCrack | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEthanolLn | number | 耐液体性乙醇圈数 |
| &ensp;&ensp;&#124;─waterResistanceEthanolTd | number | 耐液体性乙醇测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEthanolPct | number | 耐液体性乙醇百分比 |
| &ensp;&ensp;&#124;─waterResistanceEthanolCrack | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilLn | number | 耐液体性柴油圈数 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilTd | number | 耐液体性柴油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilPct | number | 耐液体性柴油百分比 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilCrack | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Ln | number | 耐液体性IRM-902圈数 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Td | number | 耐液体性IRM-902测试数据 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Pct | number | 耐液体性IRM-902百分比 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Crack | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Ln | number | 耐液体性IRM-903圈数 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Td | number | 耐液体性IRM-903测试数据 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Pct | number | 耐液体性IRM-903百分比 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Crack | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAtfLn | number | 耐液体性自动排挡液圈数 |
| &ensp;&ensp;&#124;─waterResistanceAtfTd | number | 耐液体性自动排挡液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceAtfPct | number | 耐液体性自动排挡液百分比 |
| &ensp;&ensp;&#124;─waterResistanceAtfCrack | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeLn | number | 耐液体性防冻液圈数 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeTd | number | 耐液体性防冻液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezePct | number | 耐液体性防冻液百分比 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeCrack | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidLn | number | 耐液体性电池酸圈数 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidTd | number | 耐液体性电池酸测试数据 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidPct | number | 耐液体性电池酸百分比 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidCrack | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&#124;─frSelfExtinguishingDv | number | 阻燃试验自熄判断值 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTime | number | 阻燃试验自熄时间 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd1 | number | 阻燃试验自熄测试值1 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd2 | number | 阻燃试验自熄测试值2 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd3 | number | 阻燃试验自熄测试值3 |
| &ensp;&ensp;&#124;─frUnburnedTd1 | number | 阻燃试验未燃测试值1 |
| &ensp;&ensp;&#124;─frUnburnedTd2 | number | 阻燃试验未燃测试值2 |
| &ensp;&ensp;&#124;─frUnburnedTd3 | number | 阻燃试验未燃测试值3 |
| &ensp;&ensp;&#124;─hte | number | 热延伸率 |
| &ensp;&ensp;&#124;─dielectricPok | string | 耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─peelStrength | number | 剥离力 |
| &ensp;&ensp;&#124;─hthpTemp | number | 高温压力温度 |
| &ensp;&ensp;&#124;─hthpCrack | string | 高温压力是否开裂 |
| &ensp;&ensp;&#124;─lowTemperatureWindingWeight | number | 低温卷绕重量/kg |
| &ensp;&ensp;&#124;─lowTemperatureWindingLn | number | 低温卷绕圈数 |
| &ensp;&ensp;&#124;─lowTemperatureWindingCrack | string | 低温卷绕是否开裂 |
| &ensp;&ensp;&#124;─arDv | number | 耐磨性（刮磨）判断值 |
| &ensp;&ensp;&#124;─ar | number | 耐磨性（刮磨）测试值 |
| &ensp;&ensp;&#124;─longTermAgingTemp | number | 长期老化摄氏度 |
| &ensp;&ensp;&#124;─longTermAgingLn | number | 长期老化圈数 |
| &ensp;&ensp;&#124;─longTermAgingCrack | string | 长期老化是否开裂 |
| &ensp;&ensp;&#124;─shortTermAgingTemp | number | 短期老化摄氏度 |
| &ensp;&ensp;&#124;─shortTermAgingLn | number | 短期老化圈数 |
| &ensp;&ensp;&#124;─shortTermAgingWeight | number | 短期老化重量/kg |
| &ensp;&ensp;&#124;─shortTermAgingCrack | string | 短期老化是否开裂 |
| &ensp;&ensp;&#124;─thermalOverloadLn | number | 热过载圈数 |
| &ensp;&ensp;&#124;─thermalOverloadCrack | string | 热过载是否开裂 |
| &ensp;&ensp;&#124;─thermalShrinkage | number | 热收缩测试值 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationLn | number | 温湿度交变圈数 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationTemp1 | number | 温湿度交变摄氏度1 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationTemp2 | number | 温湿度交变摄氏度2 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationCrack | string | 温湿度交变是否开裂 |
| &ensp;&ensp;&#124;─ozoneResistanceLn | number | 耐臭氧圈数 |
| &ensp;&ensp;&#124;─ozoneResistancePok | string | 耐臭氧是否击穿 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantLn | number | 耐液体性发动机冷却液圈数 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantTd | number | 耐液体性发动机冷却液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantPct | number | 耐液体性发动机冷却液百分比 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantCrack | string | 耐液体性发动机冷却液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilLn | number | 耐液体性发动机润滑油圈数 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilTd | number | 耐液体性发动机润滑油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilPct | number | 耐液体性发动机润滑油百分比 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilCrack | string | 耐液体性发动机润滑油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidLn | number | 耐液体性转向助力液圈数 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidTd | number | 耐液体性转向助力液测试数据 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPct | number | 耐液体性转向助力液百分比 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidCrack | string | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidPok | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&#124;─frFireSupplyTime | number | 阻燃试验供火时间 |
| &ensp;&ensp;&#124;─adhesionDv | number | 附着力判断值 |
| &ensp;&ensp;&#124;─adhesionTd1 | number | 附着力测试数据1 |
| &ensp;&ensp;&#124;─adhesionTd2 | number | 附着力测试数据2 |
| &ensp;&ensp;&#124;─adhesionTd3 | number | 附着力测试数据3 |
| &ensp;&ensp;&#124;─adhesionTd4 | number | 附着力测试数据4 |
| &ensp;&ensp;&#124;─adhesionTd5 | number | 附着力测试数据5 |
| &ensp;&ensp;&#124;─htgTemp | number | 加热变形摄氏度 |
| &ensp;&ensp;&#124;─htgCrack | string | 加热变形是否无开裂 |
| &ensp;&ensp;&#124;─htgPok | string | 加热变形是否无击穿 |
| &ensp;&ensp;&#124;─ltBendWeight | number | 低温弯曲重量 |
| &ensp;&ensp;&#124;─lowTemperatureImpactPok | string | 低温冲击是否无击穿 |
| &ensp;&ensp;&#124;─hr1ATemp | number | 耐热性1(A)摄氏度 |
| &ensp;&ensp;&#124;─hr1ATime | number | 耐热性1(A)时间 |
| &ensp;&ensp;&#124;─hr1ALenght | number | 耐热性1(A)长度 |
| &ensp;&ensp;&#124;─hr1AWeight | number | 耐热性1(A)重量 |
| &ensp;&ensp;&#124;─hr1ACrack | string | 耐热性1(A)是否无开裂 |
| &ensp;&ensp;&#124;─hr1APok | string | 耐热性1(A)是否无击穿 |
| &ensp;&ensp;&#124;─hr1BTemp | number | 耐热性1(B)摄氏度 |
| &ensp;&ensp;&#124;─hr1BTime | number | 耐热性1(B)时间 |
| &ensp;&ensp;&#124;─hr1BLenght | number | 耐热性1(B)长度 |
| &ensp;&ensp;&#124;─hr1BWeight | number | 耐热性1(B)重量 |
| &ensp;&ensp;&#124;─hr1BCrack | string | 热性1(B)是否无开裂 |
| &ensp;&ensp;&#124;─hr1BPok | string | 耐热性1(B)是否无击穿 |
| &ensp;&ensp;&#124;─hr1CCrack | string | 耐热性1(C)是否无开裂 |
| &ensp;&ensp;&#124;─waterResistanceGasolinePok | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilPok | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEthanolPok | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAtfPok | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezePok | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Pok | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Pok | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd | number | 阻燃试验自熄测试值 |
| &ensp;&ensp;&#124;─tsLenght | number | 热冲击长度 |
| &ensp;&ensp;&#124;─hotStretchLoadLenght | number | 热延伸试验负荷下长度 |
| &ensp;&ensp;&#124;─hotStretchCoolingLenght | number | 热延伸试验冷却后长度 |
| &ensp;&ensp;&#124;─signContinuity | number | 标志连续性 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltage | number | 浸水工频电压试验耐压 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltageTime | object | 浸水工频电压试验耐压时间 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltagePok | object | 浸水工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTemp | object | 室温工频电压试验摄氏度 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTime | object | 室温工频电压试验时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLenght | object | 室温工频电压试验长度 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLn | object | 室温工频电压试验圈数 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltage | object | 室温工频电压试验未老化样品耐压 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltageTime | object | 室温工频电压试验未老化样品耐压时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltage | object | 室温工频电压试验老化样品耐压 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltageTime | object | 室温工频电压试验老化样品耐压时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltagePok | object | 室温工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTemp | object | 额定温度工频电压试验摄氏度 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTime | object | 额定温度工频电压试验时间 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageRoastTemp | object | 额定温度工频电压试验烤摄氏度 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltage | object | 额定温度工频电压试验烤耐压 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltageTime | object | 额定温度工频电压试验耐压时间 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltagePok | object | 额定温度工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd1 | object | 水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd2 | object | 水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd3 | object | 水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd1 | object | 垂直燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd2 | object | 垂直燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd3 | object | 垂直燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据1 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据2 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据3 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据1 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据2 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd1 | object | 兼容性护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd2 | object | 兼容性护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd3 | object | 兼容性护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd4 | object | 兼容性护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd5 | object | 兼容性护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd6 | object | 兼容性护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd1 | object | 兼容性护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd2 | object | 兼容性护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd3 | object | 兼容性护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd4 | object | 兼容性护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd5 | object | 兼容性护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd6 | object | 兼容性护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd1 | object | 兼容性护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd2 | object | 兼容性护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd3 | object | 兼容性护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd4 | object | 兼容性护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd5 | object | 兼容性护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd6 | object | 兼容性护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd1 | object | 兼容性护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd2 | object | 兼容性护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd3 | object | 兼容性护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd4 | object | 兼容性护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd5 | object | 兼容性护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd6 | object | 兼容性护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─compatibilityInsulUnagedEiMvsDv | object | 兼容性绝缘延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulUnagedTsMvsDv | object | 兼容性绝缘抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingEiMvsDv | object | 兼容性绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingTsMvsDv | object | 兼容性绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingEi | object | 兼容性绝缘老化后延伸残率判断值\|\|兼容性绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingTs | object | 兼容性绝缘老化后抗张残率判断值\|\|兼容性绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedEiMvsDv | object | 兼容性护套延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedTsMvsDv | object | 兼容性护套抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingEiMvsDv | object | 兼容性护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingTsMvsDv | object | 兼容性护套老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingEi | object | 兼容性护套老化后延伸残率判断值\|\|兼容性护套老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingTs | object | 兼容性护套老化后抗张残率判断值\|\|兼容性护套老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─flexureFrequency | object | 曲挠次数 |
| &ensp;&ensp;&#124;─ir90Calc | object | 90℃绝缘电阻 |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltageCurrent | object | 绝缘耐电压测试电流/M |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltageCurrent | object | 成品耐电压测试电流/M\|\|护套耐电压测试电流/M |
| &ensp;&ensp;&#124;─sheathOdDv | object | 护套外径判断值 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd1 | object | 耐酸护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd2 | object | 耐酸护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd3 | object | 耐酸护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd4 | object | 耐酸护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd5 | object | 耐酸护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd6 | object | 耐酸护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd1 | object | 耐酸护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd2 | object | 耐酸护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd3 | object | 耐酸护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd4 | object | 耐酸护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd5 | object | 耐酸护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd6 | object | 耐酸护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd1 | object | 耐酸护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd2 | object | 耐酸护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd3 | object | 耐酸护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd4 | object | 耐酸护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd5 | object | 耐酸护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd6 | object | 耐酸护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd1 | object | 耐酸护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd2 | object | 耐酸护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd3 | object | 耐酸护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd4 | object | 耐酸护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd5 | object | 耐酸护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd6 | object | 耐酸护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd1 | object | 耐碱护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd2 | object | 耐碱护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd3 | object | 耐碱护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd4 | object | 耐碱护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd5 | object | 耐碱护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd6 | object | 耐碱护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd1 | object | 耐碱护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd2 | object | 耐碱护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd3 | object | 耐碱护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd4 | object | 耐碱护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd5 | object | 耐碱护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd6 | object | 耐碱护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd1 | object | 耐碱护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd2 | object | 耐碱护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd3 | object | 耐碱护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd4 | object | 耐碱护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd5 | object | 耐碱护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd6 | object | 耐碱护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd1 | object | 耐碱护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd2 | object | 耐碱护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd3 | object | 耐碱护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd4 | object | 耐碱护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd5 | object | 耐碱护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd6 | object | 耐碱护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd1 | object | 热寿命护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd2 | object | 热寿命护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd3 | object | 热寿命护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd4 | object | 热寿命护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd5 | object | 热寿命护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd6 | object | 热寿命护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd1 | object | 热寿命护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd2 | object | 热寿命护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd3 | object | 热寿命护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd4 | object | 热寿命护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd5 | object | 热寿命护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd6 | object | 热寿命护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd1 | object | 热寿命护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd2 | object | 热寿命护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd3 | object | 热寿命护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd4 | object | 热寿命护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd5 | object | 热寿命护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd6 | object | 热寿命护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd1 | object | 热寿命护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd2 | object | 热寿命护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd3 | object | 热寿命护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd4 | object | 热寿命护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd5 | object | 热寿命护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd6 | object | 热寿命护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathHotStretchLoadHte | object | 护套热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&#124;─sheathHotStretchCoolingHte | object | 护套热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&#124;─dielectricWithstandVoltage | object | 耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─dielectricWithstandVoltageTiem | object | 耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─cl | object | Cl测试值 |
| &ensp;&ensp;&#124;─br | object | Br测试值 |
| &ensp;&ensp;&#124;─numUl | object | 数量 |
| &ensp;&ensp;&#124;─diameterUlTd1 | object | UL线径测试数据1 |
| &ensp;&ensp;&#124;─diameterUlTd2 | object | UL线径测试数据2 |
| &ensp;&ensp;&#124;─diameterUlTd3 | object | UL线径测试数据3 |
| &ensp;&ensp;&#124;─diameterUlTd4 | object | UL线径测试数据4 |
| &ensp;&ensp;&#124;─diameterUlTd5 | object | UL线径测试数据5 |
| &ensp;&ensp;&#124;─diameterUlTd6 | object | UL线径测试数据6 |
| &ensp;&ensp;&#124;─insulOdUlTd1 | object | UL绝缘外径测试数据1 |
| &ensp;&ensp;&#124;─insulOdUlTd2 | object | UL绝缘外径测试数据2 |
| &ensp;&ensp;&#124;─insulOdUlTd3 | object | UL绝缘外径测试数据3 |
| &ensp;&ensp;&#124;─insulOdUlTd4 | object | UL绝缘外径测试数据4 |
| &ensp;&ensp;&#124;─insulOdUlTd5 | object | UL绝缘外径测试数据5 |
| &ensp;&ensp;&#124;─insulOdUlTd6 | object | UL绝缘外径测试数据6 |
| &ensp;&ensp;&#124;─insulOdUlTd | object | UL绝缘外径测试数据 |
| &ensp;&ensp;&#124;─insulThkUlTd1 | object | UL绝缘厚度测试数据1 |
| &ensp;&ensp;&#124;─insulThkUlTd2 | object | UL绝缘厚度测试数据2 |
| &ensp;&ensp;&#124;─insulThkUlTd3 | object | UL绝缘厚度测试数据3 |
| &ensp;&ensp;&#124;─insulThkUlTd4 | object | UL绝缘厚度测试数据4 |
| &ensp;&ensp;&#124;─insulThkUlTd5 | object | UL绝缘厚度测试数据5 |
| &ensp;&ensp;&#124;─insulThkUlTd6 | object | UL绝缘厚度测试数据6 |
| &ensp;&ensp;&#124;─insulThkUlTd7 | object | UL绝缘厚度测试数据7 |
| &ensp;&ensp;&#124;─insulThkUlTd8 | object | UL绝缘厚度测试数据8 |
| &ensp;&ensp;&#124;─insulThkUlTd9 | object | UL绝缘厚度测试数据9 |
| &ensp;&ensp;&#124;─insulThkUlTd10 | object | UL绝缘厚度测试数据10 |
| &ensp;&ensp;&#124;─sheathThkUlTd1 | object | Ul护套厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathThkUlTd2 | object | Ul护套厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathThkUlTd3 | object | Ul护套厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathThkUlTd4 | object | Ul护套厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathThkUlTd5 | object | Ul护套厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathThkUlTd6 | object | Ul护套厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathThkUlTd7 | object | Ul护套厚度测试数据7 |
| &ensp;&ensp;&#124;─sheathThkUlTd8 | object | Ul护套厚度测试数据8 |
| &ensp;&ensp;&#124;─sheathThkUlTd9 | object | Ul护套厚度测试数据9 |
| &ensp;&ensp;&#124;─sheathThkUlTd10 | object | Ul护套厚度测试数据10 |
| &ensp;&ensp;&#124;─insulAvgThkUl | object | 绝缘平均厚度判断值 |
| &ensp;&ensp;&#124;─insulMinThkUl | object | 绝缘最小厚度判断值 |
| &ensp;&ensp;&#124;─sheathAvgThkUl | object | 护套平均厚度判断值 |
| &ensp;&ensp;&#124;─sheathMinThkUl | object | 护套最小厚度判断值 |
| &ensp;&ensp;&#124;─biTempUl | object | Ul老化条件温度/℃ |
| &ensp;&ensp;&#124;─biTimeUl | object | Ul老化条件时间/H |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd1 | object | Ul护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd2 | object | Ul护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd3 | object | Ul护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd4 | object | Ul护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd5 | object | Ul护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd6 | object | Ul护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd1 | object | Ul护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd2 | object | Ul护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd3 | object | Ul护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd4 | object | Ul护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd5 | object | Ul护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd6 | object | Ul护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd1 | object | Ul护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd2 | object | Ul护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd3 | object | Ul护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd4 | object | Ul护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd5 | object | Ul护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd6 | object | Ul护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd1 | object | Ul护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd2 | object | Ul护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd3 | object | Ul护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd4 | object | Ul护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd5 | object | Ul护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd6 | object | Ul护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathHotStretchLoadHteIec | object | IEC热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&#124;─sheathHotStretchCoolingHteIec | object | IEC热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&#124;─sheathLtBendLnIec | object | IEC护套低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─sheathLtBendCrackIec | object | IEC护套低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─sheathBeforeHeatingTd | object | 加热前值 |
| &ensp;&ensp;&#124;─sheathAfterHeatingTd | object | 加热后值 |
| &ensp;&ensp;&#124;─irCalcIecDv | object | IEC绝缘电阻判断值 |
| &ensp;&ensp;&#124;─dielectricPokIec | object | IEC耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─adhesion | object | 附着力 |
| &ensp;&ensp;&#124;─lowTemperatureWindingDiameter | object | 低温卷绕直径 |
| &ensp;&ensp;&#124;─thermalOverloadDiameter | object | 热过载直径 |
| &ensp;&ensp;&#124;─thermalOverloadWeight | object | 热过载重量 |
| &ensp;&ensp;&#124;─waterResistanceGasolineDiameter | object | 耐液体性汽油直径 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilDiameter | object | 耐液体性柴油直径 |
| &ensp;&ensp;&#124;─waterResistanceEthanolDiameter | object | 耐液体性乙醇直径 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidDiameter | object | 耐液体性电池酸直径 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilDiameter | object | 耐液体性发动机润滑油直径 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidDiameter | object | 耐液体性转向助力液直径 |
| &ensp;&ensp;&#124;─waterResistanceAtfDiameter | object | 耐液体性自动排挡液直径\|\|耐液体性自动变速箱油直径 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeDiameter | object | 耐液体性防冻液直径 |
| &ensp;&ensp;&#124;─powerFrequencyVoltagePok | object | 工频交流电压是否无击穿 |
| &ensp;&ensp;&#124;─breakdownVoltagePok | object | 击穿电压是否无击穿 |
| &ensp;&ensp;&#124;─hthpTd | object | 高温压力测试值 |
| &ensp;&ensp;&#124;─thermalShrinkageOriginalLength | object | 热收缩原长 |
| &ensp;&ensp;&#124;─thermalShrinkageHeatingLenght | object | 热收缩加热后长 |
| &ensp;&ensp;&#124;─overheatCrack | object | 过热试验是否无开裂 |
| &ensp;&ensp;&#124;─lowTemperatureImpact4hrCrack | object | 低温冲击4hr是否无开裂 |
| &ensp;&ensp;&#124;─adhesionFallOff | object | 附着力是否无脱落 |
| &ensp;&ensp;&#124;─peelEasy | object | 剥离是否容易 |
| &ensp;&ensp;&#124;─oilResistantCrack | object | 耐油是否无开裂 |
| &ensp;&ensp;&#124;─fuelResistantCrack | object | 耐燃料是否无开裂 |
| &ensp;&ensp;&#124;─arWeight | object | 耐磨性重量 |
| &ensp;&ensp;&#124;─withstandVoltageDielectricText | object | 耐电压测试介电文字 |
| &ensp;&ensp;&#124;─withstandVoltageDielectricImmersion | object | 耐电压测试介电浸水 |
| &ensp;&ensp;&#124;─withstandVoltageVoltage | object | 耐电压测试电压 |
| &ensp;&ensp;&#124;─withstandVoltageRaiseVoltage | object | 耐电压测试升高电压 |
| &ensp;&ensp;&#124;─shortTermAgingDiameter | object | 短期老化直径 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPok | object | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidLn | object | 耐液体性制动液圈数 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidCrack | object | 耐液体性制动液是否无开裂 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidPok | object | 耐液体性制动液是否无击穿 |
| &ensp;&ensp;&#124;─windingHeatingLn | object | 卷绕加热圈数 |
| &ensp;&ensp;&#124;─windingHeatingCrack | object | 卷绕加热是否开裂 |
| &ensp;&ensp;&#124;─windingHeatingDiameter | object | 卷绕加热直径 |
| &ensp;&ensp;&#124;─ir20Length | object | 20℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir20Td | object | 20℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─ir20CalcDv | object | 20℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─ir60Length | object | 60℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir60Td | object | 60℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─ir60CalcDv | object | 60℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltage | object | 耐电压测试(浸水)耐压/kv |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltageTime | object | 耐电压测试(浸水)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltagePok | object | 耐电压测试(浸水)是否击穿 |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltage | object | 耐电压测试(空气)耐压/kv |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltageTime | object | 耐电压测试(空气)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltagePok | object | 耐电压测试(空气)是否击穿 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd1 | object | 护套哑铃片老化前厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd2 | object | 护套哑铃片老化前厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd3 | object | 护套哑铃片老化前厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd4 | object | 护套哑铃片老化前厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd5 | object | 护套哑铃片老化前厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd6 | object | 护套哑铃片老化前厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd1 | object | 护套哑铃片老化后厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd2 | object | 护套哑铃片老化后厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd3 | object | 护套哑铃片老化后厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd4 | object | 护套哑铃片老化后厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd5 | object | 护套哑铃片老化后厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd6 | object | 护套哑铃片老化后厚度测试数据6 |
| &ensp;&ensp;&#124;─tsText | object | 热冲击文本 |
| &ensp;&ensp;&#124;─ltBendText | object | 低温弯曲文本 |
| &ensp;&ensp;&#124;─flexibilityText | object | 柔韧性文本 |
| &ensp;&ensp;&#124;─sheathAgingCt | object | 护套老化计算模板 |
| &ensp;&ensp;&#124;─htgDeformationRateCt | object | 加热变形计算模板 |
| &ensp;&ensp;&#124;─htgFrontDiameter | object | 加热变形前线径测试数据 |
| &ensp;&ensp;&#124;─htgRearDiameter | object | 加热变形后线径测试数据 |
| &ensp;&ensp;&#124;─htgMandrelDiameter | object | 加热变形心棒直径测试数据 |
| &ensp;&ensp;&#124;─irCalcDvText | object | 绝缘电阻判断文本 |
| &ensp;&ensp;&#124;─irCalcDvResult | object | 绝缘电阻判断结果 |
| &ensp;&ensp;&#124;─irCalcTemp | object | 绝缘电阻温度 |
| &ensp;&ensp;&#124;─insulTsDiameter | object | 绝缘热冲击直径 |
| &ensp;&ensp;&#124;─sheathTsDiameter | object | 护套热冲击直径 |
| &ensp;&ensp;&#124;─insulLtBendDiameter | object | 绝缘低温弯曲直径 |
| &ensp;&ensp;&#124;─sheathLtBendDiameter | object | 护套低温弯曲直径 |
| &ensp;&ensp;&#124;─hotWaterResistanceForwardSampleLength | object | 耐热水测试值MΩ(正向) |
| &ensp;&ensp;&#124;─hotWaterResistanceReverseSampleLength | object | 耐热水测试值MΩ(反向) |
| visible | object | 是否显示 |

**Request Demo:**

```json
{
  "report": {
    "customerName": "",
    "submitter": "",
    "testBasis": "",
    "productName": "",
    "specification": "",
    "reportNo": "",
    "submitterDate": "",
    "sampleStatus": "",
    "startTestDate": "",
    "endTestDate": "",
    "majorMeasured": "",
    "checked": "",
    "approved": "",
    "certigier": "",
    "createTime": "",
    "createUserId": "",
    "createUserName": "",
    "description": "",
    "wireType": "",
    "updateTime": "",
    "updateUserId": "",
    "updateUserName": ""
  },
  "wireList": [
    {
      "reportNo": "",
      "id": 0,
      "num": 0,
      "color": "",
      "diameterTd1": 0.0,
      "diameterTd2": 0.0,
      "diameterTd3": 0.0,
      "diameterTd4": 0.0,
      "diameterTd5": 0.0,
      "diameterTd6": 0.0,
      "insulOdTd1": 0.0,
      "insulOdTd2": 0.0,
      "insulOdTd3": 0.0,
      "insulOdTd4": 0.0,
      "insulOdTd5": 0.0,
      "insulOdTd6": 0.0,
      "insulThkTd1": 0.0,
      "insulThkTd2": 0.0,
      "insulThkTd3": 0.0,
      "insulThkTd4": 0.0,
      "insulThkTd5": 0.0,
      "insulThkTd6": 0.0,
      "insulThkTd7": 0.0,
      "insulThkTd8": 0.0,
      "insulThkTd9": 0.0,
      "insulThkTd10": 0.0,
      "insulUnagedElongationTd1": 0.0,
      "insulUnagedElongationTd2": 0.0,
      "insulUnagedElongationTd3": 0.0,
      "insulUnagedElongationTd4": 0.0,
      "insulUnagedElongationTd5": 0.0,
      "insulUnagedElongationTd6": 0.0,
      "insulUnagedPullTd1": 0.0,
      "insulUnagedPullTd2": 0.0,
      "insulUnagedPullTd3": 0.0,
      "insulUnagedPullTd4": 0.0,
      "insulUnagedPullTd5": 0.0,
      "insulUnagedPullTd6": 0.0,
      "insulAgingElongationTd1": 0.0,
      "insulAgingElongationTd2": 0.0,
      "insulAgingElongationTd3": 0.0,
      "insulAgingElongationTd4": 0.0,
      "insulAgingElongationTd5": 0.0,
      "insulAgingElongationTd6": 0.0,
      "insulAgingPullTd1": 0.0,
      "insulAgingPullTd2": 0.0,
      "insulAgingPullTd3": 0.0,
      "insulAgingPullTd4": 0.0,
      "insulAgingPullTd5": 0.0,
      "insulAgingPullTd6": 0.0,
      "htgFrontAvgDiameter": 0.0,
      "htgRearAvgDiameter": 0.0,
      "conductor20DcrTd": 0.0,
      "irLength": 0.0,
      "irTd": 0.0,
      "materialQuality": "",
      "insulMaterialQuality": "",
      "firty807Unaged": 0.0,
      "second807Aging": 0.0,
      "insulHthp": 0.0,
      "insulThkTd11": 0.0,
      "insulThkTd12": 0.0,
      "insulThkTd13": 0.0,
      "insulThkTd14": 0.0,
      "insulThkTd15": 0.0,
      "insulThkTd16": 0.0,
      "insulThkTd17": 0.0,
      "insulThkTd18": 0.0,
      "compatibilityInsulUnagedElongationTd1": 0.0,
      "compatibilityInsulUnagedElongationTd2": 0.0,
      "compatibilityInsulUnagedElongationTd3": 0.0,
      "compatibilityInsulUnagedElongationTd4": 0.0,
      "compatibilityInsulUnagedElongationTd5": 0.0,
      "compatibilityInsulUnagedElongationTd6": 0.0,
      "compatibilityInsulUnagedPullTd1": 0.0,
      "compatibilityInsulUnagedPullTd2": 0.0,
      "compatibilityInsulUnagedPullTd3": 0.0,
      "compatibilityInsulUnagedPullTd4": 0.0,
      "compatibilityInsulUnagedPullTd5": 0.0,
      "compatibilityInsulUnagedPullTd6": 0.0,
      "compatibilityInsulAgingElongationTd1": 0.0,
      "compatibilityInsulAgingElongationTd2": 0.0,
      "compatibilityInsulAgingElongationTd3": 0.0,
      "compatibilityInsulAgingElongationTd4": 0.0,
      "compatibilityInsulAgingElongationTd5": 0.0,
      "compatibilityInsulAgingElongationTd6": 0.0,
      "compatibilityInsulAgingPullTd1": 0.0,
      "compatibilityInsulAgingPullTd2": 0.0,
      "compatibilityInsulAgingPullTd3": 0.0,
      "compatibilityInsulAgingPullTd4": 0.0,
      "compatibilityInsulAgingPullTd5": 0.0,
      "compatibilityInsulAgingPullTd6": 0.0,
      "thermalLifeInsulUnagedElongationTd1": 0.0,
      "thermalLifeInsulUnagedElongationTd2": 0.0,
      "thermalLifeInsulUnagedElongationTd3": 0.0,
      "thermalLifeInsulUnagedElongationTd4": 0.0,
      "thermalLifeInsulUnagedElongationTd5": 0.0,
      "thermalLifeInsulUnagedElongationTd6": 0.0,
      "thermalLifeInsulUnagedPullTd1": 0.0,
      "thermalLifeInsulUnagedPullTd2": 0.0,
      "thermalLifeInsulUnagedPullTd3": 0.0,
      "thermalLifeInsulUnagedPullTd4": 0.0,
      "thermalLifeInsulUnagedPullTd5": 0.0,
      "thermalLifeInsulUnagedPullTd6": 0.0,
      "thermalLifeInsulAgingElongationTd1": 0.0,
      "thermalLifeInsulAgingElongationTd2": 0.0,
      "thermalLifeInsulAgingElongationTd3": 0.0,
      "thermalLifeInsulAgingElongationTd4": 0.0,
      "thermalLifeInsulAgingElongationTd5": 0.0,
      "thermalLifeInsulAgingElongationTd6": 0.0,
      "thermalLifeInsulAgingPullTd1": 0.0,
      "thermalLifeInsulAgingPullTd2": 0.0,
      "thermalLifeInsulAgingPullTd3": 0.0,
      "thermalLifeInsulAgingPullTd4": 0.0,
      "thermalLifeInsulAgingPullTd5": 0.0,
      "thermalLifeInsulAgingPullTd6": 0.0,
      "insulHotStretchLoadHte": 0.0,
      "insulHotStretchCoolingHte": 0.0,
      "irCalc": 0.0,
      "irCalcIec": 0.0
    }
  ],
  "publicData": {
    "reportNo": "",
    "printingErasibilit": "",
    "conductorCorrosion": "",
    "tsCrack": "",
    "ltBendCrack": "",
    "flexibilityCrack": "",
    "dielectricIiiPok": "",
    "dielectricIPok": "",
    "hvdcWirePok": "",
    "lightCottonVw1Td1": "",
    "lightCottonVw1Td2": "",
    "lightCottonVw1Td3": "",
    "lightCottonFt2Td1": "",
    "lightCottonFt2Td2": "",
    "lightCottonFt2Td3": "",
    "lightCottonUlTd1": "",
    "lightCottonUlTd2": "",
    "lightCottonUlTd3": "",
    "sheathMaterialQuality": "",
    "insulTsCrack": "",
    "sheathTsCrack": "",
    "insulLtBendCrack": "",
    "sheathLtBendCrack": "",
    "lowTemperatureImpactCrack": "",
    "thermalStability": 0.0,
    "flexureTest": "",
    "insulDielectricPok": "",
    "fgDielectricPok": "",
    "sheathOdTd1": 0.0,
    "sheathOdTd2": 0.0,
    "sheathOdTd3": 0.0,
    "sheathOdTd4": 0.0,
    "sheathOdTd5": 0.0,
    "sheathOdTd6": 0.0,
    "sheathThkTd1": 0.0,
    "sheathThkTd2": 0.0,
    "sheathThkTd3": 0.0,
    "sheathThkTd4": 0.0,
    "sheathThkTd5": 0.0,
    "sheathThkTd6": 0.0,
    "sheathUnagedElongationTd1": 0.0,
    "sheathUnagedElongationTd2": 0.0,
    "sheathUnagedElongationTd3": 0.0,
    "sheathUnagedElongationTd4": 0.0,
    "sheathUnagedElongationTd5": 0.0,
    "sheathUnagedElongationTd6": 0.0,
    "sheathUnagedPullTd1": 0.0,
    "sheathUnagedPullTd2": 0.0,
    "sheathUnagedPullTd3": 0.0,
    "sheathUnagedPullTd4": 0.0,
    "sheathUnagedPullTd5": 0.0,
    "sheathUnagedPullTd6": 0.0,
    "sheathAgingElongationTd1": 0.0,
    "sheathAgingElongationTd2": 0.0,
    "sheathAgingElongationTd3": 0.0,
    "sheathAgingElongationTd4": 0.0,
    "sheathAgingElongationTd5": 0.0,
    "sheathAgingElongationTd6": 0.0,
    "sheathAgingPullTd1": 0.0,
    "sheathAgingPullTd2": 0.0,
    "sheathAgingPullTd3": 0.0,
    "sheathAgingPullTd4": 0.0,
    "sheathAgingPullTd5": 0.0,
    "sheathAgingPullTd6": 0.0,
    "csgFrontThk": 0.0,
    "csgRearThk": 0.0,
    "spgLength": 0.0,
    "spgEmptyWeight": 0.0,
    "spgWaterWeight": 0.0,
    "hteMarkLength": 0.0,
    "hteExtensionLength": 0.0,
    "sheathThkTd7": 0.0,
    "sheathThkTd8": 0.0,
    "sheathThkTd9": 0.0,
    "sheathThkTd10": 0.0,
    "insulAvgThk": 0.0,
    "insulMinThk": 0.0,
    "sheathAvgThk": 0.0,
    "sheathMinThk": 0.0,
    "insulBiTemp": 0.0,
    "insulBiTime": 0.0,
    "insulUnagedEi": 0.0,
    "insulUnagedTs": 0.0,
    "insulAgingEi": 0.0,
    "insulAgingTs": 0.0,
    "sheathBiTemp": 0.0,
    "sheathBiTime": 0.0,
    "sheathUnagedEi": 0.0,
    "sheathUnagedTs": 0.0,
    "sheathAgingEi": 0.0,
    "sheathAgingTs": 0.0,
    "conductorCorrosionTemp": 0.0,
    "conductorCorrosionTime": 0.0,
    "tsTemp": 0.0,
    "tsTime": 0.0,
    "tsLn": 0.0,
    "ltBendTemp": 0.0,
    "ltBendTime": 0.0,
    "ltBendLn": 0.0,
    "flexibilityTemp": 0.0,
    "flexibilityTime": 0.0,
    "flexibilityLn": 0.0,
    "conductor20Dcr": 0.0,
    "dielectricIiiWithstandVoltage": 0.0,
    "dielectricIiiWithstandVoltageTime": 0.0,
    "dielectricINum": 0.0,
    "dielectricITemp": 0.0,
    "dielectricITime": 0.0,
    "dielectricIGirth": 0.0,
    "dielectricILn": 0.0,
    "dielectricIWithstandVoltage": 0.0,
    "dielectricIWithstandVoltageTiem": 0.0,
    "dielectricIPokNum": 0.0,
    "hvdcWireNum": 0.0,
    "hvdcWireBakingTemp": 0.0,
    "hvdcWireBakingTime": 0.0,
    "hvdcWireDischargeTemp": 0.0,
    "hvdcWireDischargePct": 0.0,
    "hvdcWireDischargeTime": 0.0,
    "hvdcWireTestBar": 0.0,
    "hvdcWireLn": 0.0,
    "hvdcWireDcv": 0.0,
    "hvdcWireDcvTime": 0.0,
    "firstFlameRetardingTd1": 0.0,
    "firstFlameRetardingTd2": 0.0,
    "firstFlameRetardingTd3": 0.0,
    "secondFlameRetardingTd1": 0.0,
    "secondFlameRetardingTd2": 0.0,
    "secondFlameRetardingTd3": 0.0,
    "thirdFlameRetardingTd1": 0.0,
    "thirdFlameRetardingTd2": 0.0,
    "thirdFlameRetardingTd3": 0.0,
    "fourthFlameRetardingTd1": 0.0,
    "fourthFlameRetardingTd2": 0.0,
    "fourthFlameRetardingTd3": 0.0,
    "fifthFlameRetardingTd1": 0.0,
    "fifthFlameRetardingTd2": 0.0,
    "fifthFlameRetardingTd3": 0.0,
    "flagBurningAreaTd1": 0.0,
    "flagBurningAreaTd2": 0.0,
    "flagBurningAreaTd3": 0.0,
    "burningAfterLenghtTd1": 0.0,
    "burningAfterLenghtTd2": 0.0,
    "burningAfterLenghtTd3": 0.0,
    "burningTimeTd1": 0.0,
    "burningTimeTd2": 0.0,
    "burningTimeTd3": 0.0,
    "thermalElongation": 0.0,
    "avgOdUbv": 0.0,
    "sectionMax": 0.0,
    "sectionMin": 0.0,
    "sheathFirty807Unaged": 0.0,
    "sheathSecond807Aging": 0.0,
    "insulTsLength": 0.0,
    "insulTsLn": 0.0,
    "sheathTsLength": 0.0,
    "sheathTsLn": 0.0,
    "insulLtBendLn": 0.0,
    "sheathLtBendLn": 0.0,
    "lowTemperatureImpact": 0.0,
    "sheathHthp": 0.0,
    "printingSpaceDv": 0.0,
    "printingSpace": 0.0,
    "ir90Length": 0.0,
    "ir90Td": 0.0,
    "irCalcDv": 0.0,
    "ir90CalcDv": 0.0,
    "diameterTdAvgDv": 0.0,
    "sheathOdDvStart": 0.0,
    "sheathOdDvEnd": 0.0,
    "insulUnagedEiMvsDv": 0.0,
    "insulUnagedTsMvsDv": 0.0,
    "insulAgingEiMvsDv": 0.0,
    "insulAgingTsMvsDv": 0.0,
    "sheathUnagedEiMvsDv": 0.0,
    "sheathUnagedTsMvsDv": 0.0,
    "sheathAgingEiMvsDv": 0.0,
    "sheathAgingTsMvsDv": 0.0,
    "insulDielectricWithstandVoltage": 0.0,
    "insulDielectricWithstandVoltageTime": 0.0,
    "fgDielectricWithstandVoltage": 0.0,
    "fgDielectricWithstandVoltageTime": 0.0,
    "gbTbfStartDistance": 0.0,
    "gbTbfBurningDistance": 0.0,
    "sheathThkTd11": 0.0,
    "sheathThkTd12": 0.0,
    "sheathThkTd13": 0.0,
    "sheathThkTd14": 0.0,
    "sheathThkTd15": 0.0,
    "sheathThkTd16": 0.0,
    "sheathThkTd17": 0.0,
    "sheathThkTd18": 0.0,
    "spgLengthEmptyWeight": 0.0,
    "parallelCordBeforeTearingTd1": 0.0,
    "parallelCordBeforeTearingTd2": 0.0,
    "parallelCordBeforeTearingTd3": 0.0,
    "parallelCordBeforeTearingTd4": 0.0,
    "parallelCordBeforeTearingTd5": 0.0,
    "parallelCordBeforeTearingTd6": 0.0,
    "parallelCordAfterTearingTd1": 0.0,
    "parallelCordAfterTearingTd2": 0.0,
    "parallelCordAfterTearingTd3": 0.0,
    "parallelCordAfterTearingTd4": 0.0,
    "parallelCordAfterTearingTd5": 0.0,
    "parallelCordAfterTearingTd6": 0.0,
    "parallelCordSpacerBarTd1": 0.0,
    "parallelCordSpacerBarTd2": 0.0,
    "parallelCordSpacerBarTd3": 0.0,
    "parallelCordSpacerBarTd4": 0.0,
    "parallelCordSpacerBarTd5": 0.0,
    "parallelCordSpacerBarTd6": 0.0,
    "parallelCordBeforeTearingDv": 0.0,
    "parallelCordAfterTearingDv": 0.0,
    "parallelCordSpacerBarDv": 0.0,
    "insulTsTime": 0.0,
    "insulTsTemp": 0.0,
    "sheathTsTime": 0.0,
    "sheathTsTemp": 0.0,
    "insulLtBendTemp": 0.0,
    "insulLtBendTime": 0.0,
    "insulLtBendLenght": 0.0,
    "sheathLtBendTemp": 0.0,
    "sheathLtBendTime": 0.0,
    "sheathLtBendLenght": 0.0,
    "insulHtgDv": 0.0,
    "sheathHtgDv": 0.0,
    "sheathSurfaceR": 0.0,
    "sheathSurfaceRDv": 0.0,
    "csaDv": 0.0,
    "spindleNum": 0.0,
    "spindleRootNum": 0.0,
    "singleShieldDiameter": 0.0,
    "pitch": 0.0,
    "shieldDiameter": 0.0,
    "insulOdDv": 0.0,
    "peelStrengthTd1": 0.0,
    "peelStrengthTd2": 0.0,
    "peelStrengthTd3": 0.0,
    "peelStrengthTd4": 0.0,
    "ltBendBreakdown": "",
    "ltBendLenght": 0.0,
    "thcLenght": 0.0,
    "thcLn": 0.0,
    "thcCrack": "",
    "hotWaterResistanceLenght": 0.0,
    "hotWaterResistanceLn": 0.0,
    "hotWaterResistanceCrack": "",
    "hotWaterResistanceForward": 0.0,
    "hotWaterResistanceReverse": 0.0,
    "waterResistanceGasolineLn": 0.0,
    "waterResistanceGasolineTd": 0.0,
    "waterResistanceGasolinePct": 0.0,
    "waterResistanceGasolineCrack": "",
    "waterResistanceEthanolLn": 0.0,
    "waterResistanceEthanolTd": 0.0,
    "waterResistanceEthanolPct": 0.0,
    "waterResistanceEthanolCrack": "",
    "waterResistanceDieselOilLn": 0.0,
    "waterResistanceDieselOilTd": 0.0,
    "waterResistanceDieselOilPct": 0.0,
    "waterResistanceDieselOilCrack": "",
    "waterResistanceIrm902Ln": 0.0,
    "waterResistanceIrm902Td": 0.0,
    "waterResistanceIrm902Pct": 0.0,
    "waterResistanceIrm902Crack": "",
    "waterResistanceIrm903Ln": 0.0,
    "waterResistanceIrm903Td": 0.0,
    "waterResistanceIrm903Pct": 0.0,
    "waterResistanceIrm903Crack": "",
    "waterResistanceAtfLn": 0.0,
    "waterResistanceAtfTd": 0.0,
    "waterResistanceAtfPct": 0.0,
    "waterResistanceAtfCrack": "",
    "waterResistanceAntifreezeLn": 0.0,
    "waterResistanceAntifreezeTd": 0.0,
    "waterResistanceAntifreezePct": 0.0,
    "waterResistanceAntifreezeCrack": "",
    "waterResistanceBatteryAcidLn": 0.0,
    "waterResistanceBatteryAcidTd": 0.0,
    "waterResistanceBatteryAcidPct": 0.0,
    "waterResistanceBatteryAcidCrack": "",
    "frSelfExtinguishingDv": 0.0,
    "frSelfExtinguishingTime": 0.0,
    "frSelfExtinguishingTd1": 0.0,
    "frSelfExtinguishingTd2": 0.0,
    "frSelfExtinguishingTd3": 0.0,
    "frUnburnedTd1": 0.0,
    "frUnburnedTd2": 0.0,
    "frUnburnedTd3": 0.0,
    "hte": 0.0,
    "dielectricPok": "",
    "peelStrength": 0.0,
    "hthpTemp": 0.0,
    "hthpCrack": "",
    "lowTemperatureWindingWeight": 0.0,
    "lowTemperatureWindingLn": 0.0,
    "lowTemperatureWindingCrack": "",
    "arDv": 0.0,
    "ar": 0.0,
    "longTermAgingTemp": 0.0,
    "longTermAgingLn": 0.0,
    "longTermAgingCrack": "",
    "shortTermAgingTemp": 0.0,
    "shortTermAgingLn": 0.0,
    "shortTermAgingWeight": 0.0,
    "shortTermAgingCrack": "",
    "thermalOverloadLn": 0.0,
    "thermalOverloadCrack": "",
    "thermalShrinkage": 0.0,
    "temperatureHumidityHlternationLn": 0.0,
    "temperatureHumidityHlternationTemp1": 0.0,
    "temperatureHumidityHlternationTemp2": 0.0,
    "temperatureHumidityHlternationCrack": "",
    "ozoneResistanceLn": 0.0,
    "ozoneResistancePok": "",
    "waterResistanceEngineCoolantLn": 0.0,
    "waterResistanceEngineCoolantTd": 0.0,
    "waterResistanceEngineCoolantPct": 0.0,
    "waterResistanceEngineCoolantCrack": "",
    "waterResistanceEngineOilLn": 0.0,
    "waterResistanceEngineOilTd": 0.0,
    "waterResistanceEngineOilPct": 0.0,
    "waterResistanceEngineOilCrack": "",
    "waterResistancePowerSteeringFluidLn": 0.0,
    "waterResistancePowerSteeringFluidTd": 0.0,
    "waterResistancePowerSteeringFluidPct": 0.0,
    "waterResistancePowerSteeringFluidCrack": "",
    "waterResistanceBatteryAcidPok": "",
    "frFireSupplyTime": 0.0,
    "adhesionDv": 0.0,
    "adhesionTd1": 0.0,
    "adhesionTd2": 0.0,
    "adhesionTd3": 0.0,
    "adhesionTd4": 0.0,
    "adhesionTd5": 0.0,
    "htgTemp": 0.0,
    "htgCrack": "",
    "htgPok": "",
    "ltBendWeight": 0.0,
    "lowTemperatureImpactPok": "",
    "hr1ATemp": 0.0,
    "hr1ATime": 0.0,
    "hr1ALenght": 0.0,
    "hr1AWeight": 0.0,
    "hr1ACrack": "",
    "hr1APok": "",
    "hr1BTemp": 0.0,
    "hr1BTime": 0.0,
    "hr1BLenght": 0.0,
    "hr1BWeight": 0.0,
    "hr1BCrack": "",
    "hr1BPok": "",
    "hr1CCrack": "",
    "waterResistanceGasolinePok": "",
    "waterResistanceDieselOilPok": "",
    "waterResistanceEthanolPok": "",
    "waterResistanceAtfPok": "",
    "waterResistanceAntifreezePok": "",
    "waterResistanceIrm902Pok": "",
    "waterResistanceIrm903Pok": "",
    "frSelfExtinguishingTd": 0.0,
    "tsLenght": 0.0,
    "hotStretchLoadLenght": 0.0,
    "hotStretchCoolingLenght": 0.0,
    "signContinuity": 0.0,
    "immersionPowerFrequencyVoltageVoltage": 0.0,
    "immersionPowerFrequencyVoltageVoltageTime": null,
    "immersionPowerFrequencyVoltagePok": null,
    "roomTempPowerFrequencyVoltageTemp": null,
    "roomTempPowerFrequencyVoltageTime": null,
    "roomTempPowerFrequencyVoltageLenght": null,
    "roomTempPowerFrequencyVoltageLn": null,
    "roomTempPowerFrequencyVoltageUnagedVoltage": null,
    "roomTempPowerFrequencyVoltageUnagedVoltageTime": null,
    "roomTempPowerFrequencyVoltageAgingVoltage": null,
    "roomTempPowerFrequencyVoltageAgingVoltageTime": null,
    "roomTempPowerFrequencyVoltagePok": null,
    "ratedTempPowerFrequencyVoltageTemp": null,
    "ratedTempPowerFrequencyVoltageTime": null,
    "ratedTempPowerFrequencyVoltageRoastTemp": null,
    "ratedTempPowerFrequencyVoltageVoltage": null,
    "ratedTempPowerFrequencyVoltageVoltageTime": null,
    "ratedTempPowerFrequencyVoltagePok": null,
    "lightCottonHorizontalTd1": null,
    "lightCottonHorizontalTd2": null,
    "lightCottonHorizontalTd3": null,
    "lightCottonVerticalTd1": null,
    "lightCottonVerticalTd2": null,
    "lightCottonVerticalTd3": null,
    "zTbfStartDistanceTd1": null,
    "zTbfStartDistanceTd2": null,
    "zTbfStartDistanceTd3": null,
    "zTbfBurningDistanceTd1": null,
    "zTbfBurningDistanceTd2": null,
    "zTbfBurningDistanceTd3": null,
    "compatibilitySheathUnagedElongationTd1": null,
    "compatibilitySheathUnagedElongationTd2": null,
    "compatibilitySheathUnagedElongationTd3": null,
    "compatibilitySheathUnagedElongationTd4": null,
    "compatibilitySheathUnagedElongationTd5": null,
    "compatibilitySheathUnagedElongationTd6": null,
    "compatibilitySheathUnagedPullTd1": null,
    "compatibilitySheathUnagedPullTd2": null,
    "compatibilitySheathUnagedPullTd3": null,
    "compatibilitySheathUnagedPullTd4": null,
    "compatibilitySheathUnagedPullTd5": null,
    "compatibilitySheathUnagedPullTd6": null,
    "compatibilitySheathAgingElongationTd1": null,
    "compatibilitySheathAgingElongationTd2": null,
    "compatibilitySheathAgingElongationTd3": null,
    "compatibilitySheathAgingElongationTd4": null,
    "compatibilitySheathAgingElongationTd5": null,
    "compatibilitySheathAgingElongationTd6": null,
    "compatibilitySheathAgingPullTd1": null,
    "compatibilitySheathAgingPullTd2": null,
    "compatibilitySheathAgingPullTd3": null,
    "compatibilitySheathAgingPullTd4": null,
    "compatibilitySheathAgingPullTd5": null,
    "compatibilitySheathAgingPullTd6": null,
    "compatibilityInsulUnagedEiMvsDv": null,
    "compatibilityInsulUnagedTsMvsDv": null,
    "compatibilityInsulAgingEiMvsDv": null,
    "compatibilityInsulAgingTsMvsDv": null,
    "compatibilityInsulAgingEi": null,
    "compatibilityInsulAgingTs": null,
    "compatibilitySheathUnagedEiMvsDv": null,
    "compatibilitySheathUnagedTsMvsDv": null,
    "compatibilitySheathAgingEiMvsDv": null,
    "compatibilitySheathAgingTsMvsDv": null,
    "compatibilitySheathAgingEi": null,
    "compatibilitySheathAgingTs": null,
    "flexureFrequency": null,
    "ir90Calc": null,
    "insulDielectricWithstandVoltageCurrent": null,
    "fgDielectricWithstandVoltageCurrent": null,
    "sheathOdDv": null,
    "arSheathUnagedElongationTd1": null,
    "arSheathUnagedElongationTd2": null,
    "arSheathUnagedElongationTd3": null,
    "arSheathUnagedElongationTd4": null,
    "arSheathUnagedElongationTd5": null,
    "arSheathUnagedElongationTd6": null,
    "arSheathUnagedPullTd1": null,
    "arSheathUnagedPullTd2": null,
    "arSheathUnagedPullTd3": null,
    "arSheathUnagedPullTd4": null,
    "arSheathUnagedPullTd5": null,
    "arSheathUnagedPullTd6": null,
    "arSheathAgingElongationTd1": null,
    "arSheathAgingElongationTd2": null,
    "arSheathAgingElongationTd3": null,
    "arSheathAgingElongationTd4": null,
    "arSheathAgingElongationTd5": null,
    "arSheathAgingElongationTd6": null,
    "arSheathAgingPullTd1": null,
    "arSheathAgingPullTd2": null,
    "arSheathAgingPullTd3": null,
    "arSheathAgingPullTd4": null,
    "arSheathAgingPullTd5": null,
    "arSheathAgingPullTd6": null,
    "apSheathUnagedElongationTd1": null,
    "apSheathUnagedElongationTd2": null,
    "apSheathUnagedElongationTd3": null,
    "apSheathUnagedElongationTd4": null,
    "apSheathUnagedElongationTd5": null,
    "apSheathUnagedElongationTd6": null,
    "apSheathUnagedPullTd1": null,
    "apSheathUnagedPullTd2": null,
    "apSheathUnagedPullTd3": null,
    "apSheathUnagedPullTd4": null,
    "apSheathUnagedPullTd5": null,
    "apSheathUnagedPullTd6": null,
    "apSheathAgingElongationTd1": null,
    "apSheathAgingElongationTd2": null,
    "apSheathAgingElongationTd3": null,
    "apSheathAgingElongationTd4": null,
    "apSheathAgingElongationTd5": null,
    "apSheathAgingElongationTd6": null,
    "apSheathAgingPullTd1": null,
    "apSheathAgingPullTd2": null,
    "apSheathAgingPullTd3": null,
    "apSheathAgingPullTd4": null,
    "apSheathAgingPullTd5": null,
    "apSheathAgingPullTd6": null,
    "thermalLifeSheathUnagedElongationTd1": null,
    "thermalLifeSheathUnagedElongationTd2": null,
    "thermalLifeSheathUnagedElongationTd3": null,
    "thermalLifeSheathUnagedElongationTd4": null,
    "thermalLifeSheathUnagedElongationTd5": null,
    "thermalLifeSheathUnagedElongationTd6": null,
    "thermalLifeSheathUnagedPullTd1": null,
    "thermalLifeSheathUnagedPullTd2": null,
    "thermalLifeSheathUnagedPullTd3": null,
    "thermalLifeSheathUnagedPullTd4": null,
    "thermalLifeSheathUnagedPullTd5": null,
    "thermalLifeSheathUnagedPullTd6": null,
    "thermalLifeSheathAgingElongationTd1": null,
    "thermalLifeSheathAgingElongationTd2": null,
    "thermalLifeSheathAgingElongationTd3": null,
    "thermalLifeSheathAgingElongationTd4": null,
    "thermalLifeSheathAgingElongationTd5": null,
    "thermalLifeSheathAgingElongationTd6": null,
    "thermalLifeSheathAgingPullTd1": null,
    "thermalLifeSheathAgingPullTd2": null,
    "thermalLifeSheathAgingPullTd3": null,
    "thermalLifeSheathAgingPullTd4": null,
    "thermalLifeSheathAgingPullTd5": null,
    "thermalLifeSheathAgingPullTd6": null,
    "sheathHotStretchLoadHte": null,
    "sheathHotStretchCoolingHte": null,
    "dielectricWithstandVoltage": null,
    "dielectricWithstandVoltageTiem": null,
    "cl": null,
    "br": null,
    "numUl": null,
    "diameterUlTd1": null,
    "diameterUlTd2": null,
    "diameterUlTd3": null,
    "diameterUlTd4": null,
    "diameterUlTd5": null,
    "diameterUlTd6": null,
    "insulOdUlTd1": null,
    "insulOdUlTd2": null,
    "insulOdUlTd3": null,
    "insulOdUlTd4": null,
    "insulOdUlTd5": null,
    "insulOdUlTd6": null,
    "insulOdUlTd": null,
    "insulThkUlTd1": null,
    "insulThkUlTd2": null,
    "insulThkUlTd3": null,
    "insulThkUlTd4": null,
    "insulThkUlTd5": null,
    "insulThkUlTd6": null,
    "insulThkUlTd7": null,
    "insulThkUlTd8": null,
    "insulThkUlTd9": null,
    "insulThkUlTd10": null,
    "sheathThkUlTd1": null,
    "sheathThkUlTd2": null,
    "sheathThkUlTd3": null,
    "sheathThkUlTd4": null,
    "sheathThkUlTd5": null,
    "sheathThkUlTd6": null,
    "sheathThkUlTd7": null,
    "sheathThkUlTd8": null,
    "sheathThkUlTd9": null,
    "sheathThkUlTd10": null,
    "insulAvgThkUl": null,
    "insulMinThkUl": null,
    "sheathAvgThkUl": null,
    "sheathMinThkUl": null,
    "biTempUl": null,
    "biTimeUl": null,
    "sheathUnagedElongationUlTd1": null,
    "sheathUnagedElongationUlTd2": null,
    "sheathUnagedElongationUlTd3": null,
    "sheathUnagedElongationUlTd4": null,
    "sheathUnagedElongationUlTd5": null,
    "sheathUnagedElongationUlTd6": null,
    "sheathUnagedPullUlTd1": null,
    "sheathUnagedPullUlTd2": null,
    "sheathUnagedPullUlTd3": null,
    "sheathUnagedPullUlTd4": null,
    "sheathUnagedPullUlTd5": null,
    "sheathUnagedPullUlTd6": null,
    "sheathAgingElongationUlTd1": null,
    "sheathAgingElongationUlTd2": null,
    "sheathAgingElongationUlTd3": null,
    "sheathAgingElongationUlTd4": null,
    "sheathAgingElongationUlTd5": null,
    "sheathAgingElongationUlTd6": null,
    "sheathAgingPullUlTd1": null,
    "sheathAgingPullUlTd2": null,
    "sheathAgingPullUlTd3": null,
    "sheathAgingPullUlTd4": null,
    "sheathAgingPullUlTd5": null,
    "sheathAgingPullUlTd6": null,
    "sheathHotStretchLoadHteIec": null,
    "sheathHotStretchCoolingHteIec": null,
    "sheathLtBendLnIec": null,
    "sheathLtBendCrackIec": null,
    "sheathBeforeHeatingTd": null,
    "sheathAfterHeatingTd": null,
    "irCalcIecDv": null,
    "dielectricPokIec": null,
    "adhesion": null,
    "lowTemperatureWindingDiameter": null,
    "thermalOverloadDiameter": null,
    "thermalOverloadWeight": null,
    "waterResistanceGasolineDiameter": null,
    "waterResistanceDieselOilDiameter": null,
    "waterResistanceEthanolDiameter": null,
    "waterResistanceBatteryAcidDiameter": null,
    "waterResistanceEngineOilDiameter": null,
    "waterResistancePowerSteeringFluidDiameter": null,
    "waterResistanceAtfDiameter": null,
    "waterResistanceAntifreezeDiameter": null,
    "powerFrequencyVoltagePok": null,
    "breakdownVoltagePok": null,
    "hthpTd": null,
    "thermalShrinkageOriginalLength": null,
    "thermalShrinkageHeatingLenght": null,
    "overheatCrack": null,
    "lowTemperatureImpact4hrCrack": null,
    "adhesionFallOff": null,
    "peelEasy": null,
    "oilResistantCrack": null,
    "fuelResistantCrack": null,
    "arWeight": null,
    "withstandVoltageDielectricText": null,
    "withstandVoltageDielectricImmersion": null,
    "withstandVoltageVoltage": null,
    "withstandVoltageRaiseVoltage": null,
    "shortTermAgingDiameter": null,
    "waterResistancePowerSteeringFluidPok": null,
    "waterResistanceBrakeFluidLn": null,
    "waterResistanceBrakeFluidCrack": null,
    "waterResistanceBrakeFluidPok": null,
    "windingHeatingLn": null,
    "windingHeatingCrack": null,
    "windingHeatingDiameter": null,
    "ir20Length": null,
    "ir20Td": null,
    "ir20CalcDv": null,
    "ir60Length": null,
    "ir60Td": null,
    "ir60CalcDv": null,
    "dielectricImmersionWithstandVoltage": null,
    "dielectricImmersionWithstandVoltageTime": null,
    "dielectricImmersionWithstandVoltagePok": null,
    "dielectricAirWithstandVoltage": null,
    "dielectricAirWithstandVoltageTime": null,
    "dielectricAirWithstandVoltagePok": null,
    "sheathDumbbellSliceUnagedThkTd1": null,
    "sheathDumbbellSliceUnagedThkTd2": null,
    "sheathDumbbellSliceUnagedThkTd3": null,
    "sheathDumbbellSliceUnagedThkTd4": null,
    "sheathDumbbellSliceUnagedThkTd5": null,
    "sheathDumbbellSliceUnagedThkTd6": null,
    "sheathDumbbellSliceAgingThkTd1": null,
    "sheathDumbbellSliceAgingThkTd2": null,
    "sheathDumbbellSliceAgingThkTd3": null,
    "sheathDumbbellSliceAgingThkTd4": null,
    "sheathDumbbellSliceAgingThkTd5": null,
    "sheathDumbbellSliceAgingThkTd6": null,
    "tsText": null,
    "ltBendText": null,
    "flexibilityText": null,
    "sheathAgingCt": null,
    "htgDeformationRateCt": null,
    "htgFrontDiameter": null,
    "htgRearDiameter": null,
    "htgMandrelDiameter": null,
    "irCalcDvText": null,
    "irCalcDvResult": null,
    "irCalcTemp": null,
    "insulTsDiameter": null,
    "sheathTsDiameter": null,
    "insulLtBendDiameter": null,
    "sheathLtBendDiameter": null,
    "hotWaterResistanceForwardSampleLength": null,
    "hotWaterResistanceReverseSampleLength": null
  },
  "visible": null
}
```



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | string | 数据 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": ""
}
```




---
## 查询报告列表

> BASIC

**Path:** report/getReports

**Method:** POST

**Desc:**

 查询报告列表

> REQUEST



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | array | 数据 |
| &ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": [
    {
      "customerName": "",
      "submitter": "",
      "testBasis": "",
      "productName": "",
      "specification": "",
      "reportNo": "",
      "submitterDate": "",
      "sampleStatus": "",
      "startTestDate": "",
      "endTestDate": "",
      "majorMeasured": "",
      "checked": "",
      "approved": "",
      "certigier": "",
      "createTime": "",
      "createUserId": "",
      "createUserName": "",
      "description": "",
      "wireType": "",
      "updateTime": "",
      "updateUserId": "",
      "updateUserName": ""
    }
  ]
}
```




---
## 根据条件以及页码查询报告列表

> BASIC

**Path:** report/getQueryPageReports

**Method:** GET

**Desc:**

 根据条件以及页码查询报告列表

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| reportNo |  | YES |  |
| specification |  | YES |  |
| reportPage |  | YES |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | array | 数据 |
| &ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": [
    {
      "customerName": "",
      "submitter": "",
      "testBasis": "",
      "productName": "",
      "specification": "",
      "reportNo": "",
      "submitterDate": "",
      "sampleStatus": "",
      "startTestDate": "",
      "endTestDate": "",
      "majorMeasured": "",
      "checked": "",
      "approved": "",
      "certigier": "",
      "createTime": "",
      "createUserId": "",
      "createUserName": "",
      "description": "",
      "wireType": "",
      "updateTime": "",
      "updateUserId": "",
      "updateUserName": ""
    }
  ]
}
```




---
## 根据条件以及页码查询报告列表页码数量

> BASIC

**Path:** report/getQueryPageReportsPageNum

**Method:** GET

**Desc:**

 根据条件以及页码查询报告列表页码数量

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| reportNo |  | YES |  |
| specification |  | YES |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | integer | 数据 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": 0
}
```




---
## 查询报告

> BASIC

**Path:** report/getReport

**Method:** GET

**Desc:**

 查询报告

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| reportNo |  | YES |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | object | 数据 |
| &ensp;&ensp;&#124;─report | object | UI电子线表 |
| &ensp;&ensp;&ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |
| &ensp;&ensp;&#124;─wireList | array | 芯线列表 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─id | integer | 芯线序号 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─num | integer | 数量 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─color | string | 颜色 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd1 | number | 线径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd2 | number | 线径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd3 | number | 线径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd4 | number | 线径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd5 | number | 线径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─diameterTd6 | number | 线径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd1 | number | 绝缘外径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd2 | number | 绝缘外径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd3 | number | 绝缘外径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd4 | number | 绝缘外径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd5 | number | 绝缘外径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd6 | number | 绝缘外径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd1 | number | 绝缘厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd2 | number | 绝缘厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd3 | number | 绝缘厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd4 | number | 绝缘厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd5 | number | 绝缘厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd6 | number | 绝缘厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd7 | number | 绝缘厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd8 | number | 绝缘厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd9 | number | 绝缘厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd10 | number | 绝缘厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd1 | number | 绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd2 | number | 绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd3 | number | 绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd4 | number | 绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd5 | number | 绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd6 | number | 绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd1 | number | 绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd2 | number | 绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd3 | number | 绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd4 | number | 绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd5 | number | 绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd6 | number | 绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd1 | number | 绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd2 | number | 绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd3 | number | 绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd4 | number | 绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd5 | number | 绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd6 | number | 绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd1 | number | 绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd2 | number | 绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd3 | number | 绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd4 | number | 绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd5 | number | 绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd6 | number | 绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─htgFrontAvgDiameter | number | 加热变形前平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─htgRearAvgDiameter | number | 加热变形后平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─conductor20DcrTd | number | 20℃导体直流电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─irLength | number | 绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─irTd | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─materialQuality | string | 导体材质 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulMaterialQuality | string | 绝缘材质 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─firty807Unaged | number | 80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─second807Aging | number | 80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulHthp | number | 高温压力 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd11 | number | 绝缘厚度测试数据11 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd12 | number | 绝缘厚度测试数据12 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd13 | number | 绝缘厚度测试数据13 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd14 | number | 绝缘厚度测试数据14 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd15 | number | 绝缘厚度测试数据15 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd16 | number | 绝缘厚度测试数据16 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd17 | number | 绝缘厚度测试数据17 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd18 | number | 绝缘厚度测试数据18 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd1 | number | 兼容性绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd2 | number | 兼容性绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd3 | number | 兼容性绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd4 | number | 兼容性绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd5 | number | 兼容性绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd6 | number | 兼容性绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd1 | number | 兼容性绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd2 | number | 兼容性绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd3 | number | 兼容性绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd4 | number | 兼容性绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd5 | number | 兼容性绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd6 | number | 兼容性绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd1 | number | 兼容性绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd2 | number | 兼容性绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd3 | number | 兼容性绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd4 | number | 兼容性绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd5 | number | 兼容性绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd6 | number | 兼容性绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd1 | number | 兼容性绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd2 | number | 兼容性绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd3 | number | 兼容性绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd4 | number | 兼容性绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd5 | number | 兼容性绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd6 | number | 兼容性绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd1 | number | 热寿命绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd2 | number | 热寿命绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd3 | number | 热寿命绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd4 | number | 热寿命绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd5 | number | 热寿命绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd6 | number | 热寿命绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd1 | number | 热寿命绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd2 | number | 热寿命绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd3 | number | 热寿命绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd4 | number | 热寿命绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd5 | number | 热寿命绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd6 | number | 热寿命绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd1 | number | 热寿命绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd2 | number | 热寿命绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd3 | number | 热寿命绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd4 | number | 热寿命绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd5 | number | 热寿命绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd6 | number | 热寿命绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd1 | number | 热寿命绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd2 | number | 热寿命绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd3 | number | 热寿命绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd4 | number | 热寿命绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd5 | number | 热寿命绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd6 | number | 热寿命绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchLoadHte | number | 绝缘热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchCoolingHte | number | 绝缘热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─irCalc | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&#124;─irCalcIec | number | IEC绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─publicData | object | 公共数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─printingErasibilit | string | 印字耐擦是否印字清晰 |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductorCorrosion | string | 导体腐蚀是否无腐蚀 |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsCrack | string | 热冲击是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendCrack | string | 低温弯曲是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexibilityCrack | string | 柔韧性是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIiiPok | string | 耐电压测试(介电III)是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIPok | string | 耐电压测试(介电I)是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWirePok | string | 高压直流线介质耐压试验I是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVw1Td1 | string | VW1棉花是否点燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVw1Td2 | string | VW1棉花是否点燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVw1Td3 | string | VW1棉花是否点燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonFt2Td1 | string | FT2棉花是否点燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonFt2Td2 | string | FT2棉花是否点燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonFt2Td3 | string | FT2棉花是否点燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonUlTd1 | string | UL水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonUlTd2 | string | UL水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonUlTd3 | string | UL水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathMaterialQuality | string | 护套材质 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsCrack | string | 绝缘热冲击是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsCrack | string | 护套热冲击是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendCrack | string | 绝缘低温弯曲是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendCrack | string | 护套低温弯曲是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureImpactCrack | string | 低温冲击是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalStability | number | 热稳定性 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexureTest | string | 曲挠试验 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulDielectricPok | string | 绝缘耐电压测试是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fgDielectricPok | string | 成品耐电压测试是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd1 | number | 护套外径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd2 | number | 护套外径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd3 | number | 护套外径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd4 | number | 护套外径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd5 | number | 护套外径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdTd6 | number | 护套外径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd1 | number | 护套厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd2 | number | 护套厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd3 | number | 护套厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd4 | number | 护套厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd5 | number | 护套厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd6 | number | 护套厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd1 | number | 护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd2 | number | 护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd3 | number | 护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd4 | number | 护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd5 | number | 护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationTd6 | number | 护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd1 | number | 护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd2 | number | 护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd3 | number | 护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd4 | number | 护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd5 | number | 护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullTd6 | number | 护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd1 | number | 护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd2 | number | 护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd3 | number | 护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd4 | number | 护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd5 | number | 护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationTd6 | number | 护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd1 | number | 护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd2 | number | 护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd3 | number | 护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd4 | number | 护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd5 | number | 护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullTd6 | number | 护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─csgFrontThk | number | 套管前厚度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─csgRearThk | number | 套管后厚度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spgLength | number | 比重长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spgEmptyWeight | number | 比重空重 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spgWaterWeight | number | 比重水重 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hteMarkLength | number | 热延伸标记长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hteExtensionLength | number | 热延伸延伸长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd7 | number | 护套厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd8 | number | 护套厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd9 | number | 护套厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd10 | number | 护套厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAvgThk | number | 绝缘平均厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulMinThk | number | 绝缘最小厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAvgThk | number | 护套平均厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathMinThk | number | 护套最小厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulBiTemp | number | 绝缘老化条件温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulBiTime | number | 绝缘老化条件时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedEi | number | 绝缘延伸率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedTs | number | 绝缘抗张强度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingEi | number | 绝缘老化后延伸残率判断值\|\|绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingTs | number | 绝缘老化后抗张残率判断值\|\|绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathBiTemp | number | 护套老化条件温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathBiTime | number | 护套老化条件时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedEi | number | 护套延伸率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedTs | number | 护套抗张强度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingEi | number | 护套老化后延伸残率判断值\|\|护套老化延伸变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingTs | number | 护套老化后抗张残率判断值\|\|护套老化抗张变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductorCorrosionTemp | number | 导体腐蚀温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductorCorrosionTime | number | 导体腐蚀时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsTemp | number | 热冲击温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsTime | number | 热冲击时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsLn | number | 热冲击圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendTemp | number | 低温弯曲温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendTime | number | 低温弯曲时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendLn | number | 低温弯曲圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexibilityTemp | number | 柔韧性温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexibilityTime | number | 柔韧性时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexibilityLn | number | 柔韧性圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductor20Dcr | number | 20℃导体直流电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIiiWithstandVoltage | number | 耐电压测试(介电III)耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIiiWithstandVoltageTime | number | 耐电压测试(介电III)耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricINum | number | 耐电压测试(介电I)取样/个 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricITemp | number | 耐电压测试(介电I)温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricITime | number | 耐电压测试(介电I)时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIGirth | number | 耐电压测试(介电I)圈长/mm |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricILn | number | 耐电压测试(介电I)圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIWithstandVoltage | number | 耐电压测试(介电I)耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIWithstandVoltageTiem | number | 耐电压测试(介电I)耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricIPokNum | number | 耐电压测试(介电I)击穿值/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireNum | number | 高压直流线介质耐压试验I取样/M |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireBakingTemp | number | 高压直流线介质耐压试验I烘温度/摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireBakingTime | number | 高压直流线介质耐压试验I烘时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireDischargeTemp | number | 高压直流线介质耐压试验I放温度/摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireDischargePct | number | 高压直流线介质耐压试验I放% |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireDischargeTime | number | 高压直流线介质耐压试验I放时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireTestBar | number | 高压直流线介质耐压试验I试棒/mm |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireLn | number | 高压直流线介质耐压试验I圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireDcv | number | 高压直流线介质耐压试验I直流电压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─hvdcWireDcvTime | number | 高压直流线介质耐压试验I直流电压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─firstFlameRetardingTd1 | number | 第1次施火延燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─firstFlameRetardingTd2 | number | 第1次施火延燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─firstFlameRetardingTd3 | number | 第1次施火延燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─secondFlameRetardingTd1 | number | 第2次施火延燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─secondFlameRetardingTd2 | number | 第2次施火延燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─secondFlameRetardingTd3 | number | 第2次施火延燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thirdFlameRetardingTd1 | number | 第3次施火延燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thirdFlameRetardingTd2 | number | 第3次施火延燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thirdFlameRetardingTd3 | number | 第3次施火延燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fourthFlameRetardingTd1 | number | 第4次施火延燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fourthFlameRetardingTd2 | number | 第4次施火延燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fourthFlameRetardingTd3 | number | 第4次施火延燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fifthFlameRetardingTd1 | number | 第5次施火延燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fifthFlameRetardingTd2 | number | 第5次施火延燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fifthFlameRetardingTd3 | number | 第5次施火延燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flagBurningAreaTd1 | number | 旗子烧毁面积测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flagBurningAreaTd2 | number | 旗子烧毁面积测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flagBurningAreaTd3 | number | 旗子烧毁面积测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningAfterLenghtTd1 | number | 施火30秒后燃烧长度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningAfterLenghtTd2 | number | 施火30秒后燃烧长度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningAfterLenghtTd3 | number | 施火30秒后燃烧长度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningTimeTd1 | number | UL水平燃烧时间测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningTimeTd2 | number | UL水平燃烧时间测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─burningTimeTd3 | number | UL水平燃烧时间测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalElongation | number | 热延伸率/g |
| &ensp;&ensp;&ensp;&ensp;&#124;─avgOdUbv | number | 平均外径上限值默认设置7.5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sectionMax | number | 同一截面最大值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sectionMin | number | 同一截面最小值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathFirty807Unaged | number | 护套80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathSecond807Aging | number | 护套80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsLength | number | 绝缘热冲击长度/mm |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsLn | number | 绝缘热冲击圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsLength | number | 护套热冲击长度/mm |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsLn | number | 护套热冲击圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendLn | number | 绝缘低温弯曲圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendLn | number | 护套低温弯曲圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureImpact | number | 低温冲击重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHthp | number | 绝缘高温压力 |
| &ensp;&ensp;&ensp;&ensp;&#124;─printingSpaceDv | number | 印字间距判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─printingSpace | number | 印字间距 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir90Length | number | 90℃绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir90Td | number | 90℃绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcDv | number | 绝缘电阻判断值\|\|70℃绝缘电阻判断值\|\|15℃绝缘电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir90CalcDv | number | 90℃绝缘电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTdAvgDv | number | 导体单根线径判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdDvStart | number | 护套外径判断值起始范围 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdDvEnd | number | 护套外径判断值结束范围 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedEiMvsDv | number | 绝缘延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedTsMvsDv | number | 绝缘抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingEiMvsDv | number | 绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingTsMvsDv | number | 绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedEiMvsDv | number | 护套延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedTsMvsDv | number | 护套抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingEiMvsDv | number | 护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingTsMvsDv | number | 护套老化后抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulDielectricWithstandVoltage | number | 绝缘耐电压测试耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulDielectricWithstandVoltageTime | number | 绝缘耐电压测试耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─fgDielectricWithstandVoltage | number | 成品耐电压测试耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─fgDielectricWithstandVoltageTime | number | 成品耐电压测试耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─gbTbfStartDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，上夹具下缘与碳化起始点距离 |
| &ensp;&ensp;&ensp;&ensp;&#124;─gbTbfBurningDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，向下延燃至上夹具下缘距离 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd11 | number | 护套厚度测试数据11 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd12 | number | 护套厚度测试数据12 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd13 | number | 护套厚度测试数据13 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd14 | number | 护套厚度测试数据14 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd15 | number | 护套厚度测试数据15 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd16 | number | 护套厚度测试数据16 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd17 | number | 护套厚度测试数据17 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkTd18 | number | 护套厚度测试数据18 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spgLengthEmptyWeight | number | 比长L空重 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd1 | number | 平行软线撕裂前厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd2 | number | 平行软线撕裂前厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd3 | number | 平行软线撕裂前厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd4 | number | 平行软线撕裂前厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd5 | number | 平行软线撕裂前厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingTd6 | number | 平行软线撕裂前厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd1 | number | 平行软线撕裂后厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd2 | number | 平行软线撕裂后厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd3 | number | 平行软线撕裂后厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd4 | number | 平行软线撕裂后厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd5 | number | 平行软线撕裂后厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingTd6 | number | 平行软线撕裂后厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd1 | number | 平行软线隔离筋厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd2 | number | 平行软线隔离筋厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd3 | number | 平行软线隔离筋厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd4 | number | 平行软线隔离筋厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd5 | number | 平行软线隔离筋厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarTd6 | number | 平行软线隔离筋厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordBeforeTearingDv | number | 平行软线撕裂前厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordAfterTearingDv | number | 平行软线撕裂后厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─parallelCordSpacerBarDv | number | 平行软线隔离筋厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsTime | number | 绝缘热冲击时间/h |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsTemp | number | 绝缘热冲击温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsTime | number | 护套热冲击时间/h |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsTemp | number | 护套热冲击温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendTemp | number | 绝缘低温弯曲温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendTime | number | 绝缘低温弯曲时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendLenght | number | 绝缘低温弯曲长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendTemp | number | 护套低温弯曲温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendTime | number | 护套低温弯曲时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendLenght | number | 护套低温弯曲长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHtgDv | number | 绝缘加热变形判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHtgDv | number | 护套加热变形判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathSurfaceR | number | 护套表面电阻 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathSurfaceRDv | number | 护套表面电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─csaDv | number | 截面积判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spindleNum | number | 锭子总数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─spindleRootNum | number | 每锭根数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─singleShieldDiameter | number | 屏蔽单根直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─pitch | number | 节距 |
| &ensp;&ensp;&ensp;&ensp;&#124;─shieldDiameter | number | 屏蔽层直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdDv | number | 绝缘外径判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelStrengthTd1 | number | 剥离力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelStrengthTd2 | number | 剥离力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelStrengthTd3 | number | 剥离力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelStrengthTd4 | number | 剥离力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendBreakdown | string | 低温弯曲是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendLenght | number | 低温弯曲长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thcLenght | number | 温湿度循环长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thcLn | number | 温湿度循环圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thcCrack | string | 温湿度循环是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceLenght | number | 耐热水长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceLn | number | 耐热水圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceCrack | string | 耐热水是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceForward | number | 耐热水测试值(正向) |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceReverse | number | 耐热水测试值(反向) |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolineLn | number | 耐液体性汽油圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolineTd | number | 耐液体性汽油测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolinePct | number | 耐液体性汽油百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolineCrack | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolLn | number | 耐液体性乙醇圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolTd | number | 耐液体性乙醇测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolPct | number | 耐液体性乙醇百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolCrack | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilLn | number | 耐液体性柴油圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilTd | number | 耐液体性柴油测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilPct | number | 耐液体性柴油百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilCrack | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm902Ln | number | 耐液体性IRM-902圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm902Td | number | 耐液体性IRM-902测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm902Pct | number | 耐液体性IRM-902百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm902Crack | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm903Ln | number | 耐液体性IRM-903圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm903Td | number | 耐液体性IRM-903测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm903Pct | number | 耐液体性IRM-903百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm903Crack | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfLn | number | 耐液体性自动排挡液圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfTd | number | 耐液体性自动排挡液测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfPct | number | 耐液体性自动排挡液百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfCrack | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezeLn | number | 耐液体性防冻液圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezeTd | number | 耐液体性防冻液测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezePct | number | 耐液体性防冻液百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezeCrack | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidLn | number | 耐液体性电池酸圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidTd | number | 耐液体性电池酸测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidPct | number | 耐液体性电池酸百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidCrack | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingDv | number | 阻燃试验自熄判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingTime | number | 阻燃试验自熄时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingTd1 | number | 阻燃试验自熄测试值1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingTd2 | number | 阻燃试验自熄测试值2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingTd3 | number | 阻燃试验自熄测试值3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frUnburnedTd1 | number | 阻燃试验未燃测试值1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frUnburnedTd2 | number | 阻燃试验未燃测试值2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frUnburnedTd3 | number | 阻燃试验未燃测试值3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hte | number | 热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricPok | string | 耐电压测试是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelStrength | number | 剥离力 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hthpTemp | number | 高温压力温度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hthpCrack | string | 高温压力是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureWindingWeight | number | 低温卷绕重量/kg |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureWindingLn | number | 低温卷绕圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureWindingCrack | string | 低温卷绕是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arDv | number | 耐磨性（刮磨）判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ar | number | 耐磨性（刮磨）测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─longTermAgingTemp | number | 长期老化摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─longTermAgingLn | number | 长期老化圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─longTermAgingCrack | string | 长期老化是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─shortTermAgingTemp | number | 短期老化摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─shortTermAgingLn | number | 短期老化圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─shortTermAgingWeight | number | 短期老化重量/kg |
| &ensp;&ensp;&ensp;&ensp;&#124;─shortTermAgingCrack | string | 短期老化是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalOverloadLn | number | 热过载圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalOverloadCrack | string | 热过载是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalShrinkage | number | 热收缩测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─temperatureHumidityHlternationLn | number | 温湿度交变圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─temperatureHumidityHlternationTemp1 | number | 温湿度交变摄氏度1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─temperatureHumidityHlternationTemp2 | number | 温湿度交变摄氏度2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─temperatureHumidityHlternationCrack | string | 温湿度交变是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ozoneResistanceLn | number | 耐臭氧圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ozoneResistancePok | string | 耐臭氧是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineCoolantLn | number | 耐液体性发动机冷却液圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineCoolantTd | number | 耐液体性发动机冷却液测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineCoolantPct | number | 耐液体性发动机冷却液百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineCoolantCrack | string | 耐液体性发动机冷却液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineOilLn | number | 耐液体性发动机润滑油圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineOilTd | number | 耐液体性发动机润滑油测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineOilPct | number | 耐液体性发动机润滑油百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineOilCrack | string | 耐液体性发动机润滑油是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidLn | number | 耐液体性转向助力液圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidTd | number | 耐液体性转向助力液测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPct | number | 耐液体性转向助力液百分比 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidCrack | string | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidPok | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frFireSupplyTime | number | 阻燃试验供火时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionDv | number | 附着力判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionTd1 | number | 附着力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionTd2 | number | 附着力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionTd3 | number | 附着力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionTd4 | number | 附着力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionTd5 | number | 附着力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgTemp | number | 加热变形摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgCrack | string | 加热变形是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgPok | string | 加热变形是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendWeight | number | 低温弯曲重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureImpactPok | string | 低温冲击是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1ATemp | number | 耐热性1(A)摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1ATime | number | 耐热性1(A)时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1ALenght | number | 耐热性1(A)长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1AWeight | number | 耐热性1(A)重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1ACrack | string | 耐热性1(A)是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1APok | string | 耐热性1(A)是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BTemp | number | 耐热性1(B)摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BTime | number | 耐热性1(B)时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BLenght | number | 耐热性1(B)长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BWeight | number | 耐热性1(B)重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BCrack | string | 热性1(B)是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1BPok | string | 耐热性1(B)是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hr1CCrack | string | 耐热性1(C)是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolinePok | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilPok | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolPok | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfPok | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezePok | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm902Pok | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceIrm903Pok | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─frSelfExtinguishingTd | number | 阻燃试验自熄测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsLenght | number | 热冲击长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotStretchLoadLenght | number | 热延伸试验负荷下长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotStretchCoolingLenght | number | 热延伸试验冷却后长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─signContinuity | number | 标志连续性 |
| &ensp;&ensp;&ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltage | number | 浸水工频电压试验耐压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltageTime | object | 浸水工频电压试验耐压时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─immersionPowerFrequencyVoltagePok | object | 浸水工频电压试验是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTemp | object | 室温工频电压试验摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTime | object | 室温工频电压试验时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLenght | object | 室温工频电压试验长度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLn | object | 室温工频电压试验圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltage | object | 室温工频电压试验未老化样品耐压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltageTime | object | 室温工频电压试验未老化样品耐压时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltage | object | 室温工频电压试验老化样品耐压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltageTime | object | 室温工频电压试验老化样品耐压时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─roomTempPowerFrequencyVoltagePok | object | 室温工频电压试验是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTemp | object | 额定温度工频电压试验摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTime | object | 额定温度工频电压试验时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageRoastTemp | object | 额定温度工频电压试验烤摄氏度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltage | object | 额定温度工频电压试验烤耐压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltageTime | object | 额定温度工频电压试验耐压时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltagePok | object | 额定温度工频电压试验是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonHorizontalTd1 | object | 水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonHorizontalTd2 | object | 水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonHorizontalTd3 | object | 水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVerticalTd1 | object | 垂直燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVerticalTd2 | object | 垂直燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lightCottonVerticalTd3 | object | 垂直燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfStartDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfStartDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfStartDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfBurningDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfBurningDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─zTbfBurningDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd1 | object | 兼容性护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd2 | object | 兼容性护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd3 | object | 兼容性护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd4 | object | 兼容性护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd5 | object | 兼容性护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd6 | object | 兼容性护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd1 | object | 兼容性护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd2 | object | 兼容性护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd3 | object | 兼容性护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd4 | object | 兼容性护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd5 | object | 兼容性护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd6 | object | 兼容性护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd1 | object | 兼容性护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd2 | object | 兼容性护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd3 | object | 兼容性护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd4 | object | 兼容性护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd5 | object | 兼容性护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd6 | object | 兼容性护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd1 | object | 兼容性护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd2 | object | 兼容性护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd3 | object | 兼容性护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd4 | object | 兼容性护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd5 | object | 兼容性护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingPullTd6 | object | 兼容性护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedEiMvsDv | object | 兼容性绝缘延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedTsMvsDv | object | 兼容性绝缘抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingEiMvsDv | object | 兼容性绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingTsMvsDv | object | 兼容性绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingEi | object | 兼容性绝缘老化后延伸残率判断值\|\|兼容性绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingTs | object | 兼容性绝缘老化后抗张残率判断值\|\|兼容性绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedEiMvsDv | object | 兼容性护套延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathUnagedTsMvsDv | object | 兼容性护套抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingEiMvsDv | object | 兼容性护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingTsMvsDv | object | 兼容性护套老化后抗张中间值判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingEi | object | 兼容性护套老化后延伸残率判断值\|\|兼容性护套老化延伸变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilitySheathAgingTs | object | 兼容性护套老化后抗张残率判断值\|\|兼容性护套老化抗张变化率判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexureFrequency | object | 曲挠次数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir90Calc | object | 90℃绝缘电阻 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulDielectricWithstandVoltageCurrent | object | 绝缘耐电压测试电流/M |
| &ensp;&ensp;&ensp;&ensp;&#124;─fgDielectricWithstandVoltageCurrent | object | 成品耐电压测试电流/M\|\|护套耐电压测试电流/M |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathOdDv | object | 护套外径判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd1 | object | 耐酸护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd2 | object | 耐酸护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd3 | object | 耐酸护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd4 | object | 耐酸护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd5 | object | 耐酸护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedElongationTd6 | object | 耐酸护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd1 | object | 耐酸护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd2 | object | 耐酸护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd3 | object | 耐酸护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd4 | object | 耐酸护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd5 | object | 耐酸护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathUnagedPullTd6 | object | 耐酸护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd1 | object | 耐酸护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd2 | object | 耐酸护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd3 | object | 耐酸护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd4 | object | 耐酸护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd5 | object | 耐酸护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingElongationTd6 | object | 耐酸护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd1 | object | 耐酸护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd2 | object | 耐酸护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd3 | object | 耐酸护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd4 | object | 耐酸护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd5 | object | 耐酸护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arSheathAgingPullTd6 | object | 耐酸护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd1 | object | 耐碱护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd2 | object | 耐碱护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd3 | object | 耐碱护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd4 | object | 耐碱护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd5 | object | 耐碱护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedElongationTd6 | object | 耐碱护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd1 | object | 耐碱护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd2 | object | 耐碱护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd3 | object | 耐碱护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd4 | object | 耐碱护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd5 | object | 耐碱护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathUnagedPullTd6 | object | 耐碱护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd1 | object | 耐碱护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd2 | object | 耐碱护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd3 | object | 耐碱护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd4 | object | 耐碱护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd5 | object | 耐碱护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingElongationTd6 | object | 耐碱护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd1 | object | 耐碱护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd2 | object | 耐碱护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd3 | object | 耐碱护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd4 | object | 耐碱护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd5 | object | 耐碱护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─apSheathAgingPullTd6 | object | 耐碱护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd1 | object | 热寿命护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd2 | object | 热寿命护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd3 | object | 热寿命护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd4 | object | 热寿命护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd5 | object | 热寿命护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd6 | object | 热寿命护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd1 | object | 热寿命护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd2 | object | 热寿命护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd3 | object | 热寿命护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd4 | object | 热寿命护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd5 | object | 热寿命护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd6 | object | 热寿命护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd1 | object | 热寿命护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd2 | object | 热寿命护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd3 | object | 热寿命护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd4 | object | 热寿命护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd5 | object | 热寿命护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd6 | object | 热寿命护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd1 | object | 热寿命护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd2 | object | 热寿命护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd3 | object | 热寿命护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd4 | object | 热寿命护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd5 | object | 热寿命护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd6 | object | 热寿命护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHotStretchLoadHte | object | 护套热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHotStretchCoolingHte | object | 护套热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricWithstandVoltage | object | 耐电压测试耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricWithstandVoltageTiem | object | 耐电压测试耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─cl | object | Cl测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─br | object | Br测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─numUl | object | 数量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd1 | object | UL线径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd2 | object | UL线径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd3 | object | UL线径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd4 | object | UL线径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd5 | object | UL线径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterUlTd6 | object | UL线径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd1 | object | UL绝缘外径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd2 | object | UL绝缘外径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd3 | object | UL绝缘外径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd4 | object | UL绝缘外径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd5 | object | UL绝缘外径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd6 | object | UL绝缘外径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdUlTd | object | UL绝缘外径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd1 | object | UL绝缘厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd2 | object | UL绝缘厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd3 | object | UL绝缘厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd4 | object | UL绝缘厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd5 | object | UL绝缘厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd6 | object | UL绝缘厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd7 | object | UL绝缘厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd8 | object | UL绝缘厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd9 | object | UL绝缘厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkUlTd10 | object | UL绝缘厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd1 | object | Ul护套厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd2 | object | Ul护套厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd3 | object | Ul护套厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd4 | object | Ul护套厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd5 | object | Ul护套厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd6 | object | Ul护套厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd7 | object | Ul护套厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd8 | object | Ul护套厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd9 | object | Ul护套厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathThkUlTd10 | object | Ul护套厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAvgThkUl | object | 绝缘平均厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulMinThkUl | object | 绝缘最小厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAvgThkUl | object | 护套平均厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathMinThkUl | object | 护套最小厚度判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─biTempUl | object | Ul老化条件温度/℃ |
| &ensp;&ensp;&ensp;&ensp;&#124;─biTimeUl | object | Ul老化条件时间/H |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd1 | object | Ul护套老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd2 | object | Ul护套老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd3 | object | Ul护套老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd4 | object | Ul护套老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd5 | object | Ul护套老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedElongationUlTd6 | object | Ul护套老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd1 | object | Ul护套老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd2 | object | Ul护套老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd3 | object | Ul护套老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd4 | object | Ul护套老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd5 | object | Ul护套老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathUnagedPullUlTd6 | object | Ul护套老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd1 | object | Ul护套老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd2 | object | Ul护套老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd3 | object | Ul护套老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd4 | object | Ul护套老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd5 | object | Ul护套老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingElongationUlTd6 | object | Ul护套老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd1 | object | Ul护套老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd2 | object | Ul护套老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd3 | object | Ul护套老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd4 | object | Ul护套老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd5 | object | Ul护套老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingPullUlTd6 | object | Ul护套老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHotStretchLoadHteIec | object | IEC热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathHotStretchCoolingHteIec | object | IEC热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendLnIec | object | IEC护套低温弯曲圈数/圈 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendCrackIec | object | IEC护套低温弯曲是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathBeforeHeatingTd | object | 加热前值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAfterHeatingTd | object | 加热后值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcIecDv | object | IEC绝缘电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricPokIec | object | IEC耐电压测试是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesion | object | 附着力 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureWindingDiameter | object | 低温卷绕直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalOverloadDiameter | object | 热过载直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalOverloadWeight | object | 热过载重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceGasolineDiameter | object | 耐液体性汽油直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceDieselOilDiameter | object | 耐液体性柴油直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEthanolDiameter | object | 耐液体性乙醇直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBatteryAcidDiameter | object | 耐液体性电池酸直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceEngineOilDiameter | object | 耐液体性发动机润滑油直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidDiameter | object | 耐液体性转向助力液直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAtfDiameter | object | 耐液体性自动排挡液直径\|\|耐液体性自动变速箱油直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceAntifreezeDiameter | object | 耐液体性防冻液直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─powerFrequencyVoltagePok | object | 工频交流电压是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─breakdownVoltagePok | object | 击穿电压是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hthpTd | object | 高温压力测试值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalShrinkageOriginalLength | object | 热收缩原长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalShrinkageHeatingLenght | object | 热收缩加热后长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─overheatCrack | object | 过热试验是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─lowTemperatureImpact4hrCrack | object | 低温冲击4hr是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─adhesionFallOff | object | 附着力是否无脱落 |
| &ensp;&ensp;&ensp;&ensp;&#124;─peelEasy | object | 剥离是否容易 |
| &ensp;&ensp;&ensp;&ensp;&#124;─oilResistantCrack | object | 耐油是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─fuelResistantCrack | object | 耐燃料是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─arWeight | object | 耐磨性重量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─withstandVoltageDielectricText | object | 耐电压测试介电文字 |
| &ensp;&ensp;&ensp;&ensp;&#124;─withstandVoltageDielectricImmersion | object | 耐电压测试介电浸水 |
| &ensp;&ensp;&ensp;&ensp;&#124;─withstandVoltageVoltage | object | 耐电压测试电压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─withstandVoltageRaiseVoltage | object | 耐电压测试升高电压 |
| &ensp;&ensp;&ensp;&ensp;&#124;─shortTermAgingDiameter | object | 短期老化直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPok | object | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBrakeFluidLn | object | 耐液体性制动液圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBrakeFluidCrack | object | 耐液体性制动液是否无开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─waterResistanceBrakeFluidPok | object | 耐液体性制动液是否无击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─windingHeatingLn | object | 卷绕加热圈数 |
| &ensp;&ensp;&ensp;&ensp;&#124;─windingHeatingCrack | object | 卷绕加热是否开裂 |
| &ensp;&ensp;&ensp;&ensp;&#124;─windingHeatingDiameter | object | 卷绕加热直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir20Length | object | 20℃绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir20Td | object | 20℃绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir20CalcDv | object | 20℃绝缘电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir60Length | object | 60℃绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir60Td | object | 60℃绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ir60CalcDv | object | 60℃绝缘电阻判断值 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricImmersionWithstandVoltage | object | 耐电压测试(浸水)耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricImmersionWithstandVoltageTime | object | 耐电压测试(浸水)耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricImmersionWithstandVoltagePok | object | 耐电压测试(浸水)是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricAirWithstandVoltage | object | 耐电压测试(空气)耐压/kv |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricAirWithstandVoltageTime | object | 耐电压测试(空气)耐压时间/min |
| &ensp;&ensp;&ensp;&ensp;&#124;─dielectricAirWithstandVoltagePok | object | 耐电压测试(空气)是否击穿 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd1 | object | 护套哑铃片老化前厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd2 | object | 护套哑铃片老化前厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd3 | object | 护套哑铃片老化前厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd4 | object | 护套哑铃片老化前厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd5 | object | 护套哑铃片老化前厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd6 | object | 护套哑铃片老化前厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd1 | object | 护套哑铃片老化后厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd2 | object | 护套哑铃片老化后厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd3 | object | 护套哑铃片老化后厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd4 | object | 护套哑铃片老化后厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd5 | object | 护套哑铃片老化后厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd6 | object | 护套哑铃片老化后厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─tsText | object | 热冲击文本 |
| &ensp;&ensp;&ensp;&ensp;&#124;─ltBendText | object | 低温弯曲文本 |
| &ensp;&ensp;&ensp;&ensp;&#124;─flexibilityText | object | 柔韧性文本 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathAgingCt | object | 护套老化计算模板 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgDeformationRateCt | object | 加热变形计算模板 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgFrontDiameter | object | 加热变形前线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgRearDiameter | object | 加热变形后线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgMandrelDiameter | object | 加热变形心棒直径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcDvText | object | 绝缘电阻判断文本 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcDvResult | object | 绝缘电阻判断结果 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcTemp | object | 绝缘电阻温度 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulTsDiameter | object | 绝缘热冲击直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathTsDiameter | object | 护套热冲击直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulLtBendDiameter | object | 绝缘低温弯曲直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sheathLtBendDiameter | object | 护套低温弯曲直径 |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceForwardSampleLength | object | 耐热水测试值MΩ(正向) |
| &ensp;&ensp;&ensp;&ensp;&#124;─hotWaterResistanceReverseSampleLength | object | 耐热水测试值MΩ(反向) |
| &ensp;&ensp;&#124;─visible | object | 是否显示 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": {
    "report": {
      "customerName": "",
      "submitter": "",
      "testBasis": "",
      "productName": "",
      "specification": "",
      "reportNo": "",
      "submitterDate": "",
      "sampleStatus": "",
      "startTestDate": "",
      "endTestDate": "",
      "majorMeasured": "",
      "checked": "",
      "approved": "",
      "certigier": "",
      "createTime": "",
      "createUserId": "",
      "createUserName": "",
      "description": "",
      "wireType": "",
      "updateTime": "",
      "updateUserId": "",
      "updateUserName": ""
    },
    "wireList": [
      {
        "reportNo": "",
        "id": 0,
        "num": 0,
        "color": "",
        "diameterTd1": 0.0,
        "diameterTd2": 0.0,
        "diameterTd3": 0.0,
        "diameterTd4": 0.0,
        "diameterTd5": 0.0,
        "diameterTd6": 0.0,
        "insulOdTd1": 0.0,
        "insulOdTd2": 0.0,
        "insulOdTd3": 0.0,
        "insulOdTd4": 0.0,
        "insulOdTd5": 0.0,
        "insulOdTd6": 0.0,
        "insulThkTd1": 0.0,
        "insulThkTd2": 0.0,
        "insulThkTd3": 0.0,
        "insulThkTd4": 0.0,
        "insulThkTd5": 0.0,
        "insulThkTd6": 0.0,
        "insulThkTd7": 0.0,
        "insulThkTd8": 0.0,
        "insulThkTd9": 0.0,
        "insulThkTd10": 0.0,
        "insulUnagedElongationTd1": 0.0,
        "insulUnagedElongationTd2": 0.0,
        "insulUnagedElongationTd3": 0.0,
        "insulUnagedElongationTd4": 0.0,
        "insulUnagedElongationTd5": 0.0,
        "insulUnagedElongationTd6": 0.0,
        "insulUnagedPullTd1": 0.0,
        "insulUnagedPullTd2": 0.0,
        "insulUnagedPullTd3": 0.0,
        "insulUnagedPullTd4": 0.0,
        "insulUnagedPullTd5": 0.0,
        "insulUnagedPullTd6": 0.0,
        "insulAgingElongationTd1": 0.0,
        "insulAgingElongationTd2": 0.0,
        "insulAgingElongationTd3": 0.0,
        "insulAgingElongationTd4": 0.0,
        "insulAgingElongationTd5": 0.0,
        "insulAgingElongationTd6": 0.0,
        "insulAgingPullTd1": 0.0,
        "insulAgingPullTd2": 0.0,
        "insulAgingPullTd3": 0.0,
        "insulAgingPullTd4": 0.0,
        "insulAgingPullTd5": 0.0,
        "insulAgingPullTd6": 0.0,
        "htgFrontAvgDiameter": 0.0,
        "htgRearAvgDiameter": 0.0,
        "conductor20DcrTd": 0.0,
        "irLength": 0.0,
        "irTd": 0.0,
        "materialQuality": "",
        "insulMaterialQuality": "",
        "firty807Unaged": 0.0,
        "second807Aging": 0.0,
        "insulHthp": 0.0,
        "insulThkTd11": 0.0,
        "insulThkTd12": 0.0,
        "insulThkTd13": 0.0,
        "insulThkTd14": 0.0,
        "insulThkTd15": 0.0,
        "insulThkTd16": 0.0,
        "insulThkTd17": 0.0,
        "insulThkTd18": 0.0,
        "compatibilityInsulUnagedElongationTd1": 0.0,
        "compatibilityInsulUnagedElongationTd2": 0.0,
        "compatibilityInsulUnagedElongationTd3": 0.0,
        "compatibilityInsulUnagedElongationTd4": 0.0,
        "compatibilityInsulUnagedElongationTd5": 0.0,
        "compatibilityInsulUnagedElongationTd6": 0.0,
        "compatibilityInsulUnagedPullTd1": 0.0,
        "compatibilityInsulUnagedPullTd2": 0.0,
        "compatibilityInsulUnagedPullTd3": 0.0,
        "compatibilityInsulUnagedPullTd4": 0.0,
        "compatibilityInsulUnagedPullTd5": 0.0,
        "compatibilityInsulUnagedPullTd6": 0.0,
        "compatibilityInsulAgingElongationTd1": 0.0,
        "compatibilityInsulAgingElongationTd2": 0.0,
        "compatibilityInsulAgingElongationTd3": 0.0,
        "compatibilityInsulAgingElongationTd4": 0.0,
        "compatibilityInsulAgingElongationTd5": 0.0,
        "compatibilityInsulAgingElongationTd6": 0.0,
        "compatibilityInsulAgingPullTd1": 0.0,
        "compatibilityInsulAgingPullTd2": 0.0,
        "compatibilityInsulAgingPullTd3": 0.0,
        "compatibilityInsulAgingPullTd4": 0.0,
        "compatibilityInsulAgingPullTd5": 0.0,
        "compatibilityInsulAgingPullTd6": 0.0,
        "thermalLifeInsulUnagedElongationTd1": 0.0,
        "thermalLifeInsulUnagedElongationTd2": 0.0,
        "thermalLifeInsulUnagedElongationTd3": 0.0,
        "thermalLifeInsulUnagedElongationTd4": 0.0,
        "thermalLifeInsulUnagedElongationTd5": 0.0,
        "thermalLifeInsulUnagedElongationTd6": 0.0,
        "thermalLifeInsulUnagedPullTd1": 0.0,
        "thermalLifeInsulUnagedPullTd2": 0.0,
        "thermalLifeInsulUnagedPullTd3": 0.0,
        "thermalLifeInsulUnagedPullTd4": 0.0,
        "thermalLifeInsulUnagedPullTd5": 0.0,
        "thermalLifeInsulUnagedPullTd6": 0.0,
        "thermalLifeInsulAgingElongationTd1": 0.0,
        "thermalLifeInsulAgingElongationTd2": 0.0,
        "thermalLifeInsulAgingElongationTd3": 0.0,
        "thermalLifeInsulAgingElongationTd4": 0.0,
        "thermalLifeInsulAgingElongationTd5": 0.0,
        "thermalLifeInsulAgingElongationTd6": 0.0,
        "thermalLifeInsulAgingPullTd1": 0.0,
        "thermalLifeInsulAgingPullTd2": 0.0,
        "thermalLifeInsulAgingPullTd3": 0.0,
        "thermalLifeInsulAgingPullTd4": 0.0,
        "thermalLifeInsulAgingPullTd5": 0.0,
        "thermalLifeInsulAgingPullTd6": 0.0,
        "insulHotStretchLoadHte": 0.0,
        "insulHotStretchCoolingHte": 0.0,
        "irCalc": 0.0,
        "irCalcIec": 0.0
      }
    ],
    "publicData": {
      "reportNo": "",
      "printingErasibilit": "",
      "conductorCorrosion": "",
      "tsCrack": "",
      "ltBendCrack": "",
      "flexibilityCrack": "",
      "dielectricIiiPok": "",
      "dielectricIPok": "",
      "hvdcWirePok": "",
      "lightCottonVw1Td1": "",
      "lightCottonVw1Td2": "",
      "lightCottonVw1Td3": "",
      "lightCottonFt2Td1": "",
      "lightCottonFt2Td2": "",
      "lightCottonFt2Td3": "",
      "lightCottonUlTd1": "",
      "lightCottonUlTd2": "",
      "lightCottonUlTd3": "",
      "sheathMaterialQuality": "",
      "insulTsCrack": "",
      "sheathTsCrack": "",
      "insulLtBendCrack": "",
      "sheathLtBendCrack": "",
      "lowTemperatureImpactCrack": "",
      "thermalStability": 0.0,
      "flexureTest": "",
      "insulDielectricPok": "",
      "fgDielectricPok": "",
      "sheathOdTd1": 0.0,
      "sheathOdTd2": 0.0,
      "sheathOdTd3": 0.0,
      "sheathOdTd4": 0.0,
      "sheathOdTd5": 0.0,
      "sheathOdTd6": 0.0,
      "sheathThkTd1": 0.0,
      "sheathThkTd2": 0.0,
      "sheathThkTd3": 0.0,
      "sheathThkTd4": 0.0,
      "sheathThkTd5": 0.0,
      "sheathThkTd6": 0.0,
      "sheathUnagedElongationTd1": 0.0,
      "sheathUnagedElongationTd2": 0.0,
      "sheathUnagedElongationTd3": 0.0,
      "sheathUnagedElongationTd4": 0.0,
      "sheathUnagedElongationTd5": 0.0,
      "sheathUnagedElongationTd6": 0.0,
      "sheathUnagedPullTd1": 0.0,
      "sheathUnagedPullTd2": 0.0,
      "sheathUnagedPullTd3": 0.0,
      "sheathUnagedPullTd4": 0.0,
      "sheathUnagedPullTd5": 0.0,
      "sheathUnagedPullTd6": 0.0,
      "sheathAgingElongationTd1": 0.0,
      "sheathAgingElongationTd2": 0.0,
      "sheathAgingElongationTd3": 0.0,
      "sheathAgingElongationTd4": 0.0,
      "sheathAgingElongationTd5": 0.0,
      "sheathAgingElongationTd6": 0.0,
      "sheathAgingPullTd1": 0.0,
      "sheathAgingPullTd2": 0.0,
      "sheathAgingPullTd3": 0.0,
      "sheathAgingPullTd4": 0.0,
      "sheathAgingPullTd5": 0.0,
      "sheathAgingPullTd6": 0.0,
      "csgFrontThk": 0.0,
      "csgRearThk": 0.0,
      "spgLength": 0.0,
      "spgEmptyWeight": 0.0,
      "spgWaterWeight": 0.0,
      "hteMarkLength": 0.0,
      "hteExtensionLength": 0.0,
      "sheathThkTd7": 0.0,
      "sheathThkTd8": 0.0,
      "sheathThkTd9": 0.0,
      "sheathThkTd10": 0.0,
      "insulAvgThk": 0.0,
      "insulMinThk": 0.0,
      "sheathAvgThk": 0.0,
      "sheathMinThk": 0.0,
      "insulBiTemp": 0.0,
      "insulBiTime": 0.0,
      "insulUnagedEi": 0.0,
      "insulUnagedTs": 0.0,
      "insulAgingEi": 0.0,
      "insulAgingTs": 0.0,
      "sheathBiTemp": 0.0,
      "sheathBiTime": 0.0,
      "sheathUnagedEi": 0.0,
      "sheathUnagedTs": 0.0,
      "sheathAgingEi": 0.0,
      "sheathAgingTs": 0.0,
      "conductorCorrosionTemp": 0.0,
      "conductorCorrosionTime": 0.0,
      "tsTemp": 0.0,
      "tsTime": 0.0,
      "tsLn": 0.0,
      "ltBendTemp": 0.0,
      "ltBendTime": 0.0,
      "ltBendLn": 0.0,
      "flexibilityTemp": 0.0,
      "flexibilityTime": 0.0,
      "flexibilityLn": 0.0,
      "conductor20Dcr": 0.0,
      "dielectricIiiWithstandVoltage": 0.0,
      "dielectricIiiWithstandVoltageTime": 0.0,
      "dielectricINum": 0.0,
      "dielectricITemp": 0.0,
      "dielectricITime": 0.0,
      "dielectricIGirth": 0.0,
      "dielectricILn": 0.0,
      "dielectricIWithstandVoltage": 0.0,
      "dielectricIWithstandVoltageTiem": 0.0,
      "dielectricIPokNum": 0.0,
      "hvdcWireNum": 0.0,
      "hvdcWireBakingTemp": 0.0,
      "hvdcWireBakingTime": 0.0,
      "hvdcWireDischargeTemp": 0.0,
      "hvdcWireDischargePct": 0.0,
      "hvdcWireDischargeTime": 0.0,
      "hvdcWireTestBar": 0.0,
      "hvdcWireLn": 0.0,
      "hvdcWireDcv": 0.0,
      "hvdcWireDcvTime": 0.0,
      "firstFlameRetardingTd1": 0.0,
      "firstFlameRetardingTd2": 0.0,
      "firstFlameRetardingTd3": 0.0,
      "secondFlameRetardingTd1": 0.0,
      "secondFlameRetardingTd2": 0.0,
      "secondFlameRetardingTd3": 0.0,
      "thirdFlameRetardingTd1": 0.0,
      "thirdFlameRetardingTd2": 0.0,
      "thirdFlameRetardingTd3": 0.0,
      "fourthFlameRetardingTd1": 0.0,
      "fourthFlameRetardingTd2": 0.0,
      "fourthFlameRetardingTd3": 0.0,
      "fifthFlameRetardingTd1": 0.0,
      "fifthFlameRetardingTd2": 0.0,
      "fifthFlameRetardingTd3": 0.0,
      "flagBurningAreaTd1": 0.0,
      "flagBurningAreaTd2": 0.0,
      "flagBurningAreaTd3": 0.0,
      "burningAfterLenghtTd1": 0.0,
      "burningAfterLenghtTd2": 0.0,
      "burningAfterLenghtTd3": 0.0,
      "burningTimeTd1": 0.0,
      "burningTimeTd2": 0.0,
      "burningTimeTd3": 0.0,
      "thermalElongation": 0.0,
      "avgOdUbv": 0.0,
      "sectionMax": 0.0,
      "sectionMin": 0.0,
      "sheathFirty807Unaged": 0.0,
      "sheathSecond807Aging": 0.0,
      "insulTsLength": 0.0,
      "insulTsLn": 0.0,
      "sheathTsLength": 0.0,
      "sheathTsLn": 0.0,
      "insulLtBendLn": 0.0,
      "sheathLtBendLn": 0.0,
      "lowTemperatureImpact": 0.0,
      "sheathHthp": 0.0,
      "printingSpaceDv": 0.0,
      "printingSpace": 0.0,
      "ir90Length": 0.0,
      "ir90Td": 0.0,
      "irCalcDv": 0.0,
      "ir90CalcDv": 0.0,
      "diameterTdAvgDv": 0.0,
      "sheathOdDvStart": 0.0,
      "sheathOdDvEnd": 0.0,
      "insulUnagedEiMvsDv": 0.0,
      "insulUnagedTsMvsDv": 0.0,
      "insulAgingEiMvsDv": 0.0,
      "insulAgingTsMvsDv": 0.0,
      "sheathUnagedEiMvsDv": 0.0,
      "sheathUnagedTsMvsDv": 0.0,
      "sheathAgingEiMvsDv": 0.0,
      "sheathAgingTsMvsDv": 0.0,
      "insulDielectricWithstandVoltage": 0.0,
      "insulDielectricWithstandVoltageTime": 0.0,
      "fgDielectricWithstandVoltage": 0.0,
      "fgDielectricWithstandVoltageTime": 0.0,
      "gbTbfStartDistance": 0.0,
      "gbTbfBurningDistance": 0.0,
      "sheathThkTd11": 0.0,
      "sheathThkTd12": 0.0,
      "sheathThkTd13": 0.0,
      "sheathThkTd14": 0.0,
      "sheathThkTd15": 0.0,
      "sheathThkTd16": 0.0,
      "sheathThkTd17": 0.0,
      "sheathThkTd18": 0.0,
      "spgLengthEmptyWeight": 0.0,
      "parallelCordBeforeTearingTd1": 0.0,
      "parallelCordBeforeTearingTd2": 0.0,
      "parallelCordBeforeTearingTd3": 0.0,
      "parallelCordBeforeTearingTd4": 0.0,
      "parallelCordBeforeTearingTd5": 0.0,
      "parallelCordBeforeTearingTd6": 0.0,
      "parallelCordAfterTearingTd1": 0.0,
      "parallelCordAfterTearingTd2": 0.0,
      "parallelCordAfterTearingTd3": 0.0,
      "parallelCordAfterTearingTd4": 0.0,
      "parallelCordAfterTearingTd5": 0.0,
      "parallelCordAfterTearingTd6": 0.0,
      "parallelCordSpacerBarTd1": 0.0,
      "parallelCordSpacerBarTd2": 0.0,
      "parallelCordSpacerBarTd3": 0.0,
      "parallelCordSpacerBarTd4": 0.0,
      "parallelCordSpacerBarTd5": 0.0,
      "parallelCordSpacerBarTd6": 0.0,
      "parallelCordBeforeTearingDv": 0.0,
      "parallelCordAfterTearingDv": 0.0,
      "parallelCordSpacerBarDv": 0.0,
      "insulTsTime": 0.0,
      "insulTsTemp": 0.0,
      "sheathTsTime": 0.0,
      "sheathTsTemp": 0.0,
      "insulLtBendTemp": 0.0,
      "insulLtBendTime": 0.0,
      "insulLtBendLenght": 0.0,
      "sheathLtBendTemp": 0.0,
      "sheathLtBendTime": 0.0,
      "sheathLtBendLenght": 0.0,
      "insulHtgDv": 0.0,
      "sheathHtgDv": 0.0,
      "sheathSurfaceR": 0.0,
      "sheathSurfaceRDv": 0.0,
      "csaDv": 0.0,
      "spindleNum": 0.0,
      "spindleRootNum": 0.0,
      "singleShieldDiameter": 0.0,
      "pitch": 0.0,
      "shieldDiameter": 0.0,
      "insulOdDv": 0.0,
      "peelStrengthTd1": 0.0,
      "peelStrengthTd2": 0.0,
      "peelStrengthTd3": 0.0,
      "peelStrengthTd4": 0.0,
      "ltBendBreakdown": "",
      "ltBendLenght": 0.0,
      "thcLenght": 0.0,
      "thcLn": 0.0,
      "thcCrack": "",
      "hotWaterResistanceLenght": 0.0,
      "hotWaterResistanceLn": 0.0,
      "hotWaterResistanceCrack": "",
      "hotWaterResistanceForward": 0.0,
      "hotWaterResistanceReverse": 0.0,
      "waterResistanceGasolineLn": 0.0,
      "waterResistanceGasolineTd": 0.0,
      "waterResistanceGasolinePct": 0.0,
      "waterResistanceGasolineCrack": "",
      "waterResistanceEthanolLn": 0.0,
      "waterResistanceEthanolTd": 0.0,
      "waterResistanceEthanolPct": 0.0,
      "waterResistanceEthanolCrack": "",
      "waterResistanceDieselOilLn": 0.0,
      "waterResistanceDieselOilTd": 0.0,
      "waterResistanceDieselOilPct": 0.0,
      "waterResistanceDieselOilCrack": "",
      "waterResistanceIrm902Ln": 0.0,
      "waterResistanceIrm902Td": 0.0,
      "waterResistanceIrm902Pct": 0.0,
      "waterResistanceIrm902Crack": "",
      "waterResistanceIrm903Ln": 0.0,
      "waterResistanceIrm903Td": 0.0,
      "waterResistanceIrm903Pct": 0.0,
      "waterResistanceIrm903Crack": "",
      "waterResistanceAtfLn": 0.0,
      "waterResistanceAtfTd": 0.0,
      "waterResistanceAtfPct": 0.0,
      "waterResistanceAtfCrack": "",
      "waterResistanceAntifreezeLn": 0.0,
      "waterResistanceAntifreezeTd": 0.0,
      "waterResistanceAntifreezePct": 0.0,
      "waterResistanceAntifreezeCrack": "",
      "waterResistanceBatteryAcidLn": 0.0,
      "waterResistanceBatteryAcidTd": 0.0,
      "waterResistanceBatteryAcidPct": 0.0,
      "waterResistanceBatteryAcidCrack": "",
      "frSelfExtinguishingDv": 0.0,
      "frSelfExtinguishingTime": 0.0,
      "frSelfExtinguishingTd1": 0.0,
      "frSelfExtinguishingTd2": 0.0,
      "frSelfExtinguishingTd3": 0.0,
      "frUnburnedTd1": 0.0,
      "frUnburnedTd2": 0.0,
      "frUnburnedTd3": 0.0,
      "hte": 0.0,
      "dielectricPok": "",
      "peelStrength": 0.0,
      "hthpTemp": 0.0,
      "hthpCrack": "",
      "lowTemperatureWindingWeight": 0.0,
      "lowTemperatureWindingLn": 0.0,
      "lowTemperatureWindingCrack": "",
      "arDv": 0.0,
      "ar": 0.0,
      "longTermAgingTemp": 0.0,
      "longTermAgingLn": 0.0,
      "longTermAgingCrack": "",
      "shortTermAgingTemp": 0.0,
      "shortTermAgingLn": 0.0,
      "shortTermAgingWeight": 0.0,
      "shortTermAgingCrack": "",
      "thermalOverloadLn": 0.0,
      "thermalOverloadCrack": "",
      "thermalShrinkage": 0.0,
      "temperatureHumidityHlternationLn": 0.0,
      "temperatureHumidityHlternationTemp1": 0.0,
      "temperatureHumidityHlternationTemp2": 0.0,
      "temperatureHumidityHlternationCrack": "",
      "ozoneResistanceLn": 0.0,
      "ozoneResistancePok": "",
      "waterResistanceEngineCoolantLn": 0.0,
      "waterResistanceEngineCoolantTd": 0.0,
      "waterResistanceEngineCoolantPct": 0.0,
      "waterResistanceEngineCoolantCrack": "",
      "waterResistanceEngineOilLn": 0.0,
      "waterResistanceEngineOilTd": 0.0,
      "waterResistanceEngineOilPct": 0.0,
      "waterResistanceEngineOilCrack": "",
      "waterResistancePowerSteeringFluidLn": 0.0,
      "waterResistancePowerSteeringFluidTd": 0.0,
      "waterResistancePowerSteeringFluidPct": 0.0,
      "waterResistancePowerSteeringFluidCrack": "",
      "waterResistanceBatteryAcidPok": "",
      "frFireSupplyTime": 0.0,
      "adhesionDv": 0.0,
      "adhesionTd1": 0.0,
      "adhesionTd2": 0.0,
      "adhesionTd3": 0.0,
      "adhesionTd4": 0.0,
      "adhesionTd5": 0.0,
      "htgTemp": 0.0,
      "htgCrack": "",
      "htgPok": "",
      "ltBendWeight": 0.0,
      "lowTemperatureImpactPok": "",
      "hr1ATemp": 0.0,
      "hr1ATime": 0.0,
      "hr1ALenght": 0.0,
      "hr1AWeight": 0.0,
      "hr1ACrack": "",
      "hr1APok": "",
      "hr1BTemp": 0.0,
      "hr1BTime": 0.0,
      "hr1BLenght": 0.0,
      "hr1BWeight": 0.0,
      "hr1BCrack": "",
      "hr1BPok": "",
      "hr1CCrack": "",
      "waterResistanceGasolinePok": "",
      "waterResistanceDieselOilPok": "",
      "waterResistanceEthanolPok": "",
      "waterResistanceAtfPok": "",
      "waterResistanceAntifreezePok": "",
      "waterResistanceIrm902Pok": "",
      "waterResistanceIrm903Pok": "",
      "frSelfExtinguishingTd": 0.0,
      "tsLenght": 0.0,
      "hotStretchLoadLenght": 0.0,
      "hotStretchCoolingLenght": 0.0,
      "signContinuity": 0.0,
      "immersionPowerFrequencyVoltageVoltage": 0.0,
      "immersionPowerFrequencyVoltageVoltageTime": null,
      "immersionPowerFrequencyVoltagePok": null,
      "roomTempPowerFrequencyVoltageTemp": null,
      "roomTempPowerFrequencyVoltageTime": null,
      "roomTempPowerFrequencyVoltageLenght": null,
      "roomTempPowerFrequencyVoltageLn": null,
      "roomTempPowerFrequencyVoltageUnagedVoltage": null,
      "roomTempPowerFrequencyVoltageUnagedVoltageTime": null,
      "roomTempPowerFrequencyVoltageAgingVoltage": null,
      "roomTempPowerFrequencyVoltageAgingVoltageTime": null,
      "roomTempPowerFrequencyVoltagePok": null,
      "ratedTempPowerFrequencyVoltageTemp": null,
      "ratedTempPowerFrequencyVoltageTime": null,
      "ratedTempPowerFrequencyVoltageRoastTemp": null,
      "ratedTempPowerFrequencyVoltageVoltage": null,
      "ratedTempPowerFrequencyVoltageVoltageTime": null,
      "ratedTempPowerFrequencyVoltagePok": null,
      "lightCottonHorizontalTd1": null,
      "lightCottonHorizontalTd2": null,
      "lightCottonHorizontalTd3": null,
      "lightCottonVerticalTd1": null,
      "lightCottonVerticalTd2": null,
      "lightCottonVerticalTd3": null,
      "zTbfStartDistanceTd1": null,
      "zTbfStartDistanceTd2": null,
      "zTbfStartDistanceTd3": null,
      "zTbfBurningDistanceTd1": null,
      "zTbfBurningDistanceTd2": null,
      "zTbfBurningDistanceTd3": null,
      "compatibilitySheathUnagedElongationTd1": null,
      "compatibilitySheathUnagedElongationTd2": null,
      "compatibilitySheathUnagedElongationTd3": null,
      "compatibilitySheathUnagedElongationTd4": null,
      "compatibilitySheathUnagedElongationTd5": null,
      "compatibilitySheathUnagedElongationTd6": null,
      "compatibilitySheathUnagedPullTd1": null,
      "compatibilitySheathUnagedPullTd2": null,
      "compatibilitySheathUnagedPullTd3": null,
      "compatibilitySheathUnagedPullTd4": null,
      "compatibilitySheathUnagedPullTd5": null,
      "compatibilitySheathUnagedPullTd6": null,
      "compatibilitySheathAgingElongationTd1": null,
      "compatibilitySheathAgingElongationTd2": null,
      "compatibilitySheathAgingElongationTd3": null,
      "compatibilitySheathAgingElongationTd4": null,
      "compatibilitySheathAgingElongationTd5": null,
      "compatibilitySheathAgingElongationTd6": null,
      "compatibilitySheathAgingPullTd1": null,
      "compatibilitySheathAgingPullTd2": null,
      "compatibilitySheathAgingPullTd3": null,
      "compatibilitySheathAgingPullTd4": null,
      "compatibilitySheathAgingPullTd5": null,
      "compatibilitySheathAgingPullTd6": null,
      "compatibilityInsulUnagedEiMvsDv": null,
      "compatibilityInsulUnagedTsMvsDv": null,
      "compatibilityInsulAgingEiMvsDv": null,
      "compatibilityInsulAgingTsMvsDv": null,
      "compatibilityInsulAgingEi": null,
      "compatibilityInsulAgingTs": null,
      "compatibilitySheathUnagedEiMvsDv": null,
      "compatibilitySheathUnagedTsMvsDv": null,
      "compatibilitySheathAgingEiMvsDv": null,
      "compatibilitySheathAgingTsMvsDv": null,
      "compatibilitySheathAgingEi": null,
      "compatibilitySheathAgingTs": null,
      "flexureFrequency": null,
      "ir90Calc": null,
      "insulDielectricWithstandVoltageCurrent": null,
      "fgDielectricWithstandVoltageCurrent": null,
      "sheathOdDv": null,
      "arSheathUnagedElongationTd1": null,
      "arSheathUnagedElongationTd2": null,
      "arSheathUnagedElongationTd3": null,
      "arSheathUnagedElongationTd4": null,
      "arSheathUnagedElongationTd5": null,
      "arSheathUnagedElongationTd6": null,
      "arSheathUnagedPullTd1": null,
      "arSheathUnagedPullTd2": null,
      "arSheathUnagedPullTd3": null,
      "arSheathUnagedPullTd4": null,
      "arSheathUnagedPullTd5": null,
      "arSheathUnagedPullTd6": null,
      "arSheathAgingElongationTd1": null,
      "arSheathAgingElongationTd2": null,
      "arSheathAgingElongationTd3": null,
      "arSheathAgingElongationTd4": null,
      "arSheathAgingElongationTd5": null,
      "arSheathAgingElongationTd6": null,
      "arSheathAgingPullTd1": null,
      "arSheathAgingPullTd2": null,
      "arSheathAgingPullTd3": null,
      "arSheathAgingPullTd4": null,
      "arSheathAgingPullTd5": null,
      "arSheathAgingPullTd6": null,
      "apSheathUnagedElongationTd1": null,
      "apSheathUnagedElongationTd2": null,
      "apSheathUnagedElongationTd3": null,
      "apSheathUnagedElongationTd4": null,
      "apSheathUnagedElongationTd5": null,
      "apSheathUnagedElongationTd6": null,
      "apSheathUnagedPullTd1": null,
      "apSheathUnagedPullTd2": null,
      "apSheathUnagedPullTd3": null,
      "apSheathUnagedPullTd4": null,
      "apSheathUnagedPullTd5": null,
      "apSheathUnagedPullTd6": null,
      "apSheathAgingElongationTd1": null,
      "apSheathAgingElongationTd2": null,
      "apSheathAgingElongationTd3": null,
      "apSheathAgingElongationTd4": null,
      "apSheathAgingElongationTd5": null,
      "apSheathAgingElongationTd6": null,
      "apSheathAgingPullTd1": null,
      "apSheathAgingPullTd2": null,
      "apSheathAgingPullTd3": null,
      "apSheathAgingPullTd4": null,
      "apSheathAgingPullTd5": null,
      "apSheathAgingPullTd6": null,
      "thermalLifeSheathUnagedElongationTd1": null,
      "thermalLifeSheathUnagedElongationTd2": null,
      "thermalLifeSheathUnagedElongationTd3": null,
      "thermalLifeSheathUnagedElongationTd4": null,
      "thermalLifeSheathUnagedElongationTd5": null,
      "thermalLifeSheathUnagedElongationTd6": null,
      "thermalLifeSheathUnagedPullTd1": null,
      "thermalLifeSheathUnagedPullTd2": null,
      "thermalLifeSheathUnagedPullTd3": null,
      "thermalLifeSheathUnagedPullTd4": null,
      "thermalLifeSheathUnagedPullTd5": null,
      "thermalLifeSheathUnagedPullTd6": null,
      "thermalLifeSheathAgingElongationTd1": null,
      "thermalLifeSheathAgingElongationTd2": null,
      "thermalLifeSheathAgingElongationTd3": null,
      "thermalLifeSheathAgingElongationTd4": null,
      "thermalLifeSheathAgingElongationTd5": null,
      "thermalLifeSheathAgingElongationTd6": null,
      "thermalLifeSheathAgingPullTd1": null,
      "thermalLifeSheathAgingPullTd2": null,
      "thermalLifeSheathAgingPullTd3": null,
      "thermalLifeSheathAgingPullTd4": null,
      "thermalLifeSheathAgingPullTd5": null,
      "thermalLifeSheathAgingPullTd6": null,
      "sheathHotStretchLoadHte": null,
      "sheathHotStretchCoolingHte": null,
      "dielectricWithstandVoltage": null,
      "dielectricWithstandVoltageTiem": null,
      "cl": null,
      "br": null,
      "numUl": null,
      "diameterUlTd1": null,
      "diameterUlTd2": null,
      "diameterUlTd3": null,
      "diameterUlTd4": null,
      "diameterUlTd5": null,
      "diameterUlTd6": null,
      "insulOdUlTd1": null,
      "insulOdUlTd2": null,
      "insulOdUlTd3": null,
      "insulOdUlTd4": null,
      "insulOdUlTd5": null,
      "insulOdUlTd6": null,
      "insulOdUlTd": null,
      "insulThkUlTd1": null,
      "insulThkUlTd2": null,
      "insulThkUlTd3": null,
      "insulThkUlTd4": null,
      "insulThkUlTd5": null,
      "insulThkUlTd6": null,
      "insulThkUlTd7": null,
      "insulThkUlTd8": null,
      "insulThkUlTd9": null,
      "insulThkUlTd10": null,
      "sheathThkUlTd1": null,
      "sheathThkUlTd2": null,
      "sheathThkUlTd3": null,
      "sheathThkUlTd4": null,
      "sheathThkUlTd5": null,
      "sheathThkUlTd6": null,
      "sheathThkUlTd7": null,
      "sheathThkUlTd8": null,
      "sheathThkUlTd9": null,
      "sheathThkUlTd10": null,
      "insulAvgThkUl": null,
      "insulMinThkUl": null,
      "sheathAvgThkUl": null,
      "sheathMinThkUl": null,
      "biTempUl": null,
      "biTimeUl": null,
      "sheathUnagedElongationUlTd1": null,
      "sheathUnagedElongationUlTd2": null,
      "sheathUnagedElongationUlTd3": null,
      "sheathUnagedElongationUlTd4": null,
      "sheathUnagedElongationUlTd5": null,
      "sheathUnagedElongationUlTd6": null,
      "sheathUnagedPullUlTd1": null,
      "sheathUnagedPullUlTd2": null,
      "sheathUnagedPullUlTd3": null,
      "sheathUnagedPullUlTd4": null,
      "sheathUnagedPullUlTd5": null,
      "sheathUnagedPullUlTd6": null,
      "sheathAgingElongationUlTd1": null,
      "sheathAgingElongationUlTd2": null,
      "sheathAgingElongationUlTd3": null,
      "sheathAgingElongationUlTd4": null,
      "sheathAgingElongationUlTd5": null,
      "sheathAgingElongationUlTd6": null,
      "sheathAgingPullUlTd1": null,
      "sheathAgingPullUlTd2": null,
      "sheathAgingPullUlTd3": null,
      "sheathAgingPullUlTd4": null,
      "sheathAgingPullUlTd5": null,
      "sheathAgingPullUlTd6": null,
      "sheathHotStretchLoadHteIec": null,
      "sheathHotStretchCoolingHteIec": null,
      "sheathLtBendLnIec": null,
      "sheathLtBendCrackIec": null,
      "sheathBeforeHeatingTd": null,
      "sheathAfterHeatingTd": null,
      "irCalcIecDv": null,
      "dielectricPokIec": null,
      "adhesion": null,
      "lowTemperatureWindingDiameter": null,
      "thermalOverloadDiameter": null,
      "thermalOverloadWeight": null,
      "waterResistanceGasolineDiameter": null,
      "waterResistanceDieselOilDiameter": null,
      "waterResistanceEthanolDiameter": null,
      "waterResistanceBatteryAcidDiameter": null,
      "waterResistanceEngineOilDiameter": null,
      "waterResistancePowerSteeringFluidDiameter": null,
      "waterResistanceAtfDiameter": null,
      "waterResistanceAntifreezeDiameter": null,
      "powerFrequencyVoltagePok": null,
      "breakdownVoltagePok": null,
      "hthpTd": null,
      "thermalShrinkageOriginalLength": null,
      "thermalShrinkageHeatingLenght": null,
      "overheatCrack": null,
      "lowTemperatureImpact4hrCrack": null,
      "adhesionFallOff": null,
      "peelEasy": null,
      "oilResistantCrack": null,
      "fuelResistantCrack": null,
      "arWeight": null,
      "withstandVoltageDielectricText": null,
      "withstandVoltageDielectricImmersion": null,
      "withstandVoltageVoltage": null,
      "withstandVoltageRaiseVoltage": null,
      "shortTermAgingDiameter": null,
      "waterResistancePowerSteeringFluidPok": null,
      "waterResistanceBrakeFluidLn": null,
      "waterResistanceBrakeFluidCrack": null,
      "waterResistanceBrakeFluidPok": null,
      "windingHeatingLn": null,
      "windingHeatingCrack": null,
      "windingHeatingDiameter": null,
      "ir20Length": null,
      "ir20Td": null,
      "ir20CalcDv": null,
      "ir60Length": null,
      "ir60Td": null,
      "ir60CalcDv": null,
      "dielectricImmersionWithstandVoltage": null,
      "dielectricImmersionWithstandVoltageTime": null,
      "dielectricImmersionWithstandVoltagePok": null,
      "dielectricAirWithstandVoltage": null,
      "dielectricAirWithstandVoltageTime": null,
      "dielectricAirWithstandVoltagePok": null,
      "sheathDumbbellSliceUnagedThkTd1": null,
      "sheathDumbbellSliceUnagedThkTd2": null,
      "sheathDumbbellSliceUnagedThkTd3": null,
      "sheathDumbbellSliceUnagedThkTd4": null,
      "sheathDumbbellSliceUnagedThkTd5": null,
      "sheathDumbbellSliceUnagedThkTd6": null,
      "sheathDumbbellSliceAgingThkTd1": null,
      "sheathDumbbellSliceAgingThkTd2": null,
      "sheathDumbbellSliceAgingThkTd3": null,
      "sheathDumbbellSliceAgingThkTd4": null,
      "sheathDumbbellSliceAgingThkTd5": null,
      "sheathDumbbellSliceAgingThkTd6": null,
      "tsText": null,
      "ltBendText": null,
      "flexibilityText": null,
      "sheathAgingCt": null,
      "htgDeformationRateCt": null,
      "htgFrontDiameter": null,
      "htgRearDiameter": null,
      "htgMandrelDiameter": null,
      "irCalcDvText": null,
      "irCalcDvResult": null,
      "irCalcTemp": null,
      "insulTsDiameter": null,
      "sheathTsDiameter": null,
      "insulLtBendDiameter": null,
      "sheathLtBendDiameter": null,
      "hotWaterResistanceForwardSampleLength": null,
      "hotWaterResistanceReverseSampleLength": null
    },
    "visible": null
  }
}
```




---
## 修改报告

> BASIC

**Path:** report/modReport

**Method:** POST

**Desc:**

 修改报告

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| report | object | UI电子线表 |
| &ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |
| wireList | array | 芯线列表 |
| &ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─id | integer | 芯线序号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─num | integer | 数量 |
| &ensp;&ensp;&ensp;&ensp;&#124;─color | string | 颜色 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd1 | number | 线径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd2 | number | 线径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd3 | number | 线径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd4 | number | 线径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd5 | number | 线径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─diameterTd6 | number | 线径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd1 | number | 绝缘外径测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd2 | number | 绝缘外径测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd3 | number | 绝缘外径测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd4 | number | 绝缘外径测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd5 | number | 绝缘外径测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulOdTd6 | number | 绝缘外径测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd1 | number | 绝缘厚度测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd2 | number | 绝缘厚度测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd3 | number | 绝缘厚度测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd4 | number | 绝缘厚度测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd5 | number | 绝缘厚度测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd6 | number | 绝缘厚度测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd7 | number | 绝缘厚度测试数据7 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd8 | number | 绝缘厚度测试数据8 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd9 | number | 绝缘厚度测试数据9 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd10 | number | 绝缘厚度测试数据10 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd1 | number | 绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd2 | number | 绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd3 | number | 绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd4 | number | 绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd5 | number | 绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedElongationTd6 | number | 绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd1 | number | 绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd2 | number | 绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd3 | number | 绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd4 | number | 绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd5 | number | 绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulUnagedPullTd6 | number | 绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd1 | number | 绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd2 | number | 绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd3 | number | 绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd4 | number | 绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd5 | number | 绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingElongationTd6 | number | 绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd1 | number | 绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd2 | number | 绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd3 | number | 绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd4 | number | 绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd5 | number | 绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulAgingPullTd6 | number | 绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgFrontAvgDiameter | number | 加热变形前平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─htgRearAvgDiameter | number | 加热变形后平均线径测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─conductor20DcrTd | number | 20℃导体直流电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irLength | number | 绝缘电阻长 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irTd | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─materialQuality | string | 导体材质 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulMaterialQuality | string | 绝缘材质 |
| &ensp;&ensp;&ensp;&ensp;&#124;─firty807Unaged | number | 80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─second807Aging | number | 80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHthp | number | 高温压力 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd11 | number | 绝缘厚度测试数据11 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd12 | number | 绝缘厚度测试数据12 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd13 | number | 绝缘厚度测试数据13 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd14 | number | 绝缘厚度测试数据14 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd15 | number | 绝缘厚度测试数据15 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd16 | number | 绝缘厚度测试数据16 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd17 | number | 绝缘厚度测试数据17 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulThkTd18 | number | 绝缘厚度测试数据18 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd1 | number | 兼容性绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd2 | number | 兼容性绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd3 | number | 兼容性绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd4 | number | 兼容性绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd5 | number | 兼容性绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedElongationTd6 | number | 兼容性绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd1 | number | 兼容性绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd2 | number | 兼容性绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd3 | number | 兼容性绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd4 | number | 兼容性绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd5 | number | 兼容性绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulUnagedPullTd6 | number | 兼容性绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd1 | number | 兼容性绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd2 | number | 兼容性绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd3 | number | 兼容性绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd4 | number | 兼容性绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd5 | number | 兼容性绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingElongationTd6 | number | 兼容性绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd1 | number | 兼容性绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd2 | number | 兼容性绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd3 | number | 兼容性绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd4 | number | 兼容性绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd5 | number | 兼容性绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─compatibilityInsulAgingPullTd6 | number | 兼容性绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd1 | number | 热寿命绝缘老化前伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd2 | number | 热寿命绝缘老化前伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd3 | number | 热寿命绝缘老化前伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd4 | number | 热寿命绝缘老化前伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd5 | number | 热寿命绝缘老化前伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedElongationTd6 | number | 热寿命绝缘老化前伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd1 | number | 热寿命绝缘老化前拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd2 | number | 热寿命绝缘老化前拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd3 | number | 热寿命绝缘老化前拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd4 | number | 热寿命绝缘老化前拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd5 | number | 热寿命绝缘老化前拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulUnagedPullTd6 | number | 热寿命绝缘老化前拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd1 | number | 热寿命绝缘老化后伸长测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd2 | number | 热寿命绝缘老化后伸长测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd3 | number | 热寿命绝缘老化后伸长测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd4 | number | 热寿命绝缘老化后伸长测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd5 | number | 热寿命绝缘老化后伸长测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingElongationTd6 | number | 热寿命绝缘老化后伸长测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd1 | number | 热寿命绝缘老化后拉力测试数据1 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd2 | number | 热寿命绝缘老化后拉力测试数据2 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd3 | number | 热寿命绝缘老化后拉力测试数据3 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd4 | number | 热寿命绝缘老化后拉力测试数据4 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd5 | number | 热寿命绝缘老化后拉力测试数据5 |
| &ensp;&ensp;&ensp;&ensp;&#124;─thermalLifeInsulAgingPullTd6 | number | 热寿命绝缘老化后拉力测试数据6 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchLoadHte | number | 绝缘热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─insulHotStretchCoolingHte | number | 绝缘热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalc | number | 绝缘电阻测试数据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─irCalcIec | number | IEC绝缘电阻测试数据 |
| publicData | object | 公共数据 |
| &ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&#124;─printingErasibilit | string | 印字耐擦是否印字清晰 |
| &ensp;&ensp;&#124;─conductorCorrosion | string | 导体腐蚀是否无腐蚀 |
| &ensp;&ensp;&#124;─tsCrack | string | 热冲击是否无开裂 |
| &ensp;&ensp;&#124;─ltBendCrack | string | 低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─flexibilityCrack | string | 柔韧性是否无开裂 |
| &ensp;&ensp;&#124;─dielectricIiiPok | string | 耐电压测试(介电III)是否击穿 |
| &ensp;&ensp;&#124;─dielectricIPok | string | 耐电压测试(介电I)是否击穿 |
| &ensp;&ensp;&#124;─hvdcWirePok | string | 高压直流线介质耐压试验I是否击穿 |
| &ensp;&ensp;&#124;─lightCottonVw1Td1 | string | VW1棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonVw1Td2 | string | VW1棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonVw1Td3 | string | VW1棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonFt2Td1 | string | FT2棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonFt2Td2 | string | FT2棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonFt2Td3 | string | FT2棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonUlTd1 | string | UL水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonUlTd2 | string | UL水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonUlTd3 | string | UL水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─sheathMaterialQuality | string | 护套材质 |
| &ensp;&ensp;&#124;─insulTsCrack | string | 绝缘热冲击是否无开裂 |
| &ensp;&ensp;&#124;─sheathTsCrack | string | 护套热冲击是否无开裂 |
| &ensp;&ensp;&#124;─insulLtBendCrack | string | 绝缘低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─sheathLtBendCrack | string | 护套低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─lowTemperatureImpactCrack | string | 低温冲击是否无开裂 |
| &ensp;&ensp;&#124;─thermalStability | number | 热稳定性 |
| &ensp;&ensp;&#124;─flexureTest | string | 曲挠试验 |
| &ensp;&ensp;&#124;─insulDielectricPok | string | 绝缘耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─fgDielectricPok | string | 成品耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─sheathOdTd1 | number | 护套外径测试数据1 |
| &ensp;&ensp;&#124;─sheathOdTd2 | number | 护套外径测试数据2 |
| &ensp;&ensp;&#124;─sheathOdTd3 | number | 护套外径测试数据3 |
| &ensp;&ensp;&#124;─sheathOdTd4 | number | 护套外径测试数据4 |
| &ensp;&ensp;&#124;─sheathOdTd5 | number | 护套外径测试数据5 |
| &ensp;&ensp;&#124;─sheathOdTd6 | number | 护套外径测试数据6 |
| &ensp;&ensp;&#124;─sheathThkTd1 | number | 护套厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathThkTd2 | number | 护套厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathThkTd3 | number | 护套厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathThkTd4 | number | 护套厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathThkTd5 | number | 护套厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathThkTd6 | number | 护套厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd1 | number | 护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd2 | number | 护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd3 | number | 护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd4 | number | 护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd5 | number | 护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedElongationTd6 | number | 护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd1 | number | 护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd2 | number | 护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd3 | number | 护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd4 | number | 护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd5 | number | 护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedPullTd6 | number | 护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd1 | number | 护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd2 | number | 护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd3 | number | 护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd4 | number | 护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd5 | number | 护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingElongationTd6 | number | 护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingPullTd1 | number | 护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingPullTd2 | number | 护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingPullTd3 | number | 护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingPullTd4 | number | 护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingPullTd5 | number | 护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingPullTd6 | number | 护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─csgFrontThk | number | 套管前厚度 |
| &ensp;&ensp;&#124;─csgRearThk | number | 套管后厚度 |
| &ensp;&ensp;&#124;─spgLength | number | 比重长 |
| &ensp;&ensp;&#124;─spgEmptyWeight | number | 比重空重 |
| &ensp;&ensp;&#124;─spgWaterWeight | number | 比重水重 |
| &ensp;&ensp;&#124;─hteMarkLength | number | 热延伸标记长度 |
| &ensp;&ensp;&#124;─hteExtensionLength | number | 热延伸延伸长度 |
| &ensp;&ensp;&#124;─sheathThkTd7 | number | 护套厚度测试数据7 |
| &ensp;&ensp;&#124;─sheathThkTd8 | number | 护套厚度测试数据8 |
| &ensp;&ensp;&#124;─sheathThkTd9 | number | 护套厚度测试数据9 |
| &ensp;&ensp;&#124;─sheathThkTd10 | number | 护套厚度测试数据10 |
| &ensp;&ensp;&#124;─insulAvgThk | number | 绝缘平均厚度判断值 |
| &ensp;&ensp;&#124;─insulMinThk | number | 绝缘最小厚度判断值 |
| &ensp;&ensp;&#124;─sheathAvgThk | number | 护套平均厚度判断值 |
| &ensp;&ensp;&#124;─sheathMinThk | number | 护套最小厚度判断值 |
| &ensp;&ensp;&#124;─insulBiTemp | number | 绝缘老化条件温度/℃ |
| &ensp;&ensp;&#124;─insulBiTime | number | 绝缘老化条件时间/H |
| &ensp;&ensp;&#124;─insulUnagedEi | number | 绝缘延伸率判断值 |
| &ensp;&ensp;&#124;─insulUnagedTs | number | 绝缘抗张强度判断值 |
| &ensp;&ensp;&#124;─insulAgingEi | number | 绝缘老化后延伸残率判断值\|\|绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─insulAgingTs | number | 绝缘老化后抗张残率判断值\|\|绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─sheathBiTemp | number | 护套老化条件温度/℃ |
| &ensp;&ensp;&#124;─sheathBiTime | number | 护套老化条件时间/H |
| &ensp;&ensp;&#124;─sheathUnagedEi | number | 护套延伸率判断值 |
| &ensp;&ensp;&#124;─sheathUnagedTs | number | 护套抗张强度判断值 |
| &ensp;&ensp;&#124;─sheathAgingEi | number | 护套老化后延伸残率判断值\|\|护套老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─sheathAgingTs | number | 护套老化后抗张残率判断值\|\|护套老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─conductorCorrosionTemp | number | 导体腐蚀温度/℃ |
| &ensp;&ensp;&#124;─conductorCorrosionTime | number | 导体腐蚀时间/H |
| &ensp;&ensp;&#124;─tsTemp | number | 热冲击温度/℃ |
| &ensp;&ensp;&#124;─tsTime | number | 热冲击时间/H |
| &ensp;&ensp;&#124;─tsLn | number | 热冲击圈数/圈 |
| &ensp;&ensp;&#124;─ltBendTemp | number | 低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─ltBendTime | number | 低温弯曲时间/H |
| &ensp;&ensp;&#124;─ltBendLn | number | 低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─flexibilityTemp | number | 柔韧性温度/℃ |
| &ensp;&ensp;&#124;─flexibilityTime | number | 柔韧性时间/H |
| &ensp;&ensp;&#124;─flexibilityLn | number | 柔韧性圈数/圈 |
| &ensp;&ensp;&#124;─conductor20Dcr | number | 20℃导体直流电阻判断值 |
| &ensp;&ensp;&#124;─dielectricIiiWithstandVoltage | number | 耐电压测试(介电III)耐压/kv |
| &ensp;&ensp;&#124;─dielectricIiiWithstandVoltageTime | number | 耐电压测试(介电III)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricINum | number | 耐电压测试(介电I)取样/个 |
| &ensp;&ensp;&#124;─dielectricITemp | number | 耐电压测试(介电I)温度/℃ |
| &ensp;&ensp;&#124;─dielectricITime | number | 耐电压测试(介电I)时间/H |
| &ensp;&ensp;&#124;─dielectricIGirth | number | 耐电压测试(介电I)圈长/mm |
| &ensp;&ensp;&#124;─dielectricILn | number | 耐电压测试(介电I)圈数/圈 |
| &ensp;&ensp;&#124;─dielectricIWithstandVoltage | number | 耐电压测试(介电I)耐压/kv |
| &ensp;&ensp;&#124;─dielectricIWithstandVoltageTiem | number | 耐电压测试(介电I)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricIPokNum | number | 耐电压测试(介电I)击穿值/kv |
| &ensp;&ensp;&#124;─hvdcWireNum | number | 高压直流线介质耐压试验I取样/M |
| &ensp;&ensp;&#124;─hvdcWireBakingTemp | number | 高压直流线介质耐压试验I烘温度/摄氏度 |
| &ensp;&ensp;&#124;─hvdcWireBakingTime | number | 高压直流线介质耐压试验I烘时间/H |
| &ensp;&ensp;&#124;─hvdcWireDischargeTemp | number | 高压直流线介质耐压试验I放温度/摄氏度 |
| &ensp;&ensp;&#124;─hvdcWireDischargePct | number | 高压直流线介质耐压试验I放% |
| &ensp;&ensp;&#124;─hvdcWireDischargeTime | number | 高压直流线介质耐压试验I放时间/H |
| &ensp;&ensp;&#124;─hvdcWireTestBar | number | 高压直流线介质耐压试验I试棒/mm |
| &ensp;&ensp;&#124;─hvdcWireLn | number | 高压直流线介质耐压试验I圈数/圈 |
| &ensp;&ensp;&#124;─hvdcWireDcv | number | 高压直流线介质耐压试验I直流电压/kv |
| &ensp;&ensp;&#124;─hvdcWireDcvTime | number | 高压直流线介质耐压试验I直流电压时间/min |
| &ensp;&ensp;&#124;─firstFlameRetardingTd1 | number | 第1次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─firstFlameRetardingTd2 | number | 第1次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─firstFlameRetardingTd3 | number | 第1次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd1 | number | 第2次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd2 | number | 第2次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─secondFlameRetardingTd3 | number | 第2次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd1 | number | 第3次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd2 | number | 第3次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─thirdFlameRetardingTd3 | number | 第3次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd1 | number | 第4次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd2 | number | 第4次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─fourthFlameRetardingTd3 | number | 第4次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd1 | number | 第5次施火延燃测试数据1 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd2 | number | 第5次施火延燃测试数据2 |
| &ensp;&ensp;&#124;─fifthFlameRetardingTd3 | number | 第5次施火延燃测试数据3 |
| &ensp;&ensp;&#124;─flagBurningAreaTd1 | number | 旗子烧毁面积测试数据1 |
| &ensp;&ensp;&#124;─flagBurningAreaTd2 | number | 旗子烧毁面积测试数据2 |
| &ensp;&ensp;&#124;─flagBurningAreaTd3 | number | 旗子烧毁面积测试数据3 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd1 | number | 施火30秒后燃烧长度测试数据1 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd2 | number | 施火30秒后燃烧长度测试数据2 |
| &ensp;&ensp;&#124;─burningAfterLenghtTd3 | number | 施火30秒后燃烧长度测试数据3 |
| &ensp;&ensp;&#124;─burningTimeTd1 | number | UL水平燃烧时间测试数据1 |
| &ensp;&ensp;&#124;─burningTimeTd2 | number | UL水平燃烧时间测试数据2 |
| &ensp;&ensp;&#124;─burningTimeTd3 | number | UL水平燃烧时间测试数据3 |
| &ensp;&ensp;&#124;─thermalElongation | number | 热延伸率/g |
| &ensp;&ensp;&#124;─avgOdUbv | number | 平均外径上限值默认设置7.5 |
| &ensp;&ensp;&#124;─sectionMax | number | 同一截面最大值 |
| &ensp;&ensp;&#124;─sectionMin | number | 同一截面最小值 |
| &ensp;&ensp;&#124;─sheathFirty807Unaged | number | 护套80℃*7天 第一次(老化前)g |
| &ensp;&ensp;&#124;─sheathSecond807Aging | number | 护套80℃*7天 第二次(老化后)g |
| &ensp;&ensp;&#124;─insulTsLength | number | 绝缘热冲击长度/mm |
| &ensp;&ensp;&#124;─insulTsLn | number | 绝缘热冲击圈数/圈 |
| &ensp;&ensp;&#124;─sheathTsLength | number | 护套热冲击长度/mm |
| &ensp;&ensp;&#124;─sheathTsLn | number | 护套热冲击圈数/圈 |
| &ensp;&ensp;&#124;─insulLtBendLn | number | 绝缘低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─sheathLtBendLn | number | 护套低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─lowTemperatureImpact | number | 低温冲击重量 |
| &ensp;&ensp;&#124;─sheathHthp | number | 绝缘高温压力 |
| &ensp;&ensp;&#124;─printingSpaceDv | number | 印字间距判断值 |
| &ensp;&ensp;&#124;─printingSpace | number | 印字间距 |
| &ensp;&ensp;&#124;─ir90Length | number | 90℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir90Td | number | 90℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─irCalcDv | number | 绝缘电阻判断值\|\|70℃绝缘电阻判断值\|\|15℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─ir90CalcDv | number | 90℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─diameterTdAvgDv | number | 导体单根线径判断值 |
| &ensp;&ensp;&#124;─sheathOdDvStart | number | 护套外径判断值起始范围 |
| &ensp;&ensp;&#124;─sheathOdDvEnd | number | 护套外径判断值结束范围 |
| &ensp;&ensp;&#124;─insulUnagedEiMvsDv | number | 绝缘延伸率中间值判断值 |
| &ensp;&ensp;&#124;─insulUnagedTsMvsDv | number | 绝缘抗张中间值判断值 |
| &ensp;&ensp;&#124;─insulAgingEiMvsDv | number | 绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─insulAgingTsMvsDv | number | 绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─sheathUnagedEiMvsDv | number | 护套延伸率中间值判断值 |
| &ensp;&ensp;&#124;─sheathUnagedTsMvsDv | number | 护套抗张中间值判断值 |
| &ensp;&ensp;&#124;─sheathAgingEiMvsDv | number | 护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─sheathAgingTsMvsDv | number | 护套老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltage | number | 绝缘耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltageTime | number | 绝缘耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltage | number | 成品耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltageTime | number | 成品耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─gbTbfStartDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，上夹具下缘与碳化起始点距离 |
| &ensp;&ensp;&#124;─gbTbfBurningDistance | number | GB/T 18380.12-2008单根电线垂直蔓延燃烧试验供火60S，向下延燃至上夹具下缘距离 |
| &ensp;&ensp;&#124;─sheathThkTd11 | number | 护套厚度测试数据11 |
| &ensp;&ensp;&#124;─sheathThkTd12 | number | 护套厚度测试数据12 |
| &ensp;&ensp;&#124;─sheathThkTd13 | number | 护套厚度测试数据13 |
| &ensp;&ensp;&#124;─sheathThkTd14 | number | 护套厚度测试数据14 |
| &ensp;&ensp;&#124;─sheathThkTd15 | number | 护套厚度测试数据15 |
| &ensp;&ensp;&#124;─sheathThkTd16 | number | 护套厚度测试数据16 |
| &ensp;&ensp;&#124;─sheathThkTd17 | number | 护套厚度测试数据17 |
| &ensp;&ensp;&#124;─sheathThkTd18 | number | 护套厚度测试数据18 |
| &ensp;&ensp;&#124;─spgLengthEmptyWeight | number | 比长L空重 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd1 | number | 平行软线撕裂前厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd2 | number | 平行软线撕裂前厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd3 | number | 平行软线撕裂前厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd4 | number | 平行软线撕裂前厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd5 | number | 平行软线撕裂前厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingTd6 | number | 平行软线撕裂前厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd1 | number | 平行软线撕裂后厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd2 | number | 平行软线撕裂后厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd3 | number | 平行软线撕裂后厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd4 | number | 平行软线撕裂后厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd5 | number | 平行软线撕裂后厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingTd6 | number | 平行软线撕裂后厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd1 | number | 平行软线隔离筋厚度测试数据1 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd2 | number | 平行软线隔离筋厚度测试数据2 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd3 | number | 平行软线隔离筋厚度测试数据3 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd4 | number | 平行软线隔离筋厚度测试数据4 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd5 | number | 平行软线隔离筋厚度测试数据5 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarTd6 | number | 平行软线隔离筋厚度测试数据6 |
| &ensp;&ensp;&#124;─parallelCordBeforeTearingDv | number | 平行软线撕裂前厚度判断值 |
| &ensp;&ensp;&#124;─parallelCordAfterTearingDv | number | 平行软线撕裂后厚度判断值 |
| &ensp;&ensp;&#124;─parallelCordSpacerBarDv | number | 平行软线隔离筋厚度判断值 |
| &ensp;&ensp;&#124;─insulTsTime | number | 绝缘热冲击时间/h |
| &ensp;&ensp;&#124;─insulTsTemp | number | 绝缘热冲击温度/℃ |
| &ensp;&ensp;&#124;─sheathTsTime | number | 护套热冲击时间/h |
| &ensp;&ensp;&#124;─sheathTsTemp | number | 护套热冲击温度/℃ |
| &ensp;&ensp;&#124;─insulLtBendTemp | number | 绝缘低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─insulLtBendTime | number | 绝缘低温弯曲时间/H |
| &ensp;&ensp;&#124;─insulLtBendLenght | number | 绝缘低温弯曲长度 |
| &ensp;&ensp;&#124;─sheathLtBendTemp | number | 护套低温弯曲温度/℃ |
| &ensp;&ensp;&#124;─sheathLtBendTime | number | 护套低温弯曲时间/H |
| &ensp;&ensp;&#124;─sheathLtBendLenght | number | 护套低温弯曲长度 |
| &ensp;&ensp;&#124;─insulHtgDv | number | 绝缘加热变形判断值 |
| &ensp;&ensp;&#124;─sheathHtgDv | number | 护套加热变形判断值 |
| &ensp;&ensp;&#124;─sheathSurfaceR | number | 护套表面电阻 |
| &ensp;&ensp;&#124;─sheathSurfaceRDv | number | 护套表面电阻判断值 |
| &ensp;&ensp;&#124;─csaDv | number | 截面积判断值 |
| &ensp;&ensp;&#124;─spindleNum | number | 锭子总数 |
| &ensp;&ensp;&#124;─spindleRootNum | number | 每锭根数 |
| &ensp;&ensp;&#124;─singleShieldDiameter | number | 屏蔽单根直径 |
| &ensp;&ensp;&#124;─pitch | number | 节距 |
| &ensp;&ensp;&#124;─shieldDiameter | number | 屏蔽层直径 |
| &ensp;&ensp;&#124;─insulOdDv | number | 绝缘外径判断值 |
| &ensp;&ensp;&#124;─peelStrengthTd1 | number | 剥离力测试数据1 |
| &ensp;&ensp;&#124;─peelStrengthTd2 | number | 剥离力测试数据2 |
| &ensp;&ensp;&#124;─peelStrengthTd3 | number | 剥离力测试数据3 |
| &ensp;&ensp;&#124;─peelStrengthTd4 | number | 剥离力测试数据4 |
| &ensp;&ensp;&#124;─ltBendBreakdown | string | 低温弯曲是否无击穿 |
| &ensp;&ensp;&#124;─ltBendLenght | number | 低温弯曲长度 |
| &ensp;&ensp;&#124;─thcLenght | number | 温湿度循环长度 |
| &ensp;&ensp;&#124;─thcLn | number | 温湿度循环圈数 |
| &ensp;&ensp;&#124;─thcCrack | string | 温湿度循环是否无击穿 |
| &ensp;&ensp;&#124;─hotWaterResistanceLenght | number | 耐热水长度 |
| &ensp;&ensp;&#124;─hotWaterResistanceLn | number | 耐热水圈数 |
| &ensp;&ensp;&#124;─hotWaterResistanceCrack | string | 耐热水是否无击穿 |
| &ensp;&ensp;&#124;─hotWaterResistanceForward | number | 耐热水测试值(正向) |
| &ensp;&ensp;&#124;─hotWaterResistanceReverse | number | 耐热水测试值(反向) |
| &ensp;&ensp;&#124;─waterResistanceGasolineLn | number | 耐液体性汽油圈数 |
| &ensp;&ensp;&#124;─waterResistanceGasolineTd | number | 耐液体性汽油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceGasolinePct | number | 耐液体性汽油百分比 |
| &ensp;&ensp;&#124;─waterResistanceGasolineCrack | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEthanolLn | number | 耐液体性乙醇圈数 |
| &ensp;&ensp;&#124;─waterResistanceEthanolTd | number | 耐液体性乙醇测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEthanolPct | number | 耐液体性乙醇百分比 |
| &ensp;&ensp;&#124;─waterResistanceEthanolCrack | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilLn | number | 耐液体性柴油圈数 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilTd | number | 耐液体性柴油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilPct | number | 耐液体性柴油百分比 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilCrack | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Ln | number | 耐液体性IRM-902圈数 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Td | number | 耐液体性IRM-902测试数据 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Pct | number | 耐液体性IRM-902百分比 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Crack | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Ln | number | 耐液体性IRM-903圈数 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Td | number | 耐液体性IRM-903测试数据 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Pct | number | 耐液体性IRM-903百分比 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Crack | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAtfLn | number | 耐液体性自动排挡液圈数 |
| &ensp;&ensp;&#124;─waterResistanceAtfTd | number | 耐液体性自动排挡液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceAtfPct | number | 耐液体性自动排挡液百分比 |
| &ensp;&ensp;&#124;─waterResistanceAtfCrack | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeLn | number | 耐液体性防冻液圈数 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeTd | number | 耐液体性防冻液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezePct | number | 耐液体性防冻液百分比 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeCrack | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidLn | number | 耐液体性电池酸圈数 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidTd | number | 耐液体性电池酸测试数据 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidPct | number | 耐液体性电池酸百分比 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidCrack | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&#124;─frSelfExtinguishingDv | number | 阻燃试验自熄判断值 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTime | number | 阻燃试验自熄时间 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd1 | number | 阻燃试验自熄测试值1 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd2 | number | 阻燃试验自熄测试值2 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd3 | number | 阻燃试验自熄测试值3 |
| &ensp;&ensp;&#124;─frUnburnedTd1 | number | 阻燃试验未燃测试值1 |
| &ensp;&ensp;&#124;─frUnburnedTd2 | number | 阻燃试验未燃测试值2 |
| &ensp;&ensp;&#124;─frUnburnedTd3 | number | 阻燃试验未燃测试值3 |
| &ensp;&ensp;&#124;─hte | number | 热延伸率 |
| &ensp;&ensp;&#124;─dielectricPok | string | 耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─peelStrength | number | 剥离力 |
| &ensp;&ensp;&#124;─hthpTemp | number | 高温压力温度 |
| &ensp;&ensp;&#124;─hthpCrack | string | 高温压力是否开裂 |
| &ensp;&ensp;&#124;─lowTemperatureWindingWeight | number | 低温卷绕重量/kg |
| &ensp;&ensp;&#124;─lowTemperatureWindingLn | number | 低温卷绕圈数 |
| &ensp;&ensp;&#124;─lowTemperatureWindingCrack | string | 低温卷绕是否开裂 |
| &ensp;&ensp;&#124;─arDv | number | 耐磨性（刮磨）判断值 |
| &ensp;&ensp;&#124;─ar | number | 耐磨性（刮磨）测试值 |
| &ensp;&ensp;&#124;─longTermAgingTemp | number | 长期老化摄氏度 |
| &ensp;&ensp;&#124;─longTermAgingLn | number | 长期老化圈数 |
| &ensp;&ensp;&#124;─longTermAgingCrack | string | 长期老化是否开裂 |
| &ensp;&ensp;&#124;─shortTermAgingTemp | number | 短期老化摄氏度 |
| &ensp;&ensp;&#124;─shortTermAgingLn | number | 短期老化圈数 |
| &ensp;&ensp;&#124;─shortTermAgingWeight | number | 短期老化重量/kg |
| &ensp;&ensp;&#124;─shortTermAgingCrack | string | 短期老化是否开裂 |
| &ensp;&ensp;&#124;─thermalOverloadLn | number | 热过载圈数 |
| &ensp;&ensp;&#124;─thermalOverloadCrack | string | 热过载是否开裂 |
| &ensp;&ensp;&#124;─thermalShrinkage | number | 热收缩测试值 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationLn | number | 温湿度交变圈数 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationTemp1 | number | 温湿度交变摄氏度1 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationTemp2 | number | 温湿度交变摄氏度2 |
| &ensp;&ensp;&#124;─temperatureHumidityHlternationCrack | string | 温湿度交变是否开裂 |
| &ensp;&ensp;&#124;─ozoneResistanceLn | number | 耐臭氧圈数 |
| &ensp;&ensp;&#124;─ozoneResistancePok | string | 耐臭氧是否击穿 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantLn | number | 耐液体性发动机冷却液圈数 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantTd | number | 耐液体性发动机冷却液测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantPct | number | 耐液体性发动机冷却液百分比 |
| &ensp;&ensp;&#124;─waterResistanceEngineCoolantCrack | string | 耐液体性发动机冷却液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilLn | number | 耐液体性发动机润滑油圈数 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilTd | number | 耐液体性发动机润滑油测试数据 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilPct | number | 耐液体性发动机润滑油百分比 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilCrack | string | 耐液体性发动机润滑油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidLn | number | 耐液体性转向助力液圈数 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidTd | number | 耐液体性转向助力液测试数据 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPct | number | 耐液体性转向助力液百分比 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidCrack | string | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidPok | string | 耐液体性电池酸是否无击穿 |
| &ensp;&ensp;&#124;─frFireSupplyTime | number | 阻燃试验供火时间 |
| &ensp;&ensp;&#124;─adhesionDv | number | 附着力判断值 |
| &ensp;&ensp;&#124;─adhesionTd1 | number | 附着力测试数据1 |
| &ensp;&ensp;&#124;─adhesionTd2 | number | 附着力测试数据2 |
| &ensp;&ensp;&#124;─adhesionTd3 | number | 附着力测试数据3 |
| &ensp;&ensp;&#124;─adhesionTd4 | number | 附着力测试数据4 |
| &ensp;&ensp;&#124;─adhesionTd5 | number | 附着力测试数据5 |
| &ensp;&ensp;&#124;─htgTemp | number | 加热变形摄氏度 |
| &ensp;&ensp;&#124;─htgCrack | string | 加热变形是否无开裂 |
| &ensp;&ensp;&#124;─htgPok | string | 加热变形是否无击穿 |
| &ensp;&ensp;&#124;─ltBendWeight | number | 低温弯曲重量 |
| &ensp;&ensp;&#124;─lowTemperatureImpactPok | string | 低温冲击是否无击穿 |
| &ensp;&ensp;&#124;─hr1ATemp | number | 耐热性1(A)摄氏度 |
| &ensp;&ensp;&#124;─hr1ATime | number | 耐热性1(A)时间 |
| &ensp;&ensp;&#124;─hr1ALenght | number | 耐热性1(A)长度 |
| &ensp;&ensp;&#124;─hr1AWeight | number | 耐热性1(A)重量 |
| &ensp;&ensp;&#124;─hr1ACrack | string | 耐热性1(A)是否无开裂 |
| &ensp;&ensp;&#124;─hr1APok | string | 耐热性1(A)是否无击穿 |
| &ensp;&ensp;&#124;─hr1BTemp | number | 耐热性1(B)摄氏度 |
| &ensp;&ensp;&#124;─hr1BTime | number | 耐热性1(B)时间 |
| &ensp;&ensp;&#124;─hr1BLenght | number | 耐热性1(B)长度 |
| &ensp;&ensp;&#124;─hr1BWeight | number | 耐热性1(B)重量 |
| &ensp;&ensp;&#124;─hr1BCrack | string | 热性1(B)是否无开裂 |
| &ensp;&ensp;&#124;─hr1BPok | string | 耐热性1(B)是否无击穿 |
| &ensp;&ensp;&#124;─hr1CCrack | string | 耐热性1(C)是否无开裂 |
| &ensp;&ensp;&#124;─waterResistanceGasolinePok | string | 耐液体性汽油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilPok | string | 耐液体性柴油是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceEthanolPok | string | 耐液体性乙醇是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAtfPok | string | 耐液体性自动排挡液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezePok | string | 耐液体性防冻液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm902Pok | string | 耐液体性IRM-902是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceIrm903Pok | string | 耐液体性IRM-903是否无击穿 |
| &ensp;&ensp;&#124;─frSelfExtinguishingTd | number | 阻燃试验自熄测试值 |
| &ensp;&ensp;&#124;─tsLenght | number | 热冲击长度 |
| &ensp;&ensp;&#124;─hotStretchLoadLenght | number | 热延伸试验负荷下长度 |
| &ensp;&ensp;&#124;─hotStretchCoolingLenght | number | 热延伸试验冷却后长度 |
| &ensp;&ensp;&#124;─signContinuity | number | 标志连续性 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltage | number | 浸水工频电压试验耐压 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltageVoltageTime | object | 浸水工频电压试验耐压时间 |
| &ensp;&ensp;&#124;─immersionPowerFrequencyVoltagePok | object | 浸水工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTemp | object | 室温工频电压试验摄氏度 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageTime | object | 室温工频电压试验时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLenght | object | 室温工频电压试验长度 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageLn | object | 室温工频电压试验圈数 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltage | object | 室温工频电压试验未老化样品耐压 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageUnagedVoltageTime | object | 室温工频电压试验未老化样品耐压时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltage | object | 室温工频电压试验老化样品耐压 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltageAgingVoltageTime | object | 室温工频电压试验老化样品耐压时间 |
| &ensp;&ensp;&#124;─roomTempPowerFrequencyVoltagePok | object | 室温工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTemp | object | 额定温度工频电压试验摄氏度 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageTime | object | 额定温度工频电压试验时间 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageRoastTemp | object | 额定温度工频电压试验烤摄氏度 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltage | object | 额定温度工频电压试验烤耐压 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltageVoltageTime | object | 额定温度工频电压试验耐压时间 |
| &ensp;&ensp;&#124;─ratedTempPowerFrequencyVoltagePok | object | 额定温度工频电压试验是否无击穿 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd1 | object | 水平燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd2 | object | 水平燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonHorizontalTd3 | object | 水平燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd1 | object | 垂直燃烧棉花是否点燃测试数据1 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd2 | object | 垂直燃烧棉花是否点燃测试数据2 |
| &ensp;&ensp;&#124;─lightCottonVerticalTd3 | object | 垂直燃烧棉花是否点燃测试数据3 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据1 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据2 |
| &ensp;&ensp;&#124;─zTbfStartDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，上夹具下缘与碳化起始点距离测试数据3 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd1 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据1 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd2 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据2 |
| &ensp;&ensp;&#124;─zTbfBurningDistanceTd3 | object | 垂直燃烧试验（代号Z或Z1电缆)供火60S，向下延燃至上夹具下缘距离测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd1 | object | 兼容性护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd2 | object | 兼容性护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd3 | object | 兼容性护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd4 | object | 兼容性护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd5 | object | 兼容性护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedElongationTd6 | object | 兼容性护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd1 | object | 兼容性护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd2 | object | 兼容性护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd3 | object | 兼容性护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd4 | object | 兼容性护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd5 | object | 兼容性护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedPullTd6 | object | 兼容性护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd1 | object | 兼容性护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd2 | object | 兼容性护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd3 | object | 兼容性护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd4 | object | 兼容性护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd5 | object | 兼容性护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingElongationTd6 | object | 兼容性护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd1 | object | 兼容性护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd2 | object | 兼容性护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd3 | object | 兼容性护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd4 | object | 兼容性护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd5 | object | 兼容性护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingPullTd6 | object | 兼容性护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─compatibilityInsulUnagedEiMvsDv | object | 兼容性绝缘延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulUnagedTsMvsDv | object | 兼容性绝缘抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingEiMvsDv | object | 兼容性绝缘老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingTsMvsDv | object | 兼容性绝缘老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingEi | object | 兼容性绝缘老化后延伸残率判断值\|\|兼容性绝缘老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─compatibilityInsulAgingTs | object | 兼容性绝缘老化后抗张残率判断值\|\|兼容性绝缘老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedEiMvsDv | object | 兼容性护套延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathUnagedTsMvsDv | object | 兼容性护套抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingEiMvsDv | object | 兼容性护套老化后延伸率中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingTsMvsDv | object | 兼容性护套老化后抗张中间值判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingEi | object | 兼容性护套老化后延伸残率判断值\|\|兼容性护套老化延伸变化率判断值 |
| &ensp;&ensp;&#124;─compatibilitySheathAgingTs | object | 兼容性护套老化后抗张残率判断值\|\|兼容性护套老化抗张变化率判断值 |
| &ensp;&ensp;&#124;─flexureFrequency | object | 曲挠次数 |
| &ensp;&ensp;&#124;─ir90Calc | object | 90℃绝缘电阻 |
| &ensp;&ensp;&#124;─insulDielectricWithstandVoltageCurrent | object | 绝缘耐电压测试电流/M |
| &ensp;&ensp;&#124;─fgDielectricWithstandVoltageCurrent | object | 成品耐电压测试电流/M\|\|护套耐电压测试电流/M |
| &ensp;&ensp;&#124;─sheathOdDv | object | 护套外径判断值 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd1 | object | 耐酸护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd2 | object | 耐酸护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd3 | object | 耐酸护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd4 | object | 耐酸护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd5 | object | 耐酸护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─arSheathUnagedElongationTd6 | object | 耐酸护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd1 | object | 耐酸护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd2 | object | 耐酸护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd3 | object | 耐酸护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd4 | object | 耐酸护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd5 | object | 耐酸护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─arSheathUnagedPullTd6 | object | 耐酸护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd1 | object | 耐酸护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd2 | object | 耐酸护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd3 | object | 耐酸护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd4 | object | 耐酸护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd5 | object | 耐酸护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─arSheathAgingElongationTd6 | object | 耐酸护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd1 | object | 耐酸护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd2 | object | 耐酸护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd3 | object | 耐酸护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd4 | object | 耐酸护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd5 | object | 耐酸护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─arSheathAgingPullTd6 | object | 耐酸护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd1 | object | 耐碱护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd2 | object | 耐碱护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd3 | object | 耐碱护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd4 | object | 耐碱护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd5 | object | 耐碱护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─apSheathUnagedElongationTd6 | object | 耐碱护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd1 | object | 耐碱护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd2 | object | 耐碱护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd3 | object | 耐碱护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd4 | object | 耐碱护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd5 | object | 耐碱护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─apSheathUnagedPullTd6 | object | 耐碱护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd1 | object | 耐碱护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd2 | object | 耐碱护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd3 | object | 耐碱护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd4 | object | 耐碱护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd5 | object | 耐碱护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─apSheathAgingElongationTd6 | object | 耐碱护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd1 | object | 耐碱护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd2 | object | 耐碱护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd3 | object | 耐碱护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd4 | object | 耐碱护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd5 | object | 耐碱护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─apSheathAgingPullTd6 | object | 耐碱护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd1 | object | 热寿命护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd2 | object | 热寿命护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd3 | object | 热寿命护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd4 | object | 热寿命护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd5 | object | 热寿命护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedElongationTd6 | object | 热寿命护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd1 | object | 热寿命护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd2 | object | 热寿命护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd3 | object | 热寿命护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd4 | object | 热寿命护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd5 | object | 热寿命护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathUnagedPullTd6 | object | 热寿命护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd1 | object | 热寿命护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd2 | object | 热寿命护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd3 | object | 热寿命护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd4 | object | 热寿命护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd5 | object | 热寿命护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingElongationTd6 | object | 热寿命护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd1 | object | 热寿命护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd2 | object | 热寿命护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd3 | object | 热寿命护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd4 | object | 热寿命护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd5 | object | 热寿命护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─thermalLifeSheathAgingPullTd6 | object | 热寿命护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathHotStretchLoadHte | object | 护套热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&#124;─sheathHotStretchCoolingHte | object | 护套热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&#124;─dielectricWithstandVoltage | object | 耐电压测试耐压/kv |
| &ensp;&ensp;&#124;─dielectricWithstandVoltageTiem | object | 耐电压测试耐压时间/min |
| &ensp;&ensp;&#124;─cl | object | Cl测试值 |
| &ensp;&ensp;&#124;─br | object | Br测试值 |
| &ensp;&ensp;&#124;─numUl | object | 数量 |
| &ensp;&ensp;&#124;─diameterUlTd1 | object | UL线径测试数据1 |
| &ensp;&ensp;&#124;─diameterUlTd2 | object | UL线径测试数据2 |
| &ensp;&ensp;&#124;─diameterUlTd3 | object | UL线径测试数据3 |
| &ensp;&ensp;&#124;─diameterUlTd4 | object | UL线径测试数据4 |
| &ensp;&ensp;&#124;─diameterUlTd5 | object | UL线径测试数据5 |
| &ensp;&ensp;&#124;─diameterUlTd6 | object | UL线径测试数据6 |
| &ensp;&ensp;&#124;─insulOdUlTd1 | object | UL绝缘外径测试数据1 |
| &ensp;&ensp;&#124;─insulOdUlTd2 | object | UL绝缘外径测试数据2 |
| &ensp;&ensp;&#124;─insulOdUlTd3 | object | UL绝缘外径测试数据3 |
| &ensp;&ensp;&#124;─insulOdUlTd4 | object | UL绝缘外径测试数据4 |
| &ensp;&ensp;&#124;─insulOdUlTd5 | object | UL绝缘外径测试数据5 |
| &ensp;&ensp;&#124;─insulOdUlTd6 | object | UL绝缘外径测试数据6 |
| &ensp;&ensp;&#124;─insulOdUlTd | object | UL绝缘外径测试数据 |
| &ensp;&ensp;&#124;─insulThkUlTd1 | object | UL绝缘厚度测试数据1 |
| &ensp;&ensp;&#124;─insulThkUlTd2 | object | UL绝缘厚度测试数据2 |
| &ensp;&ensp;&#124;─insulThkUlTd3 | object | UL绝缘厚度测试数据3 |
| &ensp;&ensp;&#124;─insulThkUlTd4 | object | UL绝缘厚度测试数据4 |
| &ensp;&ensp;&#124;─insulThkUlTd5 | object | UL绝缘厚度测试数据5 |
| &ensp;&ensp;&#124;─insulThkUlTd6 | object | UL绝缘厚度测试数据6 |
| &ensp;&ensp;&#124;─insulThkUlTd7 | object | UL绝缘厚度测试数据7 |
| &ensp;&ensp;&#124;─insulThkUlTd8 | object | UL绝缘厚度测试数据8 |
| &ensp;&ensp;&#124;─insulThkUlTd9 | object | UL绝缘厚度测试数据9 |
| &ensp;&ensp;&#124;─insulThkUlTd10 | object | UL绝缘厚度测试数据10 |
| &ensp;&ensp;&#124;─sheathThkUlTd1 | object | Ul护套厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathThkUlTd2 | object | Ul护套厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathThkUlTd3 | object | Ul护套厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathThkUlTd4 | object | Ul护套厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathThkUlTd5 | object | Ul护套厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathThkUlTd6 | object | Ul护套厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathThkUlTd7 | object | Ul护套厚度测试数据7 |
| &ensp;&ensp;&#124;─sheathThkUlTd8 | object | Ul护套厚度测试数据8 |
| &ensp;&ensp;&#124;─sheathThkUlTd9 | object | Ul护套厚度测试数据9 |
| &ensp;&ensp;&#124;─sheathThkUlTd10 | object | Ul护套厚度测试数据10 |
| &ensp;&ensp;&#124;─insulAvgThkUl | object | 绝缘平均厚度判断值 |
| &ensp;&ensp;&#124;─insulMinThkUl | object | 绝缘最小厚度判断值 |
| &ensp;&ensp;&#124;─sheathAvgThkUl | object | 护套平均厚度判断值 |
| &ensp;&ensp;&#124;─sheathMinThkUl | object | 护套最小厚度判断值 |
| &ensp;&ensp;&#124;─biTempUl | object | Ul老化条件温度/℃ |
| &ensp;&ensp;&#124;─biTimeUl | object | Ul老化条件时间/H |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd1 | object | Ul护套老化前伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd2 | object | Ul护套老化前伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd3 | object | Ul护套老化前伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd4 | object | Ul护套老化前伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd5 | object | Ul护套老化前伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedElongationUlTd6 | object | Ul护套老化前伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd1 | object | Ul护套老化前拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd2 | object | Ul护套老化前拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd3 | object | Ul护套老化前拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd4 | object | Ul护套老化前拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd5 | object | Ul护套老化前拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathUnagedPullUlTd6 | object | Ul护套老化前拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd1 | object | Ul护套老化后伸长测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd2 | object | Ul护套老化后伸长测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd3 | object | Ul护套老化后伸长测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd4 | object | Ul护套老化后伸长测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd5 | object | Ul护套老化后伸长测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingElongationUlTd6 | object | Ul护套老化后伸长测试数据6 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd1 | object | Ul护套老化后拉力测试数据1 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd2 | object | Ul护套老化后拉力测试数据2 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd3 | object | Ul护套老化后拉力测试数据3 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd4 | object | Ul护套老化后拉力测试数据4 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd5 | object | Ul护套老化后拉力测试数据5 |
| &ensp;&ensp;&#124;─sheathAgingPullUlTd6 | object | Ul护套老化后拉力测试数据6 |
| &ensp;&ensp;&#124;─sheathHotStretchLoadHteIec | object | IEC热延伸试验负荷下热延伸率 |
| &ensp;&ensp;&#124;─sheathHotStretchCoolingHteIec | object | IEC热延伸试验冷却后热延伸率 |
| &ensp;&ensp;&#124;─sheathLtBendLnIec | object | IEC护套低温弯曲圈数/圈 |
| &ensp;&ensp;&#124;─sheathLtBendCrackIec | object | IEC护套低温弯曲是否无开裂 |
| &ensp;&ensp;&#124;─sheathBeforeHeatingTd | object | 加热前值 |
| &ensp;&ensp;&#124;─sheathAfterHeatingTd | object | 加热后值 |
| &ensp;&ensp;&#124;─irCalcIecDv | object | IEC绝缘电阻判断值 |
| &ensp;&ensp;&#124;─dielectricPokIec | object | IEC耐电压测试是否击穿 |
| &ensp;&ensp;&#124;─adhesion | object | 附着力 |
| &ensp;&ensp;&#124;─lowTemperatureWindingDiameter | object | 低温卷绕直径 |
| &ensp;&ensp;&#124;─thermalOverloadDiameter | object | 热过载直径 |
| &ensp;&ensp;&#124;─thermalOverloadWeight | object | 热过载重量 |
| &ensp;&ensp;&#124;─waterResistanceGasolineDiameter | object | 耐液体性汽油直径 |
| &ensp;&ensp;&#124;─waterResistanceDieselOilDiameter | object | 耐液体性柴油直径 |
| &ensp;&ensp;&#124;─waterResistanceEthanolDiameter | object | 耐液体性乙醇直径 |
| &ensp;&ensp;&#124;─waterResistanceBatteryAcidDiameter | object | 耐液体性电池酸直径 |
| &ensp;&ensp;&#124;─waterResistanceEngineOilDiameter | object | 耐液体性发动机润滑油直径 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidDiameter | object | 耐液体性转向助力液直径 |
| &ensp;&ensp;&#124;─waterResistanceAtfDiameter | object | 耐液体性自动排挡液直径\|\|耐液体性自动变速箱油直径 |
| &ensp;&ensp;&#124;─waterResistanceAntifreezeDiameter | object | 耐液体性防冻液直径 |
| &ensp;&ensp;&#124;─powerFrequencyVoltagePok | object | 工频交流电压是否无击穿 |
| &ensp;&ensp;&#124;─breakdownVoltagePok | object | 击穿电压是否无击穿 |
| &ensp;&ensp;&#124;─hthpTd | object | 高温压力测试值 |
| &ensp;&ensp;&#124;─thermalShrinkageOriginalLength | object | 热收缩原长 |
| &ensp;&ensp;&#124;─thermalShrinkageHeatingLenght | object | 热收缩加热后长 |
| &ensp;&ensp;&#124;─overheatCrack | object | 过热试验是否无开裂 |
| &ensp;&ensp;&#124;─lowTemperatureImpact4hrCrack | object | 低温冲击4hr是否无开裂 |
| &ensp;&ensp;&#124;─adhesionFallOff | object | 附着力是否无脱落 |
| &ensp;&ensp;&#124;─peelEasy | object | 剥离是否容易 |
| &ensp;&ensp;&#124;─oilResistantCrack | object | 耐油是否无开裂 |
| &ensp;&ensp;&#124;─fuelResistantCrack | object | 耐燃料是否无开裂 |
| &ensp;&ensp;&#124;─arWeight | object | 耐磨性重量 |
| &ensp;&ensp;&#124;─withstandVoltageDielectricText | object | 耐电压测试介电文字 |
| &ensp;&ensp;&#124;─withstandVoltageDielectricImmersion | object | 耐电压测试介电浸水 |
| &ensp;&ensp;&#124;─withstandVoltageVoltage | object | 耐电压测试电压 |
| &ensp;&ensp;&#124;─withstandVoltageRaiseVoltage | object | 耐电压测试升高电压 |
| &ensp;&ensp;&#124;─shortTermAgingDiameter | object | 短期老化直径 |
| &ensp;&ensp;&#124;─waterResistancePowerSteeringFluidPok | object | 耐液体性转向助力液是否无击穿 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidLn | object | 耐液体性制动液圈数 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidCrack | object | 耐液体性制动液是否无开裂 |
| &ensp;&ensp;&#124;─waterResistanceBrakeFluidPok | object | 耐液体性制动液是否无击穿 |
| &ensp;&ensp;&#124;─windingHeatingLn | object | 卷绕加热圈数 |
| &ensp;&ensp;&#124;─windingHeatingCrack | object | 卷绕加热是否开裂 |
| &ensp;&ensp;&#124;─windingHeatingDiameter | object | 卷绕加热直径 |
| &ensp;&ensp;&#124;─ir20Length | object | 20℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir20Td | object | 20℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─ir20CalcDv | object | 20℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─ir60Length | object | 60℃绝缘电阻长 |
| &ensp;&ensp;&#124;─ir60Td | object | 60℃绝缘电阻测试数据 |
| &ensp;&ensp;&#124;─ir60CalcDv | object | 60℃绝缘电阻判断值 |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltage | object | 耐电压测试(浸水)耐压/kv |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltageTime | object | 耐电压测试(浸水)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricImmersionWithstandVoltagePok | object | 耐电压测试(浸水)是否击穿 |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltage | object | 耐电压测试(空气)耐压/kv |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltageTime | object | 耐电压测试(空气)耐压时间/min |
| &ensp;&ensp;&#124;─dielectricAirWithstandVoltagePok | object | 耐电压测试(空气)是否击穿 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd1 | object | 护套哑铃片老化前厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd2 | object | 护套哑铃片老化前厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd3 | object | 护套哑铃片老化前厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd4 | object | 护套哑铃片老化前厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd5 | object | 护套哑铃片老化前厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceUnagedThkTd6 | object | 护套哑铃片老化前厚度测试数据6 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd1 | object | 护套哑铃片老化后厚度测试数据1 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd2 | object | 护套哑铃片老化后厚度测试数据2 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd3 | object | 护套哑铃片老化后厚度测试数据3 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd4 | object | 护套哑铃片老化后厚度测试数据4 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd5 | object | 护套哑铃片老化后厚度测试数据5 |
| &ensp;&ensp;&#124;─sheathDumbbellSliceAgingThkTd6 | object | 护套哑铃片老化后厚度测试数据6 |
| &ensp;&ensp;&#124;─tsText | object | 热冲击文本 |
| &ensp;&ensp;&#124;─ltBendText | object | 低温弯曲文本 |
| &ensp;&ensp;&#124;─flexibilityText | object | 柔韧性文本 |
| &ensp;&ensp;&#124;─sheathAgingCt | object | 护套老化计算模板 |
| &ensp;&ensp;&#124;─htgDeformationRateCt | object | 加热变形计算模板 |
| &ensp;&ensp;&#124;─htgFrontDiameter | object | 加热变形前线径测试数据 |
| &ensp;&ensp;&#124;─htgRearDiameter | object | 加热变形后线径测试数据 |
| &ensp;&ensp;&#124;─htgMandrelDiameter | object | 加热变形心棒直径测试数据 |
| &ensp;&ensp;&#124;─irCalcDvText | object | 绝缘电阻判断文本 |
| &ensp;&ensp;&#124;─irCalcDvResult | object | 绝缘电阻判断结果 |
| &ensp;&ensp;&#124;─irCalcTemp | object | 绝缘电阻温度 |
| &ensp;&ensp;&#124;─insulTsDiameter | object | 绝缘热冲击直径 |
| &ensp;&ensp;&#124;─sheathTsDiameter | object | 护套热冲击直径 |
| &ensp;&ensp;&#124;─insulLtBendDiameter | object | 绝缘低温弯曲直径 |
| &ensp;&ensp;&#124;─sheathLtBendDiameter | object | 护套低温弯曲直径 |
| &ensp;&ensp;&#124;─hotWaterResistanceForwardSampleLength | object | 耐热水测试值MΩ(正向) |
| &ensp;&ensp;&#124;─hotWaterResistanceReverseSampleLength | object | 耐热水测试值MΩ(反向) |
| visible | object | 是否显示 |

**Request Demo:**

```json
{
  "report": {
    "customerName": "",
    "submitter": "",
    "testBasis": "",
    "productName": "",
    "specification": "",
    "reportNo": "",
    "submitterDate": "",
    "sampleStatus": "",
    "startTestDate": "",
    "endTestDate": "",
    "majorMeasured": "",
    "checked": "",
    "approved": "",
    "certigier": "",
    "createTime": "",
    "createUserId": "",
    "createUserName": "",
    "description": "",
    "wireType": "",
    "updateTime": "",
    "updateUserId": "",
    "updateUserName": ""
  },
  "wireList": [
    {
      "reportNo": "",
      "id": 0,
      "num": 0,
      "color": "",
      "diameterTd1": 0.0,
      "diameterTd2": 0.0,
      "diameterTd3": 0.0,
      "diameterTd4": 0.0,
      "diameterTd5": 0.0,
      "diameterTd6": 0.0,
      "insulOdTd1": 0.0,
      "insulOdTd2": 0.0,
      "insulOdTd3": 0.0,
      "insulOdTd4": 0.0,
      "insulOdTd5": 0.0,
      "insulOdTd6": 0.0,
      "insulThkTd1": 0.0,
      "insulThkTd2": 0.0,
      "insulThkTd3": 0.0,
      "insulThkTd4": 0.0,
      "insulThkTd5": 0.0,
      "insulThkTd6": 0.0,
      "insulThkTd7": 0.0,
      "insulThkTd8": 0.0,
      "insulThkTd9": 0.0,
      "insulThkTd10": 0.0,
      "insulUnagedElongationTd1": 0.0,
      "insulUnagedElongationTd2": 0.0,
      "insulUnagedElongationTd3": 0.0,
      "insulUnagedElongationTd4": 0.0,
      "insulUnagedElongationTd5": 0.0,
      "insulUnagedElongationTd6": 0.0,
      "insulUnagedPullTd1": 0.0,
      "insulUnagedPullTd2": 0.0,
      "insulUnagedPullTd3": 0.0,
      "insulUnagedPullTd4": 0.0,
      "insulUnagedPullTd5": 0.0,
      "insulUnagedPullTd6": 0.0,
      "insulAgingElongationTd1": 0.0,
      "insulAgingElongationTd2": 0.0,
      "insulAgingElongationTd3": 0.0,
      "insulAgingElongationTd4": 0.0,
      "insulAgingElongationTd5": 0.0,
      "insulAgingElongationTd6": 0.0,
      "insulAgingPullTd1": 0.0,
      "insulAgingPullTd2": 0.0,
      "insulAgingPullTd3": 0.0,
      "insulAgingPullTd4": 0.0,
      "insulAgingPullTd5": 0.0,
      "insulAgingPullTd6": 0.0,
      "htgFrontAvgDiameter": 0.0,
      "htgRearAvgDiameter": 0.0,
      "conductor20DcrTd": 0.0,
      "irLength": 0.0,
      "irTd": 0.0,
      "materialQuality": "",
      "insulMaterialQuality": "",
      "firty807Unaged": 0.0,
      "second807Aging": 0.0,
      "insulHthp": 0.0,
      "insulThkTd11": 0.0,
      "insulThkTd12": 0.0,
      "insulThkTd13": 0.0,
      "insulThkTd14": 0.0,
      "insulThkTd15": 0.0,
      "insulThkTd16": 0.0,
      "insulThkTd17": 0.0,
      "insulThkTd18": 0.0,
      "compatibilityInsulUnagedElongationTd1": 0.0,
      "compatibilityInsulUnagedElongationTd2": 0.0,
      "compatibilityInsulUnagedElongationTd3": 0.0,
      "compatibilityInsulUnagedElongationTd4": 0.0,
      "compatibilityInsulUnagedElongationTd5": 0.0,
      "compatibilityInsulUnagedElongationTd6": 0.0,
      "compatibilityInsulUnagedPullTd1": 0.0,
      "compatibilityInsulUnagedPullTd2": 0.0,
      "compatibilityInsulUnagedPullTd3": 0.0,
      "compatibilityInsulUnagedPullTd4": 0.0,
      "compatibilityInsulUnagedPullTd5": 0.0,
      "compatibilityInsulUnagedPullTd6": 0.0,
      "compatibilityInsulAgingElongationTd1": 0.0,
      "compatibilityInsulAgingElongationTd2": 0.0,
      "compatibilityInsulAgingElongationTd3": 0.0,
      "compatibilityInsulAgingElongationTd4": 0.0,
      "compatibilityInsulAgingElongationTd5": 0.0,
      "compatibilityInsulAgingElongationTd6": 0.0,
      "compatibilityInsulAgingPullTd1": 0.0,
      "compatibilityInsulAgingPullTd2": 0.0,
      "compatibilityInsulAgingPullTd3": 0.0,
      "compatibilityInsulAgingPullTd4": 0.0,
      "compatibilityInsulAgingPullTd5": 0.0,
      "compatibilityInsulAgingPullTd6": 0.0,
      "thermalLifeInsulUnagedElongationTd1": 0.0,
      "thermalLifeInsulUnagedElongationTd2": 0.0,
      "thermalLifeInsulUnagedElongationTd3": 0.0,
      "thermalLifeInsulUnagedElongationTd4": 0.0,
      "thermalLifeInsulUnagedElongationTd5": 0.0,
      "thermalLifeInsulUnagedElongationTd6": 0.0,
      "thermalLifeInsulUnagedPullTd1": 0.0,
      "thermalLifeInsulUnagedPullTd2": 0.0,
      "thermalLifeInsulUnagedPullTd3": 0.0,
      "thermalLifeInsulUnagedPullTd4": 0.0,
      "thermalLifeInsulUnagedPullTd5": 0.0,
      "thermalLifeInsulUnagedPullTd6": 0.0,
      "thermalLifeInsulAgingElongationTd1": 0.0,
      "thermalLifeInsulAgingElongationTd2": 0.0,
      "thermalLifeInsulAgingElongationTd3": 0.0,
      "thermalLifeInsulAgingElongationTd4": 0.0,
      "thermalLifeInsulAgingElongationTd5": 0.0,
      "thermalLifeInsulAgingElongationTd6": 0.0,
      "thermalLifeInsulAgingPullTd1": 0.0,
      "thermalLifeInsulAgingPullTd2": 0.0,
      "thermalLifeInsulAgingPullTd3": 0.0,
      "thermalLifeInsulAgingPullTd4": 0.0,
      "thermalLifeInsulAgingPullTd5": 0.0,
      "thermalLifeInsulAgingPullTd6": 0.0,
      "insulHotStretchLoadHte": 0.0,
      "insulHotStretchCoolingHte": 0.0,
      "irCalc": 0.0,
      "irCalcIec": 0.0
    }
  ],
  "publicData": {
    "reportNo": "",
    "printingErasibilit": "",
    "conductorCorrosion": "",
    "tsCrack": "",
    "ltBendCrack": "",
    "flexibilityCrack": "",
    "dielectricIiiPok": "",
    "dielectricIPok": "",
    "hvdcWirePok": "",
    "lightCottonVw1Td1": "",
    "lightCottonVw1Td2": "",
    "lightCottonVw1Td3": "",
    "lightCottonFt2Td1": "",
    "lightCottonFt2Td2": "",
    "lightCottonFt2Td3": "",
    "lightCottonUlTd1": "",
    "lightCottonUlTd2": "",
    "lightCottonUlTd3": "",
    "sheathMaterialQuality": "",
    "insulTsCrack": "",
    "sheathTsCrack": "",
    "insulLtBendCrack": "",
    "sheathLtBendCrack": "",
    "lowTemperatureImpactCrack": "",
    "thermalStability": 0.0,
    "flexureTest": "",
    "insulDielectricPok": "",
    "fgDielectricPok": "",
    "sheathOdTd1": 0.0,
    "sheathOdTd2": 0.0,
    "sheathOdTd3": 0.0,
    "sheathOdTd4": 0.0,
    "sheathOdTd5": 0.0,
    "sheathOdTd6": 0.0,
    "sheathThkTd1": 0.0,
    "sheathThkTd2": 0.0,
    "sheathThkTd3": 0.0,
    "sheathThkTd4": 0.0,
    "sheathThkTd5": 0.0,
    "sheathThkTd6": 0.0,
    "sheathUnagedElongationTd1": 0.0,
    "sheathUnagedElongationTd2": 0.0,
    "sheathUnagedElongationTd3": 0.0,
    "sheathUnagedElongationTd4": 0.0,
    "sheathUnagedElongationTd5": 0.0,
    "sheathUnagedElongationTd6": 0.0,
    "sheathUnagedPullTd1": 0.0,
    "sheathUnagedPullTd2": 0.0,
    "sheathUnagedPullTd3": 0.0,
    "sheathUnagedPullTd4": 0.0,
    "sheathUnagedPullTd5": 0.0,
    "sheathUnagedPullTd6": 0.0,
    "sheathAgingElongationTd1": 0.0,
    "sheathAgingElongationTd2": 0.0,
    "sheathAgingElongationTd3": 0.0,
    "sheathAgingElongationTd4": 0.0,
    "sheathAgingElongationTd5": 0.0,
    "sheathAgingElongationTd6": 0.0,
    "sheathAgingPullTd1": 0.0,
    "sheathAgingPullTd2": 0.0,
    "sheathAgingPullTd3": 0.0,
    "sheathAgingPullTd4": 0.0,
    "sheathAgingPullTd5": 0.0,
    "sheathAgingPullTd6": 0.0,
    "csgFrontThk": 0.0,
    "csgRearThk": 0.0,
    "spgLength": 0.0,
    "spgEmptyWeight": 0.0,
    "spgWaterWeight": 0.0,
    "hteMarkLength": 0.0,
    "hteExtensionLength": 0.0,
    "sheathThkTd7": 0.0,
    "sheathThkTd8": 0.0,
    "sheathThkTd9": 0.0,
    "sheathThkTd10": 0.0,
    "insulAvgThk": 0.0,
    "insulMinThk": 0.0,
    "sheathAvgThk": 0.0,
    "sheathMinThk": 0.0,
    "insulBiTemp": 0.0,
    "insulBiTime": 0.0,
    "insulUnagedEi": 0.0,
    "insulUnagedTs": 0.0,
    "insulAgingEi": 0.0,
    "insulAgingTs": 0.0,
    "sheathBiTemp": 0.0,
    "sheathBiTime": 0.0,
    "sheathUnagedEi": 0.0,
    "sheathUnagedTs": 0.0,
    "sheathAgingEi": 0.0,
    "sheathAgingTs": 0.0,
    "conductorCorrosionTemp": 0.0,
    "conductorCorrosionTime": 0.0,
    "tsTemp": 0.0,
    "tsTime": 0.0,
    "tsLn": 0.0,
    "ltBendTemp": 0.0,
    "ltBendTime": 0.0,
    "ltBendLn": 0.0,
    "flexibilityTemp": 0.0,
    "flexibilityTime": 0.0,
    "flexibilityLn": 0.0,
    "conductor20Dcr": 0.0,
    "dielectricIiiWithstandVoltage": 0.0,
    "dielectricIiiWithstandVoltageTime": 0.0,
    "dielectricINum": 0.0,
    "dielectricITemp": 0.0,
    "dielectricITime": 0.0,
    "dielectricIGirth": 0.0,
    "dielectricILn": 0.0,
    "dielectricIWithstandVoltage": 0.0,
    "dielectricIWithstandVoltageTiem": 0.0,
    "dielectricIPokNum": 0.0,
    "hvdcWireNum": 0.0,
    "hvdcWireBakingTemp": 0.0,
    "hvdcWireBakingTime": 0.0,
    "hvdcWireDischargeTemp": 0.0,
    "hvdcWireDischargePct": 0.0,
    "hvdcWireDischargeTime": 0.0,
    "hvdcWireTestBar": 0.0,
    "hvdcWireLn": 0.0,
    "hvdcWireDcv": 0.0,
    "hvdcWireDcvTime": 0.0,
    "firstFlameRetardingTd1": 0.0,
    "firstFlameRetardingTd2": 0.0,
    "firstFlameRetardingTd3": 0.0,
    "secondFlameRetardingTd1": 0.0,
    "secondFlameRetardingTd2": 0.0,
    "secondFlameRetardingTd3": 0.0,
    "thirdFlameRetardingTd1": 0.0,
    "thirdFlameRetardingTd2": 0.0,
    "thirdFlameRetardingTd3": 0.0,
    "fourthFlameRetardingTd1": 0.0,
    "fourthFlameRetardingTd2": 0.0,
    "fourthFlameRetardingTd3": 0.0,
    "fifthFlameRetardingTd1": 0.0,
    "fifthFlameRetardingTd2": 0.0,
    "fifthFlameRetardingTd3": 0.0,
    "flagBurningAreaTd1": 0.0,
    "flagBurningAreaTd2": 0.0,
    "flagBurningAreaTd3": 0.0,
    "burningAfterLenghtTd1": 0.0,
    "burningAfterLenghtTd2": 0.0,
    "burningAfterLenghtTd3": 0.0,
    "burningTimeTd1": 0.0,
    "burningTimeTd2": 0.0,
    "burningTimeTd3": 0.0,
    "thermalElongation": 0.0,
    "avgOdUbv": 0.0,
    "sectionMax": 0.0,
    "sectionMin": 0.0,
    "sheathFirty807Unaged": 0.0,
    "sheathSecond807Aging": 0.0,
    "insulTsLength": 0.0,
    "insulTsLn": 0.0,
    "sheathTsLength": 0.0,
    "sheathTsLn": 0.0,
    "insulLtBendLn": 0.0,
    "sheathLtBendLn": 0.0,
    "lowTemperatureImpact": 0.0,
    "sheathHthp": 0.0,
    "printingSpaceDv": 0.0,
    "printingSpace": 0.0,
    "ir90Length": 0.0,
    "ir90Td": 0.0,
    "irCalcDv": 0.0,
    "ir90CalcDv": 0.0,
    "diameterTdAvgDv": 0.0,
    "sheathOdDvStart": 0.0,
    "sheathOdDvEnd": 0.0,
    "insulUnagedEiMvsDv": 0.0,
    "insulUnagedTsMvsDv": 0.0,
    "insulAgingEiMvsDv": 0.0,
    "insulAgingTsMvsDv": 0.0,
    "sheathUnagedEiMvsDv": 0.0,
    "sheathUnagedTsMvsDv": 0.0,
    "sheathAgingEiMvsDv": 0.0,
    "sheathAgingTsMvsDv": 0.0,
    "insulDielectricWithstandVoltage": 0.0,
    "insulDielectricWithstandVoltageTime": 0.0,
    "fgDielectricWithstandVoltage": 0.0,
    "fgDielectricWithstandVoltageTime": 0.0,
    "gbTbfStartDistance": 0.0,
    "gbTbfBurningDistance": 0.0,
    "sheathThkTd11": 0.0,
    "sheathThkTd12": 0.0,
    "sheathThkTd13": 0.0,
    "sheathThkTd14": 0.0,
    "sheathThkTd15": 0.0,
    "sheathThkTd16": 0.0,
    "sheathThkTd17": 0.0,
    "sheathThkTd18": 0.0,
    "spgLengthEmptyWeight": 0.0,
    "parallelCordBeforeTearingTd1": 0.0,
    "parallelCordBeforeTearingTd2": 0.0,
    "parallelCordBeforeTearingTd3": 0.0,
    "parallelCordBeforeTearingTd4": 0.0,
    "parallelCordBeforeTearingTd5": 0.0,
    "parallelCordBeforeTearingTd6": 0.0,
    "parallelCordAfterTearingTd1": 0.0,
    "parallelCordAfterTearingTd2": 0.0,
    "parallelCordAfterTearingTd3": 0.0,
    "parallelCordAfterTearingTd4": 0.0,
    "parallelCordAfterTearingTd5": 0.0,
    "parallelCordAfterTearingTd6": 0.0,
    "parallelCordSpacerBarTd1": 0.0,
    "parallelCordSpacerBarTd2": 0.0,
    "parallelCordSpacerBarTd3": 0.0,
    "parallelCordSpacerBarTd4": 0.0,
    "parallelCordSpacerBarTd5": 0.0,
    "parallelCordSpacerBarTd6": 0.0,
    "parallelCordBeforeTearingDv": 0.0,
    "parallelCordAfterTearingDv": 0.0,
    "parallelCordSpacerBarDv": 0.0,
    "insulTsTime": 0.0,
    "insulTsTemp": 0.0,
    "sheathTsTime": 0.0,
    "sheathTsTemp": 0.0,
    "insulLtBendTemp": 0.0,
    "insulLtBendTime": 0.0,
    "insulLtBendLenght": 0.0,
    "sheathLtBendTemp": 0.0,
    "sheathLtBendTime": 0.0,
    "sheathLtBendLenght": 0.0,
    "insulHtgDv": 0.0,
    "sheathHtgDv": 0.0,
    "sheathSurfaceR": 0.0,
    "sheathSurfaceRDv": 0.0,
    "csaDv": 0.0,
    "spindleNum": 0.0,
    "spindleRootNum": 0.0,
    "singleShieldDiameter": 0.0,
    "pitch": 0.0,
    "shieldDiameter": 0.0,
    "insulOdDv": 0.0,
    "peelStrengthTd1": 0.0,
    "peelStrengthTd2": 0.0,
    "peelStrengthTd3": 0.0,
    "peelStrengthTd4": 0.0,
    "ltBendBreakdown": "",
    "ltBendLenght": 0.0,
    "thcLenght": 0.0,
    "thcLn": 0.0,
    "thcCrack": "",
    "hotWaterResistanceLenght": 0.0,
    "hotWaterResistanceLn": 0.0,
    "hotWaterResistanceCrack": "",
    "hotWaterResistanceForward": 0.0,
    "hotWaterResistanceReverse": 0.0,
    "waterResistanceGasolineLn": 0.0,
    "waterResistanceGasolineTd": 0.0,
    "waterResistanceGasolinePct": 0.0,
    "waterResistanceGasolineCrack": "",
    "waterResistanceEthanolLn": 0.0,
    "waterResistanceEthanolTd": 0.0,
    "waterResistanceEthanolPct": 0.0,
    "waterResistanceEthanolCrack": "",
    "waterResistanceDieselOilLn": 0.0,
    "waterResistanceDieselOilTd": 0.0,
    "waterResistanceDieselOilPct": 0.0,
    "waterResistanceDieselOilCrack": "",
    "waterResistanceIrm902Ln": 0.0,
    "waterResistanceIrm902Td": 0.0,
    "waterResistanceIrm902Pct": 0.0,
    "waterResistanceIrm902Crack": "",
    "waterResistanceIrm903Ln": 0.0,
    "waterResistanceIrm903Td": 0.0,
    "waterResistanceIrm903Pct": 0.0,
    "waterResistanceIrm903Crack": "",
    "waterResistanceAtfLn": 0.0,
    "waterResistanceAtfTd": 0.0,
    "waterResistanceAtfPct": 0.0,
    "waterResistanceAtfCrack": "",
    "waterResistanceAntifreezeLn": 0.0,
    "waterResistanceAntifreezeTd": 0.0,
    "waterResistanceAntifreezePct": 0.0,
    "waterResistanceAntifreezeCrack": "",
    "waterResistanceBatteryAcidLn": 0.0,
    "waterResistanceBatteryAcidTd": 0.0,
    "waterResistanceBatteryAcidPct": 0.0,
    "waterResistanceBatteryAcidCrack": "",
    "frSelfExtinguishingDv": 0.0,
    "frSelfExtinguishingTime": 0.0,
    "frSelfExtinguishingTd1": 0.0,
    "frSelfExtinguishingTd2": 0.0,
    "frSelfExtinguishingTd3": 0.0,
    "frUnburnedTd1": 0.0,
    "frUnburnedTd2": 0.0,
    "frUnburnedTd3": 0.0,
    "hte": 0.0,
    "dielectricPok": "",
    "peelStrength": 0.0,
    "hthpTemp": 0.0,
    "hthpCrack": "",
    "lowTemperatureWindingWeight": 0.0,
    "lowTemperatureWindingLn": 0.0,
    "lowTemperatureWindingCrack": "",
    "arDv": 0.0,
    "ar": 0.0,
    "longTermAgingTemp": 0.0,
    "longTermAgingLn": 0.0,
    "longTermAgingCrack": "",
    "shortTermAgingTemp": 0.0,
    "shortTermAgingLn": 0.0,
    "shortTermAgingWeight": 0.0,
    "shortTermAgingCrack": "",
    "thermalOverloadLn": 0.0,
    "thermalOverloadCrack": "",
    "thermalShrinkage": 0.0,
    "temperatureHumidityHlternationLn": 0.0,
    "temperatureHumidityHlternationTemp1": 0.0,
    "temperatureHumidityHlternationTemp2": 0.0,
    "temperatureHumidityHlternationCrack": "",
    "ozoneResistanceLn": 0.0,
    "ozoneResistancePok": "",
    "waterResistanceEngineCoolantLn": 0.0,
    "waterResistanceEngineCoolantTd": 0.0,
    "waterResistanceEngineCoolantPct": 0.0,
    "waterResistanceEngineCoolantCrack": "",
    "waterResistanceEngineOilLn": 0.0,
    "waterResistanceEngineOilTd": 0.0,
    "waterResistanceEngineOilPct": 0.0,
    "waterResistanceEngineOilCrack": "",
    "waterResistancePowerSteeringFluidLn": 0.0,
    "waterResistancePowerSteeringFluidTd": 0.0,
    "waterResistancePowerSteeringFluidPct": 0.0,
    "waterResistancePowerSteeringFluidCrack": "",
    "waterResistanceBatteryAcidPok": "",
    "frFireSupplyTime": 0.0,
    "adhesionDv": 0.0,
    "adhesionTd1": 0.0,
    "adhesionTd2": 0.0,
    "adhesionTd3": 0.0,
    "adhesionTd4": 0.0,
    "adhesionTd5": 0.0,
    "htgTemp": 0.0,
    "htgCrack": "",
    "htgPok": "",
    "ltBendWeight": 0.0,
    "lowTemperatureImpactPok": "",
    "hr1ATemp": 0.0,
    "hr1ATime": 0.0,
    "hr1ALenght": 0.0,
    "hr1AWeight": 0.0,
    "hr1ACrack": "",
    "hr1APok": "",
    "hr1BTemp": 0.0,
    "hr1BTime": 0.0,
    "hr1BLenght": 0.0,
    "hr1BWeight": 0.0,
    "hr1BCrack": "",
    "hr1BPok": "",
    "hr1CCrack": "",
    "waterResistanceGasolinePok": "",
    "waterResistanceDieselOilPok": "",
    "waterResistanceEthanolPok": "",
    "waterResistanceAtfPok": "",
    "waterResistanceAntifreezePok": "",
    "waterResistanceIrm902Pok": "",
    "waterResistanceIrm903Pok": "",
    "frSelfExtinguishingTd": 0.0,
    "tsLenght": 0.0,
    "hotStretchLoadLenght": 0.0,
    "hotStretchCoolingLenght": 0.0,
    "signContinuity": 0.0,
    "immersionPowerFrequencyVoltageVoltage": 0.0,
    "immersionPowerFrequencyVoltageVoltageTime": null,
    "immersionPowerFrequencyVoltagePok": null,
    "roomTempPowerFrequencyVoltageTemp": null,
    "roomTempPowerFrequencyVoltageTime": null,
    "roomTempPowerFrequencyVoltageLenght": null,
    "roomTempPowerFrequencyVoltageLn": null,
    "roomTempPowerFrequencyVoltageUnagedVoltage": null,
    "roomTempPowerFrequencyVoltageUnagedVoltageTime": null,
    "roomTempPowerFrequencyVoltageAgingVoltage": null,
    "roomTempPowerFrequencyVoltageAgingVoltageTime": null,
    "roomTempPowerFrequencyVoltagePok": null,
    "ratedTempPowerFrequencyVoltageTemp": null,
    "ratedTempPowerFrequencyVoltageTime": null,
    "ratedTempPowerFrequencyVoltageRoastTemp": null,
    "ratedTempPowerFrequencyVoltageVoltage": null,
    "ratedTempPowerFrequencyVoltageVoltageTime": null,
    "ratedTempPowerFrequencyVoltagePok": null,
    "lightCottonHorizontalTd1": null,
    "lightCottonHorizontalTd2": null,
    "lightCottonHorizontalTd3": null,
    "lightCottonVerticalTd1": null,
    "lightCottonVerticalTd2": null,
    "lightCottonVerticalTd3": null,
    "zTbfStartDistanceTd1": null,
    "zTbfStartDistanceTd2": null,
    "zTbfStartDistanceTd3": null,
    "zTbfBurningDistanceTd1": null,
    "zTbfBurningDistanceTd2": null,
    "zTbfBurningDistanceTd3": null,
    "compatibilitySheathUnagedElongationTd1": null,
    "compatibilitySheathUnagedElongationTd2": null,
    "compatibilitySheathUnagedElongationTd3": null,
    "compatibilitySheathUnagedElongationTd4": null,
    "compatibilitySheathUnagedElongationTd5": null,
    "compatibilitySheathUnagedElongationTd6": null,
    "compatibilitySheathUnagedPullTd1": null,
    "compatibilitySheathUnagedPullTd2": null,
    "compatibilitySheathUnagedPullTd3": null,
    "compatibilitySheathUnagedPullTd4": null,
    "compatibilitySheathUnagedPullTd5": null,
    "compatibilitySheathUnagedPullTd6": null,
    "compatibilitySheathAgingElongationTd1": null,
    "compatibilitySheathAgingElongationTd2": null,
    "compatibilitySheathAgingElongationTd3": null,
    "compatibilitySheathAgingElongationTd4": null,
    "compatibilitySheathAgingElongationTd5": null,
    "compatibilitySheathAgingElongationTd6": null,
    "compatibilitySheathAgingPullTd1": null,
    "compatibilitySheathAgingPullTd2": null,
    "compatibilitySheathAgingPullTd3": null,
    "compatibilitySheathAgingPullTd4": null,
    "compatibilitySheathAgingPullTd5": null,
    "compatibilitySheathAgingPullTd6": null,
    "compatibilityInsulUnagedEiMvsDv": null,
    "compatibilityInsulUnagedTsMvsDv": null,
    "compatibilityInsulAgingEiMvsDv": null,
    "compatibilityInsulAgingTsMvsDv": null,
    "compatibilityInsulAgingEi": null,
    "compatibilityInsulAgingTs": null,
    "compatibilitySheathUnagedEiMvsDv": null,
    "compatibilitySheathUnagedTsMvsDv": null,
    "compatibilitySheathAgingEiMvsDv": null,
    "compatibilitySheathAgingTsMvsDv": null,
    "compatibilitySheathAgingEi": null,
    "compatibilitySheathAgingTs": null,
    "flexureFrequency": null,
    "ir90Calc": null,
    "insulDielectricWithstandVoltageCurrent": null,
    "fgDielectricWithstandVoltageCurrent": null,
    "sheathOdDv": null,
    "arSheathUnagedElongationTd1": null,
    "arSheathUnagedElongationTd2": null,
    "arSheathUnagedElongationTd3": null,
    "arSheathUnagedElongationTd4": null,
    "arSheathUnagedElongationTd5": null,
    "arSheathUnagedElongationTd6": null,
    "arSheathUnagedPullTd1": null,
    "arSheathUnagedPullTd2": null,
    "arSheathUnagedPullTd3": null,
    "arSheathUnagedPullTd4": null,
    "arSheathUnagedPullTd5": null,
    "arSheathUnagedPullTd6": null,
    "arSheathAgingElongationTd1": null,
    "arSheathAgingElongationTd2": null,
    "arSheathAgingElongationTd3": null,
    "arSheathAgingElongationTd4": null,
    "arSheathAgingElongationTd5": null,
    "arSheathAgingElongationTd6": null,
    "arSheathAgingPullTd1": null,
    "arSheathAgingPullTd2": null,
    "arSheathAgingPullTd3": null,
    "arSheathAgingPullTd4": null,
    "arSheathAgingPullTd5": null,
    "arSheathAgingPullTd6": null,
    "apSheathUnagedElongationTd1": null,
    "apSheathUnagedElongationTd2": null,
    "apSheathUnagedElongationTd3": null,
    "apSheathUnagedElongationTd4": null,
    "apSheathUnagedElongationTd5": null,
    "apSheathUnagedElongationTd6": null,
    "apSheathUnagedPullTd1": null,
    "apSheathUnagedPullTd2": null,
    "apSheathUnagedPullTd3": null,
    "apSheathUnagedPullTd4": null,
    "apSheathUnagedPullTd5": null,
    "apSheathUnagedPullTd6": null,
    "apSheathAgingElongationTd1": null,
    "apSheathAgingElongationTd2": null,
    "apSheathAgingElongationTd3": null,
    "apSheathAgingElongationTd4": null,
    "apSheathAgingElongationTd5": null,
    "apSheathAgingElongationTd6": null,
    "apSheathAgingPullTd1": null,
    "apSheathAgingPullTd2": null,
    "apSheathAgingPullTd3": null,
    "apSheathAgingPullTd4": null,
    "apSheathAgingPullTd5": null,
    "apSheathAgingPullTd6": null,
    "thermalLifeSheathUnagedElongationTd1": null,
    "thermalLifeSheathUnagedElongationTd2": null,
    "thermalLifeSheathUnagedElongationTd3": null,
    "thermalLifeSheathUnagedElongationTd4": null,
    "thermalLifeSheathUnagedElongationTd5": null,
    "thermalLifeSheathUnagedElongationTd6": null,
    "thermalLifeSheathUnagedPullTd1": null,
    "thermalLifeSheathUnagedPullTd2": null,
    "thermalLifeSheathUnagedPullTd3": null,
    "thermalLifeSheathUnagedPullTd4": null,
    "thermalLifeSheathUnagedPullTd5": null,
    "thermalLifeSheathUnagedPullTd6": null,
    "thermalLifeSheathAgingElongationTd1": null,
    "thermalLifeSheathAgingElongationTd2": null,
    "thermalLifeSheathAgingElongationTd3": null,
    "thermalLifeSheathAgingElongationTd4": null,
    "thermalLifeSheathAgingElongationTd5": null,
    "thermalLifeSheathAgingElongationTd6": null,
    "thermalLifeSheathAgingPullTd1": null,
    "thermalLifeSheathAgingPullTd2": null,
    "thermalLifeSheathAgingPullTd3": null,
    "thermalLifeSheathAgingPullTd4": null,
    "thermalLifeSheathAgingPullTd5": null,
    "thermalLifeSheathAgingPullTd6": null,
    "sheathHotStretchLoadHte": null,
    "sheathHotStretchCoolingHte": null,
    "dielectricWithstandVoltage": null,
    "dielectricWithstandVoltageTiem": null,
    "cl": null,
    "br": null,
    "numUl": null,
    "diameterUlTd1": null,
    "diameterUlTd2": null,
    "diameterUlTd3": null,
    "diameterUlTd4": null,
    "diameterUlTd5": null,
    "diameterUlTd6": null,
    "insulOdUlTd1": null,
    "insulOdUlTd2": null,
    "insulOdUlTd3": null,
    "insulOdUlTd4": null,
    "insulOdUlTd5": null,
    "insulOdUlTd6": null,
    "insulOdUlTd": null,
    "insulThkUlTd1": null,
    "insulThkUlTd2": null,
    "insulThkUlTd3": null,
    "insulThkUlTd4": null,
    "insulThkUlTd5": null,
    "insulThkUlTd6": null,
    "insulThkUlTd7": null,
    "insulThkUlTd8": null,
    "insulThkUlTd9": null,
    "insulThkUlTd10": null,
    "sheathThkUlTd1": null,
    "sheathThkUlTd2": null,
    "sheathThkUlTd3": null,
    "sheathThkUlTd4": null,
    "sheathThkUlTd5": null,
    "sheathThkUlTd6": null,
    "sheathThkUlTd7": null,
    "sheathThkUlTd8": null,
    "sheathThkUlTd9": null,
    "sheathThkUlTd10": null,
    "insulAvgThkUl": null,
    "insulMinThkUl": null,
    "sheathAvgThkUl": null,
    "sheathMinThkUl": null,
    "biTempUl": null,
    "biTimeUl": null,
    "sheathUnagedElongationUlTd1": null,
    "sheathUnagedElongationUlTd2": null,
    "sheathUnagedElongationUlTd3": null,
    "sheathUnagedElongationUlTd4": null,
    "sheathUnagedElongationUlTd5": null,
    "sheathUnagedElongationUlTd6": null,
    "sheathUnagedPullUlTd1": null,
    "sheathUnagedPullUlTd2": null,
    "sheathUnagedPullUlTd3": null,
    "sheathUnagedPullUlTd4": null,
    "sheathUnagedPullUlTd5": null,
    "sheathUnagedPullUlTd6": null,
    "sheathAgingElongationUlTd1": null,
    "sheathAgingElongationUlTd2": null,
    "sheathAgingElongationUlTd3": null,
    "sheathAgingElongationUlTd4": null,
    "sheathAgingElongationUlTd5": null,
    "sheathAgingElongationUlTd6": null,
    "sheathAgingPullUlTd1": null,
    "sheathAgingPullUlTd2": null,
    "sheathAgingPullUlTd3": null,
    "sheathAgingPullUlTd4": null,
    "sheathAgingPullUlTd5": null,
    "sheathAgingPullUlTd6": null,
    "sheathHotStretchLoadHteIec": null,
    "sheathHotStretchCoolingHteIec": null,
    "sheathLtBendLnIec": null,
    "sheathLtBendCrackIec": null,
    "sheathBeforeHeatingTd": null,
    "sheathAfterHeatingTd": null,
    "irCalcIecDv": null,
    "dielectricPokIec": null,
    "adhesion": null,
    "lowTemperatureWindingDiameter": null,
    "thermalOverloadDiameter": null,
    "thermalOverloadWeight": null,
    "waterResistanceGasolineDiameter": null,
    "waterResistanceDieselOilDiameter": null,
    "waterResistanceEthanolDiameter": null,
    "waterResistanceBatteryAcidDiameter": null,
    "waterResistanceEngineOilDiameter": null,
    "waterResistancePowerSteeringFluidDiameter": null,
    "waterResistanceAtfDiameter": null,
    "waterResistanceAntifreezeDiameter": null,
    "powerFrequencyVoltagePok": null,
    "breakdownVoltagePok": null,
    "hthpTd": null,
    "thermalShrinkageOriginalLength": null,
    "thermalShrinkageHeatingLenght": null,
    "overheatCrack": null,
    "lowTemperatureImpact4hrCrack": null,
    "adhesionFallOff": null,
    "peelEasy": null,
    "oilResistantCrack": null,
    "fuelResistantCrack": null,
    "arWeight": null,
    "withstandVoltageDielectricText": null,
    "withstandVoltageDielectricImmersion": null,
    "withstandVoltageVoltage": null,
    "withstandVoltageRaiseVoltage": null,
    "shortTermAgingDiameter": null,
    "waterResistancePowerSteeringFluidPok": null,
    "waterResistanceBrakeFluidLn": null,
    "waterResistanceBrakeFluidCrack": null,
    "waterResistanceBrakeFluidPok": null,
    "windingHeatingLn": null,
    "windingHeatingCrack": null,
    "windingHeatingDiameter": null,
    "ir20Length": null,
    "ir20Td": null,
    "ir20CalcDv": null,
    "ir60Length": null,
    "ir60Td": null,
    "ir60CalcDv": null,
    "dielectricImmersionWithstandVoltage": null,
    "dielectricImmersionWithstandVoltageTime": null,
    "dielectricImmersionWithstandVoltagePok": null,
    "dielectricAirWithstandVoltage": null,
    "dielectricAirWithstandVoltageTime": null,
    "dielectricAirWithstandVoltagePok": null,
    "sheathDumbbellSliceUnagedThkTd1": null,
    "sheathDumbbellSliceUnagedThkTd2": null,
    "sheathDumbbellSliceUnagedThkTd3": null,
    "sheathDumbbellSliceUnagedThkTd4": null,
    "sheathDumbbellSliceUnagedThkTd5": null,
    "sheathDumbbellSliceUnagedThkTd6": null,
    "sheathDumbbellSliceAgingThkTd1": null,
    "sheathDumbbellSliceAgingThkTd2": null,
    "sheathDumbbellSliceAgingThkTd3": null,
    "sheathDumbbellSliceAgingThkTd4": null,
    "sheathDumbbellSliceAgingThkTd5": null,
    "sheathDumbbellSliceAgingThkTd6": null,
    "tsText": null,
    "ltBendText": null,
    "flexibilityText": null,
    "sheathAgingCt": null,
    "htgDeformationRateCt": null,
    "htgFrontDiameter": null,
    "htgRearDiameter": null,
    "htgMandrelDiameter": null,
    "irCalcDvText": null,
    "irCalcDvResult": null,
    "irCalcTemp": null,
    "insulTsDiameter": null,
    "sheathTsDiameter": null,
    "insulLtBendDiameter": null,
    "sheathLtBendDiameter": null,
    "hotWaterResistanceForwardSampleLength": null,
    "hotWaterResistanceReverseSampleLength": null
  },
  "visible": null
}
```



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | string | 数据 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": ""
}
```




---
## 删除报告

> BASIC

**Path:** report/delReport

**Method:** GET

**Desc:**

 删除报告

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| reportNo |  | YES |  |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| state | string | 状态码 |
| msg | string | 消息 |
| data | array | 数据 |
| &ensp;&ensp;&#124;─ | object |  |
| &ensp;&ensp;&ensp;&ensp;&#124;─customerName | string | 客户名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitter | string | 送检人/部门 |
| &ensp;&ensp;&ensp;&ensp;&#124;─testBasis | string | 检测依据 |
| &ensp;&ensp;&ensp;&ensp;&#124;─productName | string | 产品名称 |
| &ensp;&ensp;&ensp;&ensp;&#124;─specification | string | 型号规格 |
| &ensp;&ensp;&ensp;&ensp;&#124;─reportNo | string | 报告编号 |
| &ensp;&ensp;&ensp;&ensp;&#124;─submitterDate | string | 送检日期 |
| &ensp;&ensp;&ensp;&ensp;&#124;─sampleStatus | string | 样品状态 |
| &ensp;&ensp;&ensp;&ensp;&#124;─startTestDate | string | 测试日期起始 |
| &ensp;&ensp;&ensp;&ensp;&#124;─endTestDate | string | 测试日期终止 |
| &ensp;&ensp;&ensp;&ensp;&#124;─majorMeasured | string | 主检 |
| &ensp;&ensp;&ensp;&ensp;&#124;─checked | string | 审核 |
| &ensp;&ensp;&ensp;&ensp;&#124;─approved | string | 签发 |
| &ensp;&ensp;&ensp;&ensp;&#124;─certigier | string | 授权人 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createTime | string | 创建时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserId | string | 创建人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─createUserName | string | 创建人名字 |
| &ensp;&ensp;&ensp;&ensp;&#124;─description | string | 备注 |
| &ensp;&ensp;&ensp;&ensp;&#124;─wireType | string | 线类型 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateTime | string | 修改时间 |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserId | string | 修改人id |
| &ensp;&ensp;&ensp;&ensp;&#124;─updateUserName | string | 修改人名字 |

**Response Demo:**

```json
{
  "state": "",
  "msg": "",
  "data": [
    {
      "customerName": "",
      "submitter": "",
      "testBasis": "",
      "productName": "",
      "specification": "",
      "reportNo": "",
      "submitterDate": "",
      "sampleStatus": "",
      "startTestDate": "",
      "endTestDate": "",
      "majorMeasured": "",
      "checked": "",
      "approved": "",
      "certigier": "",
      "createTime": "",
      "createUserId": "",
      "createUserName": "",
      "description": "",
      "wireType": "",
      "updateTime": "",
      "updateUserId": "",
      "updateUserName": ""
    }
  ]
}
```



