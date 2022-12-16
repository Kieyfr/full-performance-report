package com.xydz.fullperformancereport.pojo.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xydz.fullperformancereport.pojo.entity.PublicData;
import com.xydz.fullperformancereport.pojo.entity.Report;
import com.xydz.fullperformancereport.pojo.entity.Visible;
import com.xydz.fullperformancereport.pojo.entity.Wire;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 全性能报告表UI电子线全数据
 * @TableName FPR_UL_ELECTRONIC_WIRE
 */
@TableName(value ="FPR_UL_ELECTRONIC_WIRE")
@Data
public class ReportVo implements Serializable {
    /**
     * UI电子线表
     */
    private Report report;

    /**
     * 芯线列表
     */
    private List<Wire> wireList;

    /**
     * 公共数据
     */
    private PublicData publicData;

    /**
     * 是否显示
     */
    private Visible visible;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}