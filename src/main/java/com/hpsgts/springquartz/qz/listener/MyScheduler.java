package com.hpsgts.springquartz.qz.listener;

import com.hpsgts.springquartz.qz.service.TaskService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
    private static final Logger logger =  LoggerFactory.getLogger(MyScheduler.class);
    @Autowired
    SchedulerFactoryBean schedulerFactoryBean;
    @Autowired
    private TaskService taskService;
    public void scheduleJobs() throws SchedulerException {
        logger.info("启动初始化定时任务=========================开始初始化【QuartzInit.init】");
        taskService.getAllJob();
        logger.info("启动初始化定时任务=========================初始化任务池结束【QuartzInit.init】");

    }


}
