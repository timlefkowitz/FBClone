package com.fbclone.models.groupTable;



import javax.persistence.*;

@Entity
@Table(name="groupFollower")
public class groupFollower {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupId")
    private long groupId;

    @Column(nullable = false, length = 100)
    private long userId;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false, length = 100)
    private String createdAt;

    @Column(nullable = false, length = 100)
    private String updatedAt;



}
