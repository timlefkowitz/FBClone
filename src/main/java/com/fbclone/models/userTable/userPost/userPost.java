package com.fbclone.models.userTable.userPost;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="userPost")
public class userPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userPost")
    private long userPost;

    @Colum (name="postId")
    Private PostId

@Column(name ="key")
Private long key

@Column(name="content")
Private String content




}
