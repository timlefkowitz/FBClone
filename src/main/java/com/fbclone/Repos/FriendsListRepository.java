package com.fbclone.Repos;

import com.fbclone.models.userTable.userFriends.friendsList;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fbclone.models.userTable.user;

public interface FriendsListRepository extends JpaRepository<friendsList, Long> {
}
