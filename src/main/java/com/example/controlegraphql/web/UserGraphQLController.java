package com.example.controlegraphql.web;

import com.example.controlegraphql.dao.entities.User;
import com.example.controlegraphql.service.dtos.UserDTO;
import com.example.controlegraphql.service.UserManagerAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller

public class UserGraphQLController {

    @Autowired
    private UserManagerAction userManagerAction;

    @QueryMapping
    public UserDTO getUserByEmail(@Argument String email){
        return userManagerAction.getUserByEmail(email);
    }

    @QueryMapping
    public UserDTO getUserByDateNaissance(@Argument String date){
        return userManagerAction.getUserByDateNaissance(date);
    }

    @QueryMapping
    public UserDTO saveUser(@Argument("user") User user){
        return userManagerAction.saveUser(user);
    }

    @QueryMapping
    public UserDTO deleteUser(Long id){
        return userManagerAction.deleteUser(id);
    }

}
