package com.fbclone.models.RelationshipHome.userTable.userFriends;


import com.fbclone.models.RelationshipHome.user;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="user_friend")
public class user_friend {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(length = 100)
    private long sourceId;

    @Column(length = 100)
    private long targetId;

    @Column(length = 100)
    private String type;

//    @Column(nullable = false, length = 100)
//    private Timestamp createdAt;
//
//    @Column(nullable = false, length = 100)
//    private Timestamp updatedAt;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "User_friend")
//    private user User_friend;

//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userFriend")
//    private user user_Friend;


    //Insert Constructor

    public user_friend(long sourceId, long targetId, String type, Timestamp createdAt, Timestamp updatedAt) {
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;

//        this.user_Friend = user_Friend;
    }


    //Update Constructor


    public user_friend(long id, long sourceId, long targetId, String type, Timestamp createdAt, Timestamp updatedAt, user user) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;

//        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



//    public com.fbclone.models.RelationshipHome.userTable.main.user getUser() {
//        return user;
//    }
//
//    public void setUser(com.fbclone.models.RelationshipHome.userTable.main.user user) {
//        this.user = user;
//    }
}
