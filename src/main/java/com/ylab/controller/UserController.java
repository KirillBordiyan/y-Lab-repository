package com.ylab.controller;

import com.ylab.service.UserServiceImplementation;

public class UserController implements BaseConroller {

    private final UserServiceImplementation userService;

    public UserController(UserServiceImplementation userService) {
        this.userService = userService;
    }


}
