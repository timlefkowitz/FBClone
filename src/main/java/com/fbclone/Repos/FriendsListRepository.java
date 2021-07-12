package com.fbclone.Repos;

import com.fbclone.models.RelationshipHome.userTable.userFriends.friendsList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsListRepository extends JpaRepository<friendsList, Long> {
}
