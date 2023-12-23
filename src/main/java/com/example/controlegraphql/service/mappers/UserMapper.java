package com.example.controlegraphql.service.mappers;

import com.example.controlegraphql.dao.entities.User;
import com.example.controlegraphql.service.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private ModelMapper modelMapper= new ModelMapper();

    public User fromUserDtoToUser(UserDTO userDTO){
        return this.modelMapper.map(userDTO,User.class);
    }


    public UserDTO fromUserToUserDto(User user){
        return this.modelMapper.map(user,UserDTO.class);
    }
}
