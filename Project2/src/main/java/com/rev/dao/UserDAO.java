package com.rev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rev.model.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserDAO extends JpaRepository<User, Integer>{
    @Query(value = "select * from userlogin u where u.manager = true", nativeQuery = true)
    public List<User> findManagers();

    @Query(value = "select * from userlogin u where u.manager = false", nativeQuery = true)
    public List<User> findEmployees();

    public User findByUsernameAndUserpassword( String username, String password);
}
