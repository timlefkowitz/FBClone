package com.fbclone.models.userTable.userPost;


import com.fbclone.Repos.UsersPostsRepository;
import com.fbclone.models.postTable.userPostImgs;
import com.fbclone.models.userTable.user;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="userPost")
public class userPost {

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
    @Column (nullable = false, length = 100)
    private long postId;

    @Column(nullable = false, length = 100)
    private long key;

    @Column(length = 100)
    private String content;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String body;

    @ManyToOne
    @JoinColumn (name = "owner_id")
    private user owner;

//    user Post images

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "userPost")
    private List<UsersPostsRepository> userPost;



//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "owner", nullable = false)
//    private user owner;

    //Insert Constructor

    public userPost( long postId, long key, String content, List<userPost> img) {
        this.postId = postId;
        this.key = key;
        this.content = content;
//        this.imgs = imgs;
    }

    public userPost(){

    }


    //Update Constructor


    public userPost(long id, long postId, long key, String content, List<userPost> img) {
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
