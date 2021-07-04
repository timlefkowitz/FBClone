package com.fbclone.models.groupTable;

import lombok.Data;
import javax.persistence.*;




@Entity // << this is how hibernate knows to make tables out of the class
@Data
@Table(name="groupTable")
public class groupTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupTable")
    private long groupTable;

}
