package com.kuang.demo2;

import java.io.PushbackReader;

public class UserServiceProxy implements  UserService{

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    private  UserServiceImpl userService;



    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        userService.add();
    }

    @Override
    public void update() {
        userService.add();
    }

    @Override
    public void query() {
        userService.add();
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
