package com.Anish.User_Management_Systems.service;

import com.Anish.User_Management_Systems.IUserRepo.UserRepo;
import com.Anish.User_Management_Systems.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
   return  (List<User>) userRepo.findAll();
    }

    public String addUser(List<User> newUser) {
        userRepo.saveAll(newUser);
        return "Added a User";
    }
}
