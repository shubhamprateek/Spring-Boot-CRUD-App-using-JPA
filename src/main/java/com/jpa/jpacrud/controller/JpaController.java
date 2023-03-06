package com.jpa.jpacrud.controller;

import com.jpa.jpacrud.Entity.User;
import com.jpa.jpacrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class JpaController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/read")
    public List<User> fetchUsersList(){
        return userService.fetchUserList();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") int userId){
        return userService.updateUser(user, userId);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") int userId){
        userService.deleteUserById(userId);
        return "User Deleted Successfully";
    }

}

