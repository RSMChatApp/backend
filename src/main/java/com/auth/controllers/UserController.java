package com.auth.controllers;
import com.auth.entities.User;
import org.springframework.web.bind.annotation.*;

import com.auth.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



@RestController
@CrossOrigin
public class UserController {


        @Autowired
        private UserService service;

        @PostMapping("/addUser")
        public User addUser(@RequestBody User user) {
            return service.saveUser(user);
        }

//        @PostMapping("/addCats")
//        public List<User> addUsers(@RequestBody List<User> user) {
//            return service.saveUser(user);
//        }

        @GetMapping("/users")
        public List<User> findAllUsers() {
            return service.getUsers();
        }

        @GetMapping("/catById/{id}")
        public User findUserById(@PathVariable int id) {
            return service.getUserById(id);
        }

//        @GetMapping("/cat/{name}")
//        public User findCatByName(@PathVariable String name) {
//            return service.getCatBuName(name);
//        }

        @PutMapping("/update/{id}")
        public User updateUser(@RequestBody User user,@PathVariable int id) {


            return service.updateUser(user,id);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable int id) {
            return service.deleteUser(id);
        }
    }

