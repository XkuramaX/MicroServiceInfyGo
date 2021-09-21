package com.infygouser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygouser.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
