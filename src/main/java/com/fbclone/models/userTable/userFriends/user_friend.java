package com.fbclone.models.userTable.userFriends;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="user_friend")
public class user_friend {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false, length = 100)
    private long sourceId;

    @Column(nullable = false, length = 100)
    private long targetId;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false, length = 100)
    private Timestamp createdAt;

    @Column(nullable = false, length = 100)
    private Timestamp updatedAt;

//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userFriend")
//    private user user_Friend;


    //Insert Constructor

    public user_friend(long sourceId, long targetId, String type, Timestamp createdAt, Timestamp updatedAt) {
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
//        this.user_Friend = user_Friend;
    }


    //Update Constructor


    public user_friend(long id, long sourceId, long targetId, String type, Timestamp createdAt, Timestamp updatedAt, com.fbclone.models.userTable.user user) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

//    public com.fbclone.models.userTable.user getUser() {
//        return user;
//    }
//
//    public void setUser(com.fbclone.models.userTable.user user) {
//        this.user = user;
//    }
}
