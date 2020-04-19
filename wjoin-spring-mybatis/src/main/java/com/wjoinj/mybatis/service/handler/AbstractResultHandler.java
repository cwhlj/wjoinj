package com.wjoinj.mybatis.service.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @Author chengwei
 * @Date 2020/3/30 6:49 下午
 */
@Slf4j
public abstract class AbstractResultHandler<T, V> implements ResultHandler<T> {
    private ExecutorService executorService;

    public AbstractResultHandler(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /**
     * 每批处理的数据量
     */
    private int batchSize = 5000;

    /**
     * 每批次数据
     */
    private List<T> tempList = new ArrayList<>(batchSize);

    /**
     * 各个线程处理的结果集
     */
    private List<V> resultList = new ArrayList<>();

    /**
     * 各个线程处理异常信息
     */
    private List<Exception> exceptionList = new ArrayList<>();

    /**
     * 数据处理总条数
     */
    private int count = 0;

    /**
     * 上一条数据，做分组判断使用
     */
    private T preObj;

    /**
     * 各线程处理结果集,内部用
     */
    private List<Future<V>> futureList = new ArrayList<>();

    @Override
    public void handleResult(ResultContext<? extends T> resultContext) {
        if (tempList.size() >= batchSize && groupCondition(preObj, resultContext.getResultObject())) {
            futureSubmit();
        }
        tempList.add(resultContext.getResultObject());
        preObj = resultContext.getResultObject();
        count++;
    }

    /**
     * 分组条件
     *
     * @param preObj
     * @param currentObj
     * @return
     */
    private Boolean groupCondition(T preObj, T currentObj) {
        return true;
    }

    /**
     * 最后一批次处理
     */
    public void end() {
        if (!tempList.isEmpty()) {
            futureSubmit();
        }
        for (Future<V> future : futureList) {
            try {
                resultList.add(future.get());
            } catch (Exception e) {
                log.error("线程池处理异常", e);
                exceptionList.add(e);
            }
        }
    }

    /**
     * 线程执行
     */
    private void futureSubmit() {
        final List<T> resultList = tempList;
        tempList = new ArrayList<>(batchSize);
        Future<V> submit = executorService.submit(() -> businessProcess(resultList));
        futureList.add(submit);
    }

    /**
     * 业务处理
     *
     * @param dataList
     * @return
     */
    protected abstract V businessProcess(List<? extends T> dataList);

    /**
     * 修改每批次处理数量
     *
     * @param batchSize
     */
    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * 获取处理总数
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * 获取处理的结果集
     *
     * @return
     */
    public List<V> getResultList() {
        return resultList;
    }

    public List<Exception> getExceptionList() {
        return exceptionList;
    }
}
