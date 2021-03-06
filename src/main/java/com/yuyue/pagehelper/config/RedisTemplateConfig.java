package com.yuyue.pagehelper.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Title: RedisTemplateConfig * @Description:redis初始化设置编码，防止keyvalue存到服务器乱码
 * @Auther: yuyue
 * @Version: 1.0
 * @create 2020/6/11 18:23
 */
@Configuration
public class RedisTemplateConfig {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 解决redis问题
     *
     * @return RedisTemplate
     */
    @Bean
    public RedisTemplate redisTemplateInit() {

        //设置序列化Key的实例化对象
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置序列化Value的实例化对象
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return redisTemplate;

    }

}
