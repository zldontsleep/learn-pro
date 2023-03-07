package com.gientech.order.middle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 16:29
 * @Description: com.gientech.order.middle
 * @version: 1.0
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        //创建RedisTemplate对象
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        //设置ConnectionFactory
        redisTemplate.setConnectionFactory(connectionFactory);
        //设置Key的序列化，默认为StringRedisSerializer.UTF_8
        redisTemplate.setKeySerializer(RedisSerializer.string());
        //设置Value的序列化，默认为GenericJackson2JsonRedisSerializer
        redisTemplate.setValueSerializer(RedisSerializer.json());
        return redisTemplate;
    }

}
