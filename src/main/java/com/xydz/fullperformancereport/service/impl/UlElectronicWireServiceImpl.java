package com.xydz.fullperformancereport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xydz.fullperformancereport.pojo.entity.*;
import com.xydz.fullperformancereport.pojo.req.UlElectronicWireVo;
import com.xydz.fullperformancereport.service.PublicDataService;
import com.xydz.fullperformancereport.service.UlElectronicWireService;
import com.xydz.fullperformancereport.mapper.UlElectronicWireMapper;
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
public class UlElectronicWireServiceImpl extends ServiceImpl<UlElectronicWireMapper, UlElectronicWire>
    implements UlElectronicWireService{

    @Autowired
    private WireService wireService;

    @Autowired
    private PublicDataService publicDataService;

    @Autowired
    private VisibleService visibleService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveUlElectronicWire(UlElectronicWireVo ulElectronicWireVo) {
        UlElectronicWire ulElectronicWire = ulElectronicWireVo.getUlElectronicWire();
        List<Wire> wireList = ulElectronicWireVo.getWireList();
        PublicData publicData = ulElectronicWireVo.getPublicData();
        Visible visible = ulElectronicWireVo.getVisible();
        User user = LoginUtil.getLoginUser();
        String reportNo = ulElectronicWire.getReportNo();
        ulElectronicWire.setCreateUserId(user.getUserId());
        ulElectronicWire.setCreateUserName(user.getUserName());
        publicData.setReportNo(reportNo);
        visible.setReportNo(reportNo);
        for (Wire wire : wireList){
            wire.setReportNo(reportNo);
        }
        save(ulElectronicWire);
        wireService.saveBatch(wireList, wireList.size());
        publicDataService.save(publicData);
        visibleService.save(visible);
        return true;
    }
}




