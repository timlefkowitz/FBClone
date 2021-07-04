package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class commentsOnPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentsOnPost")
    private long commentsOnPost;

}
