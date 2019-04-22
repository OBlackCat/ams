package com.moon.common.service;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 22:17
 * @description: redis 的简单公共服务接口
 */
public interface RedisService<K, V> {

    void set(K key, V value, long expireIn);

    Object get(K key);

    Object delete(K key);
}
