package com.fbclone.models.userTable.userPost;


import javax.persistence.*;


@Entity
@Table(name="userPost")
public class userPost {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column (nullable = false, length = 100)
    private long postId;

    @Column(nullable = false, length = 100)
    private long key;

    @Column(nullable = false, length = 100)
    private String content;

    //Insert Constructor



    //Update Constructor





}
