package com.zhang.study.controller;

import com.zhang.study.pojo.User;
import com.zhang.study.service.IUserService;
import com.zhang.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Usercontroller类
 * 类头部增加RequestMapping会报错
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/12 11:21
 * @Version 1.0
 **/
@RestController
public class Usercontroller {

    @Autowired
    private IUserService userService;

    /**
     * http://localhost/user/save?name=zhangsan
     *
     * @param name 
     * @Date 2020/4/12 12:14
     * @return java.lang.String
     * @Author ZhanG_b1nG
     */
    @RequestMapping("user/save")
    public String saveUser(String name) {
        userService.saveUser(new User(name));

        return "save successfully";
    }

    /**
     * http://localhost/user/get?id=2
     *
     * @param id
     * @Date 2020/4/12 12:13
     * @return com.zhang.study.pojo.User
     * @Author ZhanG_b1nG
     */
    @RequestMapping("user/get")
    public User getUser(Long id) {
        return userService.getUser(id);
    }

}
