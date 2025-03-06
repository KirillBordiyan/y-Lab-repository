package com.ylab.service;

import com.ylab.model.User;
import com.ylab.service.toImpl.CreatingUserService;
import com.ylab.service.toImpl.UpdatingUserService;

public class UserServiceImplementation implements UpdatingUserService, CreatingUserService {

    @Override
    public User createUser(String name, String email, String password) {
        return null;
    }

    @Override
    public void deleteUser(String password) {

    }

    @Override
    public void deleteUserByAdmin(String email, String password) {

    }

    @Override
    public String changeName(String updated, String password) {
        return "";
    }

    @Override
    public String changePassword(String updatedPassword, String password) {
        return "";
    }

    @Override
    public String changeEmail(String updatedEmail, String password) {
        return "";
    }
}
