package com.hpsgts.springquartz.qz.listener;

import com.hpsgts.springquartz.qz.spring.SpringJobFactory;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Configuration
@Component // 此注解必加
@EnableScheduling // 此注解必加
public class SchedulerListener implements ApplicationListener<ContextRefreshedEvent> {
    public static Logger logger = LoggerFactory.getLogger(SchedulerListener.class);
    @Autowired
    private SpringJobFactory springJobFactory;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
            logger.info("==========================SchedulerListener.onApplicationEvent is running {}",event);
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setJobFactory(springJobFactory);
        //是否支持集群 true :支持  false: 不支持
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        return schedulerFactoryBean;
    }

    @Bean
    public Scheduler scheduler() {
        Scheduler scheduler = schedulerFactoryBean().getScheduler();
        return scheduler;
    }

}
