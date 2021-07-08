package com.fbclone.models.groupTable;



import javax.persistence.*;
import java.sql.Timestamp;

@Entity

@Table(name="groupMember")
public class groupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMember")
    private long groupMember;

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



}
