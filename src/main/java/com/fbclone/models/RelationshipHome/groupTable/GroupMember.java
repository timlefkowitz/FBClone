package com.fbclone.models.RelationshipHome.groupTable;



import com.fbclone.models.RelationshipHome.user;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="groupMember")
public class GroupMember {

    public GroupMember(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "groupId")
    private long groupId;

    @Column(name = "userId")
    private long userId;

    @Column(name = "roleId")
    private String roleId;

    @Column(name = "status")
    private String status;

//    @Column(name = "createdAt")
//    private Timestamp createdAt;
//
//    @Column(name = "updatedAt")
//    private Timestamp updatedAt;

    @Column(name = "notes")
    private String notes;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupOwner")
//    private user groupOwner;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupMembner")
//    private user GroupMembner;



//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupMember")
//    private groupMember groupMember;

    //Insert Constructor

    public GroupMember(long groupId, long userId, String roleId, String status, Timestamp createdAt, Timestamp updatedAt, String notes, user user) {
        this.groupId = groupId;
        this.userId = userId;
        this.roleId = roleId;
        this.status = status;
        this.notes = notes;
//        this.groupMember = groupMember;
    }

    //Update Constructor

    public GroupMember(long id, long groupId, long userId, String roleId, String status, Timestamp createdAt, Timestamp updatedAt, String notes, user user) {
        this.id = id;
        this.groupId = groupId;
        this.userId = userId;
        this.roleId = roleId;
        this.status = status;
        this.notes = notes;
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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
