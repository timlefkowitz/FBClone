package com.fbclone.models.RelationshipHome.userTable;

import com.fbclone.models.RelationshipHome.user;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name = "userProfile")
public class userProfile{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

// trying to get work done on the via/bus haha

    @Column(name = "userBio", nullable = true ,  length = 200)
    private String userBio;

//    @Column(name = "userProfileContent", nullable = true )
//    private Timestamp userProfileContent;
//
//    @Column(name = "lastLogin", length = 10)
//    private Timestamp lastLogin;

    @Column(name = "intro", length = 100 , nullable = true)
    private String intro;


    // Connecting relationships
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
//    private user owner;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "userProfile") // was this known as up_ip???? if so I'm wondering why.
//    private user ownerToProfile;


    // Inseret Constructor

    public userProfile(String userBio, Timestamp userProfileContent, Timestamp lastLogin, String intro, user owner, user ownerToProfile) {
        this.userBio = userBio;
//        this.userProfileContent = userProfileContent;
//        this.lastLogin = lastLogin;
        this.intro = intro;
//        this.owner = owner;
//        this.ownerToProfile = ownerToProfile;
    }

    public userProfile() {

    }


    // Update constructor





    // GETTERS AND SETTERS




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

}
