package com.example.crud_boot_kata.DAO;

import com.example.crud_boot_kata.model.User;



import java.util.List;

public interface UserRepo {
    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
