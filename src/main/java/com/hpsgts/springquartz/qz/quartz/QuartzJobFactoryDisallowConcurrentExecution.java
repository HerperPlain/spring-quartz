package com.hpsgts.springquartz.qz.quartz;

import com.hpsgts.springquartz.qz.bo.ScheduleJob;
import com.hpsgts.springquartz.util.TaskUtils;
import org.apache.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 有状态任务
 */
@DisallowConcurrentExecution
public class QuartzJobFactoryDisallowConcurrentExecution implements Job{
    public final Logger log = Logger.getLogger(this.getClass());
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("开始执行定时任务: 有状态任务");
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        TaskUtils.invokMethod(scheduleJob);
    }
}
