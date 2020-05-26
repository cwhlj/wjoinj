package com.wjoinj.mybatis.service.impl;


import com.wjoinj.mybatis.dao.StudentDao;
import com.wjoinj.mybatis.entity.Student;
import com.wjoinj.mybatis.service.StudentService;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.studentDao.deleteById(id) > 0;
    }

    @Override
    public void queryAllHandle(ResultHandler<Student> resultHandler){
        studentDao.queryAllHandle(resultHandler);
    }

    @Override
    public List<Student> queryByCreateTime(Date createTime) {
        return studentDao.queryByCreateTime(createTime);
    }
}