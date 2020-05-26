package com.wjoinj.mybatis.dao;

import com.wjoinj.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;

import java.util.Date;
import java.util.List;

/**
 * 学生表(Student)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-08 16:08:09
 */
public interface StudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Student queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param student 实例对象
     * @return 对象列表
     */
    List<Student> queryAll(Student student);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * queryAllHandle
     * @param resultHandler
     */
    void queryAllHandle(ResultHandler<Student> resultHandler);

    /**
     * queryByCreateTime
     * @param createTime
     * @return
     */
    List<Student> queryByCreateTime(Date createTime);
}