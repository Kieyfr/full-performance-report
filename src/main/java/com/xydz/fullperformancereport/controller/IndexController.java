package com.xydz.fullperformancereport.controller;

import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.req.UlElectronicWireVo;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.UlElectronicWireService;
import com.xydz.fullperformancereport.util.LoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UlElectronicWireService ulElectronicWireService;

    /**
     * UI电子线报表生成
     *
     * @param ulElectronicWireVo
    */
    @RequestMapping("saveULElectronicWire")
    public ResponseData<String> saveULElectronicWire(@RequestBody UlElectronicWireVo ulElectronicWireVo){
        System.out.println(ulElectronicWireVo);
        System.out.println(ulElectronicWireVo.getUlElectronicWire());
        System.out.println(ulElectronicWireVo.getWireList());
        System.out.println(ulElectronicWireVo.getPublicData());

//        User user = LoginUtil.getLoginUser();
//        ulElectronicWireVo.getUlElectronicWire().setCreateUserId(user.getUserId());
//        ulElectronicWireVo.getUlElectronicWire().setCreateUserName(user.getUserName());
//        boolean state = ulElectronicWireService.save(ulElectronicWireVo.getUlElectronicWire());
//        if (state){
//            return new ResponseData<>("200","生成成功",null);
//        }
        return new ResponseData<>("500","生成失败",null);
    }
}
