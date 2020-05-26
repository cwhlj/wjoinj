package com.wjoinj.mybatis.cache;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.wjoinj.mybatis.cache.invokemethod.InvokeMethod;
import com.wjoinj.mybatis.cache.invokemethod.InvokeMethodEnum;
import com.wjoinj.mybatis.cache.invokemethod.InvokeMethodFactory;
import com.wjoinj.mybatis.entity.Student;
import com.wjoinj.mybatis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author chengwei
 * @Date 2020/4/26 5:37 下午
 */
@Component
@Slf4j
public class StudentCache extends AbstractCache<Student> {
    @Autowired
    protected StudentService studentService;

    /**
     * Student缓存key
     */
    private static final String STUDENT_KEY = "Student";


    @Override
    protected <T> T loadData(String key) {
        log.info("数据库查询数据:" + key);
        String[] keys = StrUtil.split(key, KEY_CONNECTOR);
        InvokeMethod<T> invokeMethod = InvokeMethodFactory.getInvokeMethod(InvokeMethodEnum.valueOf(keys[1]));
        return invokeMethod.getDataFromInvokeMethod(keys[2]);
    }

    public Student queryById(Long id) throws Exception {
        //全部以字符串拼接
        return super.getData(StrUtil.join(KEY_CONNECTOR, STUDENT_KEY, InvokeMethodEnum.queryById.getDesc(), id.toString()));
    }


    public List<Student> queryByCreateTime(Date createTime) throws Exception {
        //全部以字符串拼接
        return super.getData(StrUtil.join(KEY_CONNECTOR, STUDENT_KEY, InvokeMethodEnum.queryByCreateTime.getDesc(), DateUtil.format(createTime, DatePattern.NORM_DATETIME_PATTERN)));
    }
}
