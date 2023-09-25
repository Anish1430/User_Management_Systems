package com.Anish.User_Management_Systems.controller;

import com.Anish.User_Management_Systems.model.User;
import com.Anish.User_Management_Systems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Delete the User by Id
    @DeleteMapping("user/id/{id}")
    public String getDeleteById(@PathVariable Long id){
        return userService.getDeleteById(id);
    }
//Put the User

    @PutMapping("user/email/id")
    public String updateUserById(@RequestParam Long id, @RequestParam String email) {
        return userService.updateUserById(id,email);
    }

}
