package com.xydz.fullperformancereport.controller;

import com.xydz.fullperformancereport.pojo.entity.ULElectronicWire;
import com.xydz.fullperformancereport.pojo.entity.User;
import com.xydz.fullperformancereport.pojo.resp.ResponseData;
import com.xydz.fullperformancereport.service.ULElectronicWireService;
import com.xydz.fullperformancereport.util.LoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private ULElectronicWireService ulElectronicWireService;

    /**
     * UI电子线报表生成
     *
     * @param ulElectronicWire
    */
    @RequestMapping("saveULElectronicWire")
    public ResponseData<String> saveULElectronicWire(@RequestBody ULElectronicWire ulElectronicWire){
        System.out.println(ulElectronicWire);
        User user = LoginUtil.getLoginUser();
        ulElectronicWire.setCreateUserId(user.getUserId());
        ulElectronicWire.setCreateUserName(user.getUserName());
        boolean state = ulElectronicWireService.save(ulElectronicWire);
        if (state){
            return new ResponseData<>("200","生成成功",null);
        }
        return new ResponseData<>("500","生成失败",null);
    }
}
