package com.fbclone.models.groupTable;


import javax.persistence.*;


@Entity
@Table(name="GroupPost_Tag")
public class GroupPost_tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;



    //Insert Constructor

    //Update Constructor



}
