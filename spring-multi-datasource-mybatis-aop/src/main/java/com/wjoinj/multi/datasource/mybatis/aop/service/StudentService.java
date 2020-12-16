package com.wjoinj.multi.datasource.mybatis.aop.service;

import com.wjoinj.multi.datasource.mybatis.aop.bean.Student;

/**
 * 学生表(Student)表服务接口
 *
 * @author makejava
 * @since 2020-03-08 16:08:10
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Student queryById(Long id);
}