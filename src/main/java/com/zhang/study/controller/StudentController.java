package com.zhang.study.controller;

import com.zhang.study.pojo.Student;
import com.zhang.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/11 20:18
 * @Version 1.0
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private static StudentService studentService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    /*@RequestMapping("/name")
    public Student findByName(String name) {
        return studentService.findByName(name);
    }

    public Student findByIdAndName(Integer id, String name) {
        return studentService.findByIdAndName(id, name);
    }

    @RequestMapping("/show")
    public Student findStudent(@RequestParam(value = "name")String name) {
        return studentService.findStudent(name);
    }*/

}
