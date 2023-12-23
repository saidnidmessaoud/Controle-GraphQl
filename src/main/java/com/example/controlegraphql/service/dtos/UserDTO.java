package com.example.controlegraphql.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDTO {
    private String name;
    private String email;
    private Date date_Naissance;
}
