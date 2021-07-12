package com.fbclone.models.userTable;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name = "userProfile")
public class userProfile extends user{



    public userProfile(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

// trying to get work done on the via/bus haha

    @Column(name = "userBio", nullable = true ,  length = 200)
    private String userBio;

    @Column(name = "userProfileContent", nullable = true )
    private Timestamp userProfileContent;

    @Column(name = "lastLogin", length = 10)
    private Timestamp lastLogin;

    @Column(name = "intro", length = 100 , nullable = true)
    private String intro;


    // Connecting relationships
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
    private user owner;


    // Inseret Constructor

    public userProfile(String userBio, Timestamp userProfileContent, Timestamp lastLogin, String intro, com.fbclone.models.userTable.user owner) {
        this.userBio = userBio;
        this.userProfileContent = userProfileContent;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.owner = owner;
    }


    // Update constructor


    public userProfile(long id, String userBio, Timestamp userProfileContent, Timestamp lastLogin, String intro, com.fbclone.models.userTable.user owner) {
        this.id = id;
        this.userBio = userBio;
        this.userProfileContent = userProfileContent;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.owner = owner;
    }


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

    public Timestamp getUserProfileContent() {
        return userProfileContent;
    }

    public void setUserProfileContent(Timestamp userProfileContent) {
        this.userProfileContent = userProfileContent;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public com.fbclone.models.userTable.user getOwner() {
        return owner;
    }

    public void setOwner(com.fbclone.models.userTable.user user) {
        this.owner = user;
    }
}
