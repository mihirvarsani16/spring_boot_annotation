package com.spring_boot_annotation.spring_boot_annotation.controller;

import com.spring_boot_annotation.spring_boot_annotation.Student;
import com.spring_boot_annotation.spring_boot_annotation.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MyController {

    @Autowired
    @Qualifier("student1")
    private Student student;

    @Autowired
    private Services services;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    // @ResponseBody
    // what ever you send that convert is json and pack in httpresponse.
    //
    public Student home(@RequestBody Student student1) {
        student1.studying();
        System.out.println("this is home page");

        // return "this is home page";
        // this.student.setName("hii bro");
        return this.student;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String user(@PathVariable("id") int id) {

        return String.valueOf(id);
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message() {

        return this.services.message();
    }
}
