package com.shopcore.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopcore.backend.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(null, "Lucas Sallum", "lucas.sallum@gmail.com", "15936185247", "123456");

        return ResponseEntity.ok(user);
    }
}
