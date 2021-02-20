package com.ssm.aspectj.impl;

import com.ssm.aspectj.Model.User;
import com.ssm.aspectj.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    public User findUserById(int id) {
        return this.getSqlSession().selectOne("com.ssm.po.UserMapper.findUserId",id);
    }


}
