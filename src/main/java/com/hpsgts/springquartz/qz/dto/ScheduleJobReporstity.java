package com.hpsgts.springquartz.dto;

import com.hpsgts.springquartz.bo.ScheduleJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleJobReporstity  extends JpaRepository<ScheduleJob,Long> {
}
