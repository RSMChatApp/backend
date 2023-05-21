package com.auth.services.impl;

import com.auth.entities.User;
import com.auth.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repository ;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUser(List<User> cats){
        return repository.saveAll(cats);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

   // public User getUserBuName(String name){
        //return repository.findBy(name);
    //}

    public String deleteUser(int id){
        repository.deleteById(id);
        return ":P Removed" +id;
    }

    public User updateUser(User user,int id){
        User existingUser=repository.findById(id).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setNickname(user.getNickname());
        existingUser.setBio(user.getBio());
        existingUser.setImgCover(user.getImgCover());
        existingUser.setMainImg(user.getMainImg());


        return repository.save(existingUser);
    }

}

