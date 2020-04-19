package com.wjoinj.mybatis.service.handler;

import com.wjoinj.mybatis.entity.Student;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chengwei
 * @Date 2020/3/24 4:54 下午
 */
@Service
public class StudentHandler implements ResultHandler<Student> {
    /**
     * 每批次处理的大小
     */
    private static final Integer BATCH_SIZE = 50000;

    private List<Student> studentList = new ArrayList<>(BATCH_SIZE);

    @Override
    public void handleResult(ResultContext<? extends Student> resultContext) {
        Student student = resultContext.getResultObject();
        studentList.add(student);
        if (BATCH_SIZE == studentList.size()) {
            handler();
        }
    }

    private void handler() {
        try {
            //业务处理
            System.out.println(studentList.size());
        } finally {
            //处理完业务，清空
            studentList.clear();
        }
    }

    /**
     * 最后一批次
     */
    public void end() {
        handler();
    }
}
