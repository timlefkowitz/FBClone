package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupTag")
    private long groupTag;

}
