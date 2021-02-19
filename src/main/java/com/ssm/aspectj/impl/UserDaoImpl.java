package com.ssm.aspectj.impl;

import com.ssm.aspectj.Model.User;
import com.ssm.aspectj.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    public User findUserById(int id) {
        return this.getSqlSession().selectOne("com.ssm.po.UserMapper.findUserId",id);
    }

    public void destroy(){
        System.out.println("销毁bean");
    }

    public void init(){
        System.out.println("初始化bean");
    }

}
