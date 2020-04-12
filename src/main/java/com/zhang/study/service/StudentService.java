package com.zhang.study.service;

import com.zhang.study.pojo.Student;
import com.zhang.study.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/11 20:08
 * @Version 1.0
 **/
@Service
public class StudentService{
    @Autowired
    private StudentRepository studentRepository;

    public Student findByName(String name) {
        Student student = null;
        try {
            student = studentRepository.findByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student findByIdAndName(Integer id, String name) {
        Student student = null;
        try {
            student = studentRepository.findByIdAndName(id, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student findStudent(String name) {
        Student student = null;
        try {
            student = studentRepository.findStudent(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

}
