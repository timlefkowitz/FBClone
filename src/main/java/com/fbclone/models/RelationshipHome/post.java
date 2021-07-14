package com.fbclone.models.RelationshipHome;


import com.fbclone.Repos.UsersPostsRepository;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="userPost")
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    //
    //
    //
    // I'm making things nullable and realized id's, or dates should not be nullable
    //
    //
    @Column (length = 100)
    private long postId;

    @Column(length = 100)
    private long key;

    @Column(length = 100)
    private String content;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String body;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usersPostOwner")
//    private user usersPost;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ApostsCommentsOwner")
//    private user ApostsCommentsOwnen;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ApostsCategory")
//    private user ApostsCategory;



//    @ManyToOne
//    @JoinColumn (name = "owner_id")
//    private user owner;

//    user Post images

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userPost")
//    private List<UsersPostsRepository> userPost;



//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "owner", nullable = false)
//    private user owner;

    //Insert Constructor

    public post(long postId, long key, String content, List<post> img) {
        this.postId = postId;
        this.key = key;
        this.content = content;
//        this.imgs = imgs;
    }

    public post(){

    }


    //Update Constructor


    public post(long id, long postId, long key, String content, List<post> img) {
        this.id = id;
        this.postId = postId;
        this.key = key;
        this.content = content;
//        this.imgs = imgs;
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
