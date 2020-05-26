package com.wjoinj.mybatis.cache.invokemethod;

/**
 * @Author chengwei
 * @Date 2020/5/14 11:12 上午
 */
public class InvokeMethodFactory {
    public static <T> InvokeMethod<T> getInvokeMethod(InvokeMethodEnum invokeMethodEnum) {
        return SpringContextHolder.getBean(invokeMethodEnum.getMethod() + "Invoke");
    }
}
