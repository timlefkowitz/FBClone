package com.fbclone.models.userTable;



import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user")
    private long user;

// trying to get work done on the via/bus haha

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String middleName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    private String userName;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String passwordHash;

    @Column(nullable = false, length = 100)
    private Timestamp registeredAt;

    @Column(nullable = false, length = 100)
    private Timestamp lastLogin;

    @Column(nullable = false, length = 100)
    private String intro;

    @Column(nullable = false, length = 100)
    private String profile;

    @Column(nullable = false, length = 100)
    private long mobile;

    @Column(nullable = false, length = 100)
    private String status;



    
}
