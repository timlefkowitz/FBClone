package com.fbclone.models.groupTable;


import javax.persistence.*;


@Entity
@Table(name="GroupPost_Tag")
public class GroupPost_tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_Tag")
    private long post_Tag;

}
