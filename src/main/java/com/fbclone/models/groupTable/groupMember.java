package com.fbclone.models.groupTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="")
public class groupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupMember")
    private long groupMember;


}
