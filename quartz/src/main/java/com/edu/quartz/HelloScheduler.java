package com.edu.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloScheduler {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloScheduler.class);

	public static void main(String[] args) throws SchedulerException {
		
		
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "myGroup").build();

		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTriger", "myGroup").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		
		scheduler.scheduleJob(jobDetail, trigger);
		
		scheduler.start();
		logger.debug("scheduler is start ...");
	
	}
}
