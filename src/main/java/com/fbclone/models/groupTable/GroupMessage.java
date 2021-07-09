package com.fbclone.models.groupTable;



import javax.persistence.*;


@Entity
@Table(name="GroupMessage")
public class GroupMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "groupId")
    private long groupId;

    @Column(name = "userId")
    private long userId;

    @Column(name = "message")
    private long message;

    @Column(name = "createdAt")
    private long createdAt;

    @Column(name = "updatedAt")
    private long updatedAt;


    //Insert Constructor

    //Update Constructor

}
