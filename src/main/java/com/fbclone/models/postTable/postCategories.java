package com.fbclone.models.postTable;



import javax.persistence.*;


@Entity
@Table(name="postCategories")
public class postCategories {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postCategories")
    private long postCategories;
}
