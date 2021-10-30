package com.example.library.controller;

import com.example.library.model.User;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
@Validated
public class UserController {

    @Autowired
    UserService userService;

    /**
     C - creates a new resource
     R - reads a resource
     U - updates an existing resource
     D - deletes a resource
     */

    //* GET ALL USERS
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }

    //* CREATE USERS
    @PostMapping(value ="/create-user", consumes = "application/json", produces = "application/json")
    public void createUser(@RequestBody User user) {
        User newUser = User.builder().name(user.getName()).build();
        userService.save(newUser);
    }

    //* READ USER BY ID
    @GetMapping("/user/{id}")
    public Optional<User> getUser(Long id){
        return userService.findById(id);
    }

    //* UPDATE USER BY ID
    @PutMapping(value = "updateUser/{id}", consumes = "application/json", produces = "application/json")
    public User updateUser(Long id, @RequestBody User user) {
        System.out.println(id);
        Optional<User> userToBeUpdated = userService.findById(id);
        if (userToBeUpdated.isPresent()) {
            userToBeUpdated.get().setName(user.getName());
            userService.save(userToBeUpdated.get());
            return userToBeUpdated.get();
        } else {
            ResponseEntity.badRequest().body("User not found");
            return null;
        }
    }

    //* DELETE USER
    @DeleteMapping(value = "/delete-user/{id}")
    public void deleteUser(@PathVariable(value = "id") Long userId) {
        userService.deleteById(userId);

    }
}