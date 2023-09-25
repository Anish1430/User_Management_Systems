package com.Anish.User_Management_Systems.controller;

import com.Anish.User_Management_Systems.model.User;
import com.Anish.User_Management_Systems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
      @Autowired
    UserService userService;

      //get Api

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    //Post Api
    @PostMapping("users")
    public String addUser(@RequestBody List<User> newUser){
        return userService.addUser(newUser);
    }

}
