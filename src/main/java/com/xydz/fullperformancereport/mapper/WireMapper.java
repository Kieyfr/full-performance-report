package com.xydz.fullperformancereport.mapper;
import java.util.List;

import com.xydz.fullperformancereport.pojo.entity.Wire;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author ThinkPad
* @description 针对表【FPR_WIRE(芯线表)】的数据库操作Mapper
* @createDate 2022-12-12 10:47:00
* @Entity com.xydz.fullperformancereport.pojo.entity.Wire
*/
public interface WireMapper extends BaseMapper<Wire> {

    int deleteListAllByReportNoAndId(@Param("wireList")List<Wire> wireList,@Param("reportNo")String reportNo);

    int updateAllByReportNoAndId(Wire wire);

    List<Wire> selectAllByReportNo(@Param("reportNo") String reportNo);

    int deleteByReportNo(@Param("reportNo") String reportNo);

}




