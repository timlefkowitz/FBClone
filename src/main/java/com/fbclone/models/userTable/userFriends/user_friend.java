package com.fbclone.models.userTable.userFriends;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="user_friend")
public class user_friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_friend")
    private long user_friend;
}
