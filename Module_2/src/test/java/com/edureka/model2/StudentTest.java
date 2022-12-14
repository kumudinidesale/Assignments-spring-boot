package com.edureka.model2;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextAutowireByName.xml");
		
		Student student = context.getBean("student", Student.class);
		Assertions.assertThat(student).isNotNull();
		
		System.out.println("Student Name : "+student.getName()+"\t Hostel Name : "+student.getHostel().getHostelName());
	}

}
