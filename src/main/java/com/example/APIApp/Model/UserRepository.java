package com.example.APIApp.Model;

import com.example.APIApp.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> userList=new ArrayList<>();
    public static boolean session=false;

    public static void save(User user) {
        userList.add(user);
    }
}
