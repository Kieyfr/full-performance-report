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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        String reportNo = report.getReportNo();
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

    @Override
    public ReportVo getReportVo(String reportNo) {
        Report report = getById(reportNo);
        List<String> reportNos = new ArrayList<>();
        reportNos.add(reportNo);
        List<Wire> wires = wireService.selectAllByReportNo(reportNo);
        PublicData publicData = publicDataService.getById(reportNo);
        Visible visible = visibleService.getById(reportNo);
        ReportVo reportVo = new ReportVo();
        reportVo.setReport(report);
        reportVo.setWireList(wires);
        reportVo.setPublicData(publicData);
        reportVo.setVisible(visible);
        return reportVo;
    }

    @Override
    public boolean modReportVo(ReportVo reportVo) {
        Report report = reportVo.getReport();
        List<Wire> newWireList = reportVo.getWireList();
        PublicData publicData = reportVo.getPublicData();
        Visible visible = reportVo.getVisible();
        User user = LoginUtil.getLoginUser();
        report.setCreateUserId(user.getUserId());
        report.setCreateUserName(user.getUserName());
        updateById(report);
        String reportNo = report.getReportNo();
        List<Wire> oldWireList = wireService.selectAllByReportNo(reportNo);
        if (oldWireList.size()<newWireList.size()) {
            List<Wire> updateWireList = new ArrayList<Wire>();
            for (Wire wire:newWireList){
                Long wireId = wire.getId();
                for (Wire oldWire:oldWireList){
                    Long oldWireId = oldWire.getId();
                    if (oldWireId.equals(wireId)){
                        updateWireList.add(wire);
                    }
                }
            }
            List<Wire> insertWireList = newWireList.stream().filter(wire -> updateWireList.indexOf(wire) == -1).collect(Collectors.toList());
            wireService.updateListAllByReportNoAndId(updateWireList);
            for (Wire wire : insertWireList){
                wire.setReportNo(reportNo);
            }
            wireService.saveBatch(insertWireList, insertWireList.size());
        }else if(oldWireList.size()==newWireList.size()){
            wireService.updateListAllByReportNoAndId(newWireList);
        }else {
            List<Wire> updateWireList = new ArrayList<Wire>();
            for (Wire wire:newWireList){
                Long wireId = wire.getId();
                for (Wire oldWire:oldWireList){
                    Long oldWireId = oldWire.getId();
                    if (oldWireId.equals(wireId)){
                        updateWireList.add(wire);
                    }
                }
            }
            List<Wire> deleteWireList = oldWireList.stream().filter(wire -> updateWireList.indexOf(wire) == -1).collect(Collectors.toList());
            wireService.updateListAllByReportNoAndId(updateWireList);
            wireService.deleteListAllByReportNoAndId(deleteWireList ,reportNo);
        }
        publicDataService.updateById(publicData);
        visibleService.updateById(visible);
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean delReportVo(String reportNo) {
        removeById(reportNo);
        wireService.deleteByReportNo(reportNo);
        publicDataService.removeById(reportNo);
        visibleService.removeById(reportNo);
        return true;
    }
}




