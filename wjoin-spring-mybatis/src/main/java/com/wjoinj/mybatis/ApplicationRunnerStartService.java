package com.wjoinj.mybatis;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author chengwei
 * @Description: 启动后执行
 * @Date 2020/5/25 9:12 下午
 */
@Component
@Slf4j
@Order(1)
public class ApplicationRunnerStartService implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ApplicationRunnerStartService start");
    }
}
