package com.yuyue.pagehelper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: RedisTest * @Description:redis test
 * @Auther: yuyue
 * @Version: 1.0
 * @create 2020/6/11 17:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    @Transactional
    public void test01() {

        // redisTemplate.opsForValue().set("birthday", "1996年11月11日");
        Assert.assertEquals("比较", "男", redisTemplate.opsForValue().get("sex"));
        System.out.println(redisTemplate.opsForValue().get("address"));
        System.out.println(redisTemplate.opsForValue().get("birthday"));

    }

}
