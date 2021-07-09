package com.fbclone.models.postTable;



import javax.persistence.*;


@Entity
@Table(name="postMeta")
public class postMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "userPostId")
    private long userPostId;

    @Column(name = "userPostkey")
    private long userPostkey;

    @Column(name = "userPostContent")
    private long userPostContent;


    //Insert Constructor

    //Update Constructor


}
