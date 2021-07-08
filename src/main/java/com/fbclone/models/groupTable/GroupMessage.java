package com.fbclone.models.groupTable;



import javax.persistence.*;


@Entity
@Table(name="GroupMessage")
public class GroupMessage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMessage")
    private long groupMessage;

}
