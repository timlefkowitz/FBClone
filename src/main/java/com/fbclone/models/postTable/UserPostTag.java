package com.fbclone.models.postTable;


import javax.persistence.*;


@Entity

@Table(name="UserPostTag")
public class UserPostTag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag")
    private long tag;



}
