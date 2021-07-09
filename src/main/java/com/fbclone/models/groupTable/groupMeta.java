package com.fbclone.models.groupTable;



import javax.persistence.*;


@Entity
@Table(name="groupMeta")
public class groupMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "groupId")
    private String groupId;

    @Column(name = "key")
    private long key;

    @Column(name = "content")
    private String content;



    //Insert Constructor

    //Update Constructor


}
