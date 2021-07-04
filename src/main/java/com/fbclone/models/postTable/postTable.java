package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="postTable")
public class postTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postTable")
    private long postTable;


Id
Author Id
Parent Id
Title
Meta Title
Slug
Summary
Published
Created At
Updated At
Published At
Content


}
