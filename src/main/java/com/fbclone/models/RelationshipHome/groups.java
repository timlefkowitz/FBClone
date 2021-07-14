package com.fbclone.models.RelationshipHome;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity // << this is how hibernate knows to make tables out of the class
@Table(name="groupTable")
public class groups {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "CreatedBy")
    private long CreatedBy;

    @Column(name = "UpdatedBy")
    private String updatedBy;

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

//    @Column(name = "createdAt")
//    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private String updatedAt;

    @Column(name = "profile")
    private String profile;

    @Column( name = "content")
    private String content;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groups")
//    private user groups;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupOwner")
//    private user groupOwner;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "Group_Membner")
//    private user Group_Membner;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPost")
//    private user GroupPost;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPostImgs")
//    private user GroupPostImgs;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupPostComments")
//    private user GroupPostComments;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "GroupsCatecory")
//    private user GroupsCatecory;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "groupOwner")
//    private user groupOwner;

//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "Group_Table")
//    private userProfile groupTable;

//    @OneToMany
//    private user owners;


    // Insert Constructor

    public groups(long createdBy, String updatedBy, String title, String metaTitle, String slug, String summary, String status, Timestamp createdAt, String updatedAt, String profile, String content) {
        CreatedBy = createdBy;
        this.updatedBy = updatedBy;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.status = status;
//        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
        this.content = content;
    }


    // Update Constructor


    public groups(long id, long createdBy, String updatedBy, String title, String metaTitle, String slug, String summary, String status, Timestamp createdAt, String updatedAt, String profile, String content) {
        this.id = id;
        CreatedBy = createdBy;
        this.updatedBy = updatedBy;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.status = status;
//        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
        this.content = content;
    }

    //Create a group

    public groups(long createdBy, String title, String metaTitle, String slug, String summary, String status, Timestamp createdAt, String profile, String content) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(long createdBy) {
        CreatedBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
