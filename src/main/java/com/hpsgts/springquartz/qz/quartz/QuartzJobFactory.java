package com.hpsgts.springquartz.quartz;

import com.hpsgts.springquartz.bo.ScheduleJob;
import com.hpsgts.springquartz.util.TaskUtils;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 无状态任务
 */
public class QuartzJobFactory implements Job {
    public final Logger log = Logger.getLogger(this.getClass());
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        TaskUtils.invokMethod(scheduleJob);
    }
}