package com.example.ace.repository;

import com.example.ace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    //@Query("Select u from User u WHERE u.username=:username ")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);


}
