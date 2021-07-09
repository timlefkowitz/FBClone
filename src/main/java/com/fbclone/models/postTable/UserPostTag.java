package com.fbclone.models.postTable;


import javax.persistence.*;


@Entity

@Table(name="UserPostTag")
public class UserPostTag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    //Insert Constructor





}
