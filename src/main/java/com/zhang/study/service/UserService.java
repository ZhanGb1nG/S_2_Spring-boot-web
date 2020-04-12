package com.zhang.study.service;

import com.zhang.study.dao.UserDao;
import com.zhang.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/12 11:20
 * @Version 1.0
 **/
@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUserById(id);
    }
}
