package com.example.controlegraphql.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "User_Table")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    private String name;
    private String email;
    private Date date_Naissance;
    private String password;
}
