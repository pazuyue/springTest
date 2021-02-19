package com.ssm.aspectj;

import com.ssm.aspectj.Model.User;

public interface UserDao {


    /*通过ID查询*/
    public User findUserById(int id);
}
