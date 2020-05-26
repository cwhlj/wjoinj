package com.wjoinj.mybatis.controller;


import com.wjoinj.mybatis.cache.StudentCache;
import com.wjoinj.mybatis.entity.Student;
import com.wjoinj.mybatis.service.StudentService;
import com.wjoinj.mybatis.service.handler.AbstractResultHandler;
import com.wjoinj.mybatis.service.handler.StudentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/**
 * 学生表(Student)表控制层
 *
 * @author makejava
 * @since 2020-03-08 16:08:12
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;
    @Resource
    private StudentHandler studentHandler;
    @Autowired
    private StudentCache studentCache;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(Long id) throws Exception {
        Student student = studentCache.queryById(id);
        return student;
//        return this.studentService.queryById(id);
    }
    @Autowired
    private ExecutorService executorService;

    @GetMapping("handler")
    public void handler(){
        AbstractResultHandler handler = new AbstractResultHandler(executorService) {
            @Override
            protected Boolean businessProcess(List dataList) {
                System.out.println(1/0);
                return true;
            }
        };
        handler.setBatchSize(2);
        studentService.queryAllHandle(handler);
        handler.end();
        List<Exception>  exceptionList = handler.getExceptionList();
        for (Exception exception : exceptionList) {
            System.out.println("执行失败");
        }


        List<Boolean> resultList = handler.getResultList();
        for (Boolean result : resultList) {
            if(!result){
                System.out.println("执行失败");
            }
        }


    }


    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("queryByCreateTime")
    public List<Student> selectOne() throws Exception {
        return studentCache.queryByCreateTime(new Date());
    }


    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("2");
        s.set(0,"1");
        System.out.println(s);
    }
}