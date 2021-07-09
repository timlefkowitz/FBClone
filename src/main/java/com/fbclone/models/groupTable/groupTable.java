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


    // Insert Constructor

    public groupTable(long createdBy, Timestamp updatedBy, String title, String metaTitle, String slug, String summary, String status, Timestamp createdAt, String updatedAt, String profile, String content) {
        CreatedBy = createdBy;
        this.updatedBy = updatedBy;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
        this.content = content;
    }


    // Update Constructor


    public groupTable(long id, long createdBy, Timestamp updatedBy, String title, String metaTitle, String slug, String summary, String status, Timestamp createdAt, String updatedAt, String profile, String content) {
        this.id = id;
        CreatedBy = createdBy;
        this.updatedBy = updatedBy;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
        this.content = content;
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

    public Timestamp getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Timestamp updatedBy) {
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
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
