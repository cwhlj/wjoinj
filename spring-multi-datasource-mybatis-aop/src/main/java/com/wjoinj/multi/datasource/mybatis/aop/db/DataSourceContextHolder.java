package com.wjoinj.multi.datasource.mybatis.aop.db;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author chengwei
 * @Description: 切换数据源
 * @Date 2020/12/15 10:56 上午
 */
@Slf4j
public class DataSourceContextHolder {
    /**
     * 数据源上下文
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源名
     *
     * @param dbType
     */
    public static void setDB(String dbType) {
        log.info("切换到{}数据源", dbType);
        contextHolder.set(dbType);
    }

    /**
     * 获取数据源名
     *
     * @return
     */
    public static String getDB() {
        String db = contextHolder.get();
        log.info("获取数据源为{}", db);
        return db;
    }

    /**
     * 清除数据源名
     */
    public static void clearDB() {
        log.info("清除数据源");
        contextHolder.remove();
    }
}
