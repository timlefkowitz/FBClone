package com.fbclone.models.postTable;



import javax.persistence.*;


@Entity
@Table(name="postMeta")
public class postMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postMeta")
    private long postMeta;

    @Column(name = "userPostId")
    private long userPostId;

    @Column(name = "userPostkey")
    private long userPostkey;

    @Column(name = "userPostContent")
    private long userPostContent;


}
