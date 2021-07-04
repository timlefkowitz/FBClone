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

@Column(nullable = false, length = 100)
userName

@Column(nullable = false, length = 100)
Email

@Column(nullable = false, length = 100)
Password Hash

@Column(nullable = false, length = 100)
Registered At

@Column(nullable = false, length = 100)
Last Login

@Column(nullable = false, length = 100)
Intro

@Column(nullable = false, length = 100)
Profile

@Column(nullable = false, length = 100)
Mobile

@Column(nullable = false, length = 100)
Status



    
}
