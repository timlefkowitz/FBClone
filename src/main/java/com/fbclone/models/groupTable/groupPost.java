package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class groupPost {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupPost")
    private long groupPost;

}
