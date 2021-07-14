package com.fbclone.models.RelationshipHome;



import com.fbclone.Repos.UsersRepository;
import com.fbclone.models.RelationshipHome.userTable.userProfile;


import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDate;

@Entity // << this is how hibernate knows to make tables out of the class
@Table(name="user")
public class  user {


    // [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][] the Blank function              [][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

    // [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][] Calling instances               [][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

// trying to get work done on the via/bus haha

    @Column(name = "firstName", length = 100)
    private String firstName;

    @Column(name = "middleName",  length = 20)
    private String middleName;

    @Column(name = "lastName",  length = 20)
    private String lastName;

    @Column(name = "userName",  length = 100)
    private String userName;

    @Column(name = "email",  length = 20)
    private String email;

    @Column(name = "passwordHash",   length = 100)
    private String passwordHash;

//    @Column(name = "registeredAt", nullable = false, length = 10)
//    private Timestamp registeredAt;
//
//    @Column(name = "lastLogin", nullable = false, length = 10)
//    private Timestamp lastLogin;

    @Column(name = "intro",  nullable = true , length = 100)
    private String intro;

    @Column(name = "profile", nullable = true)
    private String profile;

    @Column(name = "mobile", nullable = false, length = 16)
    private long mobile;

    @Column(name = "status", nullable = true, length = 30)
    private String status;

    // Adding some columns i missed \



//    @Column(name = "dateOfBirth", nullable = false)
//    private LocalDate dateOfBirth;

    // [][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][] mySQL Relationships[][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

//    Users Post

//    @OneToMany(mappedBy = "usersPostOwner")
//    private user usersPostOwner;
//
//    @OneToOne(mappedBy = "ApostsCommentsOwner")
//    private user ApostsCommentsOwnen;
//
////    Users Profile
//
//    @OneToOne( mappedBy = "ownerToProfile")
//    private user ownerToProfile;
//
////    Messages
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "OwnerToMessageSender")
//    private user OwnerToMessageSender;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "OwnerToMessageReciver")
//    private user OwnerToMessageReciver;
//
////    Friends
//
//    @OneToOne(mappedBy = "User_friend") // fetch not needed maybe for join columns
//    private user User_friend;

//            Groups

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groups")
//    private user groups;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupOwner")
//    private user groupOwner;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupMembner")
//    private user GroupMembner;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPost")
//    private user GroupPost;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPostImgs")
//    private user GroupPostImgs;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPostComments")
//    private user GroupPostComments;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupsCatecory")
//    private user GroupsCatecory;







//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_message_id")
//    private UserMsg UserMsg;

//    Friends List
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "added_user_id")
//    @JsonBackReference
//    private Collection<friendsList> added_user_id;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "friendListOwner_id")
//    @JsonBackReference
//    private Collection<friendsList> friendsListOwner;

//       Groups
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupOwner")
//    @JoinColumn(name="groupOwner")
//    private user groupOwner;






//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "up_id")
//    private userProfile user_Friend;






    // Insert Constructor

    public user(String firstName, String middleName, String lastName, String userName, String email, String passwordHash, Timestamp registeredAt, Timestamp lastLogin, String intro, String profile, long mobile, String status) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;

        this.intro = intro;
        this.profile = profile;
        this.mobile = mobile;
        this.status = status;
    }


    // update Constructor

    public user(long id, String firstName, String middleName, String lastName, String userName, String email, String passwordHash, Timestamp registeredAt, Timestamp lastLogin, String intro, String profile, long mobile, String status) {

        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;

        this.intro = intro;
        this.profile = profile;
        this.mobile = mobile;
        this.status = status;
    }

    public user(UsersRepository usersRepository) {
    }

    public user(String firstName, String middleName, String lastName, String userName, String email, String passwordHash, String intro, String profile, long mobile, String owner) {
    }


// GETTERS AND SETTERS


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

    public void setUserProfile(userProfile userProfile) {
    }
}
