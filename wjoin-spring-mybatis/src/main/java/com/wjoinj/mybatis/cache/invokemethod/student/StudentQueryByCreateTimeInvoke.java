package com.wjoinj.mybatis.cache.invokemethod.student;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.wjoinj.mybatis.cache.StudentCache;
import com.wjoinj.mybatis.cache.invokemethod.InvokeMethod;
import com.wjoinj.mybatis.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author chengwei
 * @Date 2020/5/15 9:31 上午
 */
@Service("studentQueryByCreateTimeInvoke")
public class StudentQueryByCreateTimeInvoke extends StudentCache implements InvokeMethod<List<Student>> {
    @Override
    public List<Student> getDataFromInvokeMethod(String key) {
        return studentService.queryByCreateTime(DateUtil.parse(key, DatePattern.NORM_DATETIME_PATTERN));
    }
}
