package com.fbclone.models.RelationshipHome.groupTable;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="groupPost")
public class GroupPost {

    public GroupPost(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "groupId")
    private long groupId;

    @Column(name = "userId")
    private long userId;

    @Column(name = "message")
    private String message;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;
//
//    @OneToOne
//    private user owner;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupPost")
//    private groupMember groupMember;


//    @OneToOne
//    private user owner;




    //Insert Constructor

    public GroupPost(long groupId, long userId, String message, Timestamp createdAt, Timestamp updatedAt) {
        this.groupId = groupId;
        this.userId = userId;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    //Update Constructor


    public GroupPost(long id, long groupId, long userId, String message, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.groupId = groupId;
        this.userId = userId;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
}
