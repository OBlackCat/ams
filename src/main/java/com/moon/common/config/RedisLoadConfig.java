package com.moon.common.config;

        import org.springframework.context.annotation.PropertySource;
        import org.springframework.stereotype.Component;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:09
 * @description: redis的yml文件加载
 */
@Component
@PropertySource(value = "application-redis.yml", encoding = "UTF-8")
public class RedisLoadConfig {
}
