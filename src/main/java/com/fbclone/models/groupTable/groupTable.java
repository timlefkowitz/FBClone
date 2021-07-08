package com.fbclone.models.groupTable;


import javax.persistence.*;




@Entity // << this is how hibernate knows to make tables out of the class
@Table(name="groupTable")
public class groupTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupTable")
    private long groupTable;

}
