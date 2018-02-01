package com.edu.entity;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduledJob extends QuartzJobBean{
	
	private static final Logger logger = LoggerFactory.getLogger(FirstScheduledJob.class);

	private AnotherBean anotherBean;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		logger.debug("FirstScheduledJob executeInternal execute ...");
		this.anotherBean.printMessage();
	}
	
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}

