package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class postTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postTable")
    private long postTable;
}
