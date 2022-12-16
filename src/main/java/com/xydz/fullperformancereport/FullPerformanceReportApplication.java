package com.xydz.fullperformancereport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xiachenchen
 * @ClassName: FullPerformanceReportApplication
 * @Description: 启动类
 * @Date 2022/12/14
*/
@SpringBootApplication
@MapperScan("com.xydz.fullperformancereport.mapper")
public class FullPerformanceReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullPerformanceReportApplication.class, args);
    }

}
