package com.crud.teste.controllers;

import com.crud.teste.domain.user.RequestUser;
import com.crud.teste.domain.user.UserRepository;
import com.crud.teste.domain.user.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public ResponseEntity getAllUsers() {
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
    }
    @PostMapping
    public ResponseEntity registerUser(@RequestBody @Valid RequestUser data) {
        Users user = new Users(data);
        repository.save(user);
        return ResponseEntity.ok().build();
    }

}
