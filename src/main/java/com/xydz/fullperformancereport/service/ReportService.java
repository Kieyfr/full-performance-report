package com.xydz.fullperformancereport.service;

import com.xydz.fullperformancereport.pojo.entity.Report;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xydz.fullperformancereport.pojo.req.ReportVo;

/**
* @author ThinkPad
* @description 针对表【FPR_UL_ELECTRONIC_WIRE(全性能报告表UI电子线表)】的数据库操作Service
* @createDate 2022-12-12 15:24:26
*/
public interface ReportService extends IService<Report> {

    /**
     * 生成一个报告
     *
     * @param reportVo
     * @return boolean
    */
    boolean saveReportVo(ReportVo reportVo);

    /**
     * 删除一个报告
     *
     * @param reportNo
     * @return boolean
     */
    boolean delReportVo(String reportNo);

}
