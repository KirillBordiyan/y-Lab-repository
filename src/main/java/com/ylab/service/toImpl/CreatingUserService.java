package com.ylab.service.toImpl;

import com.ylab.model.User;

public interface CreatingUserService {
    User createUser(String name, String email, String password);
    void deleteUser(String password);
    void deleteUserByAdmin(String email, String password);

}
