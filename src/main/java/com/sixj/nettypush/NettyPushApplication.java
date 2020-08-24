package com.sixj.nettypush;

import cn.hutool.core.lang.Assert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class NettyPushApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettyPushApplication.class, args);
    }
}
