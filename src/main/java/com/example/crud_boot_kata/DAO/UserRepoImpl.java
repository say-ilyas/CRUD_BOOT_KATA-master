package com.example.crud_boot_kata.DAO;

import com.example.crud_boot_kata.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
    public class UserRepoImpl implements UserRepo {

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        public List<User> getAllUsers() {
            return entityManager.createQuery("select u from User u", User.class).getResultList();
        }

        @Override
        public User getUserById(long id) {
            return entityManager.find(User.class,id);
        }

        @Override
        public void addUser(User user) {
            entityManager.persist(user);
        }

        @Override
        public void removeUser(long id) {
            entityManager.remove(getUserById(id));
        }

        @Override
        public void updateUser(User user) {
            entityManager.merge(user);
        }
    }
