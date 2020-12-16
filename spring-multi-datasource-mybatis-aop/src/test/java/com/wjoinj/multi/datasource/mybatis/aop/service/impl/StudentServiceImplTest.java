package com.wjoinj.multi.datasource.mybatis.aop.service.impl;

import cn.hutool.json.JSONUtil;
import com.wjoinj.multi.datasource.mybatis.aop.bean.Student;
import com.wjoinj.multi.datasource.mybatis.aop.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/12/15 3:00 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceImplTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        Student student = studentService.queryById(103L);
        System.out.println(JSONUtil.toJsonStr(student));
    }

}