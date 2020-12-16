package com.wjoinj.multi.datasource.mybatis.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author chengwei
 * @Description: MultiDatasourceMybatisAopApplication
 * @Date 2020/12/15 10:31 上午
 */
//多数据原配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//指定要扫描的Mapper类的包的路径
@MapperScan(basePackages = {"com.wjoinj.multi.datasource.mybatis.aop.dao"})
public class MultiDatasourceMybatisAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourceMybatisAopApplication.class, args);
    }

}

