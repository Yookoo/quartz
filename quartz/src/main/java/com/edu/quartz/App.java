package com.edu.quartz;

import org.quartz.JobExecutionException;

/**
 * 
 * 
 * 主函数
 * @author Administrator
 *
 */
public class App {

	public static void main(String[] args) throws JobExecutionException {

		HelloJob helloJob = new HelloJob();
		helloJob.execute(null);
		
	}

}
