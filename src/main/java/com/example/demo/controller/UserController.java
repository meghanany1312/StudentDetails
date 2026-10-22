package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id){

            return this.userService.getUser(id);

    }

    @GetMapping("/all")
    public List<User> getAllUsers() {

        return this.userService.getAllUsers();
    }

    @PostMapping("/save")
    public User postMethod(@RequestBody User user) {

        return this.userService.saveUser(user);
    }

    @PutMapping("/update/{id}/{email}")
        public User putMethod(@PathVariable Integer id,@PathVariable String email) {
            return this.userService.updateUser(id,email);
        }

    @DeleteMapping("/delete/{id}")
        public String  deleteMethod(@PathVariable Integer id) {
        this.userService.deleteUser(id);

            return "Deleted user: " +id;


        }
}
