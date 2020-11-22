package com.wei.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author chengwei
 * @Description: 获取application.properties属性中的值
 * @Date 2020/11/22 4:14 下午
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class User {
    private String name;
    private Integer age;
    private List<String> address;

    @Value("${birthday}")
    private String birthday;

    @Value("${myenvironment.name}")
    private String environmentName;
}
