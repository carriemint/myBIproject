package com.carrie.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class RedisLimitManagerTest {
    @Resource
    private RedisLimitManager redisLimitManager;
    @Test
    void doRateLimit() {
        String userId="1";
        for (int i = 0; i < 5; i++) {
            redisLimitManager.doRateLimit(userId);
            System.out.println("成功");
        }
    }
}