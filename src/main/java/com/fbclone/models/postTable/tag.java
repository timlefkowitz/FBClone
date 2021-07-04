package com.fbclone.models.postTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag")
    private long tag;
}
