package com.example.weslei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.weslei.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}