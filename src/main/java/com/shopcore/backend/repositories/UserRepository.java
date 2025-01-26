package com.shopcore.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopcore.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
