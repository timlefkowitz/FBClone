package com.fbclone.models.userTable.userPost;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="UserPostCommentTable")
public class UserPostCommentTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserPostCommentTable")
    private long UserPostCommentTable;

    @Column (nullable = false, length = 100)
    private long postId;

    @Column(nullable = false, length = 100)
    private long parentId;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private Boolean published;

    @Column(nullable = false, length = 100)
    private String createdAt;

    @Column(nullable = false, length = 100)
    private String publishedAt;

    @Column(nullable = false, length = 100)
    private String content;


}
