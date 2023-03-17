package com.jenkins.natixis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NatixisFirstJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(NatixisFirstJenkinsApplication.class);
	
	@Test
	void contextLoads() {
		
		logger.info("testing...");
		assertEquals(10,10);
	}

}
