package com.fbclone.models.userTable.userFriends;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="user_follower")
public class user_follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_follower")
    private long user_follower;
}
