package com.ensa.graphql.controllers;


import com.ensa.graphql.entities.User;
import com.ensa.graphql.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor

@Controller
public class UserController {

    private final UserService userService;

    @QueryMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
