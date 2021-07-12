package com.fbclone.models.postTable;


import com.fbclone.models.userTable.userPost.userPost;

import javax.persistence.*;

@Entity
@Table(name="post_imgs")
public class PostImgs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn (name = "userPost_id")
    private userPost img;

}
