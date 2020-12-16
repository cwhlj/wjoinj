package com.wjoinj.multi.datasource.mybatis.aop.db.aspect;

import com.wjoinj.multi.datasource.mybatis.aop.dao.BaseDao;
import com.wjoinj.multi.datasource.mybatis.aop.db.DataSourceConfig;
import com.wjoinj.multi.datasource.mybatis.aop.db.DataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author chengwei
 * @Description: 自定义注解 + AOP的方式实现数据源动态切换。
 * @Date 2020/12/15 1:49 下午
 */
@Aspect
@Component
public class DynamicDataSourceAspect {

    //根据类名贴换
    @Pointcut("this(com.wjoinj.multi.datasource.mybatis.aop.dao.BaseDao)")
    public void dynamicDataSourcePointCut() {

    }


    @Before("dynamicDataSourcePointCut()")
    public void beforeSwitchDS(JoinPoint point) {
        //获得当前访问的class
        Object className = point.getThis();
        if (className instanceof BaseDao) {
            String dataSource = DataSourceConfig.DEFAULT_DS;
            // 切换数据源
            DataSourceContextHolder.setDB(dataSource);
        } else {
            String dataSource = DataSourceConfig.USER_0;
            // 切换数据源
            DataSourceContextHolder.setDB(dataSource);
        }

    }


    @After("dynamicDataSourcePointCut()")
    public void afterSwitchDS(JoinPoint point) {
        DataSourceContextHolder.clearDB();
    }
}
