package com.fbclone.models.groupTable;



import javax.persistence.*;

@Entity

@Table(name="groupMember")
public class groupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMember")
    private long groupMember;


}
