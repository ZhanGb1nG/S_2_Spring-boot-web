package com.zhang.study.dao;

import com.zhang.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @Author ZhanG_b1nG
 * @Date 2020/4/12 11:05
 * @Version 1.0
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveUser(User user) {
        jdbcTemplate.update("insert into t_user(name) values(?)", user.getName());
    }

    public User getUserById(Long id) {
        User user = new User();
        try {
            RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
            user = jdbcTemplate.queryForObject("select * from t_user where id=?", rowMapper, id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return user;
    }
}
