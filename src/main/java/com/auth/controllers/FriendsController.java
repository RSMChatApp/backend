package com.auth.controllers;

import com.auth.entities.Friends;
import com.auth.entities.User;
import com.auth.services.FriendService;
import com.auth.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendsController {
    @Autowired
    private FriendService service;

    @PostMapping("/addfriend")
    public Friends addFriend(@RequestBody Friends friend) {
        return service.saveFriend(friend);
    }

    @GetMapping("/findFriendsById/{id}")
    public List<User> findFriendsById(@PathVariable int id) {
        return service.getByUserId(id);
    }

}