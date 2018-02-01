package com.edu.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("anotherBean")
public class AnotherBean {

	private static final Logger logger = LoggerFactory.getLogger(AnotherBean.class);

	public void printMessage() {
		logger.debug("AnotherBean printMessage execute ...");
	}

}
