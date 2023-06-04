package com.auth.repositories;

import com.auth.entities.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendsRepo extends JpaRepository<Friends,Integer> {
    List<Friends> findByUs1(int user1_id);
    List<Friends> findByUs2(int user2_id);
}

