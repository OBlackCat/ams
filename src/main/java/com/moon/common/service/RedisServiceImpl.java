package com.moon.common.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 22:18
 * @description: RedisService 的实现
 */
@Component
public class RedisServiceImpl<K, V> implements RedisService<K, V> {

    @Resource
    RedisTemplate redisTemplate;


    /**
     * @param key
     * @param value
     * @param expireIn 单位：毫秒
     */
    @Override
    public void set(K key, V value, long expireIn) {
        redisTemplate.opsForValue().set(key, value, expireIn, TimeUnit.MILLISECONDS);
    }

    @Override
    public Object get(K key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public Object delete(K key) {
        Object oldObject = this.get(key);
        redisTemplate.delete(key);
        return oldObject;
    }
}
