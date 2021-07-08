package com.fbclone.models.groupTable;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="groupPost")
public class groupPost {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupPost")
    private long groupPost;

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

}
