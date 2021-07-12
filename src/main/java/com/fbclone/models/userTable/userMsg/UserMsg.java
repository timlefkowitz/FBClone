package com.fbclone.models.userTable.userMsg;



import com.fbclone.models.userTable.user;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="userMsg")
public class UserMsg {

    public UserMsg(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false, length = 100)
    private long sourceId;

    @Column(nullable = false, length = 100)
    private long targetId;

    @Column(nullable = false, length = 250)
    private String message;

    @Column(nullable = false, length = 100)
    private Timestamp createdAt;

    @Column(nullable = false, length = 100)
    private Timestamp updatedAt;


//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "UserMsg")
//    private user owner;


    //Insert Constructor

    public UserMsg(long sourceId, long targetId, String message, Timestamp createdAt, Timestamp updatedAt) {
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        ;
    }


    //Update Constructor


    public UserMsg(long id, long sourceId, long targetId, String message, Timestamp createdAt, Timestamp updatedAt) {
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
