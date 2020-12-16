package com.wjoinj.multi.datasource.mybatis.aop.service.impl;


import com.wjoinj.multi.datasource.mybatis.aop.bean.Student;
import com.wjoinj.multi.datasource.mybatis.aop.dao.StudentDao;
import com.wjoinj.multi.datasource.mybatis.aop.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学生表(Student)表服务实现类
 *
 * @author makejava
 * @since 2020-03-08 16:08:11
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Long id) {
        return this.studentDao.queryById(id);
    }

}