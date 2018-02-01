package com.edu.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {

	private static final Logger logger = LoggerFactory.getLogger(MyBean.class);

	private void printMessage() {
		logger.debug("MyBean printMessage execute ...");
	}
}
