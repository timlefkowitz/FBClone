package com.fbclone.models.userTable.userFriends;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="user_follower")
public class user_follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false, length = 100)
    private long sourceId;

    @Column(nullable = false, length = 100)
    private long targetId;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false, length = 100)
    private Timestamp CreatedAt;

    @Column(nullable = false, length = 100)
    private Timestamp updatedAt;


    //Insert Constructor

    //Update Constructor


}
