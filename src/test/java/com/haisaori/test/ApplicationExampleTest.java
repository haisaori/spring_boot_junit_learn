package com.haisaori.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.haisaori.component.MvcTestingExampleApplication;
import com.haisaori.component.models.CollegeStudent;
import com.haisaori.component.models.StudentGrades;

@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class ApplicationExampleTest {
	
	private int count = 0;
	
	@Value("${info.app.name}")
	private String appInfo;
	
	@Value("${info.app.description}")
	private String appDescription;
	
	@Value("${info.app.version}")
	private String appVersion;
	
	@Value("${info.school.name}")
	private String schoolName;
	
	@Autowired
	CollegeStudent student;
	
	@Autowired
	StudentGrades studentGrades;
	
	@BeforeEach
	public void beforeEach() {
		count = count + 1;
		System.out.println("Testing " + appInfo + " which is " + appDescription + " Version " + appVersion + ". execution of test method " + count);
		
		student.setFirstname("Joko");
		student.setLastname("Maningki");
		student.setEmailAddress("joko.maningki@smansa.com");
		studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0, 85.0, 76.50, 91.75)));
		student.setStudentGrades(studentGrades);
	}
	
	@Test
	void basicTest() {
		
	}
}
