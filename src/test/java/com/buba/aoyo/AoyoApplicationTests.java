package com.buba.aoyo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AoyoApplicationTests {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void contextLoads() {
        stringRedisTemplate.opsForValue().set("aa","okokok");
        System.out.println(stringRedisTemplate.opsForValue().get("aa"));
    }

}
