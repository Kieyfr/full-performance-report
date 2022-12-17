package com.xydz.fullperformancereport.service;

import com.xydz.fullperformancereport.pojo.entity.Wire;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author ThinkPad
* @description 针对表【FPR_WIRE(芯线表)】的数据库操作Service
* @createDate 2022-12-12 10:47:00
*/
public interface WireService extends IService<Wire> {

    boolean deleteListAllByReportNoAndId(List<Wire> wireList,String reportNo);

    boolean updateListAllByReportNoAndId(List<Wire> wireList);

    List<Wire> selectAllByReportNo(String reportNo);

    int deleteByReportNo(String reportNo);

}
