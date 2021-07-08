package com.fbclone.models.groupTable;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity // << this is how hibernate knows to make tables out of the class
@Table(name="groupTable")
public class groupTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "CreatedBy")
    private long CreatedBy;

    @Column(name = "UpdatedBy")
    private Timestamp updatedBy;

    @Column(name = "title")
    private String title;

    @Column(name = "metaTitle")
    private String metaTitle;

    @Column(name = "slug")
    private String slug;

    @Column(name = "summary")
    private String summary;

    @Column(name = "status")   // new, approved active or blocked
    private String status;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private String updatedAt;

    @Column(name = "profile")
    private String profile;

    @Column(name = "content")
    private String content;


}
