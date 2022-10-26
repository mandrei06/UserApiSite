package com.example.APIApp.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void save() {
        User user=new User();
        UserRepository.userList.clear();
        UserRepository.save(user);
        Assertions.assertTrue(UserRepository.userList.size()==1);
    }
}