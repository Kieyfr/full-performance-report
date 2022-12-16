package com.xydz.fullperformancereport.controller;

import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.req.UlElectronicWireVo;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.UlElectronicWireService;
import com.xydz.fullperformancereport.util.LoginUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("report")
@Api(tags = "报告控制器")
public class ReportController {

    @Autowired
    private UlElectronicWireService ulElectronicWireService;

    /**
     * UI电子线报告生成
     *
     * @param ulElectronicWireVo
    */
    @PostMapping("saveULElectronicWire")
    @ApiOperation(value = "UI电子线报告生成")
    public ResponseData<String> saveULElectronicWire(@RequestBody UlElectronicWireVo ulElectronicWireVo){
        System.out.println(ulElectronicWireVo);
        boolean state = ulElectronicWireService.saveUlElectronicWire(ulElectronicWireVo);
        if (state){
            return new ResponseData<>("200","生成成功",null);
        }
        return new ResponseData<>("500","生成失败",null);
    }

//    /**
//     * 获取报告列表
//     *
//     * @param ulElectronicWireVo
//     */
//    @PostMapping("saveULElectronicWire")
//    @ApiOperation(value = "UI电子线报告生成")
//    public ResponseData<String> saveULElectronicWire(@RequestBody UlElectronicWireVo ulElectronicWireVo){
//        System.out.println(ulElectronicWireVo);
//        boolean state = ulElectronicWireService.saveUlElectronicWire(ulElectronicWireVo);
//        if (state){
//            return new ResponseData<>("200","生成成功",null);
//        }
//        return new ResponseData<>("500","生成失败",null);
//    }
}
