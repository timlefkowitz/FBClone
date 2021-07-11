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

    @Column(name = "firstName", length = 20)
    private String firstName;

    @Column(name = "middleName", length = 20)
    private String middleName;

    @Column(name = "lastName", length = 20)
    private String lastName;

    @Column(name = "userName", length = 100)
    private String userName;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "passwordHash", length = 100)
    private String passwordHash;

    @Column(name = "registeredAt", length = 10)
    private Timestamp registeredAt;

    @Column(name = "lastLogin", length = 10)
    private Timestamp lastLogin;

    @Column(name = "intro", length = 100)
    private String intro;

    @Column(name = "profile")
    private String profile;

    @Column(name = "mobile", length = 16)
    private long mobile;

    @Column(name = "status", length = 30)
    private String status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
    private user user;


    // Inseret Constructor


    public userProfile(String firstName, String middleName, String lastName, String userName, String email, String passwordHash, Timestamp registeredAt, Timestamp lastLogin, String intro, String profile, long mobile, String status) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.registeredAt = registeredAt;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.profile = profile;
        this.mobile = mobile;
        this.status = status;
    }

    // Update constructor


    public userProfile(long id, String firstName, String middleName, String lastName, String userName, String email, String passwordHash, Timestamp registeredAt, Timestamp lastLogin, String intro, String profile, long mobile, String status, com.fbclone.models.userTable.user user) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.registeredAt = registeredAt;
        this.lastLogin = lastLogin;
        this.intro = intro;
        this.profile = profile;
        this.mobile = mobile;
        this.status = status;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }
}
