package com.fbclone.models.RelationshipHome.postTable;



import com.fbclone.models.RelationshipHome.user;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity // << this is how hibernate knows to make tables out of the class
@Table(name="postTable")
public class postTable {

    public postTable(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(length = 100)
    private long authorId ;

    @Column(length = 100)
    private long parentId ;

    @Column(length = 100)
    private String title ;

    @Column(length = 100)
    private String metaTitle ;

    @Column(length = 100)
    private String slug ;

    @Column(length = 100)
    private String summary ;

    @Column(length = 100)
    private String published;

//    @Column(length = 100)
//    private Timestamp createdAt;
//
//    @Column(length = 100)
//    private Timestamp updatedAt ;
//
//    @Column(length = 100)
//    private Timestamp publishedAt;

    @Column(nullable = false, length = 100)
    private String content;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "owner", nullable = false)
//    private user owner;

    // Insert Constructor

    public postTable(long authorId, long parentId, String title, String metaTitle, String slug, String summary, String published, Timestamp createdAt, Timestamp updatedAt, Timestamp publishedAt, String content, user owner) {
        this.authorId = authorId;
        this.parentId = parentId;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.published = published;

        this.content = content;
//        this.owner = owner;
    }


    // read Constructor

    public postTable(long id, long authorId, long parentId, String title, String metaTitle, String slug, String summary, String published, Timestamp createdAt, Timestamp updatedAt, Timestamp publishedAt, String content, user owner) {
        this.id = id;
        this.authorId = authorId;
        this.parentId = parentId;
        this.title = title;
        this.metaTitle = metaTitle;
        this.slug = slug;
        this.summary = summary;
        this.published = published;

        this.content = content;
//        this.owner = owner;
    }

    public postTable(String title, String description) {
    }

    public postTable(String title, String description, user owner) {
    }


    // Update Constructor


//    public postTable(long id, long authorId, String parentId, String title, String metaTitle, String slug, String summary, String published, Timestamp createdAt, Timestamp updatedAt, Timestamp publishedAt, String content, user owner) {
//        this.id = id;
//        this.authorId = authorId;
//        this.parentId = parentId;
//        this.title = title;
//        this.metaTitle = metaTitle;
//        this.slug = slug;
//        this.summary = summary;
//        this.published = published;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.publishedAt = publishedAt;
//        this.content = content;
//        this.owner = owner;
//    }


    public long getId() {
        return id;
    }


//    public user getOwner() {
//        return owner;
//    }
//
//    public void setOwner(user owner) {
//        this.owner = owner;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
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

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
