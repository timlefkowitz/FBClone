package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class postTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postTag")
    private long postTag;
}
