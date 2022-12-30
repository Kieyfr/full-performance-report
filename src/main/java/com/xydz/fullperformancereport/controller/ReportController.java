package com.xydz.fullperformancereport.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xydz.fullperformancereport.pojo.entity.Report;
import com.xydz.fullperformancereport.pojo.req.ReportVo;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.ReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("report")
@Api(tags = "报告控制器")
public class ReportController {

    @Autowired
    private ReportService reportService;

    /**
     * 生成报告
     *
     * @param reportVo
    */
    @PostMapping("saveReport")
    @ApiOperation(value = "生成报告")
    public ResponseData<String> saveReport(@RequestBody ReportVo reportVo){
        Report report = reportService.getById(reportVo.getReport().getReportNo());
        if (null==report){
            boolean state = reportService.saveReportVo(reportVo);
            if (state){
                return new ResponseData<>("200","生成成功",null);
            }
            return new ResponseData<>("500","生成失败",null);
        }
        return new ResponseData<>("403","报告已存在",null);
    }

    /**
     * 查询报告列表
     *
     */
    @PostMapping("getReports")
    @ApiOperation(value = "查询报告列表")
    public ResponseData<List<Report> > getReports(){
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("CREATE_TIME");
        List<Report> reportList = reportService.list(queryWrapper);
        return new ResponseData<List<Report>>("200","生成成功",reportList);
    }

    /**
     * 根据条件以及页码查询报告列表
     *
     */
    @GetMapping("getQueryPageReports")
    @ApiOperation(value = "根据条件以及页码查询报告列表")
    public ResponseData<List<Report>> getQueryPageReports(@RequestParam("reportNo")String reportNo,
                                                    @RequestParam("specification")String specification,
                                                    @RequestParam("reportPage")Integer reportPage){
        Page<Report> page = new Page<>(reportPage, 10);
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("REPORT_NO",reportNo)
                .like("SPECIFICATION",specification)
                .orderByDesc("CREATE_TIME");
        reportService.page(page, queryWrapper);
        List<Report> reportList = page.getRecords();
        return new ResponseData<List<Report>>("200","生成成功",reportList);
    }

    /**
     * 根据条件以及页码查询报告列表页码数量
     *
     */
    @GetMapping("getQueryPageReportsPageNum")
    @ApiOperation(value = "根据条件以及页码查询报告列表页码数量")
    public ResponseData<Integer> getQueryPageReports(@RequestParam("reportNo")String reportNo,
                                                @RequestParam("specification")String specification){
        QueryWrapper<Report> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("REPORT_NO",reportNo)
                .like("SPECIFICATION",specification);
        List<Report> reportList = reportService.list(queryWrapper);
        Integer pageNum = reportList.size();
        return new ResponseData<Integer>("200","生成成功",pageNum);
    }

    /**
     * 查询报告
     *
     */
    @GetMapping("getReport")
    @ApiOperation(value = "查询报告")
    public ResponseData<ReportVo> getReport(@RequestParam("reportNo")String reportNo){
        ReportVo reportVo = reportService.getReportVo(reportNo);
        return new ResponseData<ReportVo>("200","生成成功",reportVo);
    }

    /**
     * 修改报告
     *
     * @param reportVo
     */
    @PostMapping("modReport")
    @ApiOperation(value = "修改报告")
    public ResponseData<String> modReport(@RequestBody ReportVo reportVo){
        boolean state = reportService.modReportVo(reportVo);
        if (state){
            return new ResponseData<>("200","修改成功",null);
        }
        return new ResponseData<>("500","修改失败",null);
    }

    /**
     * 删除报告
     *
     * @param reportNo
     */
    @GetMapping("delReport")
    @ApiOperation(value = "删除报告")
    public ResponseData<List<Report> > delReport(@RequestParam("reportNo")String reportNo){
        boolean state = reportService.delReportVo(reportNo);
        if (state){
            return new ResponseData<>("200","删除成功",null);
        }
        return new ResponseData<>("500","删除失败",null);
    }
}
