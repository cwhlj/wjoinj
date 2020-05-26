package com.wjoinj.mybatis.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author chengwei
 * @Date 2020/4/26 3:47 下午
 */
@Component
@Slf4j
public abstract class AbstractCache<T> {
    /**
     * 间隔符
     */
    protected static final String KEY_CONNECTOR = "&";

    /**
     * 缓存，并发安全，
     */
    private LoadingCache<String, T> loadingCache = CacheBuilder.newBuilder()
            .initialCapacity(100)
            .maximumSize(1000)
            .expireAfterAccess(2, TimeUnit.HOURS)
            .build(new CacheLoader<String, T>() {
                @Override
                public T load(String key) {
                    return loadData(key);
                }
            });


    /**
     * 调用接口或者数据库取数据
     *
     * @param key
     * @return
     */
    protected abstract <T> T loadData(String key);

    /**
     * 获取数据
     *
     * @param key
     * @return
     */
    protected <T> T getData(String key) throws Exception {
        if (true) {
            log.info("缓存取数据:" + key);
            return (T) getFromCache(key);
        }
        return loadData(key);
    }

    /**
     * 缓存取数据
     *
     * @param key
     * @return
     */
    private T getFromCache(String key) throws Exception {
        try {
            return loadingCache.get(key);
        } catch (Exception e) {
            log.error("Exception:", e);
            if (e instanceof CacheLoader.InvalidCacheLoadException) {
                return null;
            }
            throw new Exception(e);
        }
    }

}
