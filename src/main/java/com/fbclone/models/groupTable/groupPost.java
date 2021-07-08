package com.fbclone.models.groupTable;



import javax.persistence.*;


@Entity
@Table(name="groupPost")
public class groupPost {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupPost")
    private long groupPost;

}
