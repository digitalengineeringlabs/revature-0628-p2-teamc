package com.rev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rev.model.User;



public interface UserDAO extends JpaRepository<User, Integer>{

}
