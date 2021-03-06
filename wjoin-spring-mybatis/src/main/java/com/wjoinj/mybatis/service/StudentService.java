package com.wjoinj.mybatis.service;

import com.wjoinj.mybatis.entity.Student;
import org.apache.ibatis.session.ResultHandler;

import java.util.Date;
import java.util.List;

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

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * queryAllHandle
     *
     * @param resultHandler
     */
    void queryAllHandle(ResultHandler<Student> resultHandler);

    /**
     * queryByCreateTime
     *
     * @param createTime
     * @return
     */
    List<Student> queryByCreateTime(Date createTime);
}