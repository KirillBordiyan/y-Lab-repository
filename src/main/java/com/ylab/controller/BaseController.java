package com.ylab.controller;

import com.ylab.model.User;

public interface BaseController {
    User createUser(String name, String email, String password);
    void deleteUser(String password);
    void deleteUserByAdmin(String email, String password);
    User changeName(String updatedName, String password);
    User changeEmail(String updatedEmail, String password);
    User changePassword(String oldPassword, String newPassword);


}
