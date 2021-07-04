package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="")
public class GroupMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMessage")
    private long groupMessage;

}
