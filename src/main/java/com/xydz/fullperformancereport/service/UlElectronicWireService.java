package com.xydz.fullperformancereport.service;

import com.xydz.fullperformancereport.pojo.entity.UlElectronicWire;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xydz.fullperformancereport.pojo.req.UlElectronicWireVo;

/**
* @author ThinkPad
* @description 针对表【FPR_UL_ELECTRONIC_WIRE(全性能报告表UI电子线表)】的数据库操作Service
* @createDate 2022-12-12 15:24:26
*/
public interface UlElectronicWireService extends IService<UlElectronicWire> {

    /**
     * 生成一个UL电子线报告
     *
     * @param ulElectronicWireVo
     * @return boolean
    */
    boolean saveUlElectronicWire(UlElectronicWireVo ulElectronicWireVo);

}
