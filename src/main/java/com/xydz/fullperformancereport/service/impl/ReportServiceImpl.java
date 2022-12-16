package com.xydz.fullperformancereport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xydz.fullperformancereport.pojo.entity.*;
import com.xydz.fullperformancereport.pojo.req.ReportVo;
import com.xydz.fullperformancereport.service.PublicDataService;
import com.xydz.fullperformancereport.service.ReportService;
import com.xydz.fullperformancereport.mapper.ReportMapper;
import com.xydz.fullperformancereport.service.VisibleService;
import com.xydz.fullperformancereport.service.WireService;
import com.xydz.fullperformancereport.util.LoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author ThinkPad
* @description 针对表【FPR_UL_ELECTRONIC_WIRE(全性能报告表UI电子线表)】的数据库操作Service实现
* @createDate 2022-12-12 15:24:26
*/
@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report>
    implements ReportService {

    @Autowired
    private WireService wireService;

    @Autowired
    private PublicDataService publicDataService;

    @Autowired
    private VisibleService visibleService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveReportVo(ReportVo reportVo) {
        Report report = reportVo.getReport();
        List<Wire> wireList = reportVo.getWireList();
        PublicData publicData = reportVo.getPublicData();
        Visible visible = reportVo.getVisible();
        User user = LoginUtil.getLoginUser();
        String reportNo = report.getReportNo();
        report.setCreateUserId(user.getUserId());
        report.setCreateUserName(user.getUserName());
        publicData.setReportNo(reportNo);
        visible.setReportNo(reportNo);
        for (Wire wire : wireList){
            wire.setReportNo(reportNo);
        }
        save(report);
        wireService.saveBatch(wireList, wireList.size());
        publicDataService.save(publicData);
        visibleService.save(visible);
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean delReportVo(String reportNo) {
        removeById(reportNo);
        wireService.removeById(reportNo);
        publicDataService.removeById(reportNo);
        visibleService.removeById(reportNo);
        return true;
    }
}




