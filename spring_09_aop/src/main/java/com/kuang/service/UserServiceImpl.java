package com.kuang.service;

public class UserServiceImpl implements  UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void udate() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }
}
