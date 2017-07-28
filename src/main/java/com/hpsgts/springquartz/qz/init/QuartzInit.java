package com.hpsgts.springquartz.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Configuration
@Component // 此注解必加
@EnableScheduling // 此注解必加
public class QuartzInit {
    private static final Logger LOGGER =  LoggerFactory.getLogger(QuartzInit.class);

    public void init(){
        System.out.println("启动初始化定时任务");

    }
}
