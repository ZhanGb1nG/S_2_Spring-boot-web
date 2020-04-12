package com.zhang.study.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 学生类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/11 9:50
 * @Version 1.0
 **/
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private Double score;

    public Student() {
    }

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
