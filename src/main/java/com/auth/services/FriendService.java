package com.auth.services;

import com.auth.entities.Friends;
import com.auth.entities.User;
import com.auth.repositories.FriendsRepo;

import com.auth.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendsRepo repository ;
    @Autowired
    private UserService userService;
    public Friends saveFriend(Friends friend){
        return repository.save(friend);
    }

    public List<Friends> getFriend(){
        return repository.findAll();
    }


    public List<User> getByUserId(int id){
        List<Friends> allResult = new ArrayList<Friends>(repository.findByUs1(id));
        allResult.addAll(repository.findByUs2(id));
        List<User>allUsers= new ArrayList<User>();
        for (int i=0 ;i<allResult.size();i++){
            if(allResult.get(i).getUs1()==id){
                allUsers.add(userService.getUserById(allResult.get(i).getUs2()));
            } else if (allResult.get(i).getUs2()==id) {
                allUsers.add(userService.getUserById(allResult.get(i).getUs1()));
            }
        }
        return allUsers;
    }





}
