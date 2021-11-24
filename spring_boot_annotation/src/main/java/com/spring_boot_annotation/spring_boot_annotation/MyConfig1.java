package com.spring_boot_annotation.spring_boot_annotation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(value = Hello.class)
public class MyConfig1 {

}
