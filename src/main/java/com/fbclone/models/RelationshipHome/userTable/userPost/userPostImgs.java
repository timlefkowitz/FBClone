package com.fbclone.models.RelationshipHome.postTable;


import com.fbclone.models.RelationshipHome.post;
import com.fbclone.models.RelationshipHome.user;

import javax.persistence.*;

@Entity
@Table(name="usePost_imgs")
public class userPostImgs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String path;

//    @ManyToOne
//    @JoinColumn (name = "userPost_id")
//    private post img;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usersPostOwner")
    private user usersPost;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ApostsCommentsOwner")
    private user ApostsCommentsOwnen;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ApostsCategory")
    private user ApostsCategory;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ApostingsImages")
    private userPostImgs img;


    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][]            Constructor                         [][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

    //insert constructor


    public userPostImgs(String title, String path, userPostImgs img) {
        this.title = title;
        this.path = path;
        this.img = img;
    }

    //update constructor


    public userPostImgs(long id, String title, String path, userPostImgs img) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.img = img;
    }

    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]
    //[][][][][][][][][][][]            Getters and Setters                 [][][][][][][]
    //[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public user getUsersPost() {
        return usersPost;
    }

    public void setUsersPost(user usersPost) {
        this.usersPost = usersPost;
    }

    public user getApostsCommentsOwnen() {
        return ApostsCommentsOwnen;
    }

    public void setApostsCommentsOwnen(user apostsCommentsOwnen) {
        ApostsCommentsOwnen = apostsCommentsOwnen;
    }

    public user getApostsCategory() {
        return ApostsCategory;
    }

    public void setApostsCategory(user apostsCategory) {
        ApostsCategory = apostsCategory;
    }

    public userPostImgs getImg() {
        return img;
    }

    public void setImg(userPostImgs img) {
        this.img = img;
    }
}