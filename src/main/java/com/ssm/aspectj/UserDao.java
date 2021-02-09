package com.ssm.aspectj;

import com.ssm.aspectj.Model.User;

public interface UserDao {
    /*添加用户*/
    public int addUser(User user);
    /*删除用户*/
    public int deleteUser(int id);
    /*更新用户*/
    public int updateUser(User user);

    /*通过ID查询*/
    public User findUserById(int id);

}
