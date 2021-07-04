package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="post_Tag")
public class post_tag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_Tag")
    private long post_Tag;

}
