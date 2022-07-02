package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.core.entities.User;
import com.geekbrains.spring.web.core.services.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping
    public List<User> getAllUsers() {
        return usersService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return usersService.findById(id).get();
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return usersService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        usersService.deleteById(id);
    }
}
