package com.wjoinj.mybatis.cache.invokemethod.student;

import com.wjoinj.mybatis.cache.StudentCache;
import com.wjoinj.mybatis.cache.invokemethod.InvokeMethod;
import com.wjoinj.mybatis.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @Author chengwei
 * @Date 2020/5/15 9:31 上午
 */
@Service("studentQueryByIdInvoke")
public class StudentQueryByIdInvoke extends StudentCache implements InvokeMethod<Student> {
    @Override
    public Student getDataFromInvokeMethod(String key) {
        return studentService.queryById(Long.valueOf(key));
    }
}
