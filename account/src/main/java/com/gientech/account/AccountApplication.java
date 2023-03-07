package com.gientech.account;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: zhoulei
 * @Date: 2023/3/7 - 15:25
 * @Description: com.gientech.account
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
