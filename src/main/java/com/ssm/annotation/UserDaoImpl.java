package com.ssm.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("userDao.save do!");
    }
}
