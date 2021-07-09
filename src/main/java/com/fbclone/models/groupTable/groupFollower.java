package com.fbclone.models.groupTable;



import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="groupFollower")
public class groupFollower {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "groupId")
    private long groupId;

    @Column(nullable = false, length = 100)
    private long userId;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false, length = 100)
    private Timestamp createdAt;

    @Column(nullable = false, length = 100)
    private Timestamp updatedAt;


    //Insert Constructor

    //Update Constructor

}
