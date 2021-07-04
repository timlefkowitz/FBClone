package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class postCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postCategories")
    private long postCategories;
}
