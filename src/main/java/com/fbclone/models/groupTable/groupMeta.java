package com.fbclone.models.groupTable;



import javax.persistence.*;


@Entity
@Table(name="groupMeta")
public class groupMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMeta")
    private long groupMeta;

}
