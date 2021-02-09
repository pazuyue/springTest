package com.ssm.annotation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    public void save() {
        this.userDao.save();
        System.out.println("执行 userService.save");
    }
}
