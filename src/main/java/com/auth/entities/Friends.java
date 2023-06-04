package com.auth.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;

@Entity
@Data
@Table(name="friends")
@Embeddable
public class Friends implements Serializable {
    @Id
    @GeneratedValue
    //Register
    @Column(name="ID")
    private  int id;

    @Column(name="user1")
    private  int us1;

    @Column(name="user2")
    private  int us2;


}
