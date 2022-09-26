package com.example.crud_boot_kata.service;
import com.example.crud_boot_kata.DAO.UserRepo;
import com.example.crud_boot_kata.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

    @Service

    public class UserServiceImpl implements UserService {

        private final UserRepo userRepo;

        @Autowired
        public UserServiceImpl(UserRepo userRepo) {
            this.userRepo = userRepo;
        }

        @Override
        public List<User> getAllUsers() {
            return userRepo.getAllUsers();
        }

        @Override
        public Object getUserById(long id) {
            return userRepo.getUserById(id);
        }

        @Override
        @Transactional
        public void addUser(User user) {
            userRepo.addUser(user);
        }

        @Override
        public void removeUser(long id) {
            userRepo.removeUser(id);
        }

        @Override
        public void updateUser(User user) {
            userRepo.updateUser(user);
        }
    }

