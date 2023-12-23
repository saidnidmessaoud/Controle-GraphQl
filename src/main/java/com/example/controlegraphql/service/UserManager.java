package com.example.controlegraphql.service;

import com.example.controlegraphql.dao.entities.User;
import com.example.controlegraphql.service.dtos.UserDTO;
import org.springframework.stereotype.Component;


@Component
public interface UserManager {

    public UserDTO getUserByEmail(String email);
    public UserDTO getUserByDateNaissance(String date_Naissance);
    public UserDTO saveUser(User user);
    public UserDTO deleteUser(Long id);
}
