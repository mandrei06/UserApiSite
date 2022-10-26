package com.example.APIApp.Controller;


import com.example.APIApp.Model.User;
import com.example.APIApp.Model.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestAPIController {


    @GetMapping("/home")
    public String homePage() {
        if (UserRepository.session)
            return "mainPage";
        return "pleaseLogIn";
    }

    @GetMapping("/myAccount")
    public String myAccount() {
        if (UserRepository.session)
            return "myAccount";
        return "pleaseLogIn";
    }

    @GetMapping("/bankAccount")
    public String bankAccount() {
        if (UserRepository.session)
            return "bankAccount";
        return "pleaseLogIn";
    }

    @GetMapping("/notifications")
    public String notifications() {
        if (UserRepository.session)
            return "notifications";
        return "pleaseLogIn";
    }

    @GetMapping("/logOut")
    public String logOut() {
        UserRepository.session = false;
        return "logOutSuccessfully";
    }


    @PostMapping("/signup")
    public String signUp() {
        return "signup";
    }

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last, @RequestParam String username, @RequestParam String password, @RequestParam String repeatPass) {
        if (!password.equals(repeatPass)) {
            return "errorPass";

        } else {
            User user = new User();
            user.setFirstName(first);
            user.setLastName(last);
            user.setUsername(username);
            user.setPassword(password);
            UserRepository.save(user);
            System.out.println(user);
        }
        return "success";
    }

    @PostMapping("/login")
    public String addCustomer(@RequestParam(defaultValue = "") String username, @RequestParam(defaultValue = "") String password) {
        System.out.println(UserRepository.userList.size());
        if (UserRepository.userList.size() != 0) {
            if ((password.equals(UserRepository.userList.get(0).getPassword())&&username.equals(UserRepository.userList.get(0).getUsername())) || UserRepository.session) {
                UserRepository.session = true;
                return "mainPage";
            }
        }
        return "errorPassword";
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestParam String first, @RequestParam String last, @RequestParam String username, @RequestParam String password, @RequestParam String repeatPass) {
        if (!password.equals(repeatPass)) {
            return "errorPass";

        } else {
            UserRepository.userList.get(0).setFirstName(first);
            UserRepository.userList.get(0).setLastName(last);
            UserRepository.userList.get(0).setUsername(username);
            UserRepository.userList.get(0).setPassword(password);

        }
        return "successUpdate";
    }

}
