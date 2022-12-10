package com.xydz.fullperformancereport.pojo.resp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xiachenchen
 * @ClassName: ResponseData
 * @Description: 返回的数据类
 * @Date 2022/11/22
*/

@Data
@AllArgsConstructor
public class ResponseData<T> {

    /**
     * 状态码
     */
    private String state;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

}
