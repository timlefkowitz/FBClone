package com.fbclone.models.groupTable;



import com.fbclone.models.userTable.user;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="groupPost")
public class groupPost {


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


    @OneToOne
    private user owner;




    //Insert Constructor

    //Update Constructor



}
