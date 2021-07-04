package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class groupMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMeta")
    private long groupMeta;

}
