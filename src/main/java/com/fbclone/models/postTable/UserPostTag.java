package com.fbclone.models.postTable;


import javax.persistence.*;


@Entity

@Table(name="tag")
public class tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag")
    private long tag;



}
