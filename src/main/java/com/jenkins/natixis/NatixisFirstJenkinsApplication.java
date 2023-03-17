package com.jenkins.natixis;

import javax.annotation.PostConstruct;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NatixisFirstJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(NatixisFirstJenkinsApplication.class);
    
	@PostConstruct
	public void init() {
		logger.info("inside logger ...");
	}
	public static void main(String[] args) {
		SpringApplication.run(NatixisFirstJenkinsApplication.class, args);
		
		logger.info("hello");
		
	}

}
