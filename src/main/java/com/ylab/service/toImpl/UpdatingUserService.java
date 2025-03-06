package com.ylab.service.toImpl;

public interface UpdatingUserService {

    String changeName(String updated, String password);
    String changePassword(String updatedPassword, String password);
    String changeEmail(String updatedEmail, String password);

}
