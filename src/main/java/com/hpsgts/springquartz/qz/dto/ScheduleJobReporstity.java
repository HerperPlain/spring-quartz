package com.hpsgts.springquartz.qz.dto;

import com.hpsgts.springquartz.qz.bo.ScheduleJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleJobReporstity  extends JpaRepository<ScheduleJob,Long> {
}
