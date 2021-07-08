package com.fbclone.models.postTable;



import javax.persistence.*;


@Entity
@Table(name="postCategories")
public class postCategoryTableAndPostCategoryTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postCategories")
    private long postCategories;

    @Column(name = "ParentId")
    private long ParentId;


    @Column(name = "title")
    private long title;

    @Column(name = "metaTitle")
    private long metaTitle;

    @Column(name = "slug")
    private long slug;

    @Column(name = "content")
    private long content;
}
