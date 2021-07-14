package com.fbclone.models.RelationshipHome.userTable.userMessage;



import com.fbclone.Repos.UserMessageRepository;
import com.fbclone.models.RelationshipHome.user;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="userMsg")
public class UserMessage {

    public UserMessage(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(length = 100)
    private long sourceId;

    @Column(length = 100)
    private long targetId;

    @Column(length = 250)
    private String message;

    @Column(length = 100)
    private Timestamp createdAt;

    @Column(length = 100)
    private Timestamp updatedAt;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "OwnerToMessageSender")
////    @JoinColumn(name = "userProfile") // was this known as up_ip???? if so I'm wondering why.
//    private user OwnerToMessageSender;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "OwnerToMessageReciver")
////    @JoinColumn(name = "userProfile") // was this known as up_ip???? if so I'm wondering why.
//    private user OwnerToMessageReciver;


//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "UserMsg")
//    private user owner;


    //Insert Constructor

    public UserMessage(long sourceId, long targetId, String message, Timestamp createdAt, Timestamp updatedAt) {
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        ;
    }


    //Update Constructor


    public UserMessage(long id, long sourceId, long targetId, String message, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
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

//    public user getOwner() {
//        return owner;
//    }
//
//    public void setOwner(user owner) {
//        this.owner = owner;
//    }
}
