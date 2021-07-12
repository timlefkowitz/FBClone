package com.fbclone.models.userTable.userFriends;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fbclone.models.userTable.user;
import javax.persistence.*;

@Entity
@Table(name = "friendsList")
public class friendsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name="added_user_id")
    @JsonManagedReference
    private user added_user_id;

    @ManyToOne
    @JoinColumn(name="friendListOwner_id")
    @JsonManagedReference
    private user userOwner;


//    Getter and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public user getAdded_user_id() {
        return added_user_id;
    }

    public void setAdded_user_id(user added_user_id) {
        this.added_user_id = added_user_id;
    }

    public user getUserOwner() {
        return userOwner;
    }

    public void setUserOwner(user userOwner) {
        this.userOwner = userOwner;
    }
}
