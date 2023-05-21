package com.auth.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;
@Entity
@Data
@Table(name="users")


public class User {
    @Id
    @GeneratedValue
    //Register
    @Column(name="ID")
    private  int id;
    @Column(name = "NAME")
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PASSWORD")
    private String password;

    //fill data
    @Column(nullable = true)
    private String nickname;
    @Column(nullable = true)
    private String bio;
    @Column(nullable = true)
    private String imgCover;
    @Column(nullable = true)
    private String mainImg;


}
