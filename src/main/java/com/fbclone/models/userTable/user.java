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

// trying to get work done on the via/bus haha

    @Column(nullable = false, length = 100)
    private String firstName

    @Column(nullable = false, length = 100)
    private String middleName

        @Column(nullable = false, length = 100)
    private String lastName


userName
Email
Password Hash
Registered At
Last Login
Intro
Profile
Mobile
Status



    
}
