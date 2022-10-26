package com.example.APIApp.Model;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user;

    @BeforeEach
    public void initialize(){
        user=new User();
        user.setId(1);
        user.setFirstName("Andrei");
        user.setLastName("Marincas");
        user.setUsername("andym");
        user.setPassword("pass");

    }
    @Test
    void getId() {
        Assertions.assertEquals(user.getId(),1);
    }

    @Test
    void setId() {
        user.setId(2);
        Assertions.assertEquals(user.getId(),2);
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals(user.getFirstName(),"Andrei");
    }

    @Test
    void setFirstName() {
        user.setFirstName("Andy");
        Assertions.assertEquals(user.getFirstName(),"Andy");
    }

    @Test
    void getLastName() {
        Assertions.assertEquals(user.getLastName(),"Marincas");
    }

    @Test
    void setLastName() {
        user.setLastName("M");
        Assertions.assertEquals(user.getLastName(),"M");
    }

    @Test
    void getUsername() {
        Assertions.assertEquals(user.getUsername(),"andym");
    }

    @Test
    void setUsername() {
        user.setUsername("andym2");
        Assertions.assertEquals(user.getUsername(),"andym2");
    }

    @Test
    void getPassword() {
        Assertions.assertEquals(user.getPassword(),"pass");

    }

    @Test
    void setPassword() {
        user.setPassword("pass2");
        Assertions.assertEquals(user.getPassword(),"pass2");
    }
}