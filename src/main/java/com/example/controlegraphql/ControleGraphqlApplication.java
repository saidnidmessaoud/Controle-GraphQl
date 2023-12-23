package com.example.controlegraphql;

import com.example.controlegraphql.dao.entities.User;
import com.example.controlegraphql.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControleGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleGraphqlApplication.class, args);
    }


    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
            List<User> users=List.of(
                    User.builder().name("said1").email("said1@gmail.com").date_Naissance(new Date()).password("1234").build(),
                    User.builder().name("said2").email("said2@gmail.com").date_Naissance(new Date()).password("1234").build(),
                    User.builder().name("said3").email("said3@gmail.com").date_Naissance(new Date()).password("1234").build(),
                    User.builder().name("said4").email("said4@gmail.com").date_Naissance(new Date()).password("1234").build()
            );

            users=userRepository.saveAll(users);
        };
    }
}
