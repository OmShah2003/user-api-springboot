package com.example.userapi.controller;

import com.example.userapi.exception.UserAlreadyRegisteredException;
import com.example.userapi.exception.UserNotFoundException;
import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("User registered successfully");
        } catch (UserAlreadyRegisteredException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<User> fetchUser(@RequestParam String username) {
        try {
            User user = userService.fetchUser(username);
            return ResponseEntity.ok(user);
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}
