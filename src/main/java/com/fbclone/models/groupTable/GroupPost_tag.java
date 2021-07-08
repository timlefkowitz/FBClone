package com.fbclone.models.groupTable;


import javax.persistence.*;


@Entity
@Table(name="post_Tag")
public class post_tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_Tag")
    private long post_Tag;

}
