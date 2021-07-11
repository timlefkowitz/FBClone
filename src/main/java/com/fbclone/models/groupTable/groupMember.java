package com.fbclone.models.groupTable;



import com.fbclone.models.userTable.user;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity

@Table(name="groupMember")
public class groupMember {

    public groupMember(){

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

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    @Column(name = "notes")
    private String notes;


//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupMember")
//    private groupMember groupMember;

    //Insert Constructor

    public groupMember(long groupId, long userId, String roleId, String status, Timestamp createdAt, Timestamp updatedAt, String notes, com.fbclone.models.userTable.user user) {
        this.groupId = groupId;
        this.userId = userId;
        this.roleId = roleId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.notes = notes;
//        this.groupMember = groupMember;
    }

    //Update Constructor

    public groupMember(long id, long groupId, long userId, String roleId, String status, Timestamp createdAt, Timestamp updatedAt, String notes, com.fbclone.models.userTable.user user) {
        this.id = id;
        this.groupId = groupId;
        this.userId = userId;
        this.roleId = roleId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.notes = notes;
//        this.groupMember = groupMember;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

//    public groupMember getgroupMember() {
//        return groupMember;
//    }
//
//    public void setgroupMember(groupMember groupMember) {
//        this.groupMember = groupMember;
//    }
}
