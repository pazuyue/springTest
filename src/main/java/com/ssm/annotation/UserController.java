package com.ssm.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Resource
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("运行 UserController.save()");
    }
}
