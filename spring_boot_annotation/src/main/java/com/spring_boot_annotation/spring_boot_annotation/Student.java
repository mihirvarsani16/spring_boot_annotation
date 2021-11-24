package com.spring_boot_annotation.spring_boot_annotation;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void studying() {
        System.out.println(this.name + " is studing");
    }

}
