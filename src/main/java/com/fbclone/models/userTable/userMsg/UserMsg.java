package com.fbclone.models.userTable.userMsg;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="userMsg")
public class UserMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserMsg")
    private long UserMsg;
}
