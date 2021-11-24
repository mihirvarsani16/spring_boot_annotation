package com.spring_boot_annotation.spring_boot_annotation.service;

import org.springframework.stereotype.Service;

@Service
public class Services {

    public String message() {
        return "this message from service side";
    }

}
