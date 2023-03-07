package com.gientech.account.config;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MQProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 15:47
 * @Description: com.gientech.account.config
 * @version: 1.0
 */
@Configuration
public class MiddleConfig {

    @Bean
    public MQProducer getProducer() throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("ooxx");
        producer.setNamesrvAddr("192.168.150.11:9876;192.168.150.12:9876");
        producer.start();
        return producer;
    }
}
