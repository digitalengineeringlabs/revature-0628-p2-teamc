package com.project2.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project2.main.model.User;

public interface UserDAO extends JpaRepository<User, Integer>{
  @Query(value = "select * from userlogin u where u.manager = true", nativeQuery = true)
  public List<User> findManagers();

  @Query(value = "select * from userlogin u where u.manager = false", nativeQuery = true)
  public List<User> findEmployees();

  public User findByUsernameAndUserpassword( String username, String password);
}

