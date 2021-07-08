package com.fbclone.models.userTable.userFriends;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="user_follower")
public class user_follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_follower")
    private long user_follower;

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


}
