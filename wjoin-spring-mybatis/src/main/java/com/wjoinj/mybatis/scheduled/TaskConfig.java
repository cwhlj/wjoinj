package com.wjoinj.mybatis.scheduled;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @Author chengwei
 * @Description: 定时任务配置多线程
 * @Date 2020/5/29 4:07 下午
 */
@Configuration
public class TaskConfig {

    @Bean(name = "TaskPool")
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(3);
        return taskScheduler;
    }
}
