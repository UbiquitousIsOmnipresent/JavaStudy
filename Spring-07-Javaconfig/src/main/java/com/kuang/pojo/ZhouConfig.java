package com.kuang.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZhouConfig {
    @Bean
    public User getUser(){

        return new User();
    }
}
