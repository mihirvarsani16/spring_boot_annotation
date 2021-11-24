package com.spring_boot_annotation.spring_boot_annotation;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = { "mypack" })

public class MyConfig {

    // object is not need to manage us object is manage by spring
    // getstudent() method return a bean that manage by spring container
    @Bean("student1")
    @Lazy
    public Student getStudent() {
        System.out.println("creating first student object");
        return new Student("student1");
    }

    @Bean("student2")
    @Lazy
    public Student createStudent() {
        System.out.println("creating second student object");
        return new Student("student2");
    }

    @Bean
    public Date getDate() {
        System.out.println("creating date object");
        return new Date();
    }
}
