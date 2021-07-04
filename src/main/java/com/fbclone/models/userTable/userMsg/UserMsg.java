package com.fbclone.models.userTable.userMsg;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
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
    private String createdAt;

    @Column(nullable = false, length = 100)
    private String updatedAt;

}
