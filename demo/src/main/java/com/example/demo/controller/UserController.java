package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    UserService UserService;
    
    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers(){
        return UserService.getAll();
    }
}
    

    

