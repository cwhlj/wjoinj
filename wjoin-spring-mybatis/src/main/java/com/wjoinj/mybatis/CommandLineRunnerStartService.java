package com.wjoinj.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/5/25 9:36 下午
 */
@Component
@Slf4j
public class CommandLineRunnerStartService implements CommandLineRunner, Ordered {
    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            log.info(arg);
        }
        log.info("CommandLineRunnerStartService start");
    }

    @Override
    public int getOrder() {
        //注解的执行优先级是按value值从小到大顺序
        return 0;
    }
}
