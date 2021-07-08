package com.fbclone.models.userTable.userMsg;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="userMsg")
public class UserMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserMsg")
    private long UserMsg;

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

}
