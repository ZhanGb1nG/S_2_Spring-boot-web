package com.zhang.study.dao;

import com.zhang.study.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 学生接口类
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/11 19:46
 * @Version 1.0
 **/
public interface StudentRepository extends JpaRepository<Student, Long> {

    /**
     * 通过名称查找学生
     *
     * @param name 名称
     * @Date 2020/4/11 19:51
     * @return com.zhang.study.pojo.Student
     * @Author ZhanG_b1nG
     */
    Student findByName(String name);

    /**
     * 通过id和名称查找学生
     *
     * @param id id
     * @param name 名称
     * @Date 2020/4/11 19:52
     * @return com.zhang.study.pojo.Student
     * @Author ZhanG_b1nG
     */
    Student findByIdAndName(Integer id, String name);

    /**
     * 查找学生
     *
     * @param name
     * @Date 2020/4/11 19:53
     * @return com.zhang.study.pojo.Student
     * @Author ZhanG_b1nG
     */
    @Query("from Student s where s.name =:name")
    Student findStudent(@Param("name") String name);

}
