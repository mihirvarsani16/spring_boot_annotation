package com.spring_boot_annotation.spring_boot_annotation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mypack.Any;

@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner {

	@Autowired
	// student component object
	@Qualifier("student2")
	private Student student;

	@Autowired
	private Date date;

	@Autowired
	private Emp emp;

	@Autowired
	private Hello hello;

	@Autowired
	private Any any;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.emp.yourName();
		this.any.hii();
		this.hello.hiii();

	}

}
