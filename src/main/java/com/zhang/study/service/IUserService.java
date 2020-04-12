package com.zhang.study.service;

import com.zhang.study.pojo.User;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/12 11:19
 * @Version 1.0
 **/
public interface IUserService {
    void saveUser(User user);

    User getUser(Long id);
}
