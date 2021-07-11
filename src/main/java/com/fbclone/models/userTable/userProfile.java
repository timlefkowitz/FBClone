package com.fbclone.models.userTable;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name = "userProfile")
public class userProfile {

    public userProfile(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

// trying to get work done on the via/bus haha

    @Column(name = "userBio", length = 200)
    private String userBio;

    @Column(name = "userProfileContent")
    private Timestamp userProfileContent;

    @Column(name = "lastLogin", length = 10)
    private Timestamp lastLogin;

    @Column(name = "intro", length = 100)
    private String intro;


    // Connecting relationships
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
    private user user;


    // Inseret Constructor

    public userProfile(String userBio, Timestamp userProfileContent, Timestamp lastLogin, String intro, com.fbclone.models.userTable.user user) {
        this.userBio = userBio;
        this.userProfileContent = userProfileContent;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.user = user;
    }


    // Update constructor


    public userProfile(long id, String userBio, Timestamp userProfileContent, Timestamp lastLogin, String intro, com.fbclone.models.userTable.user user) {
        this.id = id;
        this.userBio = userBio;
        this.userProfileContent = userProfileContent;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.user = user;
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

    public com.fbclone.models.userTable.user getUser() {
        return user;
    }

    public void setUser(com.fbclone.models.userTable.user user) {
        this.user = user;
    }
}
