package com.hpsgts.springquartz.qz.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Configuration
@Component // 此注解必加
@EnableScheduling // 此注解必加
public class QuartzInit {
    private static final Logger logger =  LoggerFactory.getLogger(QuartzInit.class);

    public void init(){
        logger.info("启动初始化定时任务=========================开始初始化【QuartzInit.init】");
        logger.info("启动初始化定时任务=========================初始化任务池结束【QuartzInit.init】");

    }
}
