package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleBeanTest2 {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextAroundAdvisor.xml");
		
		SampleBean sampleBean = (SampleBean) context.getBean("proxy");
		Assertions.assertThat(sampleBean).isNotNull();
		
		sampleBean.actualLogicMethod();
		
	}

}
