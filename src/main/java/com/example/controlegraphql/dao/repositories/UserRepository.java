package com.example.controlegraphql.dao.repositories;

import com.example.controlegraphql.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;


public interface UserRepository extends JpaRepository<User,Long> {

    public User getUserByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.date_Naissance = :date")
    public User getUserByDate_Naissance(@Param("date") Date date);

}
