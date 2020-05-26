package com.wjoinj.mybatis.cache.invokemethod;

/**
 * @Author chengwei
 * @Date 2020/5/14 4:38 下午
 */
public interface InvokeMethod<T> {
    /**
     * 通过不同d方法获取数据
     *
     * @param key
     * @return
     */
    T getDataFromInvokeMethod(String key);
}
