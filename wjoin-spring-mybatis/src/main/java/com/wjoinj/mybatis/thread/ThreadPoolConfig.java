package com.wjoinj.mybatis.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author chengwei
 * @Date 2020/4/1 1:36 下午
 */
@Configuration
public class ThreadPoolConfig {
    @Bean
    public ExecutorService executorService(){
        return new ThreadPoolExecutor(8,16,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(1000));
    }
}
