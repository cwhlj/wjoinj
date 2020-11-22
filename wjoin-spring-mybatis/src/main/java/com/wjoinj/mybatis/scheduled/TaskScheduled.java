package com.wjoinj.mybatis.scheduled;

import com.wjoinj.mybatis.entity.Student;
import com.wjoinj.mybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author chengwei
 * @Description: 定时任务
 * @Date 2020/5/29 3:59 下午
 */
@Component
@Slf4j
@EnableScheduling
public class TaskScheduled {
    @Autowired
    private StudentService studentService;

    @Scheduled(cron = "0/10 * * * * ?")
    @Transactional(rollbackFor = Exception.class)
    public void task() {
        log.info("定时任务启动成功");

            Student student = new Student();
            student.setName("test");
            student.setNum("10");
            student.setAge(0);
            student.setCreateTime(new Date());

            studentService.insert(student);
        try {
            int a= 10/0;
        }catch (Exception e){
            log.error("error",e);
        }

        log.info("定时任务启动结束");
    }

    @Scheduled(fixedRate=5000)
    public void task2(){
        log.info("task2");
    }

    @Scheduled(fixedDelay=5000)
    public void task3(){
        log.info("task3");
    }

//    @Scheduled(cron = "0/2 * * * * ?")
//    public void task4(){
//        try {
//            t();
//        }catch (Exception e){
//            log.error("error",e);
//        }
//    }
//
    @Transactional(rollbackFor = Exception.class)
    public void t(){
        Student student = new Student();
        student.setName("test");
        student.setNum("10");
        student.setAge(0);
        student.setCreateTime(new Date());

        studentService.insert(student);
        int a= 10/0;
    }

}
