package com.fbclone.models.postTable;



import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="postTable")
public class postTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postTable")
    private long postTable;

    @Column(nullable = false, length = 100)
    private long authorId ;

    @Column(nullable = false, length = 100)
    private String parentId ;

    @Column(nullable = false, length = 100)
    private String title ;

    @Column(nullable = false, length = 100)
    private String metaTitle ;

    @Column(nullable = false, length = 100)
    private String slug ;

    @Column(nullable = false, length = 100)
    private String summary ;

    @Column(nullable = false, length = 100)
    private String published;

    @Column(nullable = false, length = 100)
    private Timestamp createdAt;

    @Column(nullable = false, length = 100)
    private Timestamp updatedAt ;

    @Column(nullable = false, length = 100)
    private Timestamp publishedAt;

    @Column(nullable = false, length = 100)
    private String content;




}
