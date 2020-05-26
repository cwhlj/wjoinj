package com.wjoinj.mybatis.cache.invokemethod;

import lombok.Getter;

/**
 * @Author chengwei
 * @Date 2020/5/15 10:49 上午
 */
@Getter
public enum InvokeMethodEnum {
    /**
     * studentQueryById
     */
    queryById("studentQueryById", "queryById"),
    /**
     * studentQueryByCreateTime
     */
    queryByCreateTime("studentQueryByCreateTime", "queryByCreateTime");

    private String method;

    private String desc;

    InvokeMethodEnum(String method, String desc) {
        this.method = method;
        this.desc = desc;
    }


}
