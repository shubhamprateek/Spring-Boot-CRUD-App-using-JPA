package com.jpa.jpacrud.Service;

import com.jpa.jpacrud.Entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    // read operation
    List<User> fetchUserList();

    // update operation
    User updateUser(User user, int userId);

    // delete operation
    void deleteUserById(int userId);
}
