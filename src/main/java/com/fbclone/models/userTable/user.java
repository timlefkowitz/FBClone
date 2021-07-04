package com.fbclone.models.userTable;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user")
    private long user;
}
