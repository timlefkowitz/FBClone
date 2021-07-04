package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="groupFollower")
public class groupFollower {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupFollower")
    private long groupFollower;

}
