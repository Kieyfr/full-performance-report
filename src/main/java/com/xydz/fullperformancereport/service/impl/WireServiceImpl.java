package com.xydz.fullperformancereport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xydz.fullperformancereport.pojo.entity.Wire;
import com.xydz.fullperformancereport.service.WireService;
import com.xydz.fullperformancereport.mapper.WireMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author ThinkPad
* @description 针对表【FPR_WIRE(芯线表)】的数据库操作Service实现
* @createDate 2022-12-12 10:47:00
*/
@Service
public class WireServiceImpl extends ServiceImpl<WireMapper, Wire>
    implements WireService{

    @Resource
    private WireMapper wireMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteListAllByReportNoAndId(List<Wire> wireList,String reportNo) {
        wireMapper.deleteListAllByReportNoAndId(wireList,reportNo);
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateListAllByReportNoAndId(List<Wire> wireList) {
        for (Wire wire:wireList){
            wireMapper.updateAllByReportNoAndId(wire);
        }
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<Wire> selectAllByReportNo(String reportNo) {
        return wireMapper.selectAllByReportNo(reportNo);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteByReportNo(String reportNo) {
        return wireMapper.deleteByReportNo(reportNo);
    }
}




