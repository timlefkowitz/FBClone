package com.fbclone.models.userTable.userPost;


import com.fbclone.models.userTable.user;

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


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner", nullable = false)
    private user owner;

    //Insert Constructor

    public userPost( long postId, long key, String content) {
        this.postId = postId;
        this.key = key;
        this.content = content;
    }

    public userPost(){

    }


    //Update Constructor


    public userPost(long id, long postId, long key, String content) {
        this.id = id;
        this.postId = postId;
        this.key = key;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
